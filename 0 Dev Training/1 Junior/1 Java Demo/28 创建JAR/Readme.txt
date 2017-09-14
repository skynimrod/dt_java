. 对于一些独立的功能模块, 一般调试、测试完成后， 直接封装为JAR后, 可以供更多的系统进行调用，从而避免


.  Eclipse 导出 Jar 文件的两种方式:

  方法一:

      工程没有引用外部jar 包时, 直接导出.


   选中工程-->右键, Export...--->Java--->JAR file-->next-->选择jar file 的路径及名称-->next->next->选择 main class-->finish

   
  方法二:

       当工程引用了其他的外部jar时, 由于eclipse 不支持同时导出外部jar 包的功能, 所以比较麻烦一点, 具体步骤如下:

        生成 manifest file : 选中工程--> 右键, Export-->Java-->JAR file->选择jar file 的路径及名称-->next-->next->next;

       此时来到了方法1中要选择main class 的窗口, 但这里先不选择main class, 选择最上方的Generate the manifest file, 勾上Save the manifest in the workspace, 在Manifest file: 中输入file 的名称, 如 /testProject/main, (其中testProject 为工程名, main 为manifest file 的名称)点击 finish， 回到工程, 打开刚刚生成的main， 在这里要输入如下信息:

                    Manifest-Version: 1.0

             Main-Class:com.pocong.convert.auto.propertes.ConvertAutoProperties
 
                    Class-Path: jxl.jar

              其中, Manifest-Version: 1.0 为刚刚自动生成的manifest 版本号;

       Main-Class: com.pacong.convert.auto.propertes.ConvertAutoProperties 为main class 所在类;

       Class-Path: jxl.jar 为外部jar包名称, 这里是告诉导出的jar包, 所要用到的外部的jar 包的路径和名称.

      上面都做完了就可以导出带外部jar包的jar包, 步骤如下:

        选中工程--> 右键, Export-->Java-->JAR file->选择jar file 的路径及名称-->next-->next->next; 这时又到了选择main class 的窗口, 但这里也不选择main class, 选择Use existing manifest from workspace, 在Manifest file: 里选择刚刚生成的main, 如: /testProject/main, 点击finish， 到此就大功告成了.

     这里还有一点要注意:

      如果想要在命令行中运行刚刚生成的jar， 命令如下:

       java -jar test.jar

       如果在jar 中有一些System.out.println 语句, 运行后想看看打印出的内容, 可以用以下命令:

         java -jar test.jar >log.txt

   


打包的插件: fat jar

