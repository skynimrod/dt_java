
    参见:

         http://wenku.baidu.com/view/d3d25dd9ad51f01dc281f1b0.html

. 下载地址:

   Log4J :

       http://apache.etoak.com//logging/log4j/1.2.16/  

   JCL ( Jakarta Commons Logging )
 
       http://apache.etoak.com/commons/logging/binaries/commons-logging-1.1.1-bin.zip

   SLF4J

       http://www.slf4j.org

   可以不加后面的版本号来选择最新的版本

   注意:

        导入的时候先将上面的压缩包解压后, 再导入解压后的jar

.  无论是开源项目还是商业项目, LOG4F 在事实上都成为了大多数程序元的选择, 为其配置简单, 使用方便, 功能强大, 能生成各种格式或各种类型的日至, 并且可以将日至写到文件、数据库、网络等目的地。

. Log4J 使用介绍

  添加 Log4J  JAR包

     右键点击项目, Build Path ->Libraries->Add External Jar 

  具体使用举例:

     import org.apache.log4j.Logger;

     public class LogTest {

     ....

          public static void main ( String[] args ) {
	        // 获取 Logger 实例, 参数为本类
        	Logger	logger = Logger.getLogger( LogTest.class);
		logger.debug("debugging");		// 输出一段DEBUG信息
		logger.info("info...");			// 输出一段Info 信息
		logger.error("error..");				// 输出一段Error错误信息
		...

          }

    就这样, 我们就完成日志输出的代码编写部分了. 

    ####
    如果直接执行上面的代码, 会出现下面的错误, 

log4j:WARN No appenders could be found for logger (testLog).
log4j:WARN Please initialize the log4j system properly.
log4j:WARN See http://logging.apache.org/log4j/1.2/faq.html#noconfig for more info.

   ########################

   原因是没有对Log4J 进行配置.  按照下面的说明创建log4j 的配置文件即可. 

    接下来, 我们只需要对LOG4J 做一点点地配置, 日志就能够呈现在我们面前了.

    1. 在SRC目录下创建一个文件, 名为log4j.properties, 内容如下:

       # 此属性制定日志等级或低于INFO的日志信息输出到名为stdout 的目的地
       log4j.rootCategory=DEBUG, stdout
       # 此属性执行stdout这个输出目的地类型为控制台
       log4j.appender.stdout=org.agache.log4j.ConsoleAppender
       # 此属性指定输出日志的布局类, 这里采用LOG4J默认的布局类
       log4j.appender.stdout.layout=org.apache.log4j.PatternLayout

       具备以上三个属性, 我们就能够将日志输出到控制台了, 打开LogTest.java, 右键点击该类, 点击Run As ->Java Application， 在控制台我们就可以看到如下输出:

       debuging
       info...
       error...

    2. 上面输出的信息仅仅包含信息本身, 可实际情况下, 更多情况下, 需要一同输出信息产生的时间, 信息是在哪个地方(类)产生的等, 要实现这样的效果, 只需要在log4j.properties 文件里添加一行:

      log4j.appender.stdout.layout.ConversionPattern = %d %p [%C.%M(%L)] - <%m>%n

        重新运行LogTest.java

      执行结果如下:

2010-12-15 14:06:14,062 DEBUG [testLog.main(18)] - <debugging>
2010-12-15 14:06:14,062 INFO [testLog.main(19)] - <info...>
2010-12-15 14:06:14,062 ERROR [testLog.main(20)] - <error ...>

    3. 假设我们程序已经开发完成了, 需要部署到正式环境下, 这时候如果日志输出级别仍然保持在DEBUG 级别的话, 日志文件将会变得很大很大, 不便于查阅和维护, 因此可以在部署到正式环境的时候将日志级别调低一点. 修改log4j.properties

      log4j.rootCategory=INFO, stdout  

        重新运行LogTest.java

      执行结果如下:
      
2010-12-15 14:20:50,625 INFO [testLog.main(19)] - <info...>
2010-12-15 14:20:50,640 ERROR [testLog.main(20)] - <error ...>

      这样的话，日志里就不显示DEBUG信息了. 

    4. 如果某个类或者包非常重要, 想让这个类或包输出DEBUG信息, 只需要在log4j.properties 文件里添加一行:

      # log4j.logger 加上包名或类名
      log4j.logger.com.hand.LogTest=DEBUG

          重新运行LogTest.java

      执行结果如下:

2010-12-15 14:25:50,484 DEBUG [testLog.main(18)] - <debugging>
2010-12-15 14:25:50,484 INFO [testLog.main(19)] - <info...>
2010-12-15 14:25:50,484 ERROR [testLog.main(20)] - <error ...>

      DEBUG 信息又出现了.

    5. 目前为止， 都是把日志输出到控制台的,可是大部分情况我们都需要把日志输出到日志文件, 如下修改log4j.properties

     # 在前面的基础上, 修改log4j.rootCategory 属性添加一个目的地, 起名为logfile
       log4j.rootCategory=INFO, stdout, logfile
     #
       log4j.appender.logfile=org.apache.log4j.FileAppender
       log4j.appender.logfile.File=LogTest.log
       log4j.appender.logfile.layout=org.apache.log4j.PatternLayout
       log4j.appender.logfile.layout.ConversionPattern=%d %p [%C.%M(%L)] - <%m>%n

     这样一来日志就会自动输出到LogTest.log 文件中

    6. 如果总是想一个日志文件写日志, 一段时间后, 日志文件会变得非常大, 不便于维护. 可以按照日志大小, 比如日志文件到达100M后 就自动生成一个新的日志文件. LOG4J 也提供了简单的配置方式, 修改 log4j.properties

       log4j.paaender.logfile=org.apache.log4j.RollingFileAppender
       log4j.appender.logfile.File=LogTest.log
       log4j.appender.logfile.Append=true
       log4j.appender.logfile.MaxFileSize=100MB
       log4j.appender.logfile.layout=org.apache.log4j.Patternlayout
       log4j.appender.logfile.layout.ConversionPattern= %d %p [%C.%M(%L)] - <%m>%n

       有时候希望按照日期, 每天生成一个日志文件

       log4j.appender.logfile= org.apache.log4j.DailyRollingFileAppender
       log4j.appender.logfile.File = LogTest.log
       log4j.appender.logfile.layout=org.apache.log4j.PatternLayout
       log4j.appender.logfile.layout.ConversionPattern= %d %p [%C.%M(%L)] - <%m>%n
       

   常用的配置先介绍这么多, 其他诸如输出到数据库、SOCKET等方式可以参考网上相关文章.

==============

    配置语法:

   1. 配置根Logger , 其语法为:

      log4j.rootLogger = [level],appenderName1,appenderName2,...

      level : 是日志记录的优先级, 分为 OFF、FATAL、ERROR、WARN、INFO、DEBUG、ALL 或者自定义的级别. Log4j 建议只使用四个界别, 优先级从高到低分别是 ERROR、WARN、INFO、DEBUG. 通过在这里定义的级别, 可以控制在应用程序中相应级别的日志信息的开关. 比如在这里定义了INFO 级别, 则应用程序中所有DEBUG 级别的日志信息将不被打印出来.

      appender: 就是指定日志信息输出到哪个地方. 可以同时指定多个输出目的地.

   2. 配置日志信息输出目的地, 其语法为:

      log4j.      


.  JCL ( Jakarta Commons Logging)

 LOG4J 在类库的开发中存在不便. 这时候JCL 可以进行补充. JCL 并不是一个很优秀的日志解决方案, 但是它擅长利用其他优秀日志孔家来为自己服务, 可以说, JCL 使开发人员不用关心日志服务最终由什么框架实现.

   官方给出的说明是:

       JCL 提供的是一个日志(Log)接口(interface), 同时兼顾轻量级和不依赖具体的日志实现工具. 它提供给中间件/日志工具开发者一个简单的日志操作抽象, 允许程序开发人员使用不同的具体日志实现工具.

       因此, 在使用JCL 时, 往往都要和某个日志框架搭配使用, 这里建议最经典的方案, JCL + LOG4J. 

   1. 给项目添加 JCL包

      略

   2.    
          
          