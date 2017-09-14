. Java  的Servlet

  在Web 应用中, Servlet  用来动态创建 页面，现有的Web服务器软件中， Apache 2.2 及以下不支持动态页面(2.2  之上的版本没有测试)， Tomcat 6.0 支持Servlet 的部署，支持动态页面.

  参考资料:

     http://www.stcsm.gov.cn/learning/lesson/xinxi/20020617/20020617-4.asp

. Eclipse 开发 Servlet 步骤

  1. 创建 Web App 应用

     New ->。。。略

  2. 创建 Servlet所在的 package

     略

  3. 右键点击 package

     new -> class , 然后选择 Super class 为 。。

  4. 关于部署

     如果Eclipse Export  War 到Tomcat 不能正常工作的话, 可以手工将相关文件拷贝到Tomcat 下对应目录下即可.

  5. 特别需要注意的是, 如果修改了web.xml, 需要将 Tomcat 重新启动一次, 不然总会出现(不一定是每一次)调用 Servlet 错误, 如下:

     type   Status   report 

     message   /servlet/HelloWorld 

     description   The   requested   resource   (/servlet/HelloWorld)   is   not   available. 



     参见:

        http://topic.csdn.net/t/20041115/21/3555657.html


. 关于Tomcat 6.0 及之上的Servlet 应用

  Tomcat 6.0 的WebApps 目录中存放各种Web  应用(包括动态及静态的)，每个应用对应一个子目录。 对于带Servlet 的应用， 其子目录下应该包含WEB-INF 目录. WEB-INF  一般包含2个子目录: classes, lib ，一个文件web.xml .  Servlet  部署在 classes  子目录中, 然后在web.xml  中对该Servlet 进行描述， 然后 该Servlet  就可以像 HTML， JSP 等一样应用了，即可以在URL  中指定.

  下面举一个典型的例子:

   有2个Servlet: Login, Login2, 路径:  com.AguGen.eztalk.controller.Login, com.AguGen.eztalk.controller.Login2

   如果在 <welcome-file-list>  增加 Servlet 的描述， 例如:   <welcome-file>Login</welcome-file>,  由于这一条在最上面， 执行
     http://127.0.0.1:9900/TTT/ 后，会优先执行Servlet Login. 

   


  在WEB-INF\web.xml 配置， 如下例:

<?xml version="1.0" encoding="UTF-8"?>
<web-app id="WebApp_ID" version="2.4"
 xmlns="http://java.sun.com/xml/ns/j2ee"
 xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://java.sun.com/xml/ns/j2ee http://java.sun.com/xml/ns/j2ee/web-app_2_4.xsd">
 <display-name>Kunkun</display-name>
 <servlet>
  <description>登录</description>
  <display-name>Login</display-name>
  <servlet-name>Login</servlet-name>
  <servlet-class>com.AquGen.eztalk.controller.Login</servlet-class>
 </servlet>
 <servlet>
  <display-name>Login2</display-name>
  <servlet-name>Login2</servlet-name>
  <servlet-class>com.AquGen.eztalk.controller.Login2</servlet-class>
 </servlet>
 <servlet-mapping>
  <servlet-name>Login</servlet-name>
  <url-pattern>/Login</url-pattern>
 </servlet-mapping>
 <servlet-mapping>
  <servlet-name>Login2</servlet-name>
  <url-pattern>/Login2</url-pattern>
 </servlet-mapping>
 <welcome-file-list>
  <welcome-file>Login</welcome-file>
  <welcome-file>Login.jsp</welcome-file>
  <welcome-file>index.html</welcome-file>
  <welcome-file>index.htm</welcome-file>
  <welcome-file>index.jsp</welcome-file>
  <welcome-file>default.html</welcome-file>
  <welcome-file>default.htm</welcome-file>
  <welcome-file>default.jsp</welcome-file>
 </welcome-file-list>
 <login-config>
  <auth-method>BASIC</auth-method>
 </login-config>
</web-app>

. 附: Servlet  的典型例子源码(Login.java)

  package com.AquGen.eztalk.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class for Servlet: Login
 *
 */
 public class Login extends javax.servlet.http.HttpServlet implements 
 		javax.servlet.Servlet {
   static final long serialVersionUID = 1L;
   
    /* (non-Java-doc)
	 * @see javax.servlet.http.HttpServlet#HttpServlet()
	 */
	public Login() {
		super();
	}   	
	
	/* (non-Java-doc)
	 * @see javax.servlet.http.HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// PrintWriter out = response.getWriter(); 
		//out.println("Hello World"); 
	}  	
	
	/* (non-Java-doc)
	 * @see javax.servlet.http.HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}   
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.servlet.http.HttpServlet#service(javax.servlet.http.HttpServletRequest,
	 *      javax.servlet.http.HttpServletResponse)
	 */
	@Override
	protected void service(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException
	{
		request.setCharacterEncoding("UTF-8");
		HttpSession session = request.getSession(true);
		session.setAttribute("User", null);

		request.getSession(true).setAttribute("errorInfo", null);

		String userName = request.getParameter("UserName");
		String password = request.getParameter("Password");

		session.setAttribute("errorInfo", "登录失败，请重新登录!");

		response.sendRedirect("Login.jsp");
	}

}

.
 Response.SetContentType用于设置ASP输出的文档MIME类型，默认为text/html，是HTML文档的类型。如果需要生成JPEG类型，就要设置成image/jpeg：

Response.SetContentType = "image/jpeg"

常用的MIME类型还有image/gif（GIF图片）、image/bitmap（BMP图象）、text/plain（文本文档TXT）、text/vnd.wap.wml（手机WAP页面）等

response.setContentType()的String参数及对应类型 

<option   value="image/bmp">BMP</option>  
<option   value="image/gif">GIF</option>  
<option   value="image/jpeg">JPEG</option>  
<option   value="image/tiff">TIFF</option>  
<option   value="image/x-dcx">DCX</option>  
<option   value="image/x-pcx">PCX</option>  
<option   value="text/html">HTML</option>  
<option   value="text/plain">TXT</option>  
<option   value="text/xml">XML</option>  
<option   value="application/afp">AFP</option>  
<option   value="application/pdf">PDF</option>  
<option   value="application/rtf">RTF</option>  
<option   value="application/msword">MSWORD</option>  
<option   value="application/vnd.ms-excel">MSEXCEL</option>  
<option   value="application/vnd.ms-powerpoint">MSPOWERPOINT</option>  
<option   value="application/wordperfect5.1">WORDPERFECT</option>  
<option   value="application/vnd.lotus-wordpro">WORDPRO</option>  
<option   value="application/vnd.visio">VISIO</option>  
<option   value="application/vnd.framemaker">FRAMEMAKER</option>  
<option   value="application/vnd.lotus-1-2-3">LOTUS123</option>

. 附: Tomcat  6.0 的启动

  目前的楼宇建筑等安全保障措施有:
保安人员值班巡逻
火警终端，摄像头终端及监控室24小时值班

  可以通过 菜单项启动， 也可以通过bin目录下执行tomcat6.exe  和 tomcat6w.exe  启动， 其中 tomcat6.exe  是命令行格式，可以看到启动过程中的信息，包括加载过程中可能的错误信息， tomcat6w.exe  与菜单项启动效果一样. 