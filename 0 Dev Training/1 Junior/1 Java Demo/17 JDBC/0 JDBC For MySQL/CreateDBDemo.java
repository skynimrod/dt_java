import java.sql.*;
//加载java数据连接包，java基本所有的数据库的调用的都在这个东西里面

// 本例是通过JDBC-ODBC Bridge  实现对数据库的访问.

public class CreateDBDemo {
    
     public static void main( String args[] ) {

         String url = "jdbc:odbc:AD_TEST";      //  取得连接的url名， 注意sqlserver  是dsn 名

         Connection  con;                                      // 实例化一个Connection 对象

         Statement  stmt;

         String  query = "select * from col_link ";             // 选择所有的col_link  表中的数据输出

         try {
              Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");    // 加载jdbc-odbc 桥驱动
         } catch( java.lang.ClassNotFoundException e ) {
              System.err.print( "ClassNotFoundException e" );                               // 加载 jdbc-odbc 桥错误
              System.err.println( e.getMessage() );             // 其他错误
         }
         // 以上部分执行正确

         try {
              System.out.println("----1------");
              //con = DriverManager.getConnection( url, "root","gPekin1" );    // 数据库连接
              con = DriverManager.getConnection( url );    // 数据库连接
              System.out.println("----3------");

              stmt = con.createStatement();                     // Create  一个声明

              // 执行了一个sql 语句生成了一个表 col_link 的表
              stmt.executeUpdate( "Create Table col_link (sitename varchar(20) NULL, siteurl varchar (50) NULL )" );

              // 执行 Insert into 语句
//              System.out.println("----1------");
              stmt.executeUpdate( "insert into col_link values ('sian', 'http://www.sina.com.cn') " );
              stmt.executeUpdate( "insert into col_link values ('sohu', 'http://news.sohu.com' ) " );

//              System.out.println("----4------");

              // 执行update 语句， 更新数据库
              stmt.executeUpdate("update col_link set siteurl = 'http://www.test.com' where siteurl='http://xuankong.com'");

              // 返回一个结果集
              ResultSet rs = stmt.executeQuery( query );

              // 使用while  循环打印出col_link   中的所有数据
              System.out.println("col_link  表中的数据如下(原始数据)");

              System.out.println( "站点名" + "站点地址" );
              System.out.println( "-------+---------" );

              while( rs.next() ) {
                  // 取得数据库中的数据
                  String  s = rs.getString( "sitename" );
                  String  f = rs.getString( "siteurl" );

                  System.out.println( s + " " + f );
                  

                  // Jdbc  提供了两种方法识别字段, 一种是使用 getXXX(这里的getXXX表示取不同类型字段的不同的方法) 获得字段名，第二种 是通过字段索引， 这儿把第二种方法注释了 

                  // 可以访问这个连接获得getXXX的方法:
                  //       http://java.sun.com/docs/books/tutorial/jdbc/basics/_retrievingTable.html

                  // String t = rs.getString(1);
                  // String l = rs.getString(2);
                  // System.out.println( t + " " + l );
              }

              // 关闭声明和连接
              stmt.close();
              con.close();
         }  catch( SQLException ex ) {
              // 显示数据库连接错误或者查询错误
              System.err.println( "SQLException: " + ex.getMessage() );
         }

     }

}


/*
后记:

     以上程序， 编译(Javac CreateDBDemo.java)后，用Java CreateDBDemo运行， 出现如下错误:

     SQLException: [MySQL][ODBC 5.1 Driver]Access denied for user 'root'@'localhost'

     增加调试打印语句发现， 出错在以下语句 : 

              con = DriverManager.getConnection( url, "root","rMoonSta1" );    // 数据库连接

     检查后发现密码 不对，修改为:

              con = DriverManager.getConnection( url, "root","gPekin1" );    // 数据库连接


     ================================================

     继续调试， 发现以下语句有问题：

                       stmt.executeUpdate( "insert into col_link values ('新浪', 'http://www.sina.com.cn') " );

     SQLException: [MySQL][ODBC 5.1 Driver][mysqld-5.0.45-community-nt]Incorrect stri
ng value: '\xE6\x96\xB0\xE6\xB5\xAA' for column 'sitename' at row 1

     估计错误原因是汉字支持问题。 将汉字修改为字母后，果然没有问题了。下面解决如何支持汉字? 通过MySQL 的客户端，测试:

           update col_link set sitename = '中文' where sitename = 'sian'

     发现，数据库本身支持中文没有问题， 应该是ODBC  支持的问题.

     连接数据库的时候， 为了防止出现 数据源名称过长的错误发生，可以将用户名和密码按照例子中分开写. 而不是统一写在一个字符串中. 

                   con = DriverManager.getConnection( url );    // 数据库连接

     同样的URI还有一个较长的格式：    
   
  "jdbc:oracle:thin:@(description=(address=(host=   _IP>)(protocol    
  =tcp)(port=))(connect_data=(sid=)))"    
    
  
      jdbc:mysql://localhost:3306/test

这是一个url的典型写法：
分别表示服务器地址，端口，数据库名
当然也可以把用户名和密码写在一起。
参考资料：http://www.javabiz.cn 

     uri 如果是"jdbc:odbc:AD_TEST", 是正确的，如果指定IP("jdbc:odbc:AD_TEST//127.0.0.1:3306")， 则出现如下错误:

   SQLException: [Microsoft][ODBC 驱动程序管理器] 未发现数据源名称并且未指定默认驱动程序"

    分析:

        由于是JDBC 通过ODBC 访问数据库, 所以不需要增加IP地址和端口信息(ODBC 创建DSN 的时候已经配置了相关的信息). 由于ODBC中可以设置用户名密码， 所以在这儿可以不用增加用户名和密码. 当然可以在ODBC中不设置用户名和密码， 而在代码中增加用户名和密码的设置. 

    网上很多例子都是用DriverManager.getConnection来创建数据库连接，但是这个方法是不推荐的，因为它有可能造成死锁。
在服务器中，所有的DriverManagerr调用都是类同步的, 包括所有数据库驱动产生的频繁调用，而且JDBC驱动内部也会进行很多同步。所以一个很耗用很长时间的调用可以使整个Java虚拟机的JDBC操作被阻断，然后造成死锁。

    如果 数据库服务端设置了超时时间，那么需要动态进行数据库连接来访问. 

 */

