. ����һЩ�����Ĺ���ģ��, һ����ԡ�������ɺ� ֱ�ӷ�װΪJAR��, ���Թ������ϵͳ���е��ã��Ӷ�����


.  Eclipse ���� Jar �ļ������ַ�ʽ:

  ����һ:

      ����û�������ⲿjar ��ʱ, ֱ�ӵ���.


   ѡ�й���-->�Ҽ�, Export...--->Java--->JAR file-->next-->ѡ��jar file ��·��������-->next->next->ѡ�� main class-->finish

   
  ������:

       �������������������ⲿjarʱ, ����eclipse ��֧��ͬʱ�����ⲿjar ���Ĺ���, ���ԱȽ��鷳һ��, ���岽������:

        ���� manifest file : ѡ�й���--> �Ҽ�, Export-->Java-->JAR file->ѡ��jar file ��·��������-->next-->next->next;

       ��ʱ�����˷���1��Ҫѡ��main class �Ĵ���, �������Ȳ�ѡ��main class, ѡ�����Ϸ���Generate the manifest file, ����Save the manifest in the workspace, ��Manifest file: ������file ������, �� /testProject/main, (����testProject Ϊ������, main Ϊmanifest file ������)��� finish�� �ص�����, �򿪸ո����ɵ�main�� ������Ҫ����������Ϣ:

                    Manifest-Version: 1.0

             Main-Class:com.pocong.convert.auto.propertes.ConvertAutoProperties
 
                    Class-Path: jxl.jar

              ����, Manifest-Version: 1.0 Ϊ�ո��Զ����ɵ�manifest �汾��;

       Main-Class: com.pacong.convert.auto.propertes.ConvertAutoProperties Ϊmain class ������;

       Class-Path: jxl.jar Ϊ�ⲿjar������, �����Ǹ��ߵ�����jar��, ��Ҫ�õ����ⲿ��jar ����·��������.

      ���涼�����˾Ϳ��Ե������ⲿjar����jar��, ��������:

        ѡ�й���--> �Ҽ�, Export-->Java-->JAR file->ѡ��jar file ��·��������-->next-->next->next; ��ʱ�ֵ���ѡ��main class �Ĵ���, ������Ҳ��ѡ��main class, ѡ��Use existing manifest from workspace, ��Manifest file: ��ѡ��ո����ɵ�main, ��: /testProject/main, ���finish�� ���˾ʹ󹦸����.

     ���ﻹ��һ��Ҫע��:

      �����Ҫ�������������иո����ɵ�jar�� ��������:

       java -jar test.jar

       �����jar ����һЩSystem.out.println ���, ���к��뿴����ӡ��������, ��������������:

         java -jar test.jar >log.txt

   


����Ĳ��: fat jar

