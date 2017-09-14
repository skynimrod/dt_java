Sun公司还开发了JDBC-ODBC bridge，用此技术，Java程序就可以访问带有ODBC驱动程序的数据库，

下面介绍如何用Access实现一个动态FAQ(常见问题及答案) 网站。
首先建立一个Access数据库(faq.mdb)，其中设计表(Table) faqs,有字段id(自动增量型，并设为主关键字), subject(文字型，长度200), answers(备注型)。这个表中可以存放一些编程知识的常见问题及答案。见图4。

然后，在Control Panel(控制面板)的ODBC Datasource模块中，加入System DSN，取名faq，并指向faq.mdb。
创建一个JavaBean，faq.java，并保存在jswdk-1.0.1webpagesWEB-INFjspeans est目录下。faq.java 的内容如下：
package test;
import java.sql.*;
public class faq {
String sDBDriver = "sun.jdbc.odbc.JdbcOdbcDriver";
String sConnStr = "jdbc:odbc:faq";
Connection conn = null;
ResultSet rs = null;
public faq() {
try {
Class.forName(sDBDriver);
}
catch(java.lang.ClassNotFoundException e) {
System.err.println("faq(): " + e.getMessage());
}
}

public ResultSet executeQuery(String sql) {
rs = null;
try {
conn = DriverManager.getConnection(sConnStr);
Statement stmt = conn.createStatement();
rs = stmt.executeQuery(sql);
}
catch(SQLException ex) {
System.err.println("aq.executeQuery: " + ex.getMessage());
}
return rs;
}
}
用上一节介绍的方法编译faq.java以后，在 jswdk-1.0.1webpages est 目录下创建JSP文件faq.jsp，内容如下：
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<title>我的FAQ !</title>
</head>
<body>
<p><b>这是我的FAQ!</b></p>
<%@ page language="java" import="java.sql.*" %>
<jsp:useBean id="workM" scope="page" class="test.faq" />
<%
ResultSet RS = workM.executeQuery("SELECT * FROM faqs");
String tt;
while (RS.next()) {
tt = RS.getString("Answer");
out.print("<LI>" + RS.getString("Subject") + "</LI>");
out.print("<pre>" + tt + "</pre>");
}
RS.close();
%> 　 