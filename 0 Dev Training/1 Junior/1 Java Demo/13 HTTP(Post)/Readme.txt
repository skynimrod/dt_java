. HTML 的实时刷新

  可以在<HEAD>中增加以下内容实现. 参见: http://www.people.com.cn/GB/channel5/569/20000728/163528.html

  实现网页自动刷新
    

    通常HTML文件需要浏览者来选择浏览的内容，如果想自动更换显示的内容一般要用到JavaScript、JAVA或CGI等方法来完成。 

    现在可以用META实现自动更换显示内容，更换的时间和文件都可以自行设定。语句如下： 

    <HEAD> 

    <TITLE>刷新内容< /TITLE> 

    <META HTTP-EQUIV="REFRESH" CONTENT="x; URL=*.*"> 

    < /HEAD> 

    x 是刷新的时间，单位是秒。*.* 是刷新的文件。 

    利用<META>标签实现Web的自动跳转。 

    在Web上显示一段欢迎信息，隔一定秒数后，自动跳转到其他的Web页 面，由此可以造成新奇的效果。其实现方法是在< HEAD >与< /HEAD >标签之间加上如下语句： 

    <meta http-equiv="Refresh" content="秒数; url=跳转的文件或地址"> 

    如将一个显示欢迎信息的图像：welcome.gif存放在与HTML文档同一个 

    目录中，则下面的HTML文件在浏览器中显示该图像，3 秒钟后将自动跳 

    转到人民日报网络版：http://www.peopledaily.com.cn

    <HTML> 

    <HEAD> 

    <TITLE>WELCOME< /TITLE> 

    <meta http-equiv="Refresh" content="3; 

    url=http://www.peopledaily.com.cn"> 

    < /HEAD> 

    < /HTML>SRC="welcome.gif" > 

    多个内容相似而背景不同的页面，让其每隔一定时间自动相互跳转。  

  ================================

  网页自动刷新代码

<meta http-equiv="refresh" content="100">
<meta http-equiv="Refresh" content="秒数; url=跳转的文件或地址">
将100改为想要网页自动刷新的时间秒数。


比如
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<meta http-equiv="refresh" content="10">
<title>刷新...</title>


网页自动刷新 ，不产生声音的一个解决方法
刷新页面不要用那个meta标签中的refresh属性。用这个一定有声音。大家只要在body属性里面加上这么一句话就可以了。

<body onload="setTimeout( this.location.reload(); ,6000);">

这样刷新就没有声音了！