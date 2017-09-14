package com.AquGen.eztalk.controller;

import java.io.IOException;

//import java.io.PrintWriter;	// out


import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class for Servlet: StartUp
 *
 */
 public class StartUpWithProcess extends javax.servlet.http.HttpServlet implements 
 		javax.servlet.Servlet {
   static final long serialVersionUID = 1L;
   
    /* (non-Java-doc)
	 * @see javax.servlet.http.HttpServlet#HttpServlet()
	 */
	public StartUpWithProcess() {
		super();
	}   	
	
	/* (non-Java-doc)
	 * @see javax.servlet.http.HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
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
    
    out.println("<title>Help Page</title></head><body>");
    out.println("<h2>Please submit your information</h2>");
   
   //make sure method="post" so that the servlet service method
   //calls doPost in the response to this form submit
    out.println(
        "<form method=\"get\" action =\"" + request.getContextPath( ) +
            "/Login\" >");

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

       try {
          Process process = Runtime.getRuntime().exec("cmd.exe  /c  start  http://www.csdn.net");  //登录网站
          Process process1 = Runtime.getRuntime().exec("cmd.exe  /c  start  notepad");  //调用Ping命令
        }catch (Exception  e)
        {
            e.printStackTrace();
            } 


		//	response.sendRedirect("Login.jsp");
	}

}

/*

   需要注意的是， 如果service 方法中的Form  method  触发的是 本Servlet， 则仍然会优先执行service 内容， 如果触发的是其他Servlet 则按照servlet 的触发顺序调用相应的方法. 

*/