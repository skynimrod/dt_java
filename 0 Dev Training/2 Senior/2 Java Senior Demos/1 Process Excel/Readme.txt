. Java 处理 Excel 文件

  非常好的文档:

         http://wenku.baidu.com/view/43544cc52cc58bd63186bd3b.html

         http://baike.baidu.com/view/1327707.htm


  包括2部分:  

      1.  读取已有Excel 文件数据

      2.  产生 目标Excel 文件

. 处理  Excel 文件的 Java 包

  JXL : JExcelApi     

        http://jexcelapi.sourceforge.net/

        一个成熟的开源Java API包，开发人员可以用它读写Excel 表格.  

        在Files 里面下载 jexcelapi_2_6_12.zip. 另外还有C#的Demo例子.

        处理范围:

           从 Excel 95, 97, 2000, XP, 2003  等格式的文件中读取数据;

           读取Excel 公式(可以读取 Excel 97 版本以后的公式) 

           产生的Excel  是2000格式

           支持 字体，数字和日期格式化

           支持单元格的 阴影, 边界, 颜色等操作
     
           可修改已存在的工作表

           支持拷贝

           支持插入和拷贝图像到表中

           支持 Jakata Commons Logging, log4j, JDK1.4 Loger 等等

    用法:  

        1. 将 jexcelapi_2_6_12.zip 解压，Build 子目录中的jlex 子目录就包含 处理excel的类库.

        2. import jxl.*;
     
        3. 编译
 
           javac -classpath jxl.jar WriteFirstExcel.java

           需要指定jxl.jar, 不然提示"软件包 jxl 不存在"

        4. 运行

           java WriteFirstExcel.java

           出错：

Exception in thread "main" java.lang.NoClassDefFoundError: jxl/Workbook
        at WriteFirstExcel.main(WriteFirstExcel.java:26)

           分析: 

                Classpath  已经包含 jxl.jar 所在的当前目录("."). 

                用 java -classpath ./jxl.jar WriteFirstExcel

                仍然出同样的错误.

                修改 Classpath内容. c:\..\> set CLASSPATH=./jxl.jar;%CLASSPATH%;

                然后:   c:\..\>javac WriteFirstExcel.java        成功

                        c:\..\>java WriteFirstExcel              之前的错误已经没有了, 不过出现了新错误

                             
jxl.read.biff.BiffException: Unable to recognize OLE stream
        at jxl.read.biff.CompoundFile.<init>(CompoundFile.java:116)
        at jxl.read.biff.File.<init>(File.java:127)
        at jxl.Workbook.getWorkbook(Workbook.java:268)
        at jxl.Workbook.getWorkbook(Workbook.java:253)
        at WriteFirstExcel.main(WriteFirstExcel.java:28)

    这个错误原因是 要处理的csv  文件不是标准excel 文件, 系统处理不了. 

解决方法：


1、新建excel文件，手动复制原文件内容至新文件。然后删除原文件，并将新文件的文件改成原文件的文件名。然后用jxl读取成功。


2，打开源文件，随便输入几个空格后再删除，然后保存

这个Excel文件是从哪里来的，很可能是从一个页面上下载来的，而这个页面做的功能就是导出Excel，但做偷懒了，没有用jxl和POI等库，而是用直接用jsp生成html写的。重新建过一个文件就可以了.

 

原理：去除原excel中出错的非文本部分。
                        


        第二部分:  生成新的Excel 工作薄

        与读取Excel  工作表类似, 首先要使用Workbook 类的factory 方法创建一个可写入的工作薄(Workbook)对象, 这里要注意的是, 只能通过API提供的factory 方法来创建Workbook , 而不能使用WritebleWorkbook的构造方法, 因为类 WritableWorkbook 的构造函数为protected 类型. 

        API 提供了两种方式来处理可写入的输出流, 一种是直接生成本地文件, 如果文件名不带全路径的话, 缺省的文件会定位在当前目录, 如果文件名带有全路径的话, 则生成的Excel文件则会定位在相应的目录;    另一种是将Excel 对象直接写入到输出流, 例如: 用户铜鼓噢浏览器来访问Web服务器,如果 HTTP头设置正确的话, 浏览器自动调用客户端的Excel应用程序, 来显示动态生成的Excel电子表格. 
 
/*
        jxl的类包用来对excel表格操作。它是一个open   source,下载和资料都能搜到。 
java解析XML的包有jdom,jaxp等。你可以上sun的网站查找jaxp，这个应该是最新的xml解析工具。

import     org.jdom.*; 
import     org.jdom.input.*; 
import     org.jdom.output.*;

import   javax.xml.transform.*; 
import   javax.xml.transform.stream.StreamResult; 
import   javax.xml.transform.stream.StreamSource;
*/

. 编译后执行问题:  请求的操作无法在使用用户映射区域打开的文件上执行

  解决:

       主要是 操作的文件已经在其它地方打开，造成程序里没法操作.  关闭其它打开的地方即可.

POI:

    Apache提供的开源包

    