//file: ServerRemote.java
import java.rmi.*; 
import java.util.*; 
 
public interface ServerRemote extends Remote { 
    Date getDate( ) throws RemoteException; 
    Object execute( WorkRequest work ) throws RemoteException; 
}
