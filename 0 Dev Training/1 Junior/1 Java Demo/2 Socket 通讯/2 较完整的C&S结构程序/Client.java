import java.io.*;
import java.net.*;

public class Client
{
	Socket 		socket;
	BufferedReader 	in;
	PrintWriter 		out;
	PrintWriter  	aout;
	
	public Client()
	{
		aout = new PrintWriter( System.out, true );
		
		aout.printf("::::%s\n", "hello world");
		System.out.printf("::::%s\n", "hello world");
		
		try
		{
			socket = new Socket("192.168.1.100", 10000);
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new PrintWriter(socket.getOutputStream(),true);
			BufferedReader line = new BufferedReader(new InputStreamReader(System.in));
    
			while(true)
			{
				String str = line.readLine();
				
				out.println(str);
				  
				out.flush();
				  
				if ( str.equals("End")) {
					break;
				}
				  
				System.out.println(in.readLine());
			}
      
			line.close();
			out.close();
			in.close();
			socket.close();
		}
		catch (IOException e)
		{
			System.out.printf("服务器已经断开!");

		}
	}
		
	public static void main(String[] args)
	{
		new Client();
	}
}