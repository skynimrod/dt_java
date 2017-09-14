. 需要数据库操作基础

  使用MySQL  ， 具体参见 MySQL  说明.

  主要实现以下功能:

  
  1. 连接/断开数据库
  2. 查询数据库表
  3. 删除/修改数据库数据
  4.   

  . 采用 MySQL  的Connect

. 调试与JDBC 相关的问题是，最好的方法是使JDBC发挥跟踪特性。 调用DriverManager.setLogWriter  方法可以将跟踪信息发送给PrintWriter. PrintWriter 将 输出JDBC  活动的详细列表.

  