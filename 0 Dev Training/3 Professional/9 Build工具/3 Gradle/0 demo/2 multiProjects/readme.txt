
. ����Դ��� ��projects ������:

   samples/userguide/multiproject/dependencies/***

. �� projects ��Ϊ3�����:

  1. ���ƽ�е�Projects

     ������ ���ӹ�ϵ��projects.

  2. ֻ��һ��root projects,  ������sub projects , ���� ���й����ļ���rootdir ���档

  3. ֻ��һ��root projects, ��������sub projects, �����ļ���Ŀ��projects �����rootdir ����(�� sub project ��build.gradle ��sub project ��Ӧ��root dir ��)

. �μ�:

  UserGuid -> chapter 56. Multi-project Builds

  ��Ҫ��project �������� java project

. ���κ�task ��ִ��֮ǰ, ���е�project ��configuration ����ִ��. Ҳ����˵: ֻҪ��һ��project ��һ��task ��Ҫ��, ���� project  (��� multi project)   ������Ҫ������.

. 56.1.2 

  project tree

  == Build layout =========
 
  water/

       build.gradle

       settings.gradle
 
       bulewhale/
  

  ��Ҫע�����, ���sub project ��ʱ�ǿ�Ŀ¼, ����Ҫ����Ŀ¼�����и� .ignore-me ���ƵĿ��ļ�, ��Ȼ, gradle �����. ��ʾ�Ҳ�����Ӧ��sub project

. Gradle ��������κ�build �ű����ʶ�project �е��κ�project . Project API �ṩ��project()����, ������·��, ���� Ŀ��·�������Project ����. ����ű���capability to configure a project �� ����cross project configuration. Gradle ͨ�� configuration injection (����ע��) ��ʵ��.

  Project API �ṩ��һ������ : allprojects, ���� ��ǰproject ��������sub projects ��һ��list. 

  subprojects ����

  ����ͨ��project(':��project����').task <<{} ��ָ��sub project ��������Ϊ�����磺

   project(':bluewhale').hello << {
    println "- I'm the largest animal that has ever lived on this planet."
   }


  ���˹���:

  configure(subprojects.findAll {it.name != 'tropicalFish'}) {
     hello << {println '- I love to spend time in the arctic waters.'}
  }

  ������ͨ�� ��չ����������, ����project �ж���ͬ�� ����,���磺

  subprojects {
    hello {
        doLast {println "- I depend on water"}
        afterEvaluate { Project project ->
            if (project.arctic) { doLast {
                println '- I love to spend time in the arctic waters.' }
            }
        }
    }
  }

  ��project 
  ext.arctic = true
  hello.doLast { println "- I'm the largest animal that has ever lived on this planet." }

  #### afterEvaluate  �� notification (֪ͨ).   ��˼��������ִ��