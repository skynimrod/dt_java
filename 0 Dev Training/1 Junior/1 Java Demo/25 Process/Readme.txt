�μ�:

   http://gceclub.sun.com.cn/Java_Docs/html/zh_CN/api/java/lang/Process.html

. �� Process

  java.lang.Object -> java.lang.Process

  public abstract class Process extends Object

  ----------------------------------------------------

  ProcessBuilder.start()  �� Runtime.exec  ��������һ���������̣� ������Process  �����һ��ʵ��, ��ʵ�����������ƽ��̲���ȡ�����Ϣ. Process ���ṩ��ִ�дӽ������롢ִ������� ���̡��ȴ�������ɡ������̵��Ƴ�״̬�Լ�����(ɱ��) ���̵ķ���.

  �������̵ķ��������޷����ĳЩ����ƽ̨�ϵ��ض����̺ܺõĹ����� ���磬 �������ڽ��̣� �ػ�����, Microsoft Windows �ϵ�Win16/DOS���̣� ����Shell �ű�. �������ӽ���û���Լ����ն˻��߿���̨. �������б�׼io (�� stdin, stdout, stderr) ��������ͨ��������( getOutputStream(), getInputStream(), getErrorStream() ) �ض��򵽸����̡� ������ʹ����Щ�����ṩ���ӽ��̵�����ͻ���ӽ��̵����.  ��Ϊ��Щ����ƽ̨����Ա�׼�����������ṩ���޵Ļ�������С�� �����д�ӽ��̵��������������Ѹ�ٳ���ʧ�ܣ� ����ܵ����ӽ��������� ��������������

  ��û�� Process ����ĸ�������ʱ�� ����ɾ���ӽ��̣� ���Ǽ����첽ִ���ӽ���.

  ���ڴ��� Process�����Java ����, û�б�Ҫ�첽�򲢷�ִ���� Process �����ʾ�Ľ���. 

. �μ�:

   http://www.pconline.com.cn/pcjob/process/sun/article/0411/498310.html

. PingIP.jsp

  ��Jspҳ���е���Ping����

. 
  

-----------------------------

. ����java��Processִ�г��ֵ�block����

ʹ��java.lang.Process����������ִ�е������ʱ�����ǳ����������⣬����������£�

Process proc = Runtime.getRuntime().exec(commands);

int result = process.waitFor();

�����鿴��һ�����ϣ��Լ�������������������jdk�ĵ���

�������̵ķ��������޷����ĳЩ����ƽ̨�ϵ��ض����̺ܺõع��������磬�������ڽ��̣��ػ����̣�Microsoft Windows �ϵ� Win16/DOS ���̣����� shell �ű����������ӽ���û���Լ����ն˻����̨���������б�׼ io���� stdin��stdout �� stderr����������ͨ�������� () �ض��򵽸����̡�������ʹ����Щ�����ṩ���ӽ��̵�����ͻ�ô��ӽ��̵��������Ϊ��Щ����ƽ̨����Ա�׼�����������ṩ���޵Ļ�������С�������д�ӽ��̵��������������Ѹ�ٳ���ʧ�ܣ�����ܵ����ӽ�����������������������

������Ҫ��ջ�������������������£�

final Process proc = Runtime.getRuntime().exec(commands);

new Thread(){

    public void run(){

    InputStream isError = proc.getErrorStream();

    InputStream isStdout  = proc.getInputStream();

   BufferedReader reader = new BufferedReader(new InputStreamReader(isStdout));

 while (reader.readLine()!=null) {

 ....

}

}

}.start();

