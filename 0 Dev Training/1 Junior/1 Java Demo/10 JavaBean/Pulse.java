//file: Pulse.java   , Server side
import java.net.*; 
import java.io.*; 
 
public class Pulse { 
    public static void main( String [] argv ) throws IOException { 
        DatagramSocket s =
          new DatagramSocket( Integer.parseInt(argv[0]) ); 
 
        while ( true ) { 
            DatagramPacket packet =
              new DatagramPacket(new byte [1024], 1024); 
            s.receive( packet ); 
            String message = new String( packet.getData( ) ); 
            System.out.println( "Heartbeat from: "
              + packet.getAddress(  ).getHostName( )
              + " - " + message ); 
        } 
    } 
}
