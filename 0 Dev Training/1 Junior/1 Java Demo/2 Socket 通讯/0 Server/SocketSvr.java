import java.net.*;
import java.io.*;

public class SocketSvr {
	public static void main( String args[] ) {
		ServerSocket server = new ServerSocket( 8889 );
			
		Socket client = server.accept();

		BufferedReader in = new BufferedReader( new InputSgtreamReader( client.getInputStream() ) );

		PrintWriter out = new PrintWriter( Client.getOutputStream() );

		while( true ) {
			String str = in.readLine();

			System.out.println();

			out.println("has receive...");

			if ( str.equals("End") ) {
				break;
			}
			
			System.out.println( in.readLine() );
		}
	}
}