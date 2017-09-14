. 下载地址:

     http://www.hibernate.org

     下载的应该是 Hibernate ORM.

     点击 Hibernate ORM 后, 进入Hibernate ORM 页面, 有个Download(4.3.5.Final)按钮， 按下后，会自动进入下载界面, 如果网络可以的话, 会自动开始下载对应的zip 文件, 否则就会失败。

     或者进入Hibernage ORM 页面后， 点击 左侧的Downloads 来选择具体的Hibernate 版本来下载.

. 使用Hibernate 进行数据库访问操作的处理过程:

  1. 创建Configuration 对象的实例

  2. 构建 SessionFactory 对象的实例

  3. 开始一个新的 Session

  4. 开始事务

  5. 使用Session 对象执行对数据库的操作

  6. 异常处理(如果需要, 包括事务回滚工作)

  7. 提交事务

  8. 关闭Session

  9. 关闭 SessionFactory, 释放资源

  其中, 1，2，9 在整个应用中只需要进行一次, 而在每次的数据库访问中都需要一次执行3-8 这几个步骤. 也就是和使用JDBC 直接操作数据库面临同样的问题: 重复性的代码频繁出现.

  由于处理流程的固定性, 可以像对JDBC的封装一样, 由框架去完成其中的3，4，6，7，8 的工作, 开发中只需要针对每个不同的操作直接完成5 就可以了, 这样可以在最大程度上避免重复代码的出现.

. 利用Spring 的 IoC 容器创建 SessionFactory

  由于 SessionFactory 在整个应用中只需要初始化一次, 所以可以方便的使用Spring 的IoC 容器来进行创建和管理.

. Hibernate 需要的 Jar 包在lib/required 下面， 导入即可。 core 就是核心包.

. 映射文件

  作用是描述持久层对象以及他们的属性和数据库中的表和表的字段之间的对应关系. 没有映射文件， Hibernate 系统无法完成Java 对象和数据库表中数据的相互转化. 只有通过映射文件, Hibernate 才能知道所操作的对象与那个表相关联.

. Hibernate 的配置文件

  在Hibernate 中, 可以使用两种方式连接数据库. 一种是根据 JDBC的参数连接数据库, 由Hibernate 完成连接的过程和连接的管理. 另一种方式是通过JNDI 完成数据库的连接, Hibernate 直接获取数据库的连接. 

  使用JNDI进行数据库连接的时候, 同直接使用JDBC一样, 需要数据库的URL、驱动程序、用户名和密码4个参数. 需要对下面的选项进行配置:

  hibernate.connection.datasource		数据源的JNDI 名称

  hibernate.jndi.url				JNDI 提供者的URL(可选)

  hibernate.jndi.class				JNDI初始化上下文工厂类(可选)

  hibernate.connection.username			数据库的用户名(可选)

  hibernate.connection.password			数据库的密码(可选)

  上面列举的是使用JDBC或者JNDI 建立数据库连接所必须设置的参数。 还有一个参数是必须设置的, 而且无论使用哪种连接数据库的方式都需要进行配置, 那就是连接数据库的适配器(Dialect), 它取决于所使用的数据库类型. Hibernate 为每种支持的数据库都提供了一个Dialect， 各种数据库所对应的Dialect 如下所示:

  MySQL			org.hibernate.dialect.MySQLDialect

  DB2			org.hibernate.dialect.DB2Dialect

  DB2 AS/400		org.hibernate.dialect.DB2400Dialect

  DB2 OS390		org.hibernate.dialect.DB2390Dialect

  PostgreSQL		org.hibernate.dialect.PostgreSQLDialect

  Oracle(any version)	org.hibernate.dialect.OracleDialect

  Oracle 9/10g		org.hibernate.dialect.Oracle9Dialect

  Sybase		org.hibernate.dialect.SybaseDialect

  Sybase Anywhere	org.hibernate.dialect.SybaseAnywhereDialect

  Microsoft SQL Server 	org.hibernate.dialect.SQLServerDialect

  SAP DB		org.hibernate.dialect.SAPDBDialect

  Informix		org.hibernate.dialect.InformixDialect

  HypersonicSQL		org.hibernate.dialect.HSQLDialect

  Ingres		org.hibernate.dialect.IngresDialect

  Progress		org.hibernate.dialect.ProgressDialect

  Mckoi SQL		org.hibernate.dialect.MckoiDialect

  Interbase		org.hibernate.dialect.InterbaseDialect

  Pointbase		org.hibernate.dialect.PointbaseDialect

  FrontBase		org.hibernate.dialect.FrontbaseDialect

  Firebird		org.hibernate.dialect.FirebirdDialect

  =======================================

  HBM 文件列表  只能在XML 格式的  配置文件中进行定义, 通过在这里进行定义, 可以使Hibernate 在创建Configuration 对象的实例时自动装载 HBM 文件, 而不需要在通过编程来进行手动装载操作.

  在完成了Hibernate 配置文件的配置工作后, 继续完成一个Hibernate 的工具类, 主要用于初始化Hibernate, 并实现事务的管理.
     

. 数据库连接池的配置

  数据库连接池的主要作用是提供数据库连接的缓冲机制, 在应用程序释放一个数据库的连接后, 并不是真正立即断开与数据库的连接, 而是将这个连接缓存起来, 以便于其他应用程序可以继续使用. 这样就避免了因为每次都请求一个新的连接而消耗很多资源, 并且避免了造成应用程序的响应变得缓慢.

. 
  
  