参见:

     http://jakarta.apache.org/commons/digester

     http://commons.apache.org/proper/commons-digester/     官网 , 包括最新下载

     一般会需要 commons beanutils jar 包. 下载地址:

     http://commons.apache.org/proper/commons-beanutils/     commons-beanuitls 官网


. DAO 设计结构的时候, 为了使系统具有更好的灵活性, 将所有的DAO 都定义为接口, 然后再提供一种由Hibernate 来实现的DAO.  但是, 如何才能使系统可以自动使用不同的DAO 实现方法呢?

  在这里就需要使用到另一种设计模式, 工厂模式. 它可以依据配置文件或者其他途径得到这些DAO 对象的实例, 以便业务处理程序可以方便的调用DAO接口所定义的方法.

  通过修改DAO 工厂的代码, 或者修改DAO 工厂所使用的配置文件就可以产生DAO对象的不同实例, 这样就实现了具体DAO 实现方法的可配置性, 增加了系统的灵活性.

  为了方便的进行配置文件的读取, 在这里采用了Apache 软件基金组织的一个专门用于将XML 格式转换为Java 对象的公共组件 -- Commons Digester.

. Commons Digester 提供的是一个通用的由XML文件转换为Java 对象的解决方案, 并且可以很方便的部署在不同的软件项目中.

. Commons Digester 框架结构

  最早是Struts 项目的一个子项目, 用来处理Struts 的配置文件struts-config.xml， 后来由于看到了其广阔的使用空间, 将其从Struts 中独立出来, 形成了一个独立的组件.

  Commons Digester 的工作原理非常简单. 它首先让开发者定义一系列的处理规则(rule)， 这些规则主要描述的是XML 文件中的模式与所采取的行动之间的关系.

  可以这样简单的理解:  

      Commons Digester 在解析XML文件的过程中, 将解析得到的XML 模式与 所定义的模式相匹配, 如果匹配成功, 那么就执行与这个模式向对应的动作来构建Java 对象, 这样就实现了由XML文件向Java 对象的转换工作.

. 基本使用方法

  Commons Digester 的使用主要包括以下步骤:

  1. 创建Commons Digester 的实例

  2. 设置全局处理参数(也可以全部忽略, 使用默认值)

  3. 设置匹配模式及其对应的处理规则

  4. 得到配置文件的句柄

  5. 解析配置文件, 得到配置对象的实例.

. Commons Digester 的常用处理规则

  1. ObjectCreateRule

     当begin() 方法被调用时, 这个规则类实例化一个指定的Java 类, 并将其压入栈顶. 这个被实例化的类的名字, 默认是这个规则类构造函数得到的参数, 也可以通过制定正在处理的xml元素的属性来传递一个新的类的名字. 当end()方法被调用时, 栈顶的对象被弹出.

  2. SetPropertiesRule

     当begin() 方法被调用时, Commons Digester 使用标准的Java 反射API 来讲xml 元素的属性值赋予与其相匹配的Java Bean 属性. 虽然 在这里可以自定义匹配的规则, 但是建议使用默认的同名匹配的规则.

  3. SetNextRule

     当end() 方法被调用时, Commons Digester 分析第二栈顶元素, 寻找一个特定属性的设置方法, 并接着调用这个方法, 以栈顶的元素作为参数. 这个规则通常用来在两个对象间建立一对多的关系.

  # 在这里所设置的是父对象 对 子对象的引用.

  4. SetTopRule

     当end() 方法被调用时, Commons Digester 分析栈顶元素, 寻找一个特定属性的设置方法, 并接着调用这个方法, 以第二栈顶元素作为参数. 这个规则通常用来在两个对象之间建立 一对多 的关系.

   # 在这里所设置的是 子对象 对 父对象 的引用.

  5. CallMethodRule

     