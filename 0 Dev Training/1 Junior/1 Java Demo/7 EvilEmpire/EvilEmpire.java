//file: EvilEmpire.java
import java.net.*;
  
public class EvilEmpire {
  public static void main(String[] args) throws Exception{
    try {
      Socket s = new Socket("10.130.16.5", 80);
      System.out.println("Connected!");
    }
    catch (SecurityException e) {
      System.out.println("SecurityException: could not connect.");
    }
  }
}
