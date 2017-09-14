. Spring 官方网站

  参见:
  
      http://baike.baidu.com/subview/23023/11192342.htm?fr=aladdin

  www.springsource.org

  下载需要输入一些信息. 嫌麻烦可以去 http://sourceforge.net/projects/springframework/ 下载.

. Struts MVC 框架作前端

  Spring 作 中间件

  Hibernate 作后端

. CSS 内边距属性属性	描述
padding	简写属性。作用是在一个声明中设置元素的所内边距属性。
padding-bottom	设置元素的下内边距。
padding-left	设置元素的左内边距。
padding-right	设置元素的右内边距。
padding-top	设置元素的上内边距。

. Spring 是一个开源框架, 是为了解决企业 应用程序开发复杂性, 由 Rod Johnson 创建的.  框架的主要优势之一就是其分层架构, 分层架构允许使用者选择使用哪一个组件, 同时为J2EE 应用程序开发提供集成的框架. Spring 使用基本的JavaBean 来完成以前只可能由EJB 完成的事情. 然而, Spring 的用途不仅限于服务器端的开发. 从简单性、可测试性和松耦合的角度而言, 任何Java 应用都可以从Spring 中受益.

. 简介

      Spring 是一个开源框架, 是2003年兴起的一个轻量级的Java 开发框架, 由 Rod Johnson 在其著作 Expert One-On-One J2EE Development and Design 中阐述的部分理念和原型衍生而来. 

  简单的说, Spring是一个轻量级的控制反转(IoC) 和面向切面(AOP )的容器框架.

  轻量:

       从大小与开销两方面而言Spring 都是轻量的. 完整的Spring 框架可以在一个大小只有1MB 多的JAR 文件里发布. 并且 Spring 所需的处理开销也是微不足道的. 此外, Spring 是非侵入式的: 典型的, Spring 应用中的对象不依赖与SPring 的特定类. 

  控制反转

      Spring 通过一种称作控制反转(IoC)的技术促进了松耦合. 当应用了IoC, 一个对象以来的其他对象会通过被动的方式传递进来, 而不是这个对象自己创建或者查找依赖对象。 你可以认为IoC与 JNDI 相反 --- 不是对象从容器中查找依赖, 而是容器在对象初始化时不等对象请求就主动将依赖传递给它.

  面向切面

      Spring 提供了面向切面编程的丰富支持, 允许通过分离应用的业务逻辑与系统级服务(例如: 审计(auditing) 和事物(transation)管理) 进行内聚性的开发. 应用对象只实现它们应该做的----完成业务逻辑 ---- 仅此而已.  它们并不负责(甚至是意识) 其它的系统级关注点,例如 日志或事务支持.

  容器

      Spring 包含并管理应用对象的配置和生命周期, 在这个意义上它是一种容器, 你可以配置你的每个bean 如何被创建 ---- 基于一个可配置原型(prototype)， 你的bean可以创建一个单独的实例或者每次需要时都生成一个新的实例----以及他们是如何相互关联的. 然而, Spring 不应该被混同于传统的重量级的EJB容器, 他们经常是庞大与笨重的, 难以使用.

  框架

      Spring 可以将简单的组件配置、组合成为复杂的应用. 在Spring中, 应用对象被声明式的组合, 典型的是在一个XML文件中. Spring 也提供了很多基础功能(事物管理、持久化框架集成等等)， 将应用及逻辑的开发留给了你。

  MVC

      Spring 的作用是整合, 但不仅仅是整合, Spring框架可以被看作是一个企业解决方案级别的框架. 客户端发送请求, 服务端控制器(由 DispatcherServlet实现的)完成请求的转发, 控制器调用一个用于映射的类 HandlerMapping, 该类用于将请求映射到对应的处理器来处理请求.  HandlerMapping 将请求映射到对应的处理器Controller(相当于Action)在Spring 当中如果写一些处理器组件, 一般实现Controller接口, 在Controller 中就可以调用一些Service 或DAO来进行数据操作 ModelAndView 用于存放从DAO 中取出的数据, 还可以粗放响应试图的一些数据. 如果想将处理结果返回给用户, 那么在Spring 框架中还提供一个试图组件ViewResovler, 该组件根据Controller返回的标识, 找到对应的试图, 将相应response 返回给用户.

  所有Spring 的这些特征使你能够编写更干净、更可管理、并且更易于测试的代码. 他们也为Spring 中的各种模块提供了基础支持.

. 起源

  Spring 是独特的, 因为若干个原因:

  1. 它定位的领域是许多其他流行的framework 没有的. Spring 致力于提供一种方法管理你的业务对象.

  2. Spring是全面的和模块化的. Spring 有分层的体系结构, 这意味着你能选择使用它孤立的任何部分, 他的架构仍然是内在稳定的. 因此从你的学习中, 你可得到最大的价值. 例如， 你可能选择仅仅使用Spring 来简化JDBC的使用, 或用来管理所有的业务对象.

  3. 它的设计从底部帮助你编写易于测试的代码. Spring 是用于测试驱动工程的理想的framework。

  Spring 对你的工程来说, 它不需要一个以上的framework。 Spring 是潜在的一站式解决方案, 它定位于典型应用相关的大部分基础结构。 它也涉及到其他framework 没有考虑到的内容.   

.特性

     强大的基于 JavaBeans 的采用控制反转(Inversion of Control, IoC)原则的配置管理, 使得应用程序的组件更加快捷简易.

     一个可用于从applet 到 Java EE 等不同运行环境的核心Bean 工厂.

     数据库事务的一般化抽象层, 允许宣告式(Declarative)事物管理器, 简化事物的划分使之与底层无关.

     内建的针对JTA 和单个JDBC数据源的一般化策略, 使Spring 的事务支持不要求Java EE环境, 这与一般的JTA 或者 EJB CMT相反.

     JDBC 抽象层提供了有针对性的异常等级(不再从SQL 异常中提取原始代码), 简化了错误处理, 大大减少了程序员的编码量. 再次利用JDBC 时, 无需在写出另一个终止(finaly) 模块。 并且面向JDBC的一场与SPring 通用数据访问对象(Data Access Object) 异常等级一致.

     以资源容器, DAO 实现和事物策略等形式与Hiberate, JDO 和 iBATIS SQL Maps 集成. 利用众多的反转控制方便特性来全面支持, 解决了许多典型的Hiberate 集成问题. 所有这些全部遵从从SPring 通用事务处理和通用数据访问独享异常等级规范. 

     灵活的基于核心Spring 功能MVC 网页应用程序框架. 开发这通过策略接口将拥有该框架的高度控制, 因而该框架将适应于多种呈现(View)技术, 例如 JSP, FreeMarker， Velocity， Tiles, iText 以及 POI.  值得注意的是, Spring 中间层可以轻易的结合与任何基于MVC 框架的网页层, 例如 Struts, WebWork， 或 Tapestry.

     提供诸如事务管理等服务的面向对象编程(AOP)框架。

. 特点:

  1. 方便解耦，简化开发

         通过Spring 提供的IoC容器, 可以将对象之间的依赖关系交由Spring 进行控制, 避免硬编码所造成的过度程序耦合. 有了Spring， 用户不必再为单实例模式类、属性文件解析等这些很底层的需求编写代码, 可以更专注于上层的应用.

  2. AOP 编程的支持

         通过Spring 提供的AOP 功能, 方便进行面向切面的编程, 许多不容易用传统的OOP 实现的功能可以通过AOP 轻松应付.

  3. 声明式事务的支持

         在Spring 中, 可以从单调烦闷的事务管理代码中解脱出来, 通过声明式方式灵活的进行事务的管理, 提高开发效率和质量.

  4. 方便程序的测试

         可以用非容器依赖的编程方式ijinxing几乎所有的测试工作, 在Spring 里, 测试不再是昂贵的操作, 而是随手可做的事情.

  5. 方便集成各种优秀框架

         Spring 不排斥各种优秀的开源框架, 相反, Spring 可以降低各种框架的使用难度，Spring 提供了对各种优秀框架(如Struts, Hibernate, Hessian, Quartz) 等的直接支持.

  6. 降低Java EE API 的使用难度

         Spring 对很多难用的Java EE API (如 JDBC, Javamail, 远程调用等) 提供了一个薄薄的封装层, 通过Spring 的简易封装, 这些Java EE API 的使用难度大为降低.

  7. Java 源码是经典学习范例

         Spring 的源码设计精妙、结构清晰、匠心独用, 处处体现着大师对Java 设计模式灵活应用以及对Java 技术的高深造诣. Spring 框架源码无疑是Java 技术的最佳实践范例. 如果想在短时间内迅速提高自己的Java 技术水平和应用开发水平, 学习和研究Spring 源码将会使你收到意想不到的效果.

. 好处

  1. Spring 能有效的组织你的中间层对象, 无论你是否选择使用了EJB。 如果仅仅使用了Struts 或其他的包含了J2EE特有APIs 的framework， 你会发现Spring 关注了遗留下的问题.

  2. Spring 能消除许多工程上对Singleton 的过度使用. 根据经验,这是一个主要的问题, 可以减少系统的可测试性和面向对象特性.

  3. Spring 能消除使用各种各样格式的属性定制文件的需要, 在整个应用和工程中, 可通过一种一致的方法来进行配置. 曾经感到迷惑, 一个特定类药查找迷幻般的属性关键字或系统属性, 为此不得不读Javadoc乃至元编码吗? 有了 Spring ， 可以很简单的看到类的JavaBean 属性. 倒置控制的使用 帮助完成这种简化。

  4. Spring 能通过接口而不是类促进好的编程习惯, 减少编程代价到几乎为零.

  5. Spring 被设计为让使用它创建的应用尽可能少的依赖于他的APIs. 在Spring 应用中的大多数业务对象没有依赖于Spring。

  6. 使用Spring 构建的应用程序易于单元测试.

  7. Spring能使EJB 的使用 成为一个实现选择, 而不是应用架构的必然选择. 你能选择用POJOs 或 local EJBs 来实现业务接口, 却不会影响调用代码.

  8. Spring 帮助你解决许多问题而无需使用EJB. Spring 能提供一种EJB 的替换物, 他们使用于许多web应用. 例如, Spring 能使用AOP 提供声明性事务而不通过使用EJB容器, 如果你仅仅需要与单个的数据库打交道, 甚至不需要JTA 实现.

  9. Spring 为数据库存取提供了一致的框架. 不论是使用JDBC或 O/R mapping 产品(如 Hibernate)

  总结起来, Spring 有日下优点:

  1. 低侵入式设计, 代码污染极低;

  2. 独立于各种应用服务器, 基于Spring 框架的应用, 可以真正实现write once, Run anywhere 的承诺;

  3. Spring 的DI机制降低了业务对象替换的复杂性, 提高了组件之间的解耦;

  4. Spring 的AOP 支持允许将一些通用任务如 安全、事务、日志等进行集中式管理, 从而提供了更好的复用

  5. Spring 的ORM 和 DAO 提供了与第三方持久层框架的良好整合, 并简化了底层的数据库访问;

  6. Spring 并不强制应用完全依赖于Spring ， 开发者可自由选用Spring 框架的部分或全部.

. 基本框架

  Spring 框架是一个分层架构, 由7个定义良好的模块组成. Spring 模块构建在核心容器之上, 核心容器定义了创建、配置和管理bean 的方式, 如图所示:

  +----------+  +---------------+  +--------------+  +--------------+
  | AOP      |  |    ORM        |  | Web          |  |  MVC         |
  |          |  +---------------+  +--------------+  |              |
  |          |                                       |              |
  |          |  +---------------+  +--------------+  |              |
  |          |  |  DAO          |  |  Context     |  |              |
  +----------+  +---------------+  +--------------+  +--------------+

  +-----------------------------------------------------------------+
  |                           Core                                  |
  +-----------------------------------------------------------------+
        
  组成 Spring 框架的每个模块(或组件) 都可以单独存在, 或者与其他一个或多个模块联合实现. 每个模块的功能如下: 

  1. 核心容器: 核心容器提供Spring 框架的基本功能(Spring core)。  核心容器的主要组件是 BeanFactory, 它是工厂模式的实现.  BeanFactory 使用控制反转(IOC) 模式将应用程序的配置和依赖性规范与实际的应用程序代码分开.

  2. Spring 上下文 : Spring 上下文是一个配置文件, 向Spring 框架提供上下文信息. Spring 上下文包括企业服务, 例如 JNDI、EJB、电子邮件、国际化、校验和调度功能

  3. Spring AOP: 通过配置管理特性, Spring AOP 模块直接将面向切面的编程功能集成到了 Spring 框架中. 所以, 可以很容易的使用Spring 框架管理的任何对象支持AOP. Spring AOP 模块为基于Spring 的应用程序中的对象提供了事务管理服务. 通过使用了Spring AOP, 不用依赖EJB 组件, 就可以将声明性事务管理集成到应用程序中.

  4. Spring DAO:  JDBC DAO 抽象层提供了有意义的异常层次结构, 可以用该结构 来管理 异常处理和不同数据库供应商抛出的错误消息. 异常层次结构简化了错误处理, 并且极大的降低了需要编写的异常代码数量(例如 打开和关闭连接). Spring DAO 的面向JDBC 的异常遵从通用的DAO 异常层次结构.

  5. Spring ORM : Spring 框架插入了若干个ORM 框架, 从而提供了ORM 的对象关系工具, 其中包括JDO、Hibernate 和iBatisSQL Map。 所有这些都遵从 Spring 的通用事务和 DAO 异常层次结构.

  6. Spring Web 模块: Web 上下文模块建立在应用程序上下文模块之上, 为基于Web 的应用程序提供了上下文. 所以, Spring 框架支持与Jakarta struts 的集成. Web 模块还简化了处理多部分请求以及将请求参数绑定到域对象的工作.

  7. Spring MVC框架: MVC 框架 是一个全功能的构建 Web 应用程序的MVC实现. 通过策略接口, MVC 框架变成为高度可配置的, MVC 容纳了大量视图技术, 其中包括JSP、Velocity、Tiles、iText 和 POI.  模型由 javabean 构成, 存放于 Map; 视图是一个接口, 负责显示模型; 控制器表示逻辑代码, 是Controller 的实现.  Spring 框架的功能可以用在任何J2EE 服务器中, 大多数功能也适用于不受管理的环境. Spring 的核心要点是: 支持不绑定到特定J2EE 服务的可重用业务和数据访问对象. 毫无疑问, 这样的对象可以在不同的J2EE环境(Web 或 EJB) 、独立应用程序、测试环境之间重用.

. 下载安装

  下载和安装Spring请按如下步骤进行。
   （1）登录站点，下载Spring的最新稳定版本。最新版本为spring-framework-4.0.建议下载            spring-framework-spring-framework-4.0.0.M2-dist

        这个压缩包不仅包含Spring的开发包，而且包含Spring编译和运行所依赖的第三方类库。

        解压缩下载到的压缩包，解压缩后的文件夹应用如下几个文件夹。

       ◆dist：该文件夹下放Spring的jar包，通常只需要Spring.jar文件即可。该文件夹下还有一些类似spring－Xxx.jar的压缩包， 这些压缩包是spring.jar压缩包的子模块压缩包。除非确定整个J2EE应用只需要使用Spring的某一方面时，才考虑使用这种分模块压缩包。通常建议使用Spring.jar

       ◆docs：该文件夹下包含spring的相关文档、开发指南及API参考文档。

       ◆lib：该文件夹下包含spring编译和运行所依赖的第三方类库，该路径下的类库并不是spring必需的，但如果需要使用第三方类库的支持，这里的类库就是必需要的。

       ◆samples：该文件夹下包含Spring的几个简单例子，可作为Spring入门学习的案例。

       ◆src：该文件夹下包含Spring的全部源文件，如果开发过程中有地方无法把握，可以参考该源文件，了解底层实现。

       ◆test：该文件夹下包含Spring的测试示例。

       ◆tiger：该路径下存放关于JDK的相关内容

       ◆解压缩后的文件夹下，还包含一些关于Spring的License和项目相关文件

  （2）将spring.jar复制到项目的CLASSPATH路径下，对于Web应用，将spring.jar文件复制到WEB-INF/lib路径下，该应用即可以利用Spring框架了。

  （3）通常Spring的框架还依赖于其他一些jar文件，因此还须将lib下对应的包复制到WEB-INF/lib路径下，具体要复制哪些jar文件，取决于应用所需要使用的项目。通常需要复制cglib，dom4j，jakarta-commons，log4j等文件夹下的jar文件。

  （4）为了编译java文件，可以找到Spring的基础类，将Spring.jar文件的路径添加到环境变量CLASSPATH中。当然，也可以使用ANT工具，但无须添加环境变量。如果使用Eclipse或者NetBeans等IDE时，也不需要设置环境变量。

    Spring MVC
        传统的web架构的view 表现层使用struts作为表现层。但是如果试用下spring自带的MVC，会发现spring 在一般场合完全可以取代struts。从某些角度来说，spring的mvc设计的更加合理，有兴趣的话不妨尝试下单个的spring的MVC。

. 应用实例

  1. 新建一个登录页面: loginActionSupport.jsp    代码如下:

     <%@page contentType="text/html;charset=GBK" isELIgnored="false"%>
     <html>
     <head><title>;实现用户登录实例, struts 和 Spring整合</title></head>
     <body><font size='22'>$<br></font>
     <form name="form1" action="/myLogin/loginActionSupportdo" method="post">
          用户名:<input type="text" name="username" value="${user.username}"/><br>
          密码:<input type="password" name="password" value="${user.password}"/><br>
     </form>
     </body>
     </html>

  2.创建一个存储登录用户信息的类: User.java ， 该类继承于 ActionForm, 代码如下:

    package com.zhaosoft.bean;
    import org.apache.struts.action.ActionForm;
    public class User extends ActionForm {

	private String username = null;
	private String password = null;
	
	public String getUsername() {
		return uername;
	}

	public void setUsername( String username ) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword( String password ) {
		this.password = password;
	}
    }

  3. com.zhaosoft.action 中新建一个LoginActionSupport.java。  该类不集成于struts 的Action, 而是继承于 Spring 的ActionSupport， 代码示例如下:

    package com.zhaosoft.action;
    import javax.servlet.http.HttpServletRequest;
    import javax.servlet.http.HttpServletResponse;
    import org.apache.struts.action.ActionForm;
    import org.apache.struts.action.ActionForward;
    import org.apache.sruts.action.ActionMapping;
    import org.springframework.context.ApplicationContext;
    import org.springframework.web.struts.ActionSupport;
    import com.zhaosoft.bean.Usr;
    import com.zhaosoft.domain.Login;

    public class LoginActionSupport extends ActionSupport {

	public ActionForward execute( ActionMapping mapping, ActionForm form, HttpServletRequest request,
					HttpServletResponse response ) throws Exception {

		// 通过ApplicationContext 获取 配置文件
		ApplicationContext ctx = getWebApplicationContext();

		Login login = (login) ctx.getBean("login");
		login.login( ( User ) form );

		request.setAttribute( "msg", login.getMsg() );
		request.setAttribute( "user", (user)form );

		return mapping.findForward("login");
	}
    }

. 主要产品

  1. Spring Framework

  2. Spring Web Flow

  3. Spring Web Flow 

  4. Spring Security (Acegi Security );

  5. Spring Dynamic Modules For OSGi(tm) Service Platforms

  6. Spring Batch

  7. Spring Integration

  8. Spring LDAP 

  9. Spring IDE

  10. Spring Modules

  11. Spring JavaConfig

  12. Spring Rich Client

  13. Spring .NET

  14. Spring BeanDoc



. 步骤

  解析Spring 的步骤

  1. Spring 中的事务处理

  2. IoC 容器在Web 容器中的启动

  3. Spring JDBC

  4. Spring MVC

  5. Spring AOP 获取 Proxy

  6. Spring 声明式事务处理

  7. Spring AOP 中对拦截器调用的实现

  8. Spring 驱动Hibernate 的实现

  9. Spring Acegi 框架鉴权的实现

  IoC 和 AOP

      控制反转模式(也称作 依赖性注入) 的基本概念是: 不创建对象, 但是描述创建他们的方式.  在代码中不直接与对象和服务连接, 但在配置文件中描述哪一个组件需要哪一项服务.   容器( 在 Spring 框架中是IoC容器) 负责将这些联系在一起. 在典型的IoC 场景中, 容器创建了所有对象, 并设置必要的属性将他们连接在一起, 决定什么时间调用方法. 下表列出了IoC的一个实现模式.


  类型1   服务需要实现专门的接口, 通过接口, 由对象提供这些服务, 可以从对象属性查询依赖性(例如, 需要的附加服务)(接口注入)

  类型2   通过JavaBean 的属性(例如 setter 方法) 分配依赖性(setter 方法注入)

  类型3   依赖性以构造函数的形式提供, 不以 JavaBean 属性的形式公开(构造器注入)

  Spring 框架的 IOC 容器采用类型2 和类型3 实现.

  面向方面的编程, 即AOP, 是一种编程技术, 它允许程序员将横切关注点或 横切典型的职责分界线的行为(例如 日志和事务管理) 进行模块化. AOP 的核心构造是方面, 它将那些影响多个类的行为封装到可重用的模块中.

  AOP 和 IOC 是补充性的技术, 它们都运用模块化方式 解决企业 应用程序开发中的复杂问题. 在典型的面向对象开发方式中, 可能要将日志记录语句放在所有方法和 Java 类中才能实现日志功能. 在AOP 方式中, 可以反过来讲日志服务模块化, 并以声明的方式将他们应用到需要日志的组件上. 当然, 优势就是Java 类不需要知道日志服务的存在, 也不需要考虑相关的代码. 所以, 用Spring AOP 编写的应用程序代码是松散耦合的.

  AOP 的功能完全集成到了Spring 事务管理、日志和其他各种特性的上下文中.

  AOP 编程方面, Spring 提供了很多特性, 例如 PointCut， Advice, Advisor, 粗略来说就是事务管理、日志和其他各种特性的切入地点.


. 容器

  Spring 设计的核心是 org.springframework.beans 包, 它的设计目标是 与JavaBean 组件一起使用. 这个包通常不是由用户直接使用, 而是由服务器将其用作 其他多数功能的底层中介. 下一个最高级抽象是BeanFactory 接口, 它是工厂设计模式的实现, 允许通过名称创建和检索对象. BeanFactory 也可以管理对象之间的关系.

  BeanFactory 支持两个对象模型.

  1. 单态模型提供了具有特定名称的对象的共享实例, 可以在查询时对其进行检索. Singleton 是默认的也是最常用的对象模型. 对于无状态服务对象很理想.

  2. 原型模型确保每次检索都会创建单独的对象. 在每个用户都需要自己的对象时, 原型模型最适合.

  bean 工厂的概念是Spring 作为IOC 容器的基础. IOC 将处理事情的责任从应用程序代码转移到框架.
      
. 《轻量级Web应用开发》 陈天河  ZWTS\2011\TP312JA\cth

  P464

  使用静态工程方法创建Bean 的实例

  <bean id = "staticFactoryBean"
	class = "cn.hxex.springcore.construct.StaticFactory"
	factory-method="getStaticFactoryBeanInstance"/>
  
     ## 这个配置就等同于 调用Java代码 StaticFactory.getStaticFactoryBeanInstance() 方法  来得到Java 对象的实例。

     采用静态工程方法创建Bean 的实例 要求所使用的方法(例如 getStaticFactoryBeanInstance() ) 必须是静态的。

  使用实例化的工厂方法创建Bean 的实例

     这种方法与使用静态工厂方式的最大区别是, 用于创建Bean 实例的Java 对象是实例化的, 所以这里所使用的方法也不要求是静态的。

     使用实例化工厂方法创建Bean 的实例时, <bean>元素中的class 属性是空的, 需要将factory-bean属性指定为创建Bean 实例的Bean 工厂的名称, 此 Bean 工厂包含着创建Bean 实例的工厂方法。 工厂方法仍通过 factory-method 属性来进行设定. 下面是个例子:

  <bean id = "dynamicFactory"
	class = "cn.hxex.springcore.construct.DynamicFactory" />

  <bean id = "dynamicFactoryBean"
	factory-bean="dynamicFactory"
	factory-method="getDynamicFactoryBeanInstance"/>

  上面的配置， 相当于执行了以下Java 代码:

  DynamicFactory dynamicFactory = new DynamicFactory();

  DynamicFactoryBean dynamicFactoryBean = dynamicFactory.getDynamicFactoryBeanInstance();

. P466 

  使用 构造函数 依赖注入  , 实际上就是在Bean 配置中 添加构造函数 参数的配置, 如下:

  <bean id="exampleBean" class="cn.hxex.springcore.ExampleBean">
      <constructor-arg type="int"><value>7500000</value></constructor-arg>
      <constructor-arg type="java.lang.String"><value>42</value></constructor-arg>
  </bean>

  引用其他的bean

  <ref bean="someBean"/>    同一容器或父容器内的任何bean

  <ref local="someBean"/>   同一文件中的bean. local 必须是bean 的id 属性值

  <ref parent = "someBean"/> 引用父容器 中的bean， 即可以是父容器中bean 的id 值, 也可以是name 属性值.

 内部bean， 只能被本 Bean 使用, 不能被任何外部bean 使用

  <bean id = "outer" class="...">
	<property name="target">
		<bean class="com.mycompany.Person"> <!--  这是一个内部bean -->
			<property name="name" value="Fiona Apple"/>
			<property name="age" value ="25"/>
		</bean>
	</property>
  </bean>

 为集合类属性赋值  P467

 Spring 的IoC 容器 为 Bean 的集合类属性单独定义了赋值的元素. 开发人员可以通过<list>, <set>, <map>及<props> 元素定义与设置与Java Collection 类型对应 List, Set, Map及 Properties。

  例如:

  ==== java.util.List ===

  <property name="someList">
	<list>
		<value>a list element followed by a refernce</value>
		<ref bean="myDataSource"/>
	</list>
  </property>

  在<list> 元素内部可以使用前面所介绍的任意方法 来 并列 指定 List 所包含的对象. 在进行 Bean 的初始化时, 会调用该Bean 的setSomeList(List list) 方法来进行以来对象的注入操作.

  == Set == 的配置方法与此类似, 区别就是需要使用<set>元素来进行定义

  =========== java.util.Properties ====

  Properties 类型的Bean 属性是通过<props> 元素来进行初始化的, 而其内部的每一个"键-值" 对的定义则是通过<prop>元素来进行配置的. 配置的示例如下所示:

  <property name="adminEmails">
	<props>
		<prop key="administrator">administrator@somecompany.org</prop>
		<prop key="support">support@somecompany.org</prop>
		<prop key="development">development@somecompany.org</prop>
	</props>
  </property>
  

  ========== java.util.Map ====

  Map 类型的属性的初始化是通过<map> 元素来进行定义的. 与 Properties 配置不同的是, 每一个"键-值"对 都需要放置在一个<entry> 元素中, 而且Map 的键 是通过<key>来进行定义的, 值则可以使用前面所地定义的任意方法来初始化。

  <property name="someMap">
	<map>
		<entry>
			<key><value>yup an entry</value></key>
			<value>just some string</value>
		</entry>
		<entry>
			<key><value>yup a ref</value></key>
			<ref bean="myDataSource"/>
		</entry>
	</map>
  </property>

  ==== 空值的处理 ===

  Spring 的IoC 容器定义了<null>元素来处理空值, Spring 会把属性的空参数当作空字符串来处理. 以下的xml 片段将email 属性设为了空字符串.

  <bean class="Examplebean">
	<property name="email"><value></value></property>
  </bean>

  这等同于java 代码: exampleBean.setEmail(""). 而 null 值则可以使用<null> 元素来表示

  <bean class="ExampleBean">
	<property name="email"><null/></property>
  </bean>

  上述的配置等同于Java代码 : exampleBean.setEmail(null).

  ========P470  基于 seter 方法的依赖注入 ===================

  <!-- 基于 Setter 的依赖注入 -->
  <bean id="setterInjectionBean"
	class="cn.hxex.springcore.injection.SetterInjectionBean">

	<!-- 通过<ref>元素实现setter 方式的依赖注入的配置-->
	<property name="anotherBean"><ref bean="anotherBean"/></property>

	<!-- 通过 ref 属性来实现 setter 方式的依赖注入的配置 -->
	<property name="yetAnotherBean" ref="yetAnotherBean"/>

	<!-- 通过 value 属性类直接定义注入的值-->
	<property name="i" value="1"/>
  </bean>

  === 使用构造函数方法注入 和使用 setter 方式注入  的区别 ====

  使用构造方法 实现依赖注入时 可以一次性完成对象的创建和依赖关系的设置, 保证实在完全初始化 的基础上将对象的实例返回给客户的. 更重要的是, 采用构造方法实现的依赖注入 不能 在进行重新注入。  而使用 setter 方法实现的依赖注入 在需要的时候还可以进行重新注入。

. P474 初始化Web 配置

  在web.xml 增加ContextListener:

  === Servlet 2.4 及以上的 web 容器 ====
  <listener>
	<listener-class>org.springframework.web.conext.scope.RequestContextListener</listener-class>
  </listener>

  ==== Servlet 2.4 以前的容器, 要使用一个javax.servlet.Filter 的实现, 如下:

  <filter>
	<filter-name>requestContextFilter</filter-name>
	<filter-class>org.springframework.web.filter.RequestContextFilter</filter-class>
  </filter>

  <filter-mapping>
	<filter-name>requestContextFilter</filter-name>
	<url-pattern>/*</url-pattern>
  </filter-mapping>

  RequestContextListener 和 RequestContextListener 两个类 做的都是同样的工作: 将 HTTP request 对象绑定到为该请求提供服务的线程. 这使得 具有 request 和session 作用域 的Bean 能够在后面的调用链 中被访问到.

. P481  Lookup 方法注入

  在使用Lookup 方法注入的时候, 需要在引用的Bean 中 定义一个抽象的返回被引用对象的方法. 定义的方法如下所示:

  public abstract CurrentTime createCurrentTime();

  # 如果所定义的方法不是抽象的, Spring hui进行覆盖处理.

  在 进行XML 配置的时候, 需要使用<lookup-method> 来指定所要覆盖的方法和返回的Bean， 具体配置方法如下所示:

  <lookup-method name="createCurrentTime" bean="currentTime"/>