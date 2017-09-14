import java.net.*;
import java.io.*;

public class SocketServer {
	public static void main( String args[]) throws IOException{
		ServerSocket server = new ServerSocket(8889);

		Socket client= server.accept();

		BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));

		PrintWriter out = new PrintWriter(client.getOutputStream());

		while(true){
			String str = in.readLine();

			//System.out.println();
			System.out.println(str);

      out.println("has receive...");
      out.flush();

      if (str.equals("End"))
					break;
		}

		server.close();
	}
}