package sendMail;

import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;
//import java.util.Date;
import javax.activation.*;
//import java.io.*;
public class sendMail {
       // 21-30行把本程序所用变量进行定义。 具体在main中对它们赋植。
private MimeMessage mimeMsg; //MIME邮件对象
private Session session; //邮件会话对象
private Properties props; //系统属性
//private boolean needAuth = false; //smtp是否需要认证
private String username = ""; //smtp认证用户名和密码
private String passWord = "";
private Multipart mp; //Multipart对象,邮件内容,标题,附件等内容均添加到其中后再生成//MimeMessage对象
public sendMail(String smtp)
{
	setSmtpHost(smtp);
 createMimeMessage();
 }
/**
* @param hostName String
*/
public void setSmtpHost(String hostName)
 {
System.out.println("设置系统属性：mail.smtp.host = "+hostName);
if(props == null)props = System.getProperties(); //获得系统属性对象
props.put("mail.smtp.host",hostName); //设置SMTP主机
}/*** @return boolean*/
public boolean createMimeMessage()
{
	try{
System.out.println("准备获取邮件会话对象！");
session = Session.getDefaultInstance(props,null); //获得邮件会话对象
}
catch(Exception e)
{System.err.println("获取邮件会话对象时发生错误！"+e);
return false;
}
System.out.println("准备创建MIME邮件对象！");
try{
mimeMsg = new MimeMessage(session); //创建MIME邮件对象 
mp = new MimeMultipart(); //mp 一个multipart对象 
                                   //Multipart is a container that holds multiple body parts.
return true;
}
catch(Exception e)
{
System.err.println("创建MIME邮件对象失败！"+e);
return false;
}
}
/**
* @param need boolean
*/
public void setNeedAuth(boolean need) {
System.out.println("设置smtp身份认证：mail.smtp.auth = "+need);
if(props == null)props = System.getProperties();
if(need){
props.put("mail.smtp.auth","true");
}else{
props.put("mail.smtp.auth","false");
}
}
/**
* @param name String
* @param pass String
*/
public void setNamePass(String name,String pass)
 {
      System.out.println("程序得到用户名与密码");
username = name;
passWord = pass;
}
/**
* @param mailSubject String
* @return boolean
*/
public boolean setSubject(String mailSubject) {
System.out.println("设置邮件主题！");
try{
mimeMsg.setSubject(mailSubject);
return true;
}
catch(Exception e) {
System.err.println("设置邮件主题发生错误！");
return false;
}
}
/**
* @param mailBody String
*/
public boolean setBody(String mailBody)
 {
try
  {
        System.out.println("设置邮件体格式");
   BodyPart bp = new MimeBodyPart();
   bp.setContent("<meta http-equiv=Content-Type content=text/html; charset=gb2312>"
   +mailBody,"text/html;charset=GB2312");
   mp.addBodyPart(bp);
   return true;
  }
catch(Exception e)
   {
       System.err.println("设置邮件正文时发生错误！"+e);
       return false;
   }
}
/**
* @param name String
* @param pass String
*/
public boolean addFileAffix(String me) {
System.out.println("增加邮件附件："+me);

try{
BodyPart bp = new MimeBodyPart();
FileDataSource fileds = new FileDataSource(me);
bp.setDataHandler(new DataHandler(fileds));
bp.setFileName(fileds.getName());
mp.addBodyPart(bp);
return true;
}
catch(Exception e){
System.out.println("增加邮件附件："+me+"发生错误filename");
return false;
}
}
/**
* @param name String
* @param pass String
*/
public boolean setFrom(String from) {
System.out.println("设置发信人！");
try{
mimeMsg.setFrom(new InternetAddress(from)); //设置发信人
return true;
}
catch(Exception e)
{ return false; }
}
 /**
* @param name String
* @param pass String
*/
public boolean setTo(String to)
{
  System.out.println("设置收信人");
  if(to == null)return false;
try
      {
            mimeMsg.setRecipients(Message.RecipientType.TO,InternetAddress.parse(to));
            return true;
      }
catch(Exception e)
    { return false; }
}
/**
* @param name String
]* @param pass String
*/
public boolean setCopyTo(String copyto)
{
       System.out.println("发送附件到");
if(copyto == null)return false;
try{
mimeMsg.setRecipients(Message.RecipientType.CC,(Address[])InternetAddress.parse(copyto));
return true;
}
catch(Exception e)
{ return false; }
}
/**
* @param name String
* @param pass String
*/
public boolean sendout()
{
try
{
mimeMsg.setContent(mp);
mimeMsg.saveChanges();
System.out.println("正在发送邮件....");
Session mailSession = Session.getInstance(props,null);
Transport transport = mailSession.getTransport("smtp"); //
transport.connect((String)props.get("mail.smtp.host"),username,passWord);
transport.sendMessage(mimeMsg,mimeMsg.getRecipients(Message.RecipientType.TO));
//transport.send(mimeMsg);
System.out.println("发送邮件成功！");
transport.close();
return true;
}
catch(Exception e)
     {
          System.err.println("邮件发送失败！"+e);
     return false;
     }
}
/**
* Just do it as this
*/
public static void main(String[] args) 
{
String mailbody = "hello. This is a testing.";
sendMail themail = new sendMail("smtp.qq.com");
themail.setNeedAuth(true);
if(themail.setSubject("java邮箱测试，附件为一helloword程序") == false) return;
if(themail.setBody(mailbody) == false) return;
if(themail.setTo("123456@qq.com") == false) return;
if(themail.setFrom("1111@qq.com") == false) return; 
if(themail.addFileAffix("c:/Test.java") == false) return; //附件在本地机子上的绝对路径
themail.setNamePass("1111","123456"); //用户名与密码
if(themail.sendout() == false) return; 
}
}
