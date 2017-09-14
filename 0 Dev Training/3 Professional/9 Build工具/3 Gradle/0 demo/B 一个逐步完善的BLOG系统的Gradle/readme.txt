.  每一个阶段的源码及部署任务是一个 sub build, 分布在子目录中, 在根目录中的build.gradle 中，  sub build 作为一个task 被调用


.  build.gradle

   是 root project. 主要是调度各个阶段的sub project . 

. 0/build.gradle

   sub project.

   该构建子任务 仅实现下面的目标:

    index.jsp  发布到 blog.war

. 

  