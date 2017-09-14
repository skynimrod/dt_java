. 参见:

      http://baike.baidu.com/view/66926.htm?fr=aladdin

      http://junit.org/      官网

. JUnit 是由 Erich Gamma 和 Kent Beck 编写的一个回归测试框架( regression testing framework). JUnit 测试是程序员测试, 即所谓白盒测试, 因为程序员知道被测试的软件如何(how) 完成功能和完成什么样(what)的功能. JUnit 是一套框架, 继承 TestCase类, 就可以用 JUnit 进行自动测试了.


. 关于断言 

  参见:

      http://blog.sina.com.cn/s/blog_438ad45b010104g4.html

. 关于setUp与 tearDown

  参见:

      http://blog.csdn.net/kevinwu629/article/details/6275799

  这两个函数是junit.framework 中提供的初始化和反初始化 每个测试方法的.  setUp 在每个测试方法调用前被调用, 负责初始化测试方法所需要的测试环境; tearDown 在每个测试方法被调用之后被调用, 负责撤销测试环境. 他们与测试方法的关系可以描述如下:

  测试开始 -> setUp ->testXXXX -> tearDown -> 测试结束

  

     