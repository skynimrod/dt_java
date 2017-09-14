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

		session.setAttribute("errorInfo", "登录失败，请重新登录!");

//set the MIME type of the response, "text/html"
    response.setContentType("text/html");
    
    //use a PrintWriter to send text data to the client who has requested the
    //servlet
    java.io.PrintWriter out = response.getWriter( );

		//out.println("Hello World"); 

    //Begin assembling the HTML content
    out.println("<html><head>");

    // ------全屏--Begin-这儿提供脚本，在 onload()  中调用就可以全屏---------
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
    // ------全屏- end ------
	
    // 刷新方法1  Refresh 5 seconds -- 注意 URL 中的对应后面的大小写---- 测试已经通过--------
    //out.println("<meta http-equiv=\"Refresh\" Content=\"5; URL=http://localhost:9900/TTT\">");


    out.println("<title>Help Page</title></head>");
    out.println("<h2>Please submit your information</h2>");
   
   //make sure method="post" so that the servlet service method
   //calls doPost in the response to this form submit
    //out.println("<body><form method=\"get\" action =\"" + request.getContextPath( ) +"/Login\" >");

    // 刷新方法2， 注释上面一行，重写，增加Body 的属性, 这种刷新方法的好处就是不会有声音, setTimeout() 用于在指定时间后执行指定的表达式,  这儿setTimeout() 的第一个参数不能是this.location.reload(), 因为这个参数就是自动生成的HTML  本身. 时间单位是毫秒

    // setInterval()的用法和setTimeout()是一样的:
    // iTimerID = window.setInterval(vCode, iMilliSeconds [, sLanguage])
    // 不同的是setTimeout()是一次性作用,而setInterval()是每隔iMilliSeconds就执行一次vCode.(Evaluates an expression each time a specified number of milliseconds has elapsed)
    // 方法2尚没有测试通过， 不知道重定向页面的函数

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

   需要注意的是， 如果service 方法中的Form  method  触发的是 本Servlet， 则仍然会优先执行service 内容， 如果触发的是其他Servlet 则按照servlet 的触发顺序调用相应的方法. 

   需要将Jna.jar  拷贝到 Tomcat 的lib 目录下. 另外需要将 DLL  拷贝到path  中可找到的目录下.  wlog  执行后返回:   8977342377265987584 = 0x7C95ED5400000000 , 为什么返回这个值？  执行成功应该是0， 返回来查AlogTest,发现成功创建日志文件后，也返回这个值。 

  如果 filename = "c:/tiantian", 则 wlog  返回 197568495615 = 0x2DFFFFFFFF， 即-1. 

*/