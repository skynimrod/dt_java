/**
 * Add one sentence class summary here.
 * Add class description here.
 *
 * @author lxx
 * @version 1.0, 2004-11-16
 */
public class TestCmd {
    public TestCmd(){}
   /* public  void main(String args[]){
        try {
          Process process = Runtime.getRuntime().exec("cmd.exe  /c  start  http://www.csdn.net");  //登录网站
          Process process = Runtime.getRuntime().exec("cmd.exe  /c  start  ping 10.144.98.100");  //调用Ping命令
        }catch (Exception  e)
        {
            e.printStackTrace();
            } 
       
      }
    }  */

//在项目下建立一个名为hello的文件夹
    public static void main(String[] args) {
        System.out.println(System.getProperty("user.dir"));
        createFolder("hello");
      }

     private static void createFolder(String folderName) {
       String temp = System.getProperty("user.dir") + java.io.File.separator+ folderName;
       java.io.File f = new java.io.File(temp);
       f.mkdirs();
     }

 }