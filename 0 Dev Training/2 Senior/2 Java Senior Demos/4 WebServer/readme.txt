. Java  实现 Web Server 简要思路

  1. 选用一款 Web Server 软件， 以 Tomcat 为例

  2. 主页面: index.jsp

     欢迎页面, 用JSP或 PHP实现. 信息简明扼要.  包括以下信息:

     a. 标题
   
        助你迈入成功/Ensure Your Success

     b. 中间

        公司Logo

     c. 登陆

        用户名/密码/验证码

     d. 按钮

        登录

     e. 后台处理登录

        Servlet1 : 验证用户有效性  login.java

        验证用户有效性. 

        Servlet2 : 图片验证码       

  3. 

. Eclipse 输出 Web Server 包

  Export->WAR .. 指定地址。 一般直接将WAR 输出到 Web  Server  服务器软件上的目标位置, 例如Tomcat 6.0 中的Webapps 目录下.

  Tomcat6.0 自动会加载 WAR, 客户端刷新后即可使用最新的Web Server 应用系统了.

. 现在的问题:

  总是提示找不到 .html 等文件, 只要重定向另一个文件就找不到. 是启动Tomcat 的方式问题, 如果启动成功， 右下角会有Tomcat 的图标. 最好通过 开始-〉。。。〉Monitor Tomcat  启动 或者 Startup.bat (好像是这个名字的bat文件)