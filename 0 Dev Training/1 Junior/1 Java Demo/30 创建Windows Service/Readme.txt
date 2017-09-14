. java 实现  Windows  Service  的方法有以下几种:

  1. 使用 JavaService 让 Java程序加载为 Win NT 系统服务

     参见: 
 
         http://blog.csdn.net/54powerman/archive/2007/03/01/1518152.aspx

. 使用 JavaService 让 Java程序加载为 Win NT 系统服务

  1. 下载 JavaService 

     http://javaservice.objectweb.org/

     获得 Windows 的 zip 压缩版, 文件名形如: JavaService-x.x.xx.zip， 其中 x.x.xx 为版本号, 当前版本为 JavaService-2.0.10.zip,  请使用最新版.

  2. 安装

     将 JavaService-2.0.10.zip 解压缩到 c:\JavaService 目录下. (其实任意目录下都可以)

  3. 编写 java 类

import java.io.*;
import java.text.*;
import java.util.*;


