. Spring �ٷ���վ

  �μ�:
  
      http://baike.baidu.com/subview/23023/11192342.htm?fr=aladdin

  www.springsource.org

  ������Ҫ����һЩ��Ϣ. ���鷳����ȥ http://sourceforge.net/projects/springframework/ ����.

. Struts MVC �����ǰ��

  Spring �� �м��

  Hibernate �����

. CSS �ڱ߾���������	����
padding	��д���ԡ���������һ������������Ԫ�ص����ڱ߾����ԡ�
padding-bottom	����Ԫ�ص����ڱ߾ࡣ
padding-left	����Ԫ�ص����ڱ߾ࡣ
padding-right	����Ԫ�ص����ڱ߾ࡣ
padding-top	����Ԫ�ص����ڱ߾ࡣ

. Spring ��һ����Դ���, ��Ϊ�˽����ҵ Ӧ�ó��򿪷�������, �� Rod Johnson ������.  ��ܵ���Ҫ����֮һ������ֲ�ܹ�, �ֲ�ܹ�����ʹ����ѡ��ʹ����һ�����, ͬʱΪJ2EE Ӧ�ó��򿪷��ṩ���ɵĿ��. Spring ʹ�û�����JavaBean �������ǰֻ������EJB ��ɵ�����. Ȼ��, Spring ����;�������ڷ������˵Ŀ���. �Ӽ��ԡ��ɲ����Ժ�����ϵĽǶȶ���, �κ�Java Ӧ�ö����Դ�Spring ������.

. ���

      Spring ��һ����Դ���, ��2003�������һ����������Java �������, �� Rod Johnson �������� Expert One-On-One J2EE Development and Design �в����Ĳ��������ԭ����������. 

  �򵥵�˵, Spring��һ���������Ŀ��Ʒ�ת(IoC) ����������(AOP )���������.

  ����:

       �Ӵ�С�뿪�����������Spring ����������. ������Spring ��ܿ�����һ����Сֻ��1MB ���JAR �ļ��﷢��. ���� Spring ����Ĵ�����Ҳ��΢�������. ����, Spring �Ƿ�����ʽ��: ���͵�, Spring Ӧ���еĶ���������SPring ���ض���. 

  ���Ʒ�ת

      Spring ͨ��һ�ֳ������Ʒ�ת(IoC)�ļ����ٽ��������. ��Ӧ����IoC, һ���������������������ͨ�������ķ�ʽ���ݽ���, ��������������Լ��������߲����������� �������ΪIoC�� JNDI �෴ --- ���Ƕ���������в�������, ���������ڶ����ʼ��ʱ���ȶ���������������������ݸ���.

  ��������

      Spring �ṩ�����������̵ķḻ֧��, ����ͨ������Ӧ�õ�ҵ���߼���ϵͳ������(����: ���(auditing) ������(transation)����) �����ھ��ԵĿ���. Ӧ�ö���ֻʵ������Ӧ������----���ҵ���߼� ---- ���˶���.  ���ǲ�������(��������ʶ) ������ϵͳ����ע��,���� ��־������֧��.

  ����

      Spring ����������Ӧ�ö�������ú���������, ���������������һ������, ������������ÿ��bean ��α����� ---- ����һ��������ԭ��(prototype)�� ���bean���Դ���һ��������ʵ������ÿ����Ҫʱ������һ���µ�ʵ��----�Լ�����������໥������. Ȼ��, Spring ��Ӧ�ñ���ͬ�ڴ�ͳ����������EJB����, ���Ǿ������Ӵ��뱿�ص�, ����ʹ��.

  ���

      Spring ���Խ��򵥵�������á���ϳ�Ϊ���ӵ�Ӧ��. ��Spring��, Ӧ�ö�������ʽ�����, ���͵�����һ��XML�ļ���. Spring Ҳ�ṩ�˺ܶ��������(��������־û���ܼ��ɵȵ�)�� ��Ӧ�ü��߼��Ŀ����������㡣

  MVC

      Spring ������������, ��������������, Spring��ܿ��Ա�������һ����ҵ�����������Ŀ��. �ͻ��˷�������, ����˿�����(�� DispatcherServletʵ�ֵ�)��������ת��, ����������һ������ӳ����� HandlerMapping, �������ڽ�����ӳ�䵽��Ӧ�Ĵ���������������.  HandlerMapping ������ӳ�䵽��Ӧ�Ĵ�����Controller(�൱��Action)��Spring �������дһЩ���������, һ��ʵ��Controller�ӿ�, ��Controller �оͿ��Ե���һЩService ��DAO���������ݲ��� ModelAndView ���ڴ�Ŵ�DAO ��ȡ��������, �����Դַ���Ӧ��ͼ��һЩ����. ����뽫���������ظ��û�, ��ô��Spring ����л��ṩһ����ͼ���ViewResovler, ���������Controller���صı�ʶ, �ҵ���Ӧ����ͼ, ����Ӧresponse ���ظ��û�.

  ����Spring ����Щ����ʹ���ܹ���д���ɾ������ɹ������Ҹ����ڲ��ԵĴ���. ����ҲΪSpring �еĸ���ģ���ṩ�˻���֧��.

. ��Դ

  Spring �Ƕ��ص�, ��Ϊ���ɸ�ԭ��:

  1. ����λ������������������е�framework û�е�. Spring �������ṩһ�ַ����������ҵ�����.

  2. Spring��ȫ��ĺ�ģ�黯��. Spring �зֲ����ϵ�ṹ, ����ζ������ѡ��ʹ�����������κβ���, ���ļܹ���Ȼ�������ȶ���. ��˴����ѧϰ��, ��ɵõ����ļ�ֵ. ���磬 �����ѡ�����ʹ��Spring ����JDBC��ʹ��, �������������е�ҵ�����.

  3. ������ƴӵײ��������д���ڲ��ԵĴ���. Spring �����ڲ����������̵������framework��

  Spring ����Ĺ�����˵, ������Ҫһ�����ϵ�framework�� Spring ��Ǳ�ڵ�һվʽ�������, ����λ�ڵ���Ӧ����صĴ󲿷ֻ����ṹ�� ��Ҳ�漰������framework û�п��ǵ�������.   

.����

     ǿ��Ļ��� JavaBeans �Ĳ��ÿ��Ʒ�ת(Inversion of Control, IoC)ԭ������ù���, ʹ��Ӧ�ó����������ӿ�ݼ���.

     һ�������ڴ�applet �� Java EE �Ȳ�ͬ���л����ĺ���Bean ����.

     ���ݿ������һ�㻯�����, ��������ʽ(Declarative)���������, ������Ļ���ʹ֮��ײ��޹�.

     �ڽ������JTA �͵���JDBC����Դ��һ�㻯����, ʹSpring ������֧�ֲ�Ҫ��Java EE����, ����һ���JTA ���� EJB CMT�෴.

     JDBC ������ṩ��������Ե��쳣�ȼ�(���ٴ�SQL �쳣����ȡԭʼ����), ���˴�����, �������˳���Ա�ı�����. �ٴ�����JDBC ʱ, ������д����һ����ֹ(finaly) ģ�顣 ��������JDBC��һ����SPring ͨ�����ݷ��ʶ���(Data Access Object) �쳣�ȼ�һ��.

     ����Դ����, DAO ʵ�ֺ�������Ե���ʽ��Hiberate, JDO �� iBATIS SQL Maps ����. �����ڶ�ķ�ת���Ʒ���������ȫ��֧��, ����������͵�Hiberate ��������. ������Щȫ����Ӵ�SPring ͨ���������ͨ�����ݷ��ʶ����쳣�ȼ��淶. 

     ���Ļ��ں���Spring ����MVC ��ҳӦ�ó�����. ������ͨ�����Խӿڽ�ӵ�иÿ�ܵĸ߶ȿ���, ����ÿ�ܽ���Ӧ�ڶ��ֳ���(View)����, ���� JSP, FreeMarker�� Velocity�� Tiles, iText �Լ� POI.  ֵ��ע�����, Spring �м��������׵Ľ�����κλ���MVC ��ܵ���ҳ��, ���� Struts, WebWork�� �� Tapestry.

     �ṩ�����������ȷ�������������(AOP)��ܡ�

. �ص�:

  1. �������򻯿���

         ͨ��Spring �ṩ��IoC����, ���Խ�����֮���������ϵ����Spring ���п���, ����Ӳ��������ɵĹ��ȳ������. ����Spring�� �û�������Ϊ��ʵ��ģʽ�ࡢ�����ļ���������Щ�ܵײ�������д����, ���Ը�רע���ϲ��Ӧ��.

  2. AOP ��̵�֧��

         ͨ��Spring �ṩ��AOP ����, ���������������ı��, ��಻�����ô�ͳ��OOP ʵ�ֵĹ��ܿ���ͨ��AOP ����Ӧ��.

  3. ����ʽ�����֧��

         ��Spring ��, ���Դӵ������Ƶ������������н��ѳ���, ͨ������ʽ��ʽ���Ľ�������Ĺ���, ��߿���Ч�ʺ�����.

  4. �������Ĳ���

         �����÷����������ı�̷�ʽijinxing�������еĲ��Թ���, ��Spring ��, ���Բ����ǰ���Ĳ���, �������ֿ���������.

  5. ���㼯�ɸ���������

         Spring ���ų��������Ŀ�Դ���, �෴, Spring ���Խ��͸��ֿ�ܵ�ʹ���Ѷȣ�Spring �ṩ�˶Ը���������(��Struts, Hibernate, Hessian, Quartz) �ȵ�ֱ��֧��.

  6. ����Java EE API ��ʹ���Ѷ�

         Spring �Ժܶ����õ�Java EE API (�� JDBC, Javamail, Զ�̵��õ�) �ṩ��һ�������ķ�װ��, ͨ��Spring �ļ��׷�װ, ��ЩJava EE API ��ʹ���Ѷȴ�Ϊ����.

  7. Java Դ���Ǿ���ѧϰ����

         Spring ��Դ����ƾ���ṹ���������Ķ���, ���������Ŵ�ʦ��Java ���ģʽ���Ӧ���Լ���Java �����ĸ�������. Spring ���Դ��������Java ���������ʵ������. ������ڶ�ʱ����Ѹ������Լ���Java ����ˮƽ��Ӧ�ÿ���ˮƽ, ѧϰ���о�Spring Դ�뽫��ʹ���յ����벻����Ч��.

. �ô�

  1. Spring ����Ч����֯����м�����, �������Ƿ�ѡ��ʹ����EJB�� �������ʹ����Struts �������İ�����J2EE����APIs ��framework�� ��ᷢ��Spring ��ע�������µ�����.

  2. Spring ��������๤���϶�Singleton �Ĺ���ʹ��. ���ݾ���,����һ����Ҫ������, ���Լ���ϵͳ�Ŀɲ����Ժ������������.

  3. Spring ������ʹ�ø��ָ�����ʽ�����Զ����ļ�����Ҫ, ������Ӧ�ú͹�����, ��ͨ��һ��һ�µķ�������������. �����е��Ի�, һ���ض���ҩ�����Իð�����Թؼ��ֻ�ϵͳ����, Ϊ�˲��ò���Javadoc����Ԫ������? ���� Spring �� ���Ժܼ򵥵Ŀ������JavaBean ����. ���ÿ��Ƶ�ʹ�� ����������ּ򻯡�

  4. Spring ��ͨ���ӿڶ�������ٽ��õı��ϰ��, ���ٱ�̴��۵�����Ϊ��.

  5. Spring �����Ϊ��ʹ����������Ӧ�þ������ٵ�����������APIs. ��Spring Ӧ���еĴ����ҵ�����û��������Spring��

  6. ʹ��Spring ������Ӧ�ó������ڵ�Ԫ����.

  7. Spring��ʹEJB ��ʹ�� ��Ϊһ��ʵ��ѡ��, ������Ӧ�üܹ��ı�Ȼѡ��. ����ѡ����POJOs �� local EJBs ��ʵ��ҵ��ӿ�, ȴ����Ӱ����ô���.

  8. Spring ��������������������ʹ��EJB. Spring ���ṩһ��EJB ���滻��, ����ʹ�������webӦ��. ����, Spring ��ʹ��AOP �ṩ�������������ͨ��ʹ��EJB����, ����������Ҫ�뵥�������ݿ�򽻵�, ��������ҪJTA ʵ��.

  9. Spring Ϊ���ݿ��ȡ�ṩ��һ�µĿ��. ������ʹ��JDBC�� O/R mapping ��Ʒ(�� Hibernate)

  �ܽ�����, Spring �������ŵ�:

  1. ������ʽ���, ������Ⱦ����;

  2. �����ڸ���Ӧ�÷�����, ����Spring ��ܵ�Ӧ��, ��������ʵ��write once, Run anywhere �ĳ�ŵ;

  3. Spring ��DI���ƽ�����ҵ������滻�ĸ�����, ��������֮��Ľ���;

  4. Spring ��AOP ֧������һЩͨ�������� ��ȫ��������־�Ƚ��м���ʽ����, �Ӷ��ṩ�˸��õĸ���

  5. Spring ��ORM �� DAO �ṩ����������־ò��ܵ���������, �����˵ײ�����ݿ����;

  6. Spring ����ǿ��Ӧ����ȫ������Spring �� �����߿�����ѡ��Spring ��ܵĲ��ֻ�ȫ��.

. �������

  Spring �����һ���ֲ�ܹ�, ��7���������õ�ģ�����. Spring ģ�鹹���ں�������֮��, �������������˴��������ú͹���bean �ķ�ʽ, ��ͼ��ʾ:

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
        
  ��� Spring ��ܵ�ÿ��ģ��(�����) �����Ե�������, ����������һ������ģ������ʵ��. ÿ��ģ��Ĺ�������: 

  1. ��������: ���������ṩSpring ��ܵĻ�������(Spring core)��  ������������Ҫ����� BeanFactory, ���ǹ���ģʽ��ʵ��.  BeanFactory ʹ�ÿ��Ʒ�ת(IOC) ģʽ��Ӧ�ó�������ú������Թ淶��ʵ�ʵ�Ӧ�ó������ֿ�.

  2. Spring ������ : Spring ��������һ�������ļ�, ��Spring ����ṩ��������Ϣ. Spring �����İ�����ҵ����, ���� JNDI��EJB�������ʼ������ʻ���У��͵��ȹ���

  3. Spring AOP: ͨ�����ù�������, Spring AOP ģ��ֱ�ӽ���������ı�̹��ܼ��ɵ��� Spring �����. ����, ���Ժ����׵�ʹ��Spring ��ܹ�����κζ���֧��AOP. Spring AOP ģ��Ϊ����Spring ��Ӧ�ó����еĶ����ṩ������������. ͨ��ʹ����Spring AOP, ��������EJB ���, �Ϳ��Խ���������������ɵ�Ӧ�ó�����.

  4. Spring DAO:  JDBC DAO ������ṩ����������쳣��νṹ, �����øýṹ ������ �쳣����Ͳ�ͬ���ݿ⹩Ӧ���׳��Ĵ�����Ϣ. �쳣��νṹ���˴�����, ���Ҽ���Ľ�������Ҫ��д���쳣��������(���� �򿪺͹ر�����). Spring DAO ������JDBC ���쳣���ͨ�õ�DAO �쳣��νṹ.

  5. Spring ORM : Spring ��ܲ��������ɸ�ORM ���, �Ӷ��ṩ��ORM �Ķ����ϵ����, ���а���JDO��Hibernate ��iBatisSQL Map�� ������Щ����� Spring ��ͨ������� DAO �쳣��νṹ.

  6. Spring Web ģ��: Web ������ģ�齨����Ӧ�ó���������ģ��֮��, Ϊ����Web ��Ӧ�ó����ṩ��������. ����, Spring ���֧����Jakarta struts �ļ���. Web ģ�黹���˴���ಿ�������Լ�����������󶨵������Ĺ���.

  7. Spring MVC���: MVC ��� ��һ��ȫ���ܵĹ��� Web Ӧ�ó����MVCʵ��. ͨ�����Խӿ�, MVC ��ܱ��Ϊ�߶ȿ����õ�, MVC �����˴�����ͼ����, ���а���JSP��Velocity��Tiles��iText �� POI.  ģ���� javabean ����, ����� Map; ��ͼ��һ���ӿ�, ������ʾģ��; ��������ʾ�߼�����, ��Controller ��ʵ��.  Spring ��ܵĹ��ܿ��������κ�J2EE ��������, ���������Ҳ�����ڲ��ܹ���Ļ���. Spring �ĺ���Ҫ����: ֧�ֲ��󶨵��ض�J2EE ����Ŀ�����ҵ������ݷ��ʶ���. ��������, �����Ķ�������ڲ�ͬ��J2EE����(Web �� EJB) ������Ӧ�ó��򡢲��Ի���֮������.

. ���ذ�װ

  ���غͰ�װSpring�밴���²�����С�
   ��1����¼վ�㣬����Spring�������ȶ��汾�����°汾Ϊspring-framework-4.0.��������            spring-framework-spring-framework-4.0.0.M2-dist

        ���ѹ������������Spring�Ŀ����������Ұ���Spring����������������ĵ�������⡣

        ��ѹ�����ص���ѹ��������ѹ������ļ���Ӧ�����¼����ļ��С�

       ��dist�����ļ����·�Spring��jar����ͨ��ֻ��ҪSpring.jar�ļ����ɡ����ļ����»���һЩ����spring��Xxx.jar��ѹ������ ��Щѹ������spring.jarѹ��������ģ��ѹ����������ȷ������J2EEӦ��ֻ��Ҫʹ��Spring��ĳһ����ʱ���ſ���ʹ�����ַ�ģ��ѹ������ͨ������ʹ��Spring.jar

       ��docs�����ļ����°���spring������ĵ�������ָ�ϼ�API�ο��ĵ���

       ��lib�����ļ����°���spring����������������ĵ�������⣬��·���µ���Ⲣ����spring����ģ��������Ҫʹ�õ���������֧�֣�����������Ǳ���Ҫ�ġ�

       ��samples�����ļ����°���Spring�ļ��������ӣ�����ΪSpring����ѧϰ�İ�����

       ��src�����ļ����°���Spring��ȫ��Դ�ļ�����������������еط��޷����գ����Բο���Դ�ļ����˽�ײ�ʵ�֡�

       ��test�����ļ����°���Spring�Ĳ���ʾ����

       ��tiger����·���´�Ź���JDK���������

       ����ѹ������ļ����£�������һЩ����Spring��License����Ŀ����ļ�

  ��2����spring.jar���Ƶ���Ŀ��CLASSPATH·���£�����WebӦ�ã���spring.jar�ļ����Ƶ�WEB-INF/lib·���£���Ӧ�ü���������Spring����ˡ�

  ��3��ͨ��Spring�Ŀ�ܻ�����������һЩjar�ļ�����˻��뽫lib�¶�Ӧ�İ����Ƶ�WEB-INF/lib·���£�����Ҫ������Щjar�ļ���ȡ����Ӧ������Ҫʹ�õ���Ŀ��ͨ����Ҫ����cglib��dom4j��jakarta-commons��log4j���ļ����µ�jar�ļ���

  ��4��Ϊ�˱���java�ļ��������ҵ�Spring�Ļ����࣬��Spring.jar�ļ���·����ӵ���������CLASSPATH�С���Ȼ��Ҳ����ʹ��ANT���ߣ���������ӻ������������ʹ��Eclipse����NetBeans��IDEʱ��Ҳ����Ҫ���û���������

    Spring MVC
        ��ͳ��web�ܹ���view ���ֲ�ʹ��struts��Ϊ���ֲ㡣�������������spring�Դ���MVC���ᷢ��spring ��һ�㳡����ȫ����ȡ��struts����ĳЩ�Ƕ���˵��spring��mvc��Ƶĸ��Ӻ�������Ȥ�Ļ����������µ�����spring��MVC��

. Ӧ��ʵ��

  1. �½�һ����¼ҳ��: loginActionSupport.jsp    ��������:

     <%@page contentType="text/html;charset=GBK" isELIgnored="false"%>
     <html>
     <head><title>;ʵ���û���¼ʵ��, struts �� Spring����</title></head>
     <body><font size='22'>$<br></font>
     <form name="form1" action="/myLogin/loginActionSupportdo" method="post">
          �û���:<input type="text" name="username" value="${user.username}"/><br>
          ����:<input type="password" name="password" value="${user.password}"/><br>
     </form>
     </body>
     </html>

  2.����һ���洢��¼�û���Ϣ����: User.java �� ����̳��� ActionForm, ��������:

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

  3. com.zhaosoft.action ���½�һ��LoginActionSupport.java��  ���಻������struts ��Action, ���Ǽ̳��� Spring ��ActionSupport�� ����ʾ������:

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

		// ͨ��ApplicationContext ��ȡ �����ļ�
		ApplicationContext ctx = getWebApplicationContext();

		Login login = (login) ctx.getBean("login");
		login.login( ( User ) form );

		request.setAttribute( "msg", login.getMsg() );
		request.setAttribute( "user", (user)form );

		return mapping.findForward("login");
	}
    }

. ��Ҫ��Ʒ

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



. ����

  ����Spring �Ĳ���

  1. Spring �е�������

  2. IoC ������Web �����е�����

  3. Spring JDBC

  4. Spring MVC

  5. Spring AOP ��ȡ Proxy

  6. Spring ����ʽ������

  7. Spring AOP �ж����������õ�ʵ��

  8. Spring ����Hibernate ��ʵ��

  9. Spring Acegi ��ܼ�Ȩ��ʵ��

  IoC �� AOP

      ���Ʒ�תģʽ(Ҳ���� ������ע��) �Ļ���������: ����������, ���������������ǵķ�ʽ.  �ڴ����в�ֱ�������ͷ�������, ���������ļ���������һ�������Ҫ��һ�����.   ����( �� Spring �������IoC����) ������Щ��ϵ��һ��. �ڵ��͵�IoC ������, �������������ж���, �����ñ�Ҫ�����Խ�����������һ��, ����ʲôʱ����÷���. �±��г���IoC��һ��ʵ��ģʽ.


  ����1   ������Ҫʵ��ר�ŵĽӿ�, ͨ���ӿ�, �ɶ����ṩ��Щ����, ���ԴӶ������Բ�ѯ������(����, ��Ҫ�ĸ��ӷ���)(�ӿ�ע��)

  ����2   ͨ��JavaBean ������(���� setter ����) ����������(setter ����ע��)

  ����3   �������Թ��캯������ʽ�ṩ, ���� JavaBean ���Ե���ʽ����(������ע��)

  Spring ��ܵ� IOC ������������2 ������3 ʵ��.

  ������ı��, ��AOP, ��һ�ֱ�̼���, ���������Ա�����й�ע��� ���е��͵�ְ��ֽ��ߵ���Ϊ(���� ��־���������) ����ģ�黯. AOP �ĺ��Ĺ����Ƿ���, ������ЩӰ���������Ϊ��װ�������õ�ģ����.

  AOP �� IOC �ǲ����Եļ���, ���Ƕ�����ģ�黯��ʽ �����ҵ Ӧ�ó��򿪷��еĸ�������. �ڵ��͵�������󿪷���ʽ��, ����Ҫ����־��¼���������з����� Java ���в���ʵ����־����. ��AOP ��ʽ��, ���Է���������־����ģ�黯, ���������ķ�ʽ������Ӧ�õ���Ҫ��־�������. ��Ȼ, ���ƾ���Java �಻��Ҫ֪����־����Ĵ���, Ҳ����Ҫ������صĴ���. ����, ��Spring AOP ��д��Ӧ�ó����������ɢ��ϵ�.

  AOP �Ĺ�����ȫ���ɵ���Spring ���������־�������������Ե���������.

  AOP ��̷���, Spring �ṩ�˺ܶ�����, ���� PointCut�� Advice, Advisor, ������˵�������������־�������������Ե�����ص�.


. ����

  Spring ��Ƶĺ����� org.springframework.beans ��, �������Ŀ���� ��JavaBean ���һ��ʹ��. �����ͨ���������û�ֱ��ʹ��, �����ɷ������������� �����������ܵĵײ��н�. ��һ����߼�������BeanFactory �ӿ�, ���ǹ������ģʽ��ʵ��, ����ͨ�����ƴ����ͼ�������. BeanFactory Ҳ���Թ������֮��Ĺ�ϵ.

  BeanFactory ֧����������ģ��.

  1. ��̬ģ���ṩ�˾����ض����ƵĶ���Ĺ���ʵ��, �����ڲ�ѯʱ������м���. Singleton ��Ĭ�ϵ�Ҳ����õĶ���ģ��. ������״̬������������.

  2. ԭ��ģ��ȷ��ÿ�μ������ᴴ�������Ķ���. ��ÿ���û�����Ҫ�Լ��Ķ���ʱ, ԭ��ģ�����ʺ�.

  bean �����ĸ�����Spring ��ΪIOC �����Ļ���. IOC ��������������δ�Ӧ�ó������ת�Ƶ����.
      
. ��������WebӦ�ÿ����� �����  ZWTS\2011\TP312JA\cth

  P464

  ʹ�þ�̬���̷�������Bean ��ʵ��

  <bean id = "staticFactoryBean"
	class = "cn.hxex.springcore.construct.StaticFactory"
	factory-method="getStaticFactoryBeanInstance"/>
  
     ## ������þ͵�ͬ�� ����Java���� StaticFactory.getStaticFactoryBeanInstance() ����  ���õ�Java �����ʵ����

     ���þ�̬���̷�������Bean ��ʵ�� Ҫ����ʹ�õķ���(���� getStaticFactoryBeanInstance() ) �����Ǿ�̬�ġ�

  ʹ��ʵ�����Ĺ�����������Bean ��ʵ��

     ���ַ�����ʹ�þ�̬������ʽ�����������, ���ڴ���Bean ʵ����Java ������ʵ������, ����������ʹ�õķ���Ҳ��Ҫ���Ǿ�̬�ġ�

     ʹ��ʵ����������������Bean ��ʵ��ʱ, <bean>Ԫ���е�class �����ǿյ�, ��Ҫ��factory-bean����ָ��Ϊ����Bean ʵ����Bean ����������, �� Bean ���������Ŵ���Bean ʵ���Ĺ��������� ����������ͨ�� factory-method �����������趨. �����Ǹ�����:

  <bean id = "dynamicFactory"
	class = "cn.hxex.springcore.construct.DynamicFactory" />

  <bean id = "dynamicFactoryBean"
	factory-bean="dynamicFactory"
	factory-method="getDynamicFactoryBeanInstance"/>

  ��������ã� �൱��ִ��������Java ����:

  DynamicFactory dynamicFactory = new DynamicFactory();

  DynamicFactoryBean dynamicFactoryBean = dynamicFactory.getDynamicFactoryBeanInstance();

. P466 

  ʹ�� ���캯�� ����ע��  , ʵ���Ͼ�����Bean ������ ��ӹ��캯�� ����������, ����:

  <bean id="exampleBean" class="cn.hxex.springcore.ExampleBean">
      <constructor-arg type="int"><value>7500000</value></constructor-arg>
      <constructor-arg type="java.lang.String"><value>42</value></constructor-arg>
  </bean>

  ����������bean

  <ref bean="someBean"/>    ͬһ�����������ڵ��κ�bean

  <ref local="someBean"/>   ͬһ�ļ��е�bean. local ������bean ��id ����ֵ

  <ref parent = "someBean"/> ���ø����� �е�bean�� �������Ǹ�������bean ��id ֵ, Ҳ������name ����ֵ.

 �ڲ�bean�� ֻ�ܱ��� Bean ʹ��, ���ܱ��κ��ⲿbean ʹ��

  <bean id = "outer" class="...">
	<property name="target">
		<bean class="com.mycompany.Person"> <!--  ����һ���ڲ�bean -->
			<property name="name" value="Fiona Apple"/>
			<property name="age" value ="25"/>
		</bean>
	</property>
  </bean>

 Ϊ���������Ը�ֵ  P467

 Spring ��IoC ���� Ϊ Bean �ļ��������Ե��������˸�ֵ��Ԫ��. ������Ա����ͨ��<list>, <set>, <map>��<props> Ԫ�ض�����������Java Collection ���Ͷ�Ӧ List, Set, Map�� Properties��

  ����:

  ==== java.util.List ===

  <property name="someList">
	<list>
		<value>a list element followed by a refernce</value>
		<ref bean="myDataSource"/>
	</list>
  </property>

  ��<list> Ԫ���ڲ�����ʹ��ǰ�������ܵ����ⷽ�� �� ���� ָ�� List �������Ķ���. �ڽ��� Bean �ĳ�ʼ��ʱ, ����ø�Bean ��setSomeList(List list) �������������������ע�����.

  == Set == �����÷����������, ���������Ҫʹ��<set>Ԫ�������ж���

  =========== java.util.Properties ====

  Properties ���͵�Bean ������ͨ��<props> Ԫ�������г�ʼ����, �����ڲ���ÿһ��"��-ֵ" �ԵĶ�������ͨ��<prop>Ԫ�����������õ�. ���õ�ʾ��������ʾ:

  <property name="adminEmails">
	<props>
		<prop key="administrator">administrator@somecompany.org</prop>
		<prop key="support">support@somecompany.org</prop>
		<prop key="development">development@somecompany.org</prop>
	</props>
  </property>
  

  ========== java.util.Map ====

  Map ���͵����Եĳ�ʼ����ͨ��<map> Ԫ�������ж����. �� Properties ���ò�ͬ����, ÿһ��"��-ֵ"�� ����Ҫ������һ��<entry> Ԫ����, ����Map �ļ� ��ͨ��<key>�����ж����, ֵ�����ʹ��ǰ�����ض�������ⷽ������ʼ����

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

  ==== ��ֵ�Ĵ��� ===

  Spring ��IoC ����������<null>Ԫ���������ֵ, Spring ������ԵĿղ����������ַ���������. ���µ�xml Ƭ�ν�email ������Ϊ�˿��ַ���.

  <bean class="Examplebean">
	<property name="email"><value></value></property>
  </bean>

  ���ͬ��java ����: exampleBean.setEmail(""). �� null ֵ�����ʹ��<null> Ԫ������ʾ

  <bean class="ExampleBean">
	<property name="email"><null/></property>
  </bean>

  ���������õ�ͬ��Java���� : exampleBean.setEmail(null).

  ========P470  ���� seter ����������ע�� ===================

  <!-- ���� Setter ������ע�� -->
  <bean id="setterInjectionBean"
	class="cn.hxex.springcore.injection.SetterInjectionBean">

	<!-- ͨ��<ref>Ԫ��ʵ��setter ��ʽ������ע�������-->
	<property name="anotherBean"><ref bean="anotherBean"/></property>

	<!-- ͨ�� ref ������ʵ�� setter ��ʽ������ע������� -->
	<property name="yetAnotherBean" ref="yetAnotherBean"/>

	<!-- ͨ�� value ������ֱ�Ӷ���ע���ֵ-->
	<property name="i" value="1"/>
  </bean>

  === ʹ�ù��캯������ע�� ��ʹ�� setter ��ʽע��  ������ ====

  ʹ�ù��췽�� ʵ������ע��ʱ ����һ������ɶ���Ĵ�����������ϵ������, ��֤ʵ����ȫ��ʼ�� �Ļ����Ͻ������ʵ�����ظ��ͻ���. ����Ҫ����, ���ù��췽��ʵ�ֵ�����ע�� ���� �ڽ�������ע�롣  ��ʹ�� setter ����ʵ�ֵ�����ע�� ����Ҫ��ʱ�򻹿��Խ�������ע�롣

. P474 ��ʼ��Web ����

  ��web.xml ����ContextListener:

  === Servlet 2.4 �����ϵ� web ���� ====
  <listener>
	<listener-class>org.springframework.web.conext.scope.RequestContextListener</listener-class>
  </listener>

  ==== Servlet 2.4 ��ǰ������, Ҫʹ��һ��javax.servlet.Filter ��ʵ��, ����:

  <filter>
	<filter-name>requestContextFilter</filter-name>
	<filter-class>org.springframework.web.filter.RequestContextFilter</filter-class>
  </filter>

  <filter-mapping>
	<filter-name>requestContextFilter</filter-name>
	<url-pattern>/*</url-pattern>
  </filter-mapping>

  RequestContextListener �� RequestContextListener ������ ���Ķ���ͬ���Ĺ���: �� HTTP request ����󶨵�Ϊ�������ṩ������߳�. ��ʹ�� ���� request ��session ������ ��Bean �ܹ��ں���ĵ����� �б����ʵ�.

. P481  Lookup ����ע��

  ��ʹ��Lookup ����ע���ʱ��, ��Ҫ�����õ�Bean �� ����һ������ķ��ر����ö���ķ���. ����ķ���������ʾ:

  public abstract CurrentTime createCurrentTime();

  # ���������ķ������ǳ����, Spring hui���и��Ǵ���.

  �� ����XML ���õ�ʱ��, ��Ҫʹ��<lookup-method> ��ָ����Ҫ���ǵķ����ͷ��ص�Bean�� �������÷���������ʾ:

  <lookup-method name="createCurrentTime" bean="currentTime"/>