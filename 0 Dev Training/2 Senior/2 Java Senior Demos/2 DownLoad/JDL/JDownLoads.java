package JDL;

import java.io.*;
import javax.servlet.http.*;
import java.net.*;
import java.lang.*;

public class JDownLoads {

  
  /**
	 * ��ָ����URL�ϵ��ļ����ز����浽ָ���ı���·����
	 * 
	 * @param fileUrl
	 *            Զ��URL
	 * @param localPath
	 *            ����·��
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
            // path��ָ�����ص��ļ���·����
            File file = new File(path);
            // ȡ���ļ�����
            String filename = file.getName();
            // ȡ���ļ��ĺ�׺����
            String ext = filename.substring(filename.lastIndexOf(".") + 1).toUpperCase();

            // ��������ʽ�����ļ���
            InputStream fis = new BufferedInputStream(new FileInputStream(path));
            byte[] buffer = new byte[fis.available()];
            fis.read(buffer);
            fis.close();
            // ���response
            response.reset();
            // ����response��Header
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
    
    // ���ر����ļ�
    public void downloadLocal( HttpServletResponse response ) throws FileNotFoundException 
    {
        String    fileName = "Operator.doc".toString();     //�ļ���Ĭ�ϱ�����
      
        // ��������
        InputStream inStream= new FileInputStream("f:/Operator.doc");    // �ļ��ı���·��
      
        // ��������ĸ�ʽ
        response.reset();
        response.setContentType("bin");
        response.addHeader( "Content-Disposition", "attachment;filename=\""+fileName+ "\"" );
        
        // ѭ��ȡ�����е�����
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
    
    // ���������ļ�
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
    // ֧�����ߴ��ļ���һ�ַ�ʽ
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
      
      response.reset();       // �ǳ���Ҫ
      if ( isOnLine ) { // ���ߴ򿪷�ʽ
        URL u = new URL( "file:////" + filePath ); 
        response.setContentType( u.openConnection().getContentType() );
        response.setHeader( "Content-Disposition", "inline; filename=" + f.getName()  );
        // �ļ���Ӧ�ñ����UTF-8
      } else {    // �����ط�ʽ
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
