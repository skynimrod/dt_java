import java.sql.*;
//����java�������Ӱ���java�������е����ݿ�ĵ��õĶ��������������

// ������ͨ��JDBC-ODBC Bridge  ʵ�ֶ����ݿ�ķ���.

public class CreateDBDemo {
    
     public static void main( String args[] ) {

         String url = "jdbc:odbc:AD_TEST";      //  ȡ�����ӵ�url���� ע��sqlserver  ��dsn ��

         Connection  con;                                      // ʵ����һ��Connection ����

         Statement  stmt;

         String  query = "select * from col_link ";             // ѡ�����е�col_link  ���е��������

         try {
              Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");    // ����jdbc-odbc ������
         } catch( java.lang.ClassNotFoundException e ) {
              System.err.print( "ClassNotFoundException e" );                               // ���� jdbc-odbc �Ŵ���
              System.err.println( e.getMessage() );             // ��������
         }
         // ���ϲ���ִ����ȷ

         try {
              System.out.println("----1------");
              //con = DriverManager.getConnection( url, "root","gPekin1" );    // ���ݿ�����
              con = DriverManager.getConnection( url );    // ���ݿ�����
              System.out.println("----3------");

              stmt = con.createStatement();                     // Create  һ������

              // ִ����һ��sql ���������һ���� col_link �ı�
              stmt.executeUpdate( "Create Table col_link (sitename varchar(20) NULL, siteurl varchar (50) NULL )" );

              // ִ�� Insert into ���
//              System.out.println("----1------");
              stmt.executeUpdate( "insert into col_link values ('sian', 'http://www.sina.com.cn') " );
              stmt.executeUpdate( "insert into col_link values ('sohu', 'http://news.sohu.com' ) " );

//              System.out.println("----4------");

              // ִ��update ��䣬 �������ݿ�
              stmt.executeUpdate("update col_link set siteurl = 'http://www.test.com' where siteurl='http://xuankong.com'");

              // ����һ�������
              ResultSet rs = stmt.executeQuery( query );

              // ʹ��while  ѭ����ӡ��col_link   �е���������
              System.out.println("col_link  ���е���������(ԭʼ����)");

              System.out.println( "վ����" + "վ���ַ" );
              System.out.println( "-------+---------" );

              while( rs.next() ) {
                  // ȡ�����ݿ��е�����
                  String  s = rs.getString( "sitename" );
                  String  f = rs.getString( "siteurl" );

                  System.out.println( s + " " + f );
                  

                  // Jdbc  �ṩ�����ַ���ʶ���ֶ�, һ����ʹ�� getXXX(�����getXXX��ʾȡ��ͬ�����ֶεĲ�ͬ�ķ���) ����ֶ������ڶ��� ��ͨ���ֶ������� ����ѵڶ��ַ���ע���� 

                  // ���Է���������ӻ��getXXX�ķ���:
                  //       http://java.sun.com/docs/books/tutorial/jdbc/basics/_retrievingTable.html

                  // String t = rs.getString(1);
                  // String l = rs.getString(2);
                  // System.out.println( t + " " + l );
              }

              // �ر�����������
              stmt.close();
              con.close();
         }  catch( SQLException ex ) {
              // ��ʾ���ݿ����Ӵ�����߲�ѯ����
              System.err.println( "SQLException: " + ex.getMessage() );
         }

     }

}


/*
���:

     ���ϳ��� ����(Javac CreateDBDemo.java)����Java CreateDBDemo���У� �������´���:

     SQLException: [MySQL][ODBC 5.1 Driver]Access denied for user 'root'@'localhost'

     ���ӵ��Դ�ӡ��䷢�֣� ������������� : 

              con = DriverManager.getConnection( url, "root","rMoonSta1" );    // ���ݿ�����

     ���������� ���ԣ��޸�Ϊ:

              con = DriverManager.getConnection( url, "root","gPekin1" );    // ���ݿ�����


     ================================================

     �������ԣ� ����������������⣺

                       stmt.executeUpdate( "insert into col_link values ('����', 'http://www.sina.com.cn') " );

     SQLException: [MySQL][ODBC 5.1 Driver][mysqld-5.0.45-community-nt]Incorrect stri
ng value: '\xE6\x96\xB0\xE6\xB5\xAA' for column 'sitename' at row 1

     ���ƴ���ԭ���Ǻ���֧�����⡣ �������޸�Ϊ��ĸ�󣬹�Ȼû�������ˡ����������֧�ֺ���? ͨ��MySQL �Ŀͻ��ˣ�����:

           update col_link set sitename = '����' where sitename = 'sian'

     ���֣����ݿⱾ��֧������û�����⣬ Ӧ����ODBC  ֧�ֵ�����.

     �������ݿ��ʱ�� Ϊ�˷�ֹ���� ����Դ���ƹ����Ĵ����������Խ��û��������밴�������зֿ�д. ������ͳһд��һ���ַ�����. 

                   con = DriverManager.getConnection( url );    // ���ݿ�����

     ͬ����URI����һ���ϳ��ĸ�ʽ��    
   
  "jdbc:oracle:thin:@(description=(address=(host=   _IP>)(protocol    
  =tcp)(port=))(connect_data=(sid=)))"    
    
  
      jdbc:mysql://localhost:3306/test

����һ��url�ĵ���д����
�ֱ��ʾ��������ַ���˿ڣ����ݿ���
��ȻҲ���԰��û���������д��һ��
�ο����ϣ�http://www.javabiz.cn 

     uri �����"jdbc:odbc:AD_TEST", ����ȷ�ģ����ָ��IP("jdbc:odbc:AD_TEST//127.0.0.1:3306")�� ��������´���:

   SQLException: [Microsoft][ODBC �������������] δ��������Դ���Ʋ���δָ��Ĭ����������"

    ����:

        ������JDBC ͨ��ODBC �������ݿ�, ���Բ���Ҫ����IP��ַ�Ͷ˿���Ϣ(ODBC ����DSN ��ʱ���Ѿ���������ص���Ϣ). ����ODBC�п��������û������룬 ������������Բ��������û���������. ��Ȼ������ODBC�в������û��������룬 ���ڴ����������û��������������. 

    ���Ϻܶ����Ӷ�����DriverManager.getConnection���������ݿ����ӣ�������������ǲ��Ƽ��ģ���Ϊ���п������������
�ڷ������У����е�DriverManagerr���ö�����ͬ����, �����������ݿ�����������Ƶ�����ã�����JDBC�����ڲ�Ҳ����кܶ�ͬ��������һ���ܺ��úܳ�ʱ��ĵ��ÿ���ʹ����Java�������JDBC��������ϣ�Ȼ�����������

    ��� ���ݿ����������˳�ʱʱ�䣬��ô��Ҫ��̬�������ݿ�����������. 

 */

