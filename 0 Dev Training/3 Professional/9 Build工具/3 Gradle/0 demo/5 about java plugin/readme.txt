. apply plugin: 'java'

  ����java plugin.

  �μ�: userguid.pdf->7

. java plugin ����Ͱ�������� task 

  ʹ�� > gradle build ���Բ鿴����Щ����

> gradle build
:compileJava
:processResources
:classes
:jar
:assemble
:compileTestJava
:processTestResources
:testClasses
:test
:check
:build

BUILD SUCCESSFUL

Total time: 1 secs

. ����һЩ���õ�������:

  clean     ɾ��build Ŀ¼, ɾ�����е�built ���ļ�

  assemble  ���벢���(jars) Java ����, ���ǲ����� unit test(��Ԫ����). �����Ĳ�������Ӹ����artifacts �����task . ����:
            ������� War plugin����������Ϊ���project ����WAR�ļ�.

  check     ���벢������Ĵ���. 

  