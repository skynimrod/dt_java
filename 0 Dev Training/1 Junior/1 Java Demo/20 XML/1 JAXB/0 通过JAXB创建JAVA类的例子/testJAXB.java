import java.io.*;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import generated.*;

public class testJAXB 
{
  
  /**
 * @param args
 */
/**
 * @param args
 */
public static void main( String args[] )
  {
      System.out.println("This is a memory!");
    
      String    filePath = "f://A_1.xml";
      String    filePath2 = "f://a_2.xml";
    
      try {
        JAXBContext jc = JAXBContext.newInstance("generated");
        
        // 将xml 数据 导入到java 内容对象(树形)
        Unmarshaller  u = jc.createUnmarshaller();    
        generated.ProtocolOptionsMapping    maps = (generated.ProtocolOptionsMapping) u.unmarshal( new File( filePath ) );
        
        
        System.out.printf("LogType 数量为%d\n", maps.getLogType().size() );
        for ( int i = 0; i < maps.getLogType().size(); i ++) {
        	System.out.printf(": %d", i);
        	
        }
        
        // 查看 一级元素的属性
        System.out.printf( "\nLogType Name = %s, value=%d\n", maps.getLogType().get(0).getName(),
        		maps.getLogType().get(0).getValue() );
        
        // 查看下一级元素的树形
        generated.ProtocolOptionsMapping.LogType.DestinationType  des = maps.getLogType().get(0).getDestinationType().get(0);
        
        System.out.printf("\nLogtype[0]的第一个Dest name=%s, value=%d\n", des.getName(),des.getValue());

        // 写操作
        // 增加一级元素   Name=Admin, value=31
        generated.ProtocolOptionsMapping.LogType logt = new generated.ProtocolOptionsMapping.LogType();
        
        logt.setName("Admin");
        logt.setValue(31);
        
        maps.getLogType().add( logt );
        
        // 给第2个logType 增加2级元素 DestinationType   Name=北京, value =10
        generated.ProtocolOptionsMapping.LogType.DestinationType de = new generated.ProtocolOptionsMapping.LogType.DestinationType();
        
        de.setName("北京");
        de.setValue( 10 );
        
        maps.getLogType().get(1).getDestinationType().add(de);
        
        // 修改第2个LogType 的name 属性为 "BJ LogType"
        maps.getLogType().get(1).setName( "BJ LogType" );
        
        
        // marshal to System.out
        Marshaller  m = jc.createMarshaller();
        
        OutputStream os = new FileOutputStream( filePath2 );
        m.setProperty( "jaxb.encoding", "GB2312" );
        m.marshal( maps, os );
        m.marshal( maps, System.out );
        
        /*
        // 将java 对象的数据导出到 System.out
        Marshaller    m = jc.createMarshaller();
        m.setProperty( "jaxb.encoding", "GB2312" );
        m.setProperty( "jaxb.formatted.output", true );
        
        
        m.marshall( generated.ProtocolOptionsMapping,  new File( filePath) );
        */
        
      }catch( Exception e) {
        System.out.println("出异常了！");
      }
  }
}