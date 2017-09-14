
. 软件自带的 多projects 的例子:

   samples/userguide/multiproject/dependencies/***

. 多 projects 分为3种情况:

  1. 多个平行的Projects

     不存在 父子关系的projects.

  2. 只有一个root projects,  其他是sub projects , 但是 所有构建文件在rootdir 下面。

  3. 只有一个root projects, 其他都是sub projects, 构建文件在目标projects 的相对rootdir 下面(即 sub project 的build.gradle 在sub project 对应的root dir 下)

. 参见:

  UserGuid -> chapter 56. Multi-project Builds

  不要求project 都必须是 java project

. 在任何task 被执行之前, 所有的project 的configuration 会先执行. 也就是说: 只要有一个project 的一个task 被要求, 所有 project  (针对 multi project)   都必须要被配置.

. 56.1.2 

  project tree

  == Build layout =========
 
  water/

       build.gradle

       settings.gradle
 
       bulewhale/
  

  需要注意的是, 如果sub project 暂时是空目录, 必须要在子目录里面有个 .ignore-me 名称的空文件, 不然, gradle 会出错. 显示找不到对应的sub project

. Gradle 允许你从任何build 脚本访问多project 中的任何project . Project API 提供了project()方法, 参数是路径, 返回 目标路径下面的Project 对象. 任意脚本的capability to configure a project ， 叫做cross project configuration. Gradle 通过 configuration injection (配置注入) 来实现.

  Project API 提供了一个属性 : allprojects, 返回 当前project 和它所有sub projects 的一个list. 

  subprojects 属性

  可以通过project(':子project名称').task <<{} 来指定sub project 的任务行为。例如：

   project(':bluewhale').hello << {
    println "- I'm the largest animal that has ever lived on this planet."
   }


  过滤功能:

  configure(subprojects.findAll {it.name != 'tropicalFish'}) {
     hello << {println '- I love to spend time in the arctic waters.'}
  }

  还可以通过 扩展属性来过滤, 在子project 中定义同名 属性,例如：

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

  子project 
  ext.arctic = true
  hello.doLast { println "- I'm the largest animal that has ever lived on this planet." }

  #### afterEvaluate  是 notification (通知).   意思是评估后执行