package aqugen.wlog;

import java.io.*;
import java.util.*;
//import java.ext.*;

final int MAX_TIME = 18;

public class wlog 
{
	private PrintWriter outStream;
	private static wlog theInstance = null;

	
	private String FileName;

	public wlog( String str) 
	{
		FileName = str;	
	}

	public static wlog instance()
	{
		if ( null == theInstance )
			theInstance = new wlog();

		return theInstance;
	}

	public boolean open()
	{
		outStream = new PrintWriter(new BufferWriter(new FileWriter(FileName)));
		return true;
	}

	public boolean close()
	{
		outStream.close();

		return true;
	}

	public boolean write()
	{
		outStream.println("I'm listening to the radio.");
		outStream.flush();
		return true;
	}
		
	public boolean read()
	{
		//outStream.read();
		return true;
	}

}