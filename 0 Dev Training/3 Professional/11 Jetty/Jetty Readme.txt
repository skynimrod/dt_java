参见:

     http://baike.baidu.com/view/1425008.htm?fr=aladdin

. Jetty 是一个开源的servlet 容器, 它为基于Java 的Web 内容, 例如 JSP 和 servlet 提供运行环境. Jetty 是使用Java 语言编写的, 它的API 以一组JAR包的形式发布. 开发人员可以将Jetty 容器实例化成一个对象, 可以迅速为一些独立运行(stand-alone)的 Java 应用提供网络和Web 连接.

. 特性

  1. 易用性

     通过XML 或者 API 来对 Jetty 进行配置; 默认配置就可以满足大部分的需求; 将Jetty 嵌入到应用程序当中只需要非常少的代码;

  2. 可扩展性

     在使用了Ajax 的Web 2.0 的 应用程序中, 每个连接需要保持更长的时间, 这样线程和内存的消耗量会急剧的增加, 这就使得我们担心整个程序会因为单个组件陷入瓶颈而影响整个程序的性能.

     但是有了Jetty：

     即使在有大量服务请求的情况下, 系统的性能也能保持在一个可以接受的状态. 利用 Continuation 机制来处理大量的用户请求以及时间比较长的连接. 另外, Jetty 涉及了非常良好的接口, 因此在Jetty 的某种实现无法满足用户的需求时, 用户可以非常方便的对Jetty 的某些实现进行修改, 使得Jetty 适用于特殊的应用程序的需求.

  3. 易嵌入性

     Jetty 设计之初就是作为一个优秀的组件来设计的, 这也就意味着Jetty 可以非常容易的嵌入到应用程序当中, 而不需要程序为了使用Jetty 做修改. 从某种程度上, 你也可以把Jetty 理解为一个嵌入式的Web 服务器.

     Jetty 可以作为嵌入是服务器使用, Jetty 的运行速度较快, 而且是轻量级的, 可以在Java 中从 test case 中控制器运行. 从而可以是自动化测试不再依赖外部环境， 顺利实现自动化测试.

. 代码示例

  作为嵌入是服务器使用代码示例

  Java 代码:

   // 代码: 以嵌入模式启动Jetty
   import org.mortbay.http.HttpContext;
   import org.mortbay.http.HttpServer;
   import org.mortbay.http.SocketListener;
   import org.mortbay.http.handler.ResourceHandler;

   public classJettySample {
	public static void main( String[] args ) throws Exception  {
		// 创建JettyHttpServe 对象
		HttpServer server = new HttpServer();

		// 在端口8080 上给HttpServer 对象绑上一个listener，使之能够接受HTTP请求
		SocketListener	listener = new SocketListener();
		listener.setPort( 8080 );
		server.addListener( listener );

		// 创建一个HttpContext, 处理Http 请求
		HttpContext 	context  = new HttpContext()

		// 用setContextPath 吧Context 映射到(/web) URL上
		context.setContextPath( "/web" );

		// setResourceBase 方法设置文档目录以提供资源
		context.setResourceBase( "c:\\j2sdk1.4.1_05" );

		//添加资源处理器到HttpContext, 使之能够提供文件系统中的文件
		context.addHandle( new ResourceHandler() );
		server.addContext( context );

		// 启动服务器
		server.start();
   	}
   }

   需要的jar 包

   commons-logging.jar

   javax.servlet.jar

   org.mortbay.jetty.jar

   org.mortbay.jmx.jar

  ===============================================

   jetty 还有对应maven 插件

   maven pom 文件的设置

   <?xml version = "1.0" encoding="utf-8"?>

   <plugin>
	<groupId>org.mortbay.jetty</grougId>
	<artifactId>maven-jetty-plugin</artifactId>
	<version>6.1.10</version>
	<configuration>
	</configuration>
   </plugin>
  