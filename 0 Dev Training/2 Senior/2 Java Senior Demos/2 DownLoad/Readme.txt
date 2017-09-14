. 通过Java 下载文件

  目标文件:  http://vip.stock.finance.sina.com.cn/quotes_service/view/cn_bill_download.php?symbol=sz000002&num=60&sort=ticktime&asc=0&volume=40000&type=0

. 编译命令:

  1. 编译 JDownLoads.java

    c:\..\>javac -cp ./servlet-api.jar JDownLoads.java

. 这儿也包括一个Class 中调用另一个Class的情况. 

  JDownLoads.class  包含 处理下载文件的API, JDownLoadTest.class  中调用 JDownLoads中的方法.  

  1. 创建 JAR

     jar cvf JDownLoads.jar JDownLoads.class
 
     目录下会生成 JDownLoads.jar. 不过这个jar 不完整, 其中JDownLoads.class  在压缩包的根目录中，并且META-INF目录中的MANIFEST.mf  内容如下:

     Manifest-Version: 1.0
     Created-By: 1.6.0_02 (Sun Microsystems Inc.)

  2. 修正 Jar

     创建 一个MANIFEST.MF文件， 内容如下:

     Manifest-Version: 1.0
     Created-By: 1.6.0_02 (Sun Microsystems Inc.)

     Main-Class: JDownLoads

     然后用如下命令更新 jar

     jar umf MANIFEST.MF JDownLoads.jar


   ...

   需要 目标class 本身就在目标目录中， 比如: JDownLoads.class 必须就在./JDL/子目录下， 这样打包时

   jar cvfm JDL.jar manifest.mf ./jdl/JDownLoads.class

   那么 JDL.jar  中，JDownLoads.class 就会在 ./JDL/子目录下. 

   ==================================

    1. JDownLoads.java  与 JDownLoads.class  应该在 ./JDL 子目录下.

    2. JDownLoads.java  应该包含:  Package JDL;

    3. 在JDL 子目录中编译生成 JDownLoads.class

    4. 在JDL 的上一级目录中进行 JDL  的创建.

       jar cvmf MANIFEST.MF jdl.jar ./JDL/JDownLoads.class

       注意,  MANIFEST.MF  也在JDL  的上一级目录中. 内容如下:

      Manifest-Version: 1.0
Created-By: 1.6.0_02 (Sun Microsystems Inc.)

Name: JDL/
Specification-Title: Java API for Download
Specification-Version: 0.9
Specification-Vendor: AquGen
Implementation-Title: JDownLoads
Implementation-Version: 0.9 public_draft
Implementation-Vendor: AquGen

   5. 至此 在JDL 上一级目录中就产生了JDL.jar.  该JDL.jar  可以被其它APP  使用.

    本目录下 CreateJDL.JAR.bat  将上面步骤地命令行集合在一起了.

    还有个小问题， jar cvmf MANIFEST.MF jdl.jar ./jdl/jDownloads.class, 会自动在./JDL 子目录下产生一个jdl 子目录， 该子目录包含JDownLoads.class.

    原因是 产生的JDownLoads.class 进入了./jdl的下一级子目录的jdl 中，而不是./jdl 中. 

    修改 编译命令为:  

       (修改前)javac -s ./jdl -d ./jdl -cp ./jdl/servlet-api.jar ./jdl/JDownLoads.java 

       (修改后)javac -cp ./jdl/servlet-api.jar ./jdl/JDownLoads.java  

    这样就不会再产生 jdl 子目录， 而且JDownLoads.class 也生成在./JDL 子目录中.

    执行打包命令:

       jar cvmf MANIFEST.MF JDL.jar ./JDL/JDownLoads.class

     成功. 


   6. 运行

      先设置CLASSPATH , 把需要的JAR  包含进去

      set CLASSPATH=./JDL.jar;./servlet-api.jar;%CLASSPATH%

      java JDownLoadTest

      提示: 
 
      java.io.FileNotFoundException: http:\vip.stock.finance.sina.com.cn\quotes_servic
e\view\cn_bill_download.php?symbol=sz000002&num=60&sort=ticktime&asc=0&volume=40
000&type=0 (文件名、目录名或卷标语法不正确。)

   7. 截止到目前 整个结构基本正确，不过下载的程序部分有问题。 不再继续修改，重新在3 DownLoad2 中实现. 






    

  