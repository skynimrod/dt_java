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
          Process process = Runtime.getRuntime().exec("cmd.exe  /c  start  http://www.csdn.net");  //��¼��վ
          Process process = Runtime.getRuntime().exec("cmd.exe  /c  start  ping 10.144.98.100");  //����Ping����
        }catch (Exception  e)
        {
            e.printStackTrace();
            } 
       
      }
    }  */

//����Ŀ�½���һ����Ϊhello���ļ���
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