. ���ص�ַ:

     http://www.hibernate.org

     ���ص�Ӧ���� Hibernate ORM.

     ��� Hibernate ORM ��, ����Hibernate ORM ҳ��, �и�Download(4.3.5.Final)��ť�� ���º󣬻��Զ��������ؽ���, ���������ԵĻ�, ���Զ���ʼ���ض�Ӧ��zip �ļ�, ����ͻ�ʧ�ܡ�

     ���߽���Hibernage ORM ҳ��� ��� ����Downloads ��ѡ������Hibernate �汾������.

. ʹ��Hibernate �������ݿ���ʲ����Ĵ������:

  1. ����Configuration �����ʵ��

  2. ���� SessionFactory �����ʵ��

  3. ��ʼһ���µ� Session

  4. ��ʼ����

  5. ʹ��Session ����ִ�ж����ݿ�Ĳ���

  6. �쳣����(�����Ҫ, ��������ع�����)

  7. �ύ����

  8. �ر�Session

  9. �ر� SessionFactory, �ͷ���Դ

  ����, 1��2��9 ������Ӧ����ֻ��Ҫ����һ��, ����ÿ�ε����ݿ�����ж���Ҫһ��ִ��3-8 �⼸������. Ҳ���Ǻ�ʹ��JDBC ֱ�Ӳ������ݿ�����ͬ��������: �ظ��ԵĴ���Ƶ������.

  ���ڴ������̵Ĺ̶���, �������JDBC�ķ�װһ��, �ɿ��ȥ������е�3��4��6��7��8 �Ĺ���, ������ֻ��Ҫ���ÿ����ͬ�Ĳ���ֱ�����5 �Ϳ�����, �������������̶��ϱ����ظ�����ĳ���.

. ����Spring �� IoC �������� SessionFactory

  ���� SessionFactory ������Ӧ����ֻ��Ҫ��ʼ��һ��, ���Կ��Է����ʹ��Spring ��IoC ���������д����͹���.

. Hibernate ��Ҫ�� Jar ����lib/required ���棬 ���뼴�ɡ� core ���Ǻ��İ�.

. ӳ���ļ�

  �����������־ò�����Լ����ǵ����Ժ����ݿ��еı�ͱ���ֶ�֮��Ķ�Ӧ��ϵ. û��ӳ���ļ��� Hibernate ϵͳ�޷����Java ��������ݿ�������ݵ��໥ת��. ֻ��ͨ��ӳ���ļ�, Hibernate ����֪���������Ķ������Ǹ��������.

. Hibernate �������ļ�

  ��Hibernate ��, ����ʹ�����ַ�ʽ�������ݿ�. һ���Ǹ��� JDBC�Ĳ����������ݿ�, ��Hibernate ������ӵĹ��̺����ӵĹ���. ��һ�ַ�ʽ��ͨ��JNDI ������ݿ������, Hibernate ֱ�ӻ�ȡ���ݿ������. 

  ʹ��JNDI�������ݿ����ӵ�ʱ��, ֱͬ��ʹ��JDBCһ��, ��Ҫ���ݿ��URL�����������û���������4������. ��Ҫ�������ѡ���������:

  hibernate.connection.datasource		����Դ��JNDI ����

  hibernate.jndi.url				JNDI �ṩ�ߵ�URL(��ѡ)

  hibernate.jndi.class				JNDI��ʼ�������Ĺ�����(��ѡ)

  hibernate.connection.username			���ݿ���û���(��ѡ)

  hibernate.connection.password			���ݿ������(��ѡ)

  �����оٵ���ʹ��JDBC����JNDI �������ݿ��������������õĲ����� ����һ�������Ǳ������õ�, ��������ʹ�������������ݿ�ķ�ʽ����Ҫ��������, �Ǿ����������ݿ��������(Dialect), ��ȡ������ʹ�õ����ݿ�����. Hibernate Ϊÿ��֧�ֵ����ݿⶼ�ṩ��һ��Dialect�� �������ݿ�����Ӧ��Dialect ������ʾ:

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

  HBM �ļ��б�  ֻ����XML ��ʽ��  �����ļ��н��ж���, ͨ����������ж���, ����ʹHibernate �ڴ���Configuration �����ʵ��ʱ�Զ�װ�� HBM �ļ�, ������Ҫ��ͨ������������ֶ�װ�ز���.

  �������Hibernate �����ļ������ù�����, �������һ��Hibernate �Ĺ�����, ��Ҫ���ڳ�ʼ��Hibernate, ��ʵ������Ĺ���.
     

. ���ݿ����ӳص�����

  ���ݿ����ӳص���Ҫ�������ṩ���ݿ����ӵĻ������, ��Ӧ�ó����ͷ�һ�����ݿ�����Ӻ�, ���������������Ͽ������ݿ������, ���ǽ�������ӻ�������, �Ա�������Ӧ�ó�����Լ���ʹ��. �����ͱ�������Ϊÿ�ζ�����һ���µ����Ӷ����ĺܶ���Դ, ���ұ��������Ӧ�ó������Ӧ��û���.

. 
  
  