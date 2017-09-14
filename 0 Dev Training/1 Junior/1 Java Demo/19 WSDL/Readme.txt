. 使用Java 实现WebService

  有2种模式， 1种是发布的，另一种是调用的. 

  参见 http://lxj8495138.javaeye.com/blog/301211

       http://blog.chinaunix.net/u/11794/showart_95645.html

. SOAP  是基于XML 的通讯协议及编码格式规范. 

  Axis  实质上是个SOAP  引擎. 除此之外， 它还包括:

    一个简单的独立服务器

    可以嵌入到服务器里的插件(例如嵌入到Tomcat)

    支持WSDL

    从WSDL  生成 Java  类

    一些例程

    监控 TCP/IP包的工具. 

. 使用axis  可以将任何已经有的java  类提供位可供调用的webservice 接口.

  1. 环境搭建和测试

    将Tomcat  和 JDK  配置好, 然后下在Apache  上的axis 1.4, 这里有两2个版本axis 1.4  和 axis 2,  这里使用axis 1.4

    http://www.ip97.com/apache.org/ws/axis/1_4/axis-bin-1_4.zip

    http://apache.justdn.org/ws/axis/1_4/   (官方网站)

    然后解压后将WebApps/axis  这个目录复制到 %comcathome%/webapps/下

    然后启动tomcat, 打开 URL : http://localhost:8080/axis/

    配置成功后， 将有如下信息，打开 validataion,  然后, 页面上的信息会告诉你已经有的包和还要差得包， 然后根据提示将必须的包下在全， 复制到 %tomcathome%/webapps/axis/WEB-INF/lib 目录下

   重起tomcat, 直道必须的包都装齐.

   显示如下信息:

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

  通过点上面的 “Validation ”链接， 可以查看缺失哪些文件或包. 

   activation.jar  在本目录下有.

  2. 创建一个服务类

     我使用的ECLIPSE,当然其实在eclipse下并没有用axis的开发插件,只是用来写代码而已

      创建一个普通的web工程

      将 %tomcathome%/webapps/axis/WEB-INF/web.xml 文件复制到工程中 WEB-INF/下,替换原来的

     将 %tomcathome%/webapps/axis/WEB-INF/lib 下的jar包复制到工程下 WEB-INF/lib 下, 要包括 activation.jar 包

      编写如下文件代码

      src/study/TestHello.java   内容如下:

      Java 代码

   1. public class TestHello {   
   2.   
   3.  /**  
   4.   * 测试  
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


TestClient.java 文件
java 代码

   1. public class TestClient {   
   2.        
   3.     public static void main(String[] args) throws Exception {   
   4.   
   5.         // 指出service所在URL    
   6.   
   7.         String endpoint = "http://localhost:8080/虚拟路径/services/TestHello";   
   8.   
   9.         // 创建一个服务(service)调用(call)    
  10.   
  11.         Service service = new Service();   
  12.   
  13.         Call call = (Call) service.createCall();// 通过service创建call对象    
  14.   
  15.         // 设置service所在URL    
  16.   
  17.         call.setTargetEndpointAddress(new java.net.URL(endpoint));   
  18.   
  19.         // 方法名(processService)与MyService.java方法名保持一致    
  20.   
  21.         call.setOperationName("getName");   
  22.   
  23.         // Object 数组封装了参数，参数为"This is Test!",调用processService(String arg)    
  24.   
  25.         String ret = (String) call.invoke(new Object[] { "你好" });   
  26.   
  27.         System.out.println(ret);   
  28.   
  29.     }   
  30.        
  31. }  

 编写deploy.xml 文件
xml 代码

   1. xml version="1.0" encoding="GB18030"?>  
   2. <deployment xmlns="http://xml.apache.org/axis/wsdd/"  
   3.     xmlns:java="http://xml.apache.org/axis/wsdd/providers/java">  
   4.     <service name="TestHello" provider="java:RPC">  
   5.         <parameter name="className" value="study.TestHello" />  
   6.         <parameter name="allowedMethods" value="*" />  
   7.     service>  
   8. deployment>  

  编写一个命令行的axis  发布脚本  r_make_server.bat

  java -Djava.ext.dirs=lib org.apache.axis.client.AdminClient -lhttp://localhost:8080/toms/servlet/AxisServlet deloy.wsdd

  目录结构是这样的

   /工程1--- src/study/TestHello.java
         --- src/study/TestClient.java
         --- webroot/WEB-INF/class/study/TestHello.clsass
         --- webroot/WEB-INF/lib/所有的axis下的lib下的包 + 下载的必须的jar 包
         --- webroot/WEB-INF/r_make_server.bat
         --- webroot/WEB-INF/web.xml
         --- webroot/WEB-INF/deploy.xml

  3. 直接在MyEclipse 中以应用程序的方式运行TestClient.java



  