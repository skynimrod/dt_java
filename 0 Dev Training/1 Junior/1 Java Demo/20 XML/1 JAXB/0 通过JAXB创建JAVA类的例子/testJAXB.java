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
        
        // ��xml ���� ���뵽java ���ݶ���(����)
        Unmarshaller  u = jc.createUnmarshaller();    
        generated.ProtocolOptionsMapping    maps = (generated.ProtocolOptionsMapping) u.unmarshal( new File( filePath ) );
        
        
        System.out.printf("LogType ����Ϊ%d\n", maps.getLogType().size() );
        for ( int i = 0; i < maps.getLogType().size(); i ++) {
        	System.out.printf(": %d", i);
        	
        }
        
        // �鿴 һ��Ԫ�ص�����
        System.out.printf( "\nLogType Name = %s, value=%d\n", maps.getLogType().get(0).getName(),
        		maps.getLogType().get(0).getValue() );
        
        // �鿴��һ��Ԫ�ص�����
        generated.ProtocolOptionsMapping.LogType.DestinationType  des = maps.getLogType().get(0).getDestinationType().get(0);
        
        System.out.printf("\nLogtype[0]�ĵ�һ��Dest name=%s, value=%d\n", des.getName(),des.getValue());

        // д����
        // ����һ��Ԫ��   Name=Admin, value=31
        generated.ProtocolOptionsMapping.LogType logt = new generated.ProtocolOptionsMapping.LogType();
        
        logt.setName("Admin");
        logt.setValue(31);
        
        maps.getLogType().add( logt );
        
        // ����2��logType ����2��Ԫ�� DestinationType   Name=����, value =10
        generated.ProtocolOptionsMapping.LogType.DestinationType de = new generated.ProtocolOptionsMapping.LogType.DestinationType();
        
        de.setName("����");
        de.setValue( 10 );
        
        maps.getLogType().get(1).getDestinationType().add(de);
        
        // �޸ĵ�2��LogType ��name ����Ϊ "BJ LogType"
        maps.getLogType().get(1).setName( "BJ LogType" );
        
        
        // marshal to System.out
        Marshaller  m = jc.createMarshaller();
        
        OutputStream os = new FileOutputStream( filePath2 );
        m.setProperty( "jaxb.encoding", "GB2312" );
        m.marshal( maps, os );
        m.marshal( maps, System.out );
        
        /*
        // ��java ��������ݵ����� System.out
        Marshaller    m = jc.createMarshaller();
        m.setProperty( "jaxb.encoding", "GB2312" );
        m.setProperty( "jaxb.formatted.output", true );
        
        
        m.marshall( generated.ProtocolOptionsMapping,  new File( filePath) );
        */
        
      }catch( Exception e) {
        System.out.println("���쳣�ˣ�");
      }
  }
}