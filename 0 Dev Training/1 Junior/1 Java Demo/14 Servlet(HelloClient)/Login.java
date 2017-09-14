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
//set the MIME type of the response, "text/html"

    System.out.println("This is a test---DoGet----------------");

    response.setContentType("text/html");
    
    //use a PrintWriter to send text data to the client who has requested the
    //servlet
    java.io.PrintWriter out = response.getWriter( );

		//out.println("Hello World"); 

    //Begin assembling the HTML content
    out.println("<html><head>");
    
    out.println("<title>Help Page</title></head><body>");
    out.println("<h2>Please submit your information DoGet----------</h2>");
   
   //make sure method="post" so that the servlet service method
   //calls doPost in the response to this form submit
    out.println(
        "<form method=\"post\" action =\"" + request.getContextPath( ) +
            "/StartUp\" >");

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

		session.setAttribute("errorInfo", "µÇÂ¼Ê§°Ü£¬ÇëÖØÐÂµÇÂ¼!");

		//response.sendRedirect("Login.jsp");
	}

}