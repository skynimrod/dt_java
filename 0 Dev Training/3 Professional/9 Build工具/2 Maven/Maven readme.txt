. 参见:

      http://baike.baidu.com/view/336103.htm?fr=aladdin

      http://maven.apache.org/    官方网站

. Apache Maven 是软件项目管理和理解工具. 基于 POM(project object model)的概念,  Maven 能管理项目(project)编译, 报告 和文档的软件 项目管理工具.
  发文时(发布时), 绝大多数开发人员都把Ant 当作Java 变成项目的标准构建工具。 遗憾的是, Ant 的项目管理工具(作为make 的替代工具)不能满足绝大多数开发人员的需要. 通过检查Ant 构建工具, 很难发现项目的相关性信息和其他信息(如开发人员/拥有者、版本或站点主页.) 

  Maven 除了以程序构建能力 为特色之外, 还提供Ant 所缺少的高级项目管理工具。 由于Maven 的缺省构建规则有较高的可重用性, 所以常常用两三行 Maven 构建及哦啊本就可以构建简单的项目, 而是用 Ant  则需要十几行. 事实上， 由于Maven 的面向项目的方法, 许多 Apache Jakarta 项目发文时使用Maven， 而且公司项目采用Maven 的比例持续增长.

. 设置系统环境变量 MAVEN_HOME=../maven...

. 在PATH 中增加 %MAVEN_HOME%/bin

. 测试 Maven 是否正常

  > mvn -v

  > mvn -h  查看命令行帮助

. 如果是Windows 环境, 使用下面的命令来下载需要的POM文件以及JAR等。
  
  mvn archetype:generate -DgroupId=com.mycompany.app -DartifactId=my-app -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false  > c:\mvn.report.txt

  重定向的目的是为了查看到底下载了那些文件.  是多线程下载的， 速度非常快。

  第一次运行, 没有重定向, 不知道第二次能不能出来(第二次就没有那些需要下载的文件了，而且出错了).

.  

  

  