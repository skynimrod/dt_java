
    �μ�:

         http://wenku.baidu.com/view/d3d25dd9ad51f01dc281f1b0.html

. ���ص�ַ:

   Log4J :

       http://apache.etoak.com//logging/log4j/1.2.16/  

   JCL ( Jakarta Commons Logging )
 
       http://apache.etoak.com/commons/logging/binaries/commons-logging-1.1.1-bin.zip

   SLF4J

       http://www.slf4j.org

   ���Բ��Ӻ���İ汾����ѡ�����µİ汾

   ע��:

        �����ʱ���Ƚ������ѹ������ѹ��, �ٵ����ѹ���jar

.  �����ǿ�Դ��Ŀ������ҵ��Ŀ, LOG4F ����ʵ�϶���Ϊ�˴��������Ԫ��ѡ��, Ϊ�����ü�, ʹ�÷���, ����ǿ��, �����ɸ��ָ�ʽ��������͵�����, ���ҿ��Խ�����д���ļ������ݿ⡢�����Ŀ�ĵء�

. Log4J ʹ�ý���

  ��� Log4J  JAR��

     �Ҽ������Ŀ, Build Path ->Libraries->Add External Jar 

  ����ʹ�þ���:

     import org.apache.log4j.Logger;

     public class LogTest {

     ....

          public static void main ( String[] args ) {
	        // ��ȡ Logger ʵ��, ����Ϊ����
        	Logger	logger = Logger.getLogger( LogTest.class);
		logger.debug("debugging");		// ���һ��DEBUG��Ϣ
		logger.info("info...");			// ���һ��Info ��Ϣ
		logger.error("error..");				// ���һ��Error������Ϣ
		...

          }

    ������, ���Ǿ������־����Ĵ����д������. 

    ####
    ���ֱ��ִ������Ĵ���, ���������Ĵ���, 

log4j:WARN No appenders could be found for logger (testLog).
log4j:WARN Please initialize the log4j system properly.
log4j:WARN See http://logging.apache.org/log4j/1.2/faq.html#noconfig for more info.

   ########################

   ԭ����û�ж�Log4J ��������.  ���������˵������log4j �������ļ�����. 

    ������, ����ֻ��Ҫ��LOG4J ��һ��������, ��־���ܹ�������������ǰ��.

    1. ��SRCĿ¼�´���һ���ļ�, ��Ϊlog4j.properties, ��������:

       # �������ƶ���־�ȼ������INFO����־��Ϣ�������Ϊstdout ��Ŀ�ĵ�
       log4j.rootCategory=DEBUG, stdout
       # ������ִ��stdout������Ŀ�ĵ�����Ϊ����̨
       log4j.appender.stdout=org.agache.log4j.ConsoleAppender
       # ������ָ�������־�Ĳ�����, �������LOG4JĬ�ϵĲ�����
       log4j.appender.stdout.layout=org.apache.log4j.PatternLayout

       �߱�������������, ���Ǿ��ܹ�����־���������̨��, ��LogTest.java, �Ҽ��������, ���Run As ->Java Application�� �ڿ���̨���ǾͿ��Կ����������:

       debuging
       info...
       error...

    2. �����������Ϣ����������Ϣ����, ��ʵ�������, ���������, ��Ҫһͬ�����Ϣ������ʱ��, ��Ϣ�����ĸ��ط�(��)�����ĵ�, Ҫʵ��������Ч��, ֻ��Ҫ��log4j.properties �ļ������һ��:

      log4j.appender.stdout.layout.ConversionPattern = %d %p [%C.%M(%L)] - <%m>%n

        ��������LogTest.java

      ִ�н������:

2010-12-15 14:06:14,062 DEBUG [testLog.main(18)] - <debugging>
2010-12-15 14:06:14,062 INFO [testLog.main(19)] - <info...>
2010-12-15 14:06:14,062 ERROR [testLog.main(20)] - <error ...>

    3. �������ǳ����Ѿ����������, ��Ҫ������ʽ������, ��ʱ�������־���������Ȼ������DEBUG ����Ļ�, ��־�ļ������úܴ�ܴ�, �����ڲ��ĺ�ά��, ��˿����ڲ�����ʽ������ʱ����־�������һ��. �޸�log4j.properties

      log4j.rootCategory=INFO, stdout  

        ��������LogTest.java

      ִ�н������:
      
2010-12-15 14:20:50,625 INFO [testLog.main(19)] - <info...>
2010-12-15 14:20:50,640 ERROR [testLog.main(20)] - <error ...>

      �����Ļ�����־��Ͳ���ʾDEBUG��Ϣ��. 

    4. ���ĳ������߰��ǳ���Ҫ, ��������������DEBUG��Ϣ, ֻ��Ҫ��log4j.properties �ļ������һ��:

      # log4j.logger ���ϰ���������
      log4j.logger.com.hand.LogTest=DEBUG

          ��������LogTest.java

      ִ�н������:

2010-12-15 14:25:50,484 DEBUG [testLog.main(18)] - <debugging>
2010-12-15 14:25:50,484 INFO [testLog.main(19)] - <info...>
2010-12-15 14:25:50,484 ERROR [testLog.main(20)] - <error ...>

      DEBUG ��Ϣ�ֳ�����.

    5. ĿǰΪֹ�� ���ǰ���־���������̨��,���Ǵ󲿷�������Ƕ���Ҫ����־�������־�ļ�, �����޸�log4j.properties

     # ��ǰ��Ļ�����, �޸�log4j.rootCategory �������һ��Ŀ�ĵ�, ����Ϊlogfile
       log4j.rootCategory=INFO, stdout, logfile
     #
       log4j.appender.logfile=org.apache.log4j.FileAppender
       log4j.appender.logfile.File=LogTest.log
       log4j.appender.logfile.layout=org.apache.log4j.PatternLayout
       log4j.appender.logfile.layout.ConversionPattern=%d %p [%C.%M(%L)] - <%m>%n

     ����һ����־�ͻ��Զ������LogTest.log �ļ���

    6. ���������һ����־�ļ�д��־, һ��ʱ���, ��־�ļ����÷ǳ���, ������ά��. ���԰�����־��С, ������־�ļ�����100M�� ���Զ�����һ���µ���־�ļ�. LOG4J Ҳ�ṩ�˼򵥵����÷�ʽ, �޸� log4j.properties

       log4j.paaender.logfile=org.apache.log4j.RollingFileAppender
       log4j.appender.logfile.File=LogTest.log
       log4j.appender.logfile.Append=true
       log4j.appender.logfile.MaxFileSize=100MB
       log4j.appender.logfile.layout=org.apache.log4j.Patternlayout
       log4j.appender.logfile.layout.ConversionPattern= %d %p [%C.%M(%L)] - <%m>%n

       ��ʱ��ϣ����������, ÿ������һ����־�ļ�

       log4j.appender.logfile= org.apache.log4j.DailyRollingFileAppender
       log4j.appender.logfile.File = LogTest.log
       log4j.appender.logfile.layout=org.apache.log4j.PatternLayout
       log4j.appender.logfile.layout.ConversionPattern= %d %p [%C.%M(%L)] - <%m>%n
       

   ���õ������Ƚ�����ô��, ����������������ݿ⡢SOCKET�ȷ�ʽ���Բο������������.

==============

    �����﷨:

   1. ���ø�Logger , ���﷨Ϊ:

      log4j.rootLogger = [level],appenderName1,appenderName2,...

      level : ����־��¼�����ȼ�, ��Ϊ OFF��FATAL��ERROR��WARN��INFO��DEBUG��ALL �����Զ���ļ���. Log4j ����ֻʹ���ĸ����, ���ȼ��Ӹߵ��ͷֱ��� ERROR��WARN��INFO��DEBUG. ͨ�������ﶨ��ļ���, ���Կ�����Ӧ�ó�������Ӧ�������־��Ϣ�Ŀ���. ���������ﶨ����INFO ����, ��Ӧ�ó���������DEBUG �������־��Ϣ��������ӡ����.

      appender: ����ָ����־��Ϣ������ĸ��ط�. ����ͬʱָ��������Ŀ�ĵ�.

   2. ������־��Ϣ���Ŀ�ĵ�, ���﷨Ϊ:

      log4j.      


.  JCL ( Jakarta Commons Logging)

 LOG4J �����Ŀ����д��ڲ���. ��ʱ��JCL ���Խ��в���. JCL ������һ�����������־�������, �������ó���������������־�׼���Ϊ�Լ�����, ����˵, JCL ʹ������Ա���ù�����־����������ʲô���ʵ��.

   �ٷ�������˵����:

       JCL �ṩ����һ����־(Log)�ӿ�(interface), ͬʱ����������Ͳ������������־ʵ�ֹ���. ���ṩ���м��/��־���߿�����һ���򵥵���־��������, ������򿪷���Աʹ�ò�ͬ�ľ�����־ʵ�ֹ���.

       ���, ��ʹ��JCL ʱ, ������Ҫ��ĳ����־��ܴ���ʹ��, ���ｨ�����ķ���, JCL + LOG4J. 

   1. ����Ŀ��� JCL��

      ��

   2.    
          
          