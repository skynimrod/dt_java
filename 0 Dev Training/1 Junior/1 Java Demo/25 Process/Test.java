import java.io.*;

public class Test {

       public static void main(String[] args) {

              File directory  = new File(".");

              try {

                     File newPath = new File(directory.getCanonicalPath()+"NewFolder");

                     newPath.mkdir();

              }catch(Exception exp)

              {

                     exp.printStackTrace();

              }

       }

}

//File directory       = new File(".");

//directory.getCanonicalPath();ȡ�õ�ǰ·��