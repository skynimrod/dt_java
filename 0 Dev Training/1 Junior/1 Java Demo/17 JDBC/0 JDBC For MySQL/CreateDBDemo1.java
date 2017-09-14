import java.sql.*;
//加载java数据连接包，java基本所有的数据库的调用的都在这个东西里面

public class CreateDBDemo1 {
    
     public static void main( String args[] ) {

         String url = "jdbc:mysql://127.0.0.1:3306/test?useUnicode=true&amp;characterEncoding=utf-8";      //  取得连接的url名， 注意sqlserver  是dsn 名
         //String url = "jdbc:mysql://10.130.33.146:3306/test?useUnicode=true&amp;characterEncoding=utf-8";      //  取得连接的url名， 注意sqlserver  是dsn 名

         Connection  con;                                      // 实例化一个Connection 对象

         Statement  stmt;

         String  query = "select * from col_link ";             // 选择所有的col_link  表中的数据输出

         try {
              Class.forName("com.mysql.jdbc.Driver");          // 加载jdbc for MySQL 驱动
         } catch( java.lang.ClassNotFoundException e ) {
              System.err.print( "ClassNotFoundException \n" );                               // 加载 jdbc-odbc 桥错误
              System.err.println( e.getMessage() );             // 其他错误
         }
         // 以上部分执行正确

         try {
              System.out.println("----1------");
              con = DriverManager.getConnection( url, "root","gPekin1" );    // 数据库连接
              //con = DriverManager.getConnection( url );    // 数据库连接
              System.out.println("----3------");

              stmt = con.createStatement();                     // Create  一个声明

              // 执行了一个sql 语句生成了一个表 col_link 的表
              stmt.executeUpdate( "Create Table col_link (sitename varchar(20) NULL, siteurl varchar (50) NULL )" );

              // 执行 Insert into 语句
//              System.out.println("----1------");
              stmt.executeUpdate( "insert into col_link values ('新浪', 'http://www.sina.com.cn') " );
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

     使用 "jdbc:mysql:root/gPekin1@127.0.0.1/TEST";  然后 con = DriverManager.getConnection( url ); 连接接数据库出现以下错误:

 	----1------
        SQLException: No suitable driver

     改成 "jdbc:mysql://127.0.0.1:3306/test";  然后 con = DriverManager.getConnection( url,"root","gPekin1" );"

        错误一样.

     不是URI 的问题， 是找不到Jar 包。可以通过压缩软件(RAR) 打开JDBC 的Jar  包，看看 jar  包里的路径是否与 Class.forName("com.mysql.jdbc.Driver");  中一致， 修正后即可. 然后命令行按照如下格式指定:

     java -classpath .;"I:\Program Files\Java\jre1.5.0_10\lib\mysql-connector-java-5.1.5-bin.jar" CreateDBDemo1

     需要注意的是， 由于增加了-classpath  选项， 不要忘了增加当前目录. 

     另外， 对于中文的支持需要2部分设置:

           Server  端需要设置中文的支持( 可以通过status  命令查看当前的字体)

           Client  就是程序， JDBC 的 URI  中应该指定字体. 例如:

             "jdbc:mysql://127.0.0.1:3306/adams?useUnicode=true&amp;characterEncoding=utf-8"

     ----  如何判断当前表是否存在.

         用Show Tables 来判断. 

         SHOW   TABLES   LIKE   '%tb_bp_d_case%';  
select `TABLE_NAME` from `INFORMATION_SCHEMA`.`TABLES` where `TABLE_NAME`='col_link' 

      注意在 windows cmd 中 查看是乱码的，因为windows  cmd 使用的是 GBK 编码
我们也可以把编码都用成 gbk

      修改 my.ini

[mysql]

default-character-set=gbk

      这样， 客户端就支持gbk了，重新启动MySQL， 用status  返回结果如下:
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

 继续修改如下设置:

[mysqld]
# 表的缺省字体
default-character-set=utf8

则 服务端的字体全都修改了，重起MySQL 后，用status 返回如下:

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

   这样的话，就需要数据用utf8 格式存储.  需要注意的是， 如果改变之前在Latin1字体下已经创建了数据库(例如adams), 通过修改数据库配置，进行本程序操作， 会提示数据不支持， 原因是原有数据库不支持此字体， 应该删除原有数据库(Drop database adams;)， 再重新创建(Create Database adams)

   估计MySQL  的命令行界面缺省不是utf8, 所以在命令行下update col_link set sitename='冲天' where sitename='sohu' 出错， 提示乱码. 

   其实这个和字符集无关。通常出现在自己编译的mysql版本上，无论编译的时候加什么字符相关的参数都不行。其实真正的原因是系统locale引起的，如果mysql字符集用gbk,gb2312的，那么把系统LANG变量设置成en_US就可以解决这个问题，如果mysql是UTF8的字符集，用 LANG=en_US.UTF-8可以解决这个问题。

系统默认rpm安装的mysql则没有这个问题出现。

如果是UTF-8的库，这样起mysql客户端：

#LANG=en_US.UTF-8 mysql

如果是GBK或者GB2312的：
#LANG=en_US mysql

mysql 命令行客户端默认使用的字符集也是 latin1，如果你通过这个来插入中文的话也会出现乱码的情况。解决的办法是执行语句 set names 'utf8' 来告诉服务器使用 UTF-8 编码来和客户端通信。你也可以使用 set charset 'utf8'，它和 set names 区别只在于 collation 上。set names 和 set charset 都相当于执行了三条语句，具体的内容可以去看 mysql 文档 10.4 节。我想这个方法在使用 jdbc 的时候也是可以的，所以如果 jdbc 的指定数据库地址中没有告知使用的字符集编码的话可以通过执行上面的语句来达到相同的效果。

  关于支持字体的设置， 可以参见MySQL  自带的帮助文件 "Character Set Support"  一章(第十章)

  目前通过set names utf8 等修改MySQL  命令行客户端后，显示中文仍然有问题。 下载安装MySQL  的图形客户端(MySQL Query， dev.mysql.com). 图形客户端访问没有中文显示问题.   不过图形客户端书写SQL语句的时候， 输入中文时会出现问题。可以先在其他地方写好后，拷贝到GUI  界面执行. 

  haoyanxia@gmail.com

  update col_link set sitename = "春天" where sitename="sohu"

*/

