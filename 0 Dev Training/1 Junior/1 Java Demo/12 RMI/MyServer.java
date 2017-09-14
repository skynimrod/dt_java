//file: MyServer.java
import java.rmi.*; 
import java.util.*; 
  
public class MyServer  
    extends java.rmi.server.UnicastRemoteObject
    implements ServerRemote {    
  
    public MyServer( ) throws RemoteException { } 
  
    // implement the ServerRemote interface 
    public Date getDate( ) throws RemoteException { 
        return new Date( ); 
    } 
  
    public Object execute( WorkRequest work )
      throws RemoteException {
        return work.execute( ); 
    } 
 
    public static void main(String args[]) { 
        try { 
            ServerRemote server = new MyServer( ); 
            Naming.rebind("NiftyServer", server); 
        } catch (java.io.IOException e) { 
            // problem registering server 
        } 
    } 
}
