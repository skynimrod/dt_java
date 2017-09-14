. apply plugin: 'java'

  引入java plugin.

  参见: userguid.pdf->7

. java plugin 本身就包含了诸多 task 

  使用 > gradle build 可以查看有哪些任务？

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

. 其他一些有用的任务有:

  clean     删除build 目录, 删除所有的built 的文件

  assemble  编译并打包(jars) Java 代码, 但是不运行 unit test(单元测试). 其他的插件会增加更多的artifacts 到这个task . 例如:
            你可以用 War plugin，这个任务会为你的project 构建WAR文件.

  check     编译并测试你的代码. 

  