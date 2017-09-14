import java.sql.*;
//����java�������Ӱ���java�������е����ݿ�ĵ��õĶ��������������

public class CreateDBDemo1 {
    
     public static void main( String args[] ) {

         String url = "jdbc:mysql://127.0.0.1:3306/test?useUnicode=true&amp;characterEncoding=utf-8";      //  ȡ�����ӵ�url���� ע��sqlserver  ��dsn ��
         //String url = "jdbc:mysql://10.130.33.146:3306/test?useUnicode=true&amp;characterEncoding=utf-8";      //  ȡ�����ӵ�url���� ע��sqlserver  ��dsn ��

         Connection  con;                                      // ʵ����һ��Connection ����

         Statement  stmt;

         String  query = "select * from col_link ";             // ѡ�����е�col_link  ���е��������

         try {
              Class.forName("com.mysql.jdbc.Driver");          // ����jdbc for MySQL ����
         } catch( java.lang.ClassNotFoundException e ) {
              System.err.print( "ClassNotFoundException \n" );                               // ���� jdbc-odbc �Ŵ���
              System.err.println( e.getMessage() );             // ��������
         }
         // ���ϲ���ִ����ȷ

         try {
              System.out.println("----1------");
              con = DriverManager.getConnection( url, "root","gPekin1" );    // ���ݿ�����
              //con = DriverManager.getConnection( url );    // ���ݿ�����
              System.out.println("----3------");

              stmt = con.createStatement();                     // Create  һ������

              // ִ����һ��sql ���������һ���� col_link �ı�
              stmt.executeUpdate( "Create Table col_link (sitename varchar(20) NULL, siteurl varchar (50) NULL )" );

              // ִ�� Insert into ���
//              System.out.println("----1------");
              stmt.executeUpdate( "insert into col_link values ('����', 'http://www.sina.com.cn') " );
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

     ʹ�� "jdbc:mysql:root/gPekin1@127.0.0.1/TEST";  Ȼ�� con = DriverManager.getConnection( url ); ���ӽ����ݿ�������´���:

 	----1------
        SQLException: No suitable driver

     �ĳ� "jdbc:mysql://127.0.0.1:3306/test";  Ȼ�� con = DriverManager.getConnection( url,"root","gPekin1" );"

        ����һ��.

     ����URI �����⣬ ���Ҳ���Jar ��������ͨ��ѹ�����(RAR) ��JDBC ��Jar  �������� jar  �����·���Ƿ��� Class.forName("com.mysql.jdbc.Driver");  ��һ�£� �����󼴿�. Ȼ�������а������¸�ʽָ��:

     java -classpath .;"I:\Program Files\Java\jre1.5.0_10\lib\mysql-connector-java-5.1.5-bin.jar" CreateDBDemo1

     ��Ҫע����ǣ� ����������-classpath  ѡ� ��Ҫ�������ӵ�ǰĿ¼. 

     ���⣬ �������ĵ�֧����Ҫ2��������:

           Server  ����Ҫ�������ĵ�֧��( ����ͨ��status  ����鿴��ǰ������)

           Client  ���ǳ��� JDBC �� URI  ��Ӧ��ָ������. ����:

             "jdbc:mysql://127.0.0.1:3306/adams?useUnicode=true&amp;characterEncoding=utf-8"

     ----  ����жϵ�ǰ���Ƿ����.

         ��Show Tables ���ж�. 

         SHOW   TABLES   LIKE   '%tb_bp_d_case%';  
select `TABLE_NAME` from `INFORMATION_SCHEMA`.`TABLES` where `TABLE_NAME`='col_link' 

      ע���� windows cmd �� �鿴������ģ���Ϊwindows  cmd ʹ�õ��� GBK ����
����Ҳ���԰ѱ��붼�ó� gbk

      �޸� my.ini

[mysql]

default-character-set=gbk

      ������ �ͻ��˾�֧��gbk�ˣ���������MySQL�� ��status  ���ؽ������:
--------------
I:\Program Files\MySQL\MySQL Server 5.0\bin\mysql.exe  Ver 14.12 Distrib 5.0.45,
 for Win32 (ia32)

Connection id:          1
Current database:
Current user:           root@localhost
SSL:                    Not in use
Using delimiter:        ;
Server version:         5.0.45-community-nt MySQL Community Edition (GPL)
Protocol version:       10
Connection:             localhost via TCP/IP
Server characterset:    latin1
Db     characterset:    latin1
Client characterset:    utf8
Conn.  characterset:    utf8
TCP port:               3306
Uptime:                 13 sec

Threads: 1  Questions: 4  Slow queries: 0  Opens: 12  Flush tables: 1  Open tabl
es: 6  Queries per second avg: 0.308
--------------

 �����޸���������:

[mysqld]
# ���ȱʡ����
default-character-set=utf8

�� ����˵�����ȫ���޸��ˣ�����MySQL ����status ��������:

--------------
I:\Program Files\MySQL\MySQL Server 5.0\bin\mysql.exe  Ver 14.12 Distrib 5.0.45,
 for Win32 (ia32)

Connection id:          1
Current database:
Current user:           root@localhost
SSL:                    Not in use
Using delimiter:        ;
Server version:         5.0.45-community-nt MySQL Community Edition (GPL)
Protocol version:       10
Connection:             localhost via TCP/IP
Server characterset:    utf8
Db     characterset:    utf8
Client characterset:    utf8
Conn.  characterset:    utf8
TCP port:               3306
Uptime:                 17 sec

Threads: 1  Questions: 4  Slow queries: 0  Opens: 12  Flush tables: 1  Open tabl
es: 6  Queries per second avg: 0.235
--------------

   �����Ļ�������Ҫ������utf8 ��ʽ�洢.  ��Ҫע����ǣ� ����ı�֮ǰ��Latin1�������Ѿ����������ݿ�(����adams), ͨ���޸����ݿ����ã����б���������� ����ʾ���ݲ�֧�֣� ԭ����ԭ�����ݿⲻ֧�ִ����壬 Ӧ��ɾ��ԭ�����ݿ�(Drop database adams;)�� �����´���(Create Database adams)

   ����MySQL  �������н���ȱʡ����utf8, ��������������update col_link set sitename='����' where sitename='sohu' ���� ��ʾ����. 

   ��ʵ������ַ����޹ء�ͨ���������Լ������mysql�汾�ϣ����۱����ʱ���ʲô�ַ���صĲ��������С���ʵ������ԭ����ϵͳlocale����ģ����mysql�ַ�����gbk,gb2312�ģ���ô��ϵͳLANG�������ó�en_US�Ϳ��Խ��������⣬���mysql��UTF8���ַ������� LANG=en_US.UTF-8���Խ��������⡣

ϵͳĬ��rpm��װ��mysql��û�����������֡�

�����UTF-8�Ŀ⣬������mysql�ͻ��ˣ�

#LANG=en_US.UTF-8 mysql

�����GBK����GB2312�ģ�
#LANG=en_US mysql

mysql �����пͻ���Ĭ��ʹ�õ��ַ���Ҳ�� latin1�������ͨ��������������ĵĻ�Ҳ�������������������İ취��ִ����� set names 'utf8' �����߷�����ʹ�� UTF-8 �������Ϳͻ���ͨ�š���Ҳ����ʹ�� set charset 'utf8'������ set names ����ֻ���� collation �ϡ�set names �� set charset ���൱��ִ����������䣬��������ݿ���ȥ�� mysql �ĵ� 10.4 �ڡ��������������ʹ�� jdbc ��ʱ��Ҳ�ǿ��Եģ�������� jdbc ��ָ�����ݿ��ַ��û�и�֪ʹ�õ��ַ�������Ļ�����ͨ��ִ�������������ﵽ��ͬ��Ч����

  ����֧����������ã� ���Բμ�MySQL  �Դ��İ����ļ� "Character Set Support"  һ��(��ʮ��)

  Ŀǰͨ��set names utf8 ���޸�MySQL  �����пͻ��˺���ʾ������Ȼ�����⡣ ���ذ�װMySQL  ��ͼ�οͻ���(MySQL Query�� dev.mysql.com). ͼ�οͻ��˷���û��������ʾ����.   ����ͼ�οͻ�����дSQL����ʱ�� ��������ʱ��������⡣�������������ط�д�ú󣬿�����GUI  ����ִ��. 

  haoyanxia@gmail.com

  update col_link set sitename = "����" where sitename="sohu"

*/

