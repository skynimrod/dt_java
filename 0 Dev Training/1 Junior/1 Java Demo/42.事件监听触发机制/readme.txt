. 参见:

      http://blog.csdn.net/lihai211/article/details/6273189

      http://blog.csdn.net/shangzhiliang_2008/article/details/5192345

. 在Java 的swing 编程中， Java 中的时间机制非常 常用
 
  事件监听器的参与者:

  1. 事件对象

     一般继承自 java.util.EventObject 对象, 有开发者自行定义

  2. 事件源

     触发事件的源头, 不同的事件源 会触发 不同的事件类型

  3. 事件监听器

     事件监听器负责监听事件源 发出的事件, 一个事件监听器 常 通过java.util.EventListener 这个 标识 接口

  整个处理过程是这样的, 事件源  可以注册事件监听器 对象, 并可以向 事件监听器 对象发送事件对象。 事件发生后, 事件源 将事件对象发送给已经注册的所有事件监听器.

  事件监听器 对象 随后 会根据事件对象内 的相应方法响应这个时间.

  