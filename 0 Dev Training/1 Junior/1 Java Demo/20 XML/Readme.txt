. 使用Dom4j 开源包处理XML 文件

  Dom4j 的具体使用说明参见:

      http://dev.csdn.net/article/22/22753.shtm

      http://o-lions.javaeye.com/blog/79718

. FireFox  的全屏

  按F11 就可以直接全屏。 如何控制客户端通过JavaScript  或 Servlet 等直接将客户端全屏?  


   script >
< !--
function omiga_window(){
window.open("12.htm","","fullscreen=1,menubar=0,toolbar=0,directories=0,location=0,
status=0,scrollbars=0")
}
//-- >
< /script >


head >
< title >123< /title >
< meta http-equiv="Content-Type" content="text/html; charset=gb2312" >
< script >
< !--
function omiga_window(){
window.open("full_window.htm","","fullscreen,scrollbars")
}
//-- >
< /script >

. 附:

  对于Tomcat 6.0,  由于缺省http://localhost:pots/  对应的是Tomcat 自身的维护界面，应该修改，不然不安全.

  另外，错误提示应该更换， 不应该用缺省的错误提示。