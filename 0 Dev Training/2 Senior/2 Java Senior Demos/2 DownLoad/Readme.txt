. ͨ��Java �����ļ�

  Ŀ���ļ�:  http://vip.stock.finance.sina.com.cn/quotes_service/view/cn_bill_download.php?symbol=sz000002&num=60&sort=ticktime&asc=0&volume=40000&type=0

. ��������:

  1. ���� JDownLoads.java

    c:\..\>javac -cp ./servlet-api.jar JDownLoads.java

. ���Ҳ����һ��Class �е�����һ��Class�����. 

  JDownLoads.class  ���� ���������ļ���API, JDownLoadTest.class  �е��� JDownLoads�еķ���.  

  1. ���� JAR

     jar cvf JDownLoads.jar JDownLoads.class
 
     Ŀ¼�»����� JDownLoads.jar. �������jar ������, ����JDownLoads.class  ��ѹ�����ĸ�Ŀ¼�У�����META-INFĿ¼�е�MANIFEST.mf  ��������:

     Manifest-Version: 1.0
     Created-By: 1.6.0_02 (Sun Microsystems Inc.)

  2. ���� Jar

     ���� һ��MANIFEST.MF�ļ��� ��������:

     Manifest-Version: 1.0
     Created-By: 1.6.0_02 (Sun Microsystems Inc.)

     Main-Class: JDownLoads

     Ȼ��������������� jar

     jar umf MANIFEST.MF JDownLoads.jar


   ...

   ��Ҫ Ŀ��class �������Ŀ��Ŀ¼�У� ����: JDownLoads.class �������./JDL/��Ŀ¼�£� �������ʱ

   jar cvfm JDL.jar manifest.mf ./jdl/JDownLoads.class

   ��ô JDL.jar  �У�JDownLoads.class �ͻ��� ./JDL/��Ŀ¼��. 

   ==================================

    1. JDownLoads.java  �� JDownLoads.class  Ӧ���� ./JDL ��Ŀ¼��.

    2. JDownLoads.java  Ӧ�ð���:  Package JDL;

    3. ��JDL ��Ŀ¼�б������� JDownLoads.class

    4. ��JDL ����һ��Ŀ¼�н��� JDL  �Ĵ���.

       jar cvmf MANIFEST.MF jdl.jar ./JDL/JDownLoads.class

       ע��,  MANIFEST.MF  Ҳ��JDL  ����һ��Ŀ¼��. ��������:

      Manifest-Version: 1.0
Created-By: 1.6.0_02 (Sun Microsystems Inc.)

Name: JDL/
Specification-Title: Java API for Download
Specification-Version: 0.9
Specification-Vendor: AquGen
Implementation-Title: JDownLoads
Implementation-Version: 0.9 public_draft
Implementation-Vendor: AquGen

   5. ���� ��JDL ��һ��Ŀ¼�оͲ�����JDL.jar.  ��JDL.jar  ���Ա�����APP  ʹ��.

    ��Ŀ¼�� CreateJDL.JAR.bat  �����沽��������м�����һ����.

    ���и�С���⣬ jar cvmf MANIFEST.MF jdl.jar ./jdl/jDownloads.class, ���Զ���./JDL ��Ŀ¼�²���һ��jdl ��Ŀ¼�� ����Ŀ¼����JDownLoads.class.

    ԭ���� ������JDownLoads.class ������./jdl����һ����Ŀ¼��jdl �У�������./jdl ��. 

    �޸� ��������Ϊ:  

       (�޸�ǰ)javac -s ./jdl -d ./jdl -cp ./jdl/servlet-api.jar ./jdl/JDownLoads.java 

       (�޸ĺ�)javac -cp ./jdl/servlet-api.jar ./jdl/JDownLoads.java  

    �����Ͳ����ٲ��� jdl ��Ŀ¼�� ����JDownLoads.class Ҳ������./JDL ��Ŀ¼��.

    ִ�д������:

       jar cvmf MANIFEST.MF JDL.jar ./JDL/JDownLoads.class

     �ɹ�. 


   6. ����

      ������CLASSPATH , ����Ҫ��JAR  ������ȥ

      set CLASSPATH=./JDL.jar;./servlet-api.jar;%CLASSPATH%

      java JDownLoadTest

      ��ʾ: 
 
      java.io.FileNotFoundException: http:\vip.stock.finance.sina.com.cn\quotes_servic
e\view\cn_bill_download.php?symbol=sz000002&num=60&sort=ticktime&asc=0&volume=40
000&type=0 (�ļ�����Ŀ¼�������﷨����ȷ��)

   7. ��ֹ��Ŀǰ �����ṹ������ȷ���������صĳ��򲿷������⡣ ���ټ����޸ģ�������3 DownLoad2 ��ʵ��. 






    

  