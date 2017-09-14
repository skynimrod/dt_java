import java.lang.*;
import java.net.*;
import java.io.*;

public class SocketClient {
	/**
	 * @param args
	 */
	public static void main( String args[]) throws IOException{
		Socket server = new Socket(InetAddress.getLocalHost(),8889);// throws UnknownHostException;
		//        IOException;
		
		BufferedReader in=new BufferedReader(new InputStreamReader(server.getInputStream()));
		
		PrintWriter out = new PrintWriter(server.getOutputStream());
		
		BufferedReader wt = new BufferedReader( new InputStreamReader(System.in));
		
		while(true){
			String str = wt.readLine();
			
			out.println(str);
			
			out.flush();
			
			if ( str.equals("End")) {
				break;
			}
			
			System.out.println(in.readLine());
		}
		
		
		server.close();
	}
}