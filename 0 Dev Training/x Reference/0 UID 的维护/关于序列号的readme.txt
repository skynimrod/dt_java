. 关于Java 的序列化

  参见:

      http://blog.csdn.net/yakihappy/article/details/3979373

  Java 串行化技术可以使你将一个对象的状态写入一个Byte 流里, 并且可以从其他地方把该Byte 流里的数据读出来, 重新构造一个相同的对象. 这种机制允许你将对象通过网络进行传播, 并可以 随时 把对象持久化到数据库、文件等系统里.  

  Java 的串行化机制是  RMI、EJB 等技术的 技术基础.  

  用途： 利用对象的串行化  实现 保存应用程序的当前工作状态, 下次再启动的时候将自动的回复到上次执行的状态.

  
. 如果你implements 了 Serializable接口 但是没写 UID,eclipse会在你的类名边上有一个警告,你点击一下,有一个选项自动生成 UID,所以请用eclipse写java代码

  右键点击类名左面的小灯泡->Quick Fix (Ctrl + 1)，  会跳出一个菜单: 

     Add default serial version ID                     这个 就是指产生 1L， 即相应的代码
 
     Add generated serial version ID                   这个会根据这个类产生一个64位的UID

. 在JDK中，可以利用JDK的bin目录下的serialver.exe工具产生这个serialVersionUID 的值，对于Test.class，执行命令： 
serialver Test   这时JVM（java虚拟机）会生成一个哈希字段。 