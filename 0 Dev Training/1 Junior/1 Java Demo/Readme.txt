. ��������

  ʵ��Eclipse 5.0 + JRE 1.5.0

  ��װ��ɺ� ��Ҫ ���û����������Ӷ� Javac Ŀ¼�����á� Javac һ����JDK��bin Ŀ¼��

. 1. ��һ��Java ����

     import java.io.Serializable;
import java.util.ArrayList;

public class HelloWorldApp{//an application

public static void main(Stringargs[]){

System.out.println("HelloWorld!");

}

}


  2. Javac ���������������

   D:\JavaWorkSpace\Just a Test\HelloWorldApp.java:6: ��Ҫ <��ʶ��>
public static void main(Stringargs[]){
                                    ^
D:\JavaWorkSpace\Just a Test\HelloWorldApp.java:11: ��Ҫ ')'
^
2 ����

  3. ԭ��

    public static void main(Stringargs[]) �У� main() �Ĳ��� Ӧ���� String args[].

    �����󣬱���ɹ������� HelloWorldApp.class. (��Դ�ļ�ͬһĿ¼)

  4. ����

    c:\> java HelloWorldApp.class

    ���ִ���

    "I:\Documents and Settings\Administrator>java "D:\JavaWorkSpace\Just a Test\Hello
WorldApp.class"
Exception in thread "main" java.lang.NoClassDefFoundError: D:\JavaWorkSpace\Just
 a Test\HelloWorldApp/class"

    ����ʵ�����Ǹ��������⣬���classpath���ò��ԣ�������ô���ã���˵�˺ܶ���ˣ��������˼�ƪ���£��㿴���������ˣ����ְɡ�
  
    �μ�: http://www.yesky.com/SoftChannel/72348977504190464/20040706/1827869.shtml

	classpath��Ѱ��Java��·���ģ�������Java����(Java HelloWorldApp.class)ʱ�����߳����ںδ�Ѱ����ص��ࡣ�����м�ƪ���º�����Ľ�����classpath�����ְɡ�

    ������ ClassPath �����ú����к���Ȼ������������:

    Exception in thread "main" java.lang.NoClassDefFoundError: HelloWorldApp/java

  5. ���

    ԭ�������е�������������

    ��Ӧ�ô�.class ��׺. ����:  Java HelloWorldApp

. 2. ��ͼ�ν����Java ����

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
 

��ȷ��  

 
========================================================================

OK! ���ڵ���������� ��Eclipse ���ɿ��������� �������ϵĳ���.

====================================================================

��������:

1. ��Esclips (v3.2)

2. File -> New -> Project

   ���� New Project �ĶԻ��� �����κ�������Ķ�����"��һ��"(Next)��������һ������. ��"Project name" ����"Test" (���̵����֣� ����𣬲��ظ�����), Ȼ��"Finish".

3. ��ʱ�� IDE��������(Package )(Workspace) ����Test ���̵�����

4. �����ѡ�� �������� "Test"�� �һ������˵��� ѡ��"Import". 

   �������Treeview ���У� ѡ��"General"->"File System", �����������κ����룬 Ȼ�������"Next". ������һ������ѡ�� Ҫ�����Դ�����ļ���

   ʹ��"Browse" ѡ������ Դ�����ļ�.

5. ��ʱ�� ����"Test" �оͰ��� ��Ҫ���ԵĴ����ļ��� (default package).

6. ѡ����Ҫ���Ի����е�Դ���ļ�, ���� "HelloWorld.java", Ȼ�� ����һ������˵���ѡ��"Run As"->"Java Application" (���� Alt + Shift + x, J), ���м�����Ĵ����л�������н��.

���ˣ� ��򵥵�Eclips ���� Java �Ĺ��̽����� ���ɹ�.

===============================================================
����������΢���ӵļ���Ӧ��: Socket ͨѶ�� �ṩһ���������˳����һ���ͻ��˳��� ʵ�ֱ���(������)��ϢͨѶ��
=============================================================== 

1. ��������:

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

   ����ͨ����

   ����ʱ������������:

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

   ԭ���� ԭ���ĳ���ǰ����Package�Ķ��壬 ���ClassPath ���ֲ�һ�£� ɾ���� ���±������м��ɡ�
   

2. �ͻ���

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

�ܽ�:

      ͨѶ���������� ����ʱ�� �ͻ��˷�����Ϣ�����Դӷ���˷���"has receive...", ���Ƿ����û�� ��ʾ�ͻ��˷��͵���Ϣ
��

     ����ԭ��:
         �ͻ���û�������˷�����Ϣ�� --- �������ԭ�� ��Ϊ��������´��� �Ѿ�ִ�С�

                               if (str.equals("End"))
					break;

         �޸ķ���˴���:

			String str = in.readLine();
			
			System.out.println();

                   Ϊ

			String str = in.readLine();
			
			System.out.println(str);

       ������ȷ��ʾ��

       �������������Ҫ��ͻ��˷�����Ϣ�� ��Ҫ�������������߳���ʵ�֣�Ŀǰ��ģʽ�� �������˵Ĵ��������ػ��̵߳Ĺ�����
  
====================================================