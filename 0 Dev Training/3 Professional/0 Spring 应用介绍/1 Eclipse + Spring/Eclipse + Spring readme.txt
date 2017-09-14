. 参见 

      http://blog.knowsky.com/221723.htm

. 找 Eclipse, Spring 的省略了

. Eclipse 创建项目

  1. 建工程
 
    打开eclipse，新建一个工程File->New->Project   选择Web->Dynamic Web Project

    点击next，然后出现如下图，Project name随便取吧，为了后文方便，这里叫FuckSpring

  2. 点击Finish后, 在这个FuckSpring 项目上右键, new->Folder  建一个文件夹, 名字叫做lib

    现在到解压后的Spring 文件夹里面去找个文件 

     spring-framework-2.5.6-with-dependencies\spring-framework-2.5.6\lib\jakarta-commons\comms-logging.jar 

     和 spring-framework-2.5.6\dist\spring.jar

    把 comms-loging.jar 和spring.jar 复制到刚刚建好的那个 lib 文件夹里面(虽然 才看一天的书, 但是觉得复制进去而不是直接引用, 是因为相对路径和绝对路径的问题, 方便以后发布)

    在eclipse 里面添加引用。  在 FuckSpring 工程上右键, 选择 Properties， 左边选择 Java Build Path， 中间选择Libraries， 右边选择 Add Library。 然后在弹出新的框里面选择 user libaries->new， 名字随便取, 比如 LibrariesForFuckSpring， 然后确定. 在如下画面, 选中 LibrariesForFuckSpring， 点击 Add JARs，  把lib 文件夹下面的commons-logging.jar 和 spring.jar 引用进来.

  3. 创建spring 配置文件

     