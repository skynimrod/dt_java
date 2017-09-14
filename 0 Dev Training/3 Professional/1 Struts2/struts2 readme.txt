参见:

     http://baike.baidu.com/link?url=yR4pv79Xsl_inso4TYpsVIun-zAM0V9SfjMIEoAcHPsCo7B8pq8C3C-Sjt5YY09R2JTZZTFSx-IWmwshrWkiVK

. Struts 2 是 Struts 的下一代产品, 是在 struts 1 和WebWork 的技术基础上进行了合并的全新MVC框架.

. 概述. 

  Struts 2 的体系结构与 Struts1 的体系结构差别巨大.  Struts 2 以 WebWork 为核心, 采用拦截器的机制来处理用户的请求, 这样的设计也使得业务逻辑控制器能够与 Servlet API 完全脱离开, 所以 Struts 2 可以理解为 WebWork 的更新产品. 虽然 从Struts 1 到 Struts2 有着太大的变化, 但是相对于WebWork , Struts 2 的变换很小.


. 工作原理

. 发展概况

      经过六年多的发展, Struts1 已经成为了一个高度成熟的框架, 不管是稳定性还是可靠性都得到了广泛的证明. 市场占有率超过20%, 拥有丰富的开发人群, 几乎已经成为了事实上的工业标准. 但是随着时间的流逝, 技术的进步, Struts 1 的局限性也越来越多的暴露出来, 并且制约了Struts1 的发展.

      对于Struts 1 框架而言, 由于与JSP/Servlet 耦合非常紧密, 因而导致了一些严重的问题. 首先, Struts1 支持的表现层技术单一. 由于Struts1 出现的年代比较早, 那个时候没有FreeMarker、Velocity等技术, 因此它不可能与这些视图层的模板技术进行整合. 其次, Struts1 与 Servlet API 的严重耦合, 使应用难于测试. 最后, Struts1 代码严重依赖于Struts1 API, 属于侵入性框架.

      从目前的技术层面上看, 出现了许多与Struts1 竞争的视图层框架, 比如JSF、Tapestry 和 Spring MVC 等. 这些框架由于出现的年代比较近, 应用了罪行的设计理念, 同时也从Struts1 中吸取了经验, 客服了很多不足.  这些框架的出现也促进了Struts 的发展. 目前，Struts 已经分化成了两个框架: 

     第一个是在传统的Struts1 的基础上, 融合了另外的一个优秀的Web 框架 WebWork 的Struts2 。 Struts2 虽然在Struts1 的基础上发展起来的, 但是实质上是以 WebWork 为核心的. Struts2 为传统的Struts1 注入了WebWork 的先进的设计理念, 统一了Struts1 和WebWork 两个框架. 

     Struts1 分化出的另一个框架是Shale。 这个框架远远超出了Struts1 原有的设计思想, 与原有的Struts1 关联很少, 使用了全新的设计思想. Shale 更像一个新的框架而不是Struts1 的升级.