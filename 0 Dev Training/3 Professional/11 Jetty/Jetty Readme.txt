�μ�:

     http://baike.baidu.com/view/1425008.htm?fr=aladdin

. Jetty ��һ����Դ��servlet ����, ��Ϊ����Java ��Web ����, ���� JSP �� servlet �ṩ���л���. Jetty ��ʹ��Java ���Ա�д��, ����API ��һ��JAR������ʽ����. ������Ա���Խ�Jetty ����ʵ������һ������, ����Ѹ��ΪһЩ��������(stand-alone)�� Java Ӧ���ṩ�����Web ����.

. ����

  1. ������

     ͨ��XML ���� API ���� Jetty ��������; Ĭ�����þͿ�������󲿷ֵ�����; ��Jetty Ƕ�뵽Ӧ�ó�����ֻ��Ҫ�ǳ��ٵĴ���;

  2. ����չ��

     ��ʹ����Ajax ��Web 2.0 �� Ӧ�ó�����, ÿ��������Ҫ���ָ�����ʱ��, �����̺߳��ڴ���������ἱ�������, ���ʹ�����ǵ��������������Ϊ�����������ƿ����Ӱ���������������.

     ��������Jetty��

     ��ʹ���д�����������������, ϵͳ������Ҳ�ܱ�����һ�����Խ��ܵ�״̬. ���� Continuation ����������������û������Լ�ʱ��Ƚϳ�������. ����, Jetty �漰�˷ǳ����õĽӿ�, �����Jetty ��ĳ��ʵ���޷������û�������ʱ, �û����Էǳ�����Ķ�Jetty ��ĳЩʵ�ֽ����޸�, ʹ��Jetty �����������Ӧ�ó��������.

  3. ��Ƕ����

     Jetty ���֮��������Ϊһ��������������Ƶ�, ��Ҳ����ζ��Jetty ���Էǳ����׵�Ƕ�뵽Ӧ�ó�����, ������Ҫ����Ϊ��ʹ��Jetty ���޸�. ��ĳ�̶ֳ���, ��Ҳ���԰�Jetty ���Ϊһ��Ƕ��ʽ��Web ������.

     Jetty ������ΪǶ���Ƿ�����ʹ��, Jetty �������ٶȽϿ�, ��������������, ������Java �д� test case �п���������. �Ӷ��������Զ������Բ��������ⲿ������ ˳��ʵ���Զ�������.

. ����ʾ��

  ��ΪǶ���Ƿ�����ʹ�ô���ʾ��

  Java ����:

   // ����: ��Ƕ��ģʽ����Jetty
   import org.mortbay.http.HttpContext;
   import org.mortbay.http.HttpServer;
   import org.mortbay.http.SocketListener;
   import org.mortbay.http.handler.ResourceHandler;

   public classJettySample {
	public static void main( String[] args ) throws Exception  {
		// ����JettyHttpServe ����
		HttpServer server = new HttpServer();

		// �ڶ˿�8080 �ϸ�HttpServer �������һ��listener��ʹ֮�ܹ�����HTTP����
		SocketListener	listener = new SocketListener();
		listener.setPort( 8080 );
		server.addListener( listener );

		// ����һ��HttpContext, ����Http ����
		HttpContext 	context  = new HttpContext()

		// ��setContextPath ��Context ӳ�䵽(/web) URL��
		context.setContextPath( "/web" );

		// setResourceBase ���������ĵ�Ŀ¼���ṩ��Դ
		context.setResourceBase( "c:\\j2sdk1.4.1_05" );

		//�����Դ��������HttpContext, ʹ֮�ܹ��ṩ�ļ�ϵͳ�е��ļ�
		context.addHandle( new ResourceHandler() );
		server.addContext( context );

		// ����������
		server.start();
   	}
   }

   ��Ҫ��jar ��

   commons-logging.jar

   javax.servlet.jar

   org.mortbay.jetty.jar

   org.mortbay.jmx.jar

  ===============================================

   jetty ���ж�Ӧmaven ���

   maven pom �ļ�������

   <?xml version = "1.0" encoding="utf-8"?>

   <plugin>
	<groupId>org.mortbay.jetty</grougId>
	<artifactId>maven-jetty-plugin</artifactId>
	<version>6.1.10</version>
	<configuration>
	</configuration>
   </plugin>
  