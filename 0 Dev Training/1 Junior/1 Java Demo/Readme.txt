. 开发环境

  实用Eclipse 5.0 + JRE 1.5.0

  安装完成后， 需要 配置环境变量增加对 Javac 目录的设置。 Javac 一般在JDK的bin 目录下

. 1. 第一个Java 程序

     import java.io.Serializable;
import java.util.ArrayList;

public class HelloWorldApp{//an application

public static void main(Stringargs[]){

System.out.println("HelloWorld!");

}

}


  2. Javac 编译出现如下问题

   D:\JavaWorkSpace\Just a Test\HelloWorldApp.java:6: 需要 <标识符>
public static void main(Stringargs[]){
                                    ^
D:\JavaWorkSpace\Just a Test\HelloWorldApp.java:11: 需要 ')'
^
2 错误

  3. 原因

    public static void main(Stringargs[]) 中， main() 的参数 应该是 String args[].

    修正后，编译成功，生成 HelloWorldApp.class. (与源文件同一目录)

  4. 运行

    c:\> java HelloWorldApp.class

    出现错误

    "I:\Documents and Settings\Administrator>java "D:\JavaWorkSpace\Just a Test\Hello
WorldApp.class"
Exception in thread "main" java.lang.NoClassDefFoundError: D:\JavaWorkSpace\Just
 a Test\HelloWorldApp/class"

    “这实际上是个配置问题，你的classpath设置不对，具体怎么设置，我说了很多遍了，给你找了几篇文章，你看看就明白了，给分吧”
  
    参见: http://www.yesky.com/SoftChannel/72348977504190464/20040706/1827869.shtml

	classpath是寻找Java类路径的，在运行Java程序(Java HelloWorldApp.class)时，告诉程序在何处寻找相关的类。下面有几篇文章很清楚的解释了classpath，给分吧。

    增加了 ClassPath 的设置后，运行后仍然出现以下问题:

    Exception in thread "main" java.lang.NoClassDefFoundError: HelloWorldApp/java

  5. 解决

    原来是运行的命令行有问题

    不应该带.class 后缀. 例如:  Java HelloWorldApp

. 2. 带图形界面的Java 程序

import javax.swing.*;

public class HelloWorldX {
	public static void main( String args[] ) {
		JFrame frame = new JFrame ("Hello World X!");

		JLabel label = new JLabel( "Hello Java!", JLabel.CENTER );

		frame.getContentPane().add(label);

		frame.setSize(300, 300);
		frame.setVisible (true);
	}
}
 

正确。  

 
========================================================================

OK! 现在的问题是如何 在Eclipse 集成开发环境下 运行以上的程序.

====================================================================

步骤如下:

1. 打开Esclips (v3.2)

2. File -> New -> Project

   弹出 New Project 的对话框。 不做任何输入与改动，按"下一步"(Next)，进入下一个界面. 在"Project name" 输入"Test" (工程的名字， 随便起，不重复就行), 然后按"Finish".

3. 此时， IDE左面区域(Package )(Workspace) 出现Test 工程的名字

4. 鼠标点击选中 工程名称 "Test"。 右击弹出菜单， 选中"Import". 

   在下面的Treeview 框中， 选中"General"->"File System", 其他不用做任何输入， 然后鼠标点击"Next". 进入下一个界面选择 要导入的源代码文件。

   使用"Browse" 选择已有 源代码文件.

5. 此时， 工程"Test" 中就包含 需要调试的代码文件了 (default package).

6. 选中需要调试或运行的源码文件, 比如 "HelloWorld.java", 然后 鼠标右击弹出菜单，选中"Run As"->"Java Application" (或者 Alt + Shift + x, J), 在中间下面的窗口中会输出运行结果.

至此， 最简单的Eclips 调试 Java 的过程结束， 并成功.

===============================================================
下面作个稍微复杂的技术应用: Socket 通讯。 提供一个服务器端程序和一个客户端程序， 实现本机(或跨机器)消息通讯。
=============================================================== 

1. 服务器端:

   SocketServer.java
  
   ---------------------------

import java.net.*;
import java.io.*;

public class SocketServer {
	public static void main( String args[]) throws IOException{
		ServerSocket server = new ServerSocket(8889);
		
		Socket client= server.accept();
		
		BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));
		
		PrintWriter out = new PrintWriter(client.getOutputStream());
		
		while(true){
			String str = in.readLine();
			
			System.out.println();
			
				out.println("has receive...");
				out.flush();
				
				if (str.equals("end"))
					break;
		}
		
		server.close();
	}
}

   编译通过。

   运行时出现以下问题:

   ---------------------------
Exception in thread "main" java.lang.NoClassDefFoundError: SocketServer (wrong name: Server/SocketServer)
        at java.lang.ClassLoader.defineClass1(Native Method)
        at java.lang.ClassLoader.defineClass(Unknown Source)
        at java.security.SecureClassLoader.defineClass(Unknown Source)
        at java.net.URLClassLoader.defineClass(Unknown Source)
        at java.net.URLClassLoader.access$100(Unknown Source)
        at java.net.URLClassLoader$1.run(Unknown Source)
        at java.security.AccessController.doPrivileged(Native Method)
        at java.net.URLClassLoader.findClass(Unknown Source)
        at java.lang.ClassLoader.loadClass(Unknown Source)
        at sun.misc.Launcher$AppClassLoader.loadClass(Unknown Source)
        at java.lang.ClassLoader.loadClass(Unknown Source)
        at java.lang.ClassLoader.loadClassInternal(Unknown Source)

   原因是 原来的程序前面有Package的定义， 造成ClassPath 出现不一致， 删除后， 重新编译运行即可。
   

2. 客户端

   SocketClient.java

   =================

   import java.lang.*;
import java.net.*;
import java.io.*;

public class SocketClient {
	/**
	 * @param args
	 */
	public static void main( String args[]) throws IOException{
		Socket server = new Socket(InetAddress.getLocalHost(),8889);// throws UnknownHostException;
		//        IOException;
		
		BufferedReader in=new BufferedReader(new InputStreamReader(server.getInputStream()));
		
		PrintWriter out = new PrintWriter(server.getOutputStream());
		
		BufferedReader wt = new BufferedReader( new InputStreamReader(System.in));
		
		while(true){
			String str = wt.readLine();
			
			out.println(str);
			
			out.flush();
			
			if ( str.equals("End")) {
				break;
			}
			
			System.out.println(in.readLine());
		}
		
		
		server.close();
	}
} 

====================================================

总结:

      通讯基本建立。 问题时， 客户端发送信息，可以从服务端反馈"has receive...", 但是服务端没有 显示客户端发送的信息
。

     分析原因:
         客户端没有向服务端发送信息。 --- 不是这个原因， 因为服务端以下代码 已经执行。

                               if (str.equals("End"))
					break;

         修改服务端代码:

			String str = in.readLine();
			
			System.out.println();

                   为

			String str = in.readLine();
			
			System.out.println(str);

       可以正确显示。

       服务器端如果需要向客户端发送信息， 需要单独启动工作线程来实现，目前的模式， 服务器端的代码属于守护线程的工作。
  
====================================================