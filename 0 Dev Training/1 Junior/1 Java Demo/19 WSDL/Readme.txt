. ʹ��Java ʵ��WebService

  ��2��ģʽ�� 1���Ƿ����ģ���һ���ǵ��õ�. 

  �μ� http://lxj8495138.javaeye.com/blog/301211

       http://blog.chinaunix.net/u/11794/showart_95645.html

. SOAP  �ǻ���XML ��ͨѶЭ�鼰�����ʽ�淶. 

  Axis  ʵ�����Ǹ�SOAP  ����. ����֮�⣬ ��������:

    һ���򵥵Ķ���������

    ����Ƕ�뵽��������Ĳ��(����Ƕ�뵽Tomcat)

    ֧��WSDL

    ��WSDL  ���� Java  ��

    һЩ����

    ��� TCP/IP���Ĺ���. 

. ʹ��axis  ���Խ��κ��Ѿ��е�java  ���ṩλ�ɹ����õ�webservice �ӿ�.

  1. ������Ͳ���

    ��Tomcat  �� JDK  ���ú�, Ȼ������Apache  �ϵ�axis 1.4, ��������2���汾axis 1.4  �� axis 2,  ����ʹ��axis 1.4

    http://www.ip97.com/apache.org/ws/axis/1_4/axis-bin-1_4.zip

    http://apache.justdn.org/ws/axis/1_4/   (�ٷ���վ)

    Ȼ���ѹ��WebApps/axis  ���Ŀ¼���Ƶ� %comcathome%/webapps/��

    Ȼ������tomcat, �� URL : http://localhost:8080/axis/

    ���óɹ��� ����������Ϣ���� validataion,  Ȼ��, ҳ���ϵ���Ϣ��������Ѿ��еİ��ͻ�Ҫ��ð��� Ȼ�������ʾ������İ�����ȫ�� ���Ƶ� %tomcathome%/webapps/axis/WEB-INF/lib Ŀ¼��

   ����tomcat, ֱ������İ���װ��.

   ��ʾ������Ϣ:

   =================

Apache-AXIS
Language: [en] [ja]
Hello! Welcome to Apache-Axis.

What do you want to do today?

    * Validation - Validate the local installation's configuration
      see below if this does not work.
    * List - View the list of deployed Web services
    * Call - Call a local endpoint that list's the caller's http headers (or see its WSDL).
    * Visit - Visit the Apache-Axis Home Page
    * Administer Axis - [disabled by default for security reasons]
    * SOAPMonitor - [disabled by default for security reasons]

To enable the disabled features, uncomment the appropriate declarations in WEB-INF/web.xml in the webapplication and restart it.

Validating Axis
If the "happyaxis" validation page displays an exception instead of a status page, the likely cause is that you have multiple XML parsers in your classpath. Clean up your classpath by eliminating extraneous parsers.

If you have problems getting Axis to work, consult the Axis Wiki and then try the Axis user mailing list. 

   =================

  ͨ��������� ��Validation �����ӣ� ���Բ鿴ȱʧ��Щ�ļ����. 

   activation.jar  �ڱ�Ŀ¼����.

  2. ����һ��������

     ��ʹ�õ�ECLIPSE,��Ȼ��ʵ��eclipse�²�û����axis�Ŀ������,ֻ������д�������

      ����һ����ͨ��web����

      �� %tomcathome%/webapps/axis/WEB-INF/web.xml �ļ����Ƶ������� WEB-INF/��,�滻ԭ����

     �� %tomcathome%/webapps/axis/WEB-INF/lib �µ�jar�����Ƶ������� WEB-INF/lib ��, Ҫ���� activation.jar ��

      ��д�����ļ�����

      src/study/TestHello.java   ��������:

      Java ����

   1. public class TestHello {   
   2.   
   3.  /**  
   4.   * ����  
   5.   * @param name  
   6.   * @return  
   7.   */  
   8.  public String getName(String name){   
   9.     
  10.   return "Hello  "+name;   
  11.      
  12.  }   
  13.     
  14. }   


TestClient.java �ļ�
java ����

   1. public class TestClient {   
   2.        
   3.     public static void main(String[] args) throws Exception {   
   4.   
   5.         // ָ��service����URL    
   6.   
   7.         String endpoint = "http://localhost:8080/����·��/services/TestHello";   
   8.   
   9.         // ����һ������(service)����(call)    
  10.   
  11.         Service service = new Service();   
  12.   
  13.         Call call = (Call) service.createCall();// ͨ��service����call����    
  14.   
  15.         // ����service����URL    
  16.   
  17.         call.setTargetEndpointAddress(new java.net.URL(endpoint));   
  18.   
  19.         // ������(processService)��MyService.java����������һ��    
  20.   
  21.         call.setOperationName("getName");   
  22.   
  23.         // Object �����װ�˲���������Ϊ"This is Test!",����processService(String arg)    
  24.   
  25.         String ret = (String) call.invoke(new Object[] { "���" });   
  26.   
  27.         System.out.println(ret);   
  28.   
  29.     }   
  30.        
  31. }  

 ��дdeploy.xml �ļ�
xml ����

   1. xml version="1.0" encoding="GB18030"?>  
   2. <deployment xmlns="http://xml.apache.org/axis/wsdd/"  
   3.     xmlns:java="http://xml.apache.org/axis/wsdd/providers/java">  
   4.     <service name="TestHello" provider="java:RPC">  
   5.         <parameter name="className" value="study.TestHello" />  
   6.         <parameter name="allowedMethods" value="*" />  
   7.     service>  
   8. deployment>  

  ��дһ�������е�axis  �����ű�  r_make_server.bat

  java -Djava.ext.dirs=lib org.apache.axis.client.AdminClient -lhttp://localhost:8080/toms/servlet/AxisServlet deloy.wsdd

  Ŀ¼�ṹ��������

   /����1--- src/study/TestHello.java
         --- src/study/TestClient.java
         --- webroot/WEB-INF/class/study/TestHello.clsass
         --- webroot/WEB-INF/lib/���е�axis�µ�lib�µİ� + ���صı����jar ��
         --- webroot/WEB-INF/r_make_server.bat
         --- webroot/WEB-INF/web.xml
         --- webroot/WEB-INF/deploy.xml

  3. ֱ����MyEclipse ����Ӧ�ó���ķ�ʽ����TestClient.java



  