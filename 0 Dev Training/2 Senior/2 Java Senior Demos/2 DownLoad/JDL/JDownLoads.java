package JDL;

import java.io.*;
import javax.servlet.http.*;
import java.net.*;
import java.lang.*;

public class JDownLoads {

  
  /**
	 * 把指定的URL上的文件下载并保存到指定的本地路径。
	 * 
	 * @param fileUrl
	 *            远程URL
	 * @param localPath
	 *            本地路径
	 * @throws Exception
	 */
	void downloadFile2LocalDir(NetElement ne, String fileUrl, String localPath)
			throws Exception
	{
		RemoteFileManager rfm = SystemModelFactory.createRemoteFileManager();
		rfm.loginServer(ne.ipAddress, ne.ftpPort, ne.ftpUserName,
				ne.ftpPassword);
		rfm.downloadFile(fileUrl, localPath);
	}
  
    public HttpServletResponse download(String path, HttpServletResponse response) {
        try {
            // path是指欲下载的文件的路径。
            File file = new File(path);
            // 取得文件名。
            String filename = file.getName();
            // 取得文件的后缀名。
            String ext = filename.substring(filename.lastIndexOf(".") + 1).toUpperCase();

            // 以流的形式下载文件。
            InputStream fis = new BufferedInputStream(new FileInputStream(path));
            byte[] buffer = new byte[fis.available()];
            fis.read(buffer);
            fis.close();
            // 清空response
            response.reset();
            // 设置response的Header
            response.addHeader("Content-Disposition", "attachment;filename=" + new String(filename.getBytes()));
            response.addHeader("Content-Length", "" + file.length());
            OutputStream toClient = new BufferedOutputStream(response.getOutputStream());
            response.setContentType("application/octet-stream");
            toClient.write(buffer);
            toClient.flush();
            toClient.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return response;
    }
    
    // 下载本地文件
    public void downloadLocal( HttpServletResponse response ) throws FileNotFoundException 
    {
        String    fileName = "Operator.doc".toString();     //文件的默认保存名
      
        // 读到流中
        InputStream inStream= new FileInputStream("f:/Operator.doc");    // 文件的保存路径
      
        // 设置输出的格式
        response.reset();
        response.setContentType("bin");
        response.addHeader( "Content-Disposition", "attachment;filename=\""+fileName+ "\"" );
        
        // 循环取出流中的数据
        byte[] b = new byte[100];
        int   len;
      
        try {
            while ( (len = inStream.read(b) ) > 0 )
                response.getOutputStream().write( b, 0, len );
            
            inStream.close();
        } catch ( IOException e ) {
            e.printStackTrace();
        }
    }
    
    // 下载网络文件
    public void downloadNet( HttpServletResponse response ) throws MalformedURLException 
    {
      int bytesum = 0;
      int byteread = 0;
      
      URL url = new URL("windine.blogdriver.com/logo.gif");
      
      try {
        URLConnection conn = url.openConnection();
        
        InputStream inStream = conn.getInputStream();
        FileOutputStream fs = new FileOutputStream( "f:/abc.gif" );
        
        byte[] buffer = new byte[1024];
        int     length;
        
        while ( ( byteread = inStream.read(buffer) ) != -1  ) {
            bytesum += byteread;
            System.out.println( bytesum );
            fs.write( buffer, 0, byteread );
        }
      } catch ( FileNotFoundException e ) {
         e.printStackTrace();
      } catch ( IOException e ) {
        e.printStackTrace();
      }
      
    }
    
    /*
    // 支持在线打开文件的一种方式
    public void downLoad( String filePath, HttpServletResponse response, boolean isOnLine ) throws Exception 
    {
      File   f = File( filePath);
      
      if ( !f.exists() ) {
        response.sendError( 404, "File not found!" );
        return;
      }
      
      BufferedInputStream br = new BufferedInputStream( new FileInputStream( f ) );
      byte[]   buf = new byte[1024];
      int        len = 0;
      
      response.reset();       // 非常重要
      if ( isOnLine ) { // 在线打开方式
        URL u = new URL( "file:////" + filePath ); 
        response.setContentType( u.openConnection().getContentType() );
        response.setHeader( "Content-Disposition", "inline; filename=" + f.getName()  );
        // 文件名应该编码成UTF-8
      } else {    // 纯下载方式
        response.setContentType( "application/x-msdownload" );
        response.setHeader( "Content-Disposition", "attachment; filename=" + f.getName()  );
      }
      
      OutputStream  out = response.getOutputStream();
      
      while ( ( len = br.read( buf ) ) > 0 ) 
        out.write( buf, 0, len  );
      
      br.close();
      
      out.close();
    }
    */
}
