Sun��˾��������JDBC-ODBC bridge���ô˼�����Java����Ϳ��Է��ʴ���ODBC������������ݿ⣬

������������Accessʵ��һ����̬FAQ(�������⼰��) ��վ��
���Ƚ���һ��Access���ݿ�(faq.mdb)��������Ʊ�(Table) faqs,���ֶ�id(�Զ������ͣ�����Ϊ���ؼ���), subject(�����ͣ�����200), answers(��ע��)��������п��Դ��һЩ���֪ʶ�ĳ������⼰�𰸡���ͼ4��

Ȼ����Control Panel(�������)��ODBC Datasourceģ���У�����System DSN��ȡ��faq����ָ��faq.mdb��
����һ��JavaBean��faq.java����������jswdk-1.0.1webpagesWEB-INFjspeans estĿ¼�¡�faq.java ���������£�
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
����һ�ڽ��ܵķ�������faq.java�Ժ��� jswdk-1.0.1webpages est Ŀ¼�´���JSP�ļ�faq.jsp���������£�
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<title>�ҵ�FAQ !</title>
</head>
<body>
<p><b>�����ҵ�FAQ!</b></p>
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
%> �� 