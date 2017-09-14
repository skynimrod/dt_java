参见:

   http://gceclub.sun.com.cn/Java_Docs/html/zh_CN/api/java/lang/Process.html

. 类 Process

  java.lang.Object -> java.lang.Process

  public abstract class Process extends Object

  ----------------------------------------------------

  ProcessBuilder.start()  和 Runtime.exec  方法创建一个本机进程， 并返回Process  子类的一个实例, 该实例可用来控制进程并获取相关信息. Process 类提供了执行从进程输入、执行输出到 进程、等待进程完成、监察进程的推出状态以及销毁(杀掉) 进程的方法.

  创建进程的方法可能无法针对某些本机平台上的特定进程很好的工作， 比如， 本机窗口进程， 守护进程, Microsoft Windows 上的Win16/DOS进程， 或者Shell 脚本. 创建的子进程没有自己的终端或者控制台. 它的所有标准io (即 stdin, stdout, stderr) 操作都将通过三个流( getOutputStream(), getInputStream(), getErrorStream() ) 重定向到父进程。 父进程使用这些流来提供到子进程的输入和获得子进程的输出.  因为有些本机平台仅针对标准输入和输出流提供有限的缓冲区大小， 如果读写子进程的输出流或输入流迅速出现失败， 则可能导致子进程阻塞， 甚至产生死锁。

  当没有 Process 对象的更多饮用时， 不是删掉子进程， 而是继续异步执行子进程.

  对于带有 Process对象的Java 进程, 没有必要异步或并发执行由 Process 对象表示的进程. 

. 参见:

   http://www.pconline.com.cn/pcjob/process/sun/article/0411/498310.html

. PingIP.jsp

  在Jsp页面中调用Ping命令

. 
  

-----------------------------

. 关于java的Process执行出现的block问题

使用java.lang.Process处理命令行执行的问题的时候，总是出现死锁问题，问题代码如下：

Process proc = Runtime.getRuntime().exec(commands);

int result = process.waitFor();

后来查看了一下资料，以及在网上搜索。以下是jdk文档：

创建进程的方法可能无法针对某些本机平台上的特定进程很好地工作，比如，本机窗口进程，守护进程，Microsoft Windows 上的 Win16/DOS 进程，或者 shell 脚本。创建的子进程没有自己的终端或控制台。它的所有标准 io（即 stdin、stdout 和 stderr）操作都将通过三个流 () 重定向到父进程。父进程使用这些流来提供到子进程的输入和获得从子进程的输出。因为有些本机平台仅针对标准输入和输出流提供有限的缓冲区大小，如果读写子进程的输出流或输入流迅速出现失败，则可能导致子进程阻塞，甚至产生死锁。

所以需要清空缓冲区。具体的做法如下：

final Process proc = Runtime.getRuntime().exec(commands);

new Thread(){

    public void run(){

    InputStream isError = proc.getErrorStream();

    InputStream isStdout  = proc.getInputStream();

   BufferedReader reader = new BufferedReader(new InputStreamReader(isStdout));

 while (reader.readLine()!=null) {

 ....

}

}

}.start();

