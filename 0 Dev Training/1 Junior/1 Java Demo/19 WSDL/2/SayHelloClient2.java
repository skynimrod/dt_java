import  org.apache.axis.client.Call;  
import  org.apache.axis.client.Service;  
import  javax.xml.namespace.QName;  
import  javax.xml.rpc.ServiceException;  
import  java.net.MalformedURLException;  
import  java.rmi.RemoteException;  
 
public  class  SayHelloClient2  
{  
       public  static  void  main(String[]  args)  
           {  
               try {  
   			String  endpoint = "http://localhost:9900/axis/HelloClient.jws";  
 
       			Service  service  =  new  Service();  
                       Call  call  =  null;  
 
                       call  =  (Call)  service.createCall();  
 
                       call.setOperationName(new  QName( "http://localhost:9900/axis/HelloClient.jws", "getName"));  
                       call.setTargetEndpointAddress(new  java.net.URL(endpoint));  
 
                       String  ret  =  (String)  call.invoke(new  Object[]  {"zhangsan"});  
                       System.out.println("return  value  is  "  +  ret);  

			
                       call.setOperationName(new  QName( "http://localhost:9900/axis/Calculator.jws", "add"));  
                       call.setTargetEndpointAddress(new  java.net.URL("http://localhost:9900/axis/Calculator.jws"));  
 
                       int  ret1  =  (int)  call.invoke(new  Object[]  {2,5});  
                       System.out.println("return  value  is  "  +  ret1 );  

			
               }    
               catch  (Exception  ex)   {  
             		ex.printStackTrace();  
               }  
       }  
}  

