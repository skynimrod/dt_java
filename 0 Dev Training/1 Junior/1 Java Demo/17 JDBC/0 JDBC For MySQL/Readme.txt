. JDBC  for MySQL

  驱动参见 DB\MYSQL\Dev Interface\JDBC  for Java

. 本目录下建立了以下例子

  1. CreateDBDemo.java

     通过JDBC  创建MySQL数据库 Test，  如果Test  已经存在，先删除，再创建

  2. CreateTblDemo.java

     通过JDBC 创建MySQL Test 数据库的表 CustomerTbl, 如果该表已经存在，先删除再创建.

  3. 

. 顺便提一下，在JDBC中对于如int，long，boolean等值的返回是不会返回null的。如getInt()，如果数据库中值为NULL，则返回的时候是0。这样我们就不知道到底数据库中存的是NULL还是0。怎么办呢？幸好JDBC还提供给我们这么一个函数——getObject()。是的，它返回的是一个Object对象，这样我们就可以对这个Object对象进行判空，从而获悉数据库中此值是NULL还是0了。

我们获取这些有可能为NULL的值的时候，可以这么写：
java 代码

   1.  Integer age = rs.getObject("age") == null ? null : rs.getInt("age");

. 需要包含以下类

  import java.sql.*

. 数据库链接对动态网站而说是最为重要的部分, Java 中链接数据库的技术是JDBC. 很多数据库都带有JDBC 程序， Java  程序就通过JDBC  驱动程序与数据库相连， 执行查询，提取数据等. Sun 公司还开发了JDBC-ODBC bridge, 用此技术， Java 程序就可以访问带有ODBC驱动程序的数据库. 