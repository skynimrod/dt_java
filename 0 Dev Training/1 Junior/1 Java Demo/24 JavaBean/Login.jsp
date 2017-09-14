<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.AquGen.eztalk.controller.FirstJavaBean" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>ENSURE YOUR SUCCESS</title>

<LINK REL=STYLESHEET HREF="Login.css" TYPE="text/css">

<%
	String ip = request.getRemoteAddr();
	FirstJavaBean firstJavaBean = new FirstJavaBean();
	firstJavaBean.setFirstProperty(ip);
	String URL=firstJavaBean.returnIpString();
%>
<script language="javascript">
	function omiga_window(){
		alert('<%=URL%>');
		window.open("<%=URL%>","","");
		//window.open("<%=URL%>","","fullscreen,scrollbars");
		//window.opener=null;  
		//window.close();
		//alet("This is a memory");
	}
</script>

</head>
<body onload="omiga_window()">
<div id="Layer1">
  <form name="form1" method="post" action="Login2">
  <div id="Layer2">姓名</div>
  <div id="Layer3"><input type="text" name="UserName" id="UserName" size="25" /></div>
  
  <div id="Layer4">
    <input type="submit" name ="LoginButton" id="Login" value ="登录" size="25"/>
  </div>
  <div id="Layer6">密码<%=URL %></div>
  <div id="Layer7"><input type="password" name="Password" id="Password" size="25"/></div>
  <div id="Layer8"><input type="submit" name="CancelButton" id="Cancel" value="取消" size="25"/></div>
  </form>
  
</div>

</body>
</html>