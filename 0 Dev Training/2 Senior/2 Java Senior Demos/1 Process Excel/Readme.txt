. Java ���� Excel �ļ�

  �ǳ��õ��ĵ�:

         http://wenku.baidu.com/view/43544cc52cc58bd63186bd3b.html

         http://baike.baidu.com/view/1327707.htm


  ����2����:  

      1.  ��ȡ����Excel �ļ�����

      2.  ���� Ŀ��Excel �ļ�

. ����  Excel �ļ��� Java ��

  JXL : JExcelApi     

        http://jexcelapi.sourceforge.net/

        һ������Ŀ�ԴJava API����������Ա����������дExcel ���.  

        ��Files �������� jexcelapi_2_6_12.zip. ���⻹��C#��Demo����.

        ����Χ:

           �� Excel 95, 97, 2000, XP, 2003  �ȸ�ʽ���ļ��ж�ȡ����;

           ��ȡExcel ��ʽ(���Զ�ȡ Excel 97 �汾�Ժ�Ĺ�ʽ) 

           ������Excel  ��2000��ʽ

           ֧�� ���壬���ֺ����ڸ�ʽ��

           ֧�ֵ�Ԫ��� ��Ӱ, �߽�, ��ɫ�Ȳ���
     
           ���޸��Ѵ��ڵĹ�����

           ֧�ֿ���

           ֧�ֲ���Ϳ���ͼ�񵽱���

           ֧�� Jakata Commons Logging, log4j, JDK1.4 Loger �ȵ�

    �÷�:  

        1. �� jexcelapi_2_6_12.zip ��ѹ��Build ��Ŀ¼�е�jlex ��Ŀ¼�Ͱ��� ����excel�����.

        2. import jxl.*;
     
        3. ����
 
           javac -classpath jxl.jar WriteFirstExcel.java

           ��Ҫָ��jxl.jar, ��Ȼ��ʾ"����� jxl ������"

        4. ����

           java WriteFirstExcel.java

           ����

Exception in thread "main" java.lang.NoClassDefFoundError: jxl/Workbook
        at WriteFirstExcel.main(WriteFirstExcel.java:26)

           ����: 

                Classpath  �Ѿ����� jxl.jar ���ڵĵ�ǰĿ¼("."). 

                �� java -classpath ./jxl.jar WriteFirstExcel

                ��Ȼ��ͬ���Ĵ���.

                �޸� Classpath����. c:\..\> set CLASSPATH=./jxl.jar;%CLASSPATH%;

                Ȼ��:   c:\..\>javac WriteFirstExcel.java        �ɹ�

                        c:\..\>java WriteFirstExcel              ֮ǰ�Ĵ����Ѿ�û����, �����������´���

                             
jxl.read.biff.BiffException: Unable to recognize OLE stream
        at jxl.read.biff.CompoundFile.<init>(CompoundFile.java:116)
        at jxl.read.biff.File.<init>(File.java:127)
        at jxl.Workbook.getWorkbook(Workbook.java:268)
        at jxl.Workbook.getWorkbook(Workbook.java:253)
        at WriteFirstExcel.main(WriteFirstExcel.java:28)

    �������ԭ���� Ҫ�����csv  �ļ����Ǳ�׼excel �ļ�, ϵͳ������. 

���������


1���½�excel�ļ����ֶ�����ԭ�ļ����������ļ���Ȼ��ɾ��ԭ�ļ����������ļ����ļ��ĳ�ԭ�ļ����ļ�����Ȼ����jxl��ȡ�ɹ���


2����Դ�ļ���������뼸���ո����ɾ����Ȼ�󱣴�

���Excel�ļ��Ǵ��������ģ��ܿ����Ǵ�һ��ҳ�����������ģ������ҳ�����Ĺ��ܾ��ǵ���Excel������͵���ˣ�û����jxl��POI�ȿ⣬������ֱ����jsp����htmlд�ġ����½���һ���ļ��Ϳ�����.

 

ԭ��ȥ��ԭexcel�г���ķ��ı����֡�
                        


        �ڶ�����:  �����µ�Excel ������

        ���ȡExcel  ����������, ����Ҫʹ��Workbook ���factory ��������һ����д��Ĺ�����(Workbook)����, ����Ҫע�����, ֻ��ͨ��API�ṩ��factory ����������Workbook , ������ʹ��WritebleWorkbook�Ĺ��췽��, ��Ϊ�� WritableWorkbook �Ĺ��캯��Ϊprotected ����. 

        API �ṩ�����ַ�ʽ�������д��������, һ����ֱ�����ɱ����ļ�, ����ļ�������ȫ·���Ļ�, ȱʡ���ļ��ᶨλ�ڵ�ǰĿ¼, ����ļ�������ȫ·���Ļ�, �����ɵ�Excel�ļ���ᶨλ����Ӧ��Ŀ¼;    ��һ���ǽ�Excel ����ֱ��д�뵽�����, ����: �û�ͭ���������������Web������,��� HTTPͷ������ȷ�Ļ�, ������Զ����ÿͻ��˵�ExcelӦ�ó���, ����ʾ��̬���ɵ�Excel���ӱ��. 
 
/*
        jxl�����������excel������������һ��open   source,���غ����϶����ѵ��� 
java����XML�İ���jdom,jaxp�ȡ��������sun����վ����jaxp�����Ӧ�������µ�xml�������ߡ�

import     org.jdom.*; 
import     org.jdom.input.*; 
import     org.jdom.output.*;

import   javax.xml.transform.*; 
import   javax.xml.transform.stream.StreamResult; 
import   javax.xml.transform.stream.StreamSource;
*/

. �����ִ������:  ����Ĳ����޷���ʹ���û�ӳ������򿪵��ļ���ִ��

  ���:

       ��Ҫ�� �������ļ��Ѿ��������ط��򿪣���ɳ�����û������.  �ر������򿪵ĵط�����.

POI:

    Apache�ṩ�Ŀ�Դ��

    