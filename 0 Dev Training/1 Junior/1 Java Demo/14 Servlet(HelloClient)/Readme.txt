. Java  ��Servlet

  ��Web Ӧ����, Servlet  ������̬���� ҳ�棬���е�Web����������У� Apache 2.2 �����²�֧�ֶ�̬ҳ��(2.2  ֮�ϵİ汾û�в���)�� Tomcat 6.0 ֧��Servlet �Ĳ���֧�ֶ�̬ҳ��.

  �ο�����:

     http://www.stcsm.gov.cn/learning/lesson/xinxi/20020617/20020617-4.asp

. Eclipse ���� Servlet ����

  1. ���� Web App Ӧ��

     New ->��������

  2. ���� Servlet���ڵ� package

     ��

  3. �Ҽ���� package

     new -> class , Ȼ��ѡ�� Super class Ϊ ����

  4. ���ڲ���

     ���Eclipse Export  War ��Tomcat �������������Ļ�, �����ֹ�������ļ�������Tomcat �¶�ӦĿ¼�¼���.

  5. �ر���Ҫע�����, ����޸���web.xml, ��Ҫ�� Tomcat ��������һ��, ��Ȼ�ܻ����(��һ����ÿһ��)���� Servlet ����, ����:

     type   Status   report 

     message   /servlet/HelloWorld 

     description   The   requested   resource   (/servlet/HelloWorld)   is   not   available. 



     �μ�:

        http://topic.csdn.net/t/20041115/21/3555657.html


. ����Tomcat 6.0 ��֮�ϵ�Servlet Ӧ��

  Tomcat 6.0 ��WebApps Ŀ¼�д�Ÿ���Web  Ӧ��(������̬����̬��)��ÿ��Ӧ�ö�Ӧһ����Ŀ¼�� ���ڴ�Servlet ��Ӧ�ã� ����Ŀ¼��Ӧ�ð���WEB-INF Ŀ¼. WEB-INF  һ�����2����Ŀ¼: classes, lib ��һ���ļ�web.xml .  Servlet  ������ classes  ��Ŀ¼��, Ȼ����web.xml  �жԸ�Servlet ���������� Ȼ�� ��Servlet  �Ϳ����� HTML�� JSP ��һ��Ӧ���ˣ���������URL  ��ָ��.

  �����һ�����͵�����:

   ��2��Servlet: Login, Login2, ·��:  com.AguGen.eztalk.controller.Login, com.AguGen.eztalk.controller.Login2

   ����� <welcome-file-list>  ���� Servlet �������� ����:   <welcome-file>Login</welcome-file>,  ������һ���������棬 ִ��
     http://127.0.0.1:9900/TTT/ �󣬻�����ִ��Servlet Login. 

   


  ��WEB-INF\web.xml ���ã� ������:

<?xml version="1.0" encoding="UTF-8"?>
<web-app id="WebApp_ID" version="2.4"
 xmlns="http://java.sun.com/xml/ns/j2ee"
 xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://java.sun.com/xml/ns/j2ee http://java.sun.com/xml/ns/j2ee/web-app_2_4.xsd">
 <display-name>Kunkun</display-name>
 <servlet>
  <description>��¼</description>
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

. ��: Servlet  �ĵ�������Դ��(Login.java)

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

		session.setAttribute("errorInfo", "��¼ʧ�ܣ������µ�¼!");

		response.sendRedirect("Login.jsp");
	}

}

.
 Response.SetContentType��������ASP������ĵ�MIME���ͣ�Ĭ��Ϊtext/html����HTML�ĵ������͡������Ҫ����JPEG���ͣ���Ҫ���ó�image/jpeg��

Response.SetContentType = "image/jpeg"

���õ�MIME���ͻ���image/gif��GIFͼƬ����image/bitmap��BMPͼ�󣩡�text/plain���ı��ĵ�TXT����text/vnd.wap.wml���ֻ�WAPҳ�棩��

response.setContentType()��String��������Ӧ���� 

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

. ��: Tomcat  6.0 ������

  Ŀǰ��¥����Ȱ�ȫ���ϴ�ʩ��:
������Աֵ��Ѳ��
���նˣ�����ͷ�ն˼������24Сʱֵ��

  ����ͨ�� �˵��������� Ҳ����ͨ��binĿ¼��ִ��tomcat6.exe  �� tomcat6w.exe  ������ ���� tomcat6.exe  �������и�ʽ�����Կ������������е���Ϣ���������ع����п��ܵĴ�����Ϣ�� tomcat6w.exe  ��˵�������Ч��һ��. 