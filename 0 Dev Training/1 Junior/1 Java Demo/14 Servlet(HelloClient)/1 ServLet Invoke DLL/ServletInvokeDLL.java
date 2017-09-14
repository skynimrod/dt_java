package com.AquGen.eztalk.controller;

import java.io.IOException;

//import java.io.PrintWriter;	// out


import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.Platform;

/**
 * Servlet implementation class for Servlet: StartUp
 *
 */
 public class ServletInvokeDLL extends javax.servlet.http.HttpServlet implements 
 		javax.servlet.Servlet {
   static final long serialVersionUID = 1L;
   
	public interface CLibrary extends Library {
		CLibrary INSTANCE = (CLibrary)Native.loadLibrary(
			(Platform.isWindows() ? "alog" : "c"), 
			CLibrary.class );

		long wlog( String format, String msg );
	}

    	/* (non-Java-doc)
	 * @see javax.servlet.http.HttpServlet#HttpServlet()
	 */
	public ServletInvokeDLL() {
		super();
	}   	
	
	/* (non-Java-doc)
	 * @see javax.servlet.http.HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 	{
		// TODO Auto-generated method stub
		// PrintWriter out = response.getWriter(); 

	}  	
	
	/* (non-Java-doc)
	 * @see javax.servlet.http.HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
   		System.out.println("This is a test--------DoPost-----------");

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

   		System.out.println("This is a test--------Service-----------");
try
{
		long a = CLibrary.INSTANCE.wlog( "c:\\tiankongtian", "----This is a first aaa---\n" );
		System.out.println("####"+a);
}
catch (Throwable e)
{
	System.out.println("!!!!!" + e.getMessage());
}
		request.setCharacterEncoding("UTF-8");
		HttpSession session = request.getSession(true);
		session.setAttribute("User", null);

		request.getSession(true).setAttribute("errorInfo", null);

		String userName = request.getParameter("UserName");
		String password = request.getParameter("Password");

		session.setAttribute("errorInfo", "��¼ʧ�ܣ������µ�¼!");

//set the MIME type of the response, "text/html"
    response.setContentType("text/html");
    
    //use a PrintWriter to send text data to the client who has requested the
    //servlet
    java.io.PrintWriter out = response.getWriter( );

		//out.println("Hello World"); 

    //Begin assembling the HTML content
    out.println("<html><head>");

    // ------ȫ��--Begin-����ṩ�ű����� onload()  �е��þͿ���ȫ��---------
    out.println("<script language=\"javascript\">");
    out.println("	function omiga_window(){");
    out.println("alert('<%=URL%>');");
    out.println("window.open(\"<%=URL%>\",\"\",\"\");");
    		//window.open("<%=URL%>","","fullscreen,scrollbars");
		//window.opener=null;  
		//window.close();
		//alet("This is a memory");
    out.println("}");
    out.println("</script>");
    // ------ȫ��- end ------
	
    // ˢ�·���1  Refresh 5 seconds -- ע�� URL �еĶ�Ӧ����Ĵ�Сд---- �����Ѿ�ͨ��--------
    //out.println("<meta http-equiv=\"Refresh\" Content=\"5; URL=http://localhost:9900/TTT\">");


    out.println("<title>Help Page</title></head>");
    out.println("<h2>Please submit your information</h2>");
   
   //make sure method="post" so that the servlet service method
   //calls doPost in the response to this form submit
    //out.println("<body><form method=\"get\" action =\"" + request.getContextPath( ) +"/Login\" >");

    // ˢ�·���2�� ע������һ�У���д������Body ������, ����ˢ�·����ĺô����ǲ���������, setTimeout() ������ָ��ʱ���ִ��ָ���ı��ʽ,  ���setTimeout() �ĵ�һ������������this.location.reload(), ��Ϊ������������Զ����ɵ�HTML  ����. ʱ�䵥λ�Ǻ���

    // setInterval()���÷���setTimeout()��һ����:
    // iTimerID = window.setInterval(vCode, iMilliSeconds [, sLanguage])
    // ��ͬ����setTimeout()��һ��������,��setInterval()��ÿ��iMilliSeconds��ִ��һ��vCode.(Evaluates an expression each time a specified number of milliseconds has elapsed)
    // ����2��û�в���ͨ���� ��֪���ض���ҳ��ĺ���

    out.println("<body onload=\"setInterval( window.location.href=\"http://localhost:9900/TTT\" ,5000);\"><form method=\"get\" action =\"" + request.getContextPath( ) +"/Login\" >");
    


    out.println("<table border=\"0\"><tr><td valign=\"top\">");
    out.println("Your first name: </td>  <td valign=\"top\">");
    out.println("<input type=\"text\" name=\"firstname\" size=\"20\">");
    out.println("</td></tr><tr><td valign=\"top\">");
    out.println("Your last name: </td>  <td valign=\"top\">");
    out.println("<input type=\"text\" name=\"lastname\" size=\"20\">");
    out.println("</td></tr><tr><td valign=\"top\">");
    out.println("Your email: </td>  <td valign=\"top\">");
    out.println("<input type=\"text\" name=\"email\" size=\"20\">");
    out.println("</td></tr><tr><td valign=\"top\">");

    out.println("<input type=\"submit\" value=\"Submit Info\"></td></tr>");
    out.println("</table></form>");
    out.println("</body></html>");


		//	response.sendRedirect("Login.jsp");
	}

}

/*

   ��Ҫע����ǣ� ���service �����е�Form  method  �������� ��Servlet�� ����Ȼ������ִ��service ���ݣ� ���������������Servlet ����servlet �Ĵ���˳�������Ӧ�ķ���. 

   ��Ҫ��Jna.jar  ������ Tomcat ��lib Ŀ¼��. ������Ҫ�� DLL  ������path  �п��ҵ���Ŀ¼��.  wlog  ִ�к󷵻�:   8977342377265987584 = 0x7C95ED5400000000 , Ϊʲô�������ֵ��  ִ�гɹ�Ӧ����0�� ��������AlogTest,���ֳɹ�������־�ļ���Ҳ�������ֵ�� 

  ��� filename = "c:/tiantian", �� wlog  ���� 197568495615 = 0x2DFFFFFFFF�� ��-1. 

*/