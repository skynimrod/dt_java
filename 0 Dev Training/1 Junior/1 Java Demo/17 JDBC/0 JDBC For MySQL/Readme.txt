. JDBC  for MySQL

  �����μ� DB\MYSQL\Dev Interface\JDBC  for Java

. ��Ŀ¼�½�������������

  1. CreateDBDemo.java

     ͨ��JDBC  ����MySQL���ݿ� Test��  ���Test  �Ѿ����ڣ���ɾ�����ٴ���

  2. CreateTblDemo.java

     ͨ��JDBC ����MySQL Test ���ݿ�ı� CustomerTbl, ����ñ��Ѿ����ڣ���ɾ���ٴ���.

  3. 

. ˳����һ�£���JDBC�ж�����int��long��boolean��ֵ�ķ����ǲ��᷵��null�ġ���getInt()��������ݿ���ֵΪNULL���򷵻ص�ʱ����0���������ǾͲ�֪���������ݿ��д����NULL����0����ô���أ��Һ�JDBC���ṩ��������ôһ����������getObject()���ǵģ������ص���һ��Object�����������ǾͿ��Զ����Object��������пգ��Ӷ���Ϥ���ݿ��д�ֵ��NULL����0�ˡ�

���ǻ�ȡ��Щ�п���ΪNULL��ֵ��ʱ�򣬿�����ôд��
java ����

   1.  Integer age = rs.getObject("age") == null ? null : rs.getInt("age");

. ��Ҫ����������

  import java.sql.*

. ���ݿ����ӶԶ�̬��վ��˵����Ϊ��Ҫ�Ĳ���, Java ���������ݿ�ļ�����JDBC. �ܶ����ݿⶼ����JDBC ���� Java  �����ͨ��JDBC  �������������ݿ������� ִ�в�ѯ����ȡ���ݵ�. Sun ��˾��������JDBC-ODBC bridge, �ô˼����� Java ����Ϳ��Է��ʴ���ODBC������������ݿ�. 