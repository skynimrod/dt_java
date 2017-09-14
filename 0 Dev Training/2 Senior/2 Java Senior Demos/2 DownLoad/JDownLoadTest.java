import java.io.*;
import java.net.*;
import javax.servlet.http.*;
import JDL.JDownLoads;

public class JDownLoadTest extends javax.servlet.http.HttpServlet
{
  
  public static void main( String[] args)
  {
    JDownLoads  jd1=new JDownLoads();
    
    HttpServletResponse response=null;
    
    //jd1.download( "http://vip.stock.finance.sina.com.cn/quotes_service/view/cn_bill_download.php?symbol=sz000002&num=60&sort=ticktime&asc=0&volume=40000&type=0",  response );
    
    try {
      jd1.downloadNet( response );
    } catch ( MalformedURLException e ) {
      System.out.println("Òì³£Ìø³ö£¡");
    }
    
    return;
  }
  
 }