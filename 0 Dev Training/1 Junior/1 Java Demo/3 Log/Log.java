package com.channelsoft.slee.log;

import java.io.*;
import java.util.*;
import java.text.*;
import com.channelsoft.slee.perfmonitor.*;
import com.channelsoft.slee.unifiedservicemanagement.*;

public class Log
{
	public enum LogLevel
	{
		FR, // fatal error
		ER, // error
		WA, // warning
		TR, // trace
		IT, // info trace
		DT
		// debug trace
	}

	static Vector<ErrorObserver> errorObservers = new Vector<ErrorObserver>();

	public static void addObserver(ErrorObserver eo)
	{
		synchronized (errorObservers)
		{
			errorObservers.add(eo);
		}
	}
	public static void delObserver(ErrorObserver eo)
	{
		synchronized (errorObservers)
		{
			errorObservers.removeElement(eo);
		}
	}
	public static void notifyAllObservers(String strTime, String logLevel, String content)
	{
		synchronized (errorObservers)
		{
			for(int i=0;i<errorObservers.size();i++)
			{
				errorObservers.elementAt(i).addVitalInfo(strTime, logLevel, content);
			}
		}
	}
	
	public static void initialize(String tag)
	{
		LogManager.instance().initialize(tag);
		open("");
	}

	public static LogLevel getLogLevel()
	{
		return LogManager.instance().getLogLevel();
	}

	public static void setLogLevel(LogLevel level)
	{
		LogManager.instance().setLogLevel(level);
	}

	public static void setLogLevel(String logLevel)
	{
		if (logLevel.compareTo("FR") == 0)
			Log.setLogLevel(LogLevel.FR);
		else if (logLevel.compareTo("DT") == 0)
			Log.setLogLevel(LogLevel.DT);
		else if (logLevel.compareTo("ER") == 0)
			Log.setLogLevel(LogLevel.ER);
		else if (logLevel.compareTo("IT") == 0)
			Log.setLogLevel(LogLevel.IT);
		else if (logLevel.compareTo("WA") == 0)
			Log.setLogLevel(LogLevel.WA);
		if (logLevel.compareTo("TR") == 0)
			Log.setLogLevel(LogLevel.TR);
	}

	public static void setAppPath(String appPath)
	{
		LogManager.instance().setFilePath(appPath);
	}

	public static void setMaxLine(int maxLine)
	{
		FileLog.instance().setMaxLine(maxLine);
	}

	public synchronized static void trace(LogLevel logLevel, String strFormat,
			Object... strArgs)
	{
		if (LogManager.instance().getLogLevel().compareTo(logLevel) < 0)
			return;

		try
		{
			LogManager.instance().writeLog(getLevelString(logLevel),
					String.format(strFormat, strArgs));
		}
		catch (Throwable e)
		{
			e.printStackTrace(System.err);
		}
	}

	public static void wFatal(String strFormat, Object... strArgs)
	{
		trace(LogLevel.FR, strFormat, strArgs);
	}

	public static void wError(String strFormat, Object... strArgs)
	{
		trace(LogLevel.ER, strFormat, strArgs);
	}

	public static void wWarn(String strFormat, Object... strArgs)
	{
		trace(LogLevel.WA, strFormat, strArgs);
	}

	public static void wTrace(String strFormat, Object... strArgs)
	{
		trace(LogLevel.TR, strFormat, strArgs);
	}

	public static void wInfo(String strFormat, Object... strArgs)
	{
		trace(LogLevel.IT, strFormat, strArgs);
	}

	public static void wDebug(String strFormat, Object... strArgs)
	{
		trace(LogLevel.DT, strFormat, strArgs);
	}

	public synchronized static void wException(Throwable e)
	{
		trace(LogLevel.DT, e.toString());
		StackTraceElement[] stackTraceElement = e.getStackTrace();
		for (int i = 0; i < stackTraceElement.length; i++)
		{
			trace(LogLevel.DT, stackTraceElement[i].toString());
		}
	}

	private static void open(String fileTag)
	{
		LogManager.instance().open(fileTag);
	}

	private static String getLevelString(LogLevel nLevel)
	{
		switch (nLevel)
		{
		case FR:
			return "[FR]";
		case ER:
			return "[ER]";
		case WA:
			return "[WA]";
		case TR:
			return "[TR]";
		case IT:
			return "[IT]";
		case DT:
			return "[DT]";
		default:
		{
			String unknownLevel = "[UNO:%u]" + nLevel;
			return unknownLevel;
		}
		}
	}
}

class LogManager
{
	public static LogManager instance()
	{
		if (null == theInstance)
			theInstance = new LogManager();
		return theInstance;
	}

	public void initialize(String tag)
	{
		if ((tag.length() != 0) && (logName.length() == 0))
			logName = tag;

		if (logName.length() == 0)
			return;

		if (isInitialize == true)
			return;
		isInitialize = true;

		backupDirFile(filePath);
	}

	public Log.LogLevel getLogLevel()
	{
		return logLevel;
	}

	public void setLogLevel(Log.LogLevel nLevel)
	{
		logLevel = nLevel;
	}

	public void setFilePath(String appPath)
	{
		filePath = appPath;
	}

	public void open(String tag)
	{
		if (logName.length() <= 0)
			return;

		String fileTag = filePath;

		if (tag.length() == 0)
			fileTag += logName;
		else
			fileTag += tag;

		FileLog.instance().open(fileTag);

		isOpen = true;
	}

	public void writeLog(String logLevel, String content)
	{
		if (isOpen == false)
			return;

		FileLog.instance().write(logLevel, content);
	}

	public void backupFile(String fileFullPathName)
	{
		fileFullPathName = fileFullPathName.replace('\\', '/');

		int nPos = fileFullPathName.lastIndexOf("/");
		if (nPos == -1)
			return;

		File f = new File(fileFullPathName);
		String strTime = "";
		if (f.exists())
		{
			SimpleDateFormat sdFormat = new SimpleDateFormat("yyyy-MM-dd");
			strTime = sdFormat.format(new Date(f.lastModified()));
		}
		else
			return;

		String path = fileFullPathName.substring(0, nPos);
		String fileName = fileFullPathName.substring(nPos + 1, fileFullPathName
				.length());
		String backupDirectory = path;
		backupDirectory += "/";
		backupDirectory += strTime;
		backupDirectory += "/";
		String backupFile = backupDirectory + fileName;

		File d = new File(backupDirectory);
		if (d.exists() == false)
		{
			if (d.mkdirs() == false)
				return;
		}

		File backFile = new File(backupFile);
		f.renameTo(backFile);
		// System.out.println(fileFullPathName + " backuped to: "
		// + backupDirectory); // for test
	}

	public void backupDirFile(String filePathName)
	{
		File[] fileList;
		File dirFile = new File(filePathName);
		fileList = dirFile.listFiles();

		if (fileList.length == 0)
			return;
		for (int i = 0; i < fileList.length; i++)
		{
			if (fileList[i].isFile() == false)
				continue;
			backupFile(fileList[i].toString());
		}
	}

	private LogManager()
	{
		isInitialize = false;
		isOpen = false;
		logName = "";
		logLevel = Log.LogLevel.DT;
		filePath = SysCfgData.getLogPath() + "/";
	}

	private static LogManager theInstance = null;

	private Log.LogLevel logLevel;

	private boolean isInitialize;

	private boolean isOpen;

	private String logName;

	private String filePath;
}

class FileLog
{
	public static FileLog instance()
	{
		if (null == theInstance)
			theInstance = new FileLog();
		return theInstance;
	}

	public boolean open(String logFileNameTag)
	{
		if (true == isInit)
			return isInit;

		logFileFullPathTag = logFileNameTag;
		isInit = open();
		return isInit;
	}

	public boolean close()
	{
		outStream.close();
		// System.out.println(logFileFullPath + " closed"); // for test
		LogManager.instance().backupFile(logFileFullPath);
		return true;
	}

	public void write(String logLevel, String content)
	{
		try
		{
			totalLogTimes++;
			if (totalLogTimes >= getMaxLine())
			{
				newLog();
				totalLogTimes = 0;
			}
			strTime = getTimeString();
			outStream.print(strTime);
			outStream.print(logLevel);
			outStream.print(" ");
			outStream.println(content);
			outStream.flush();
			System.out.print(strTime);
			System.out.print(logLevel);
			System.out.print(" ");
			System.out.println(content);

			if ((logLevel.compareTo("[ER]") == 0)
					|| (logLevel.compareTo("[FR]") == 0))
			{
				if (null != UnifiedServiceManagement.perfMonitor)
					UnifiedServiceManagement.perfMonitor.writeLogErrorInfo(
							strTime, logLevel, content);
				Log.notifyAllObservers(strTime, logLevel, content);
			}
		}
		catch (Throwable e)
		{
			e.printStackTrace(System.err);
		}
	}

	public void setMaxLine(int maxLine)
	{
		maxFileLine = maxLine;
	}

	private FileLog()
	{
		totalLogTimes = 0;
		logFileFullPathTag = "";
		logFileFullPath = "";
		outStream = null;
		maxFileLine = 100000;
	}

	private int getMaxLine()
	{
		return maxFileLine;
	}

	private boolean open()
	{
		SimpleDateFormat sdFormat = new SimpleDateFormat(".MM-dd.HH-mm-ss");
		String tempTime = sdFormat.format(new Date());

		String fileName;
		fileName = logFileFullPathTag;
		fileName += tempTime;
		fileName += ".log";
		logFileFullPath = fileName;

		try
		{
			outStream = new PrintWriter(new BufferedWriter(new FileWriter(
					fileName)));
		}
		catch (Throwable e)
		{
			e.printStackTrace(System.err);
		}
		// System.out.println(fileName + " created"); // for test

		return true;
	}

	private void newLog()
	{
		close();
		open();
	}

	private static String getTimeString()
	{
		return sdFormatLog.format(new Date());
	}

	private static SimpleDateFormat sdFormatLog = new SimpleDateFormat(
			"MM-dd HH:mm:ss.SSS - ");

	private static FileLog theInstance = null;

	private static boolean isInit = false;

	private PrintWriter outStream;

	private String logFileFullPathTag;

	private String logFileFullPath;

	private int totalLogTimes;

	private String strTime;

	private int maxFileLine;
}