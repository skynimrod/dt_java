import java.io.*;
import java.net.*;

public class Server extends ServerSocket
{
	private static final int SERVER_PORT = 10000;

	public Server() throws IOException
	{ 
		super(SERVER_PORT);

		System.out.println("enter Server...");
		
		  
		try   {
		    while (true) {
			System.out.println("before accept...");
			    
			Socket socket = accept();
			    
			System.out.println("after accept...");
			    
			new CreateServerThread(socket);
		    }
		}
		catch (IOException e)
		{}
		finally {
		  close();
		}
	}
	    
	//--- CreateServerThread
	class CreateServerThread extends Thread
	{
		private Socket                  	client;
		private BufferedReader  	in;
		private PrintWriter             	out;
		    
		public CreateServerThread(Socket s) throws IOException
		{
			System.out.println("enter CreateServerThread...");
			
			client = s;
			in = new BufferedReader(new InputStreamReader(client.getInputStream()));
			
			out = new PrintWriter(client.getOutputStream(), true);
			out.println("--- Welcome ---");
			start();
		}
		
		public void run()
		{
			try 
			{
				String line = in.readLine();
				
				System.out.printf("收到消息:%s\n", line);
			    
				while (!line.equals("bye"))    
				{
					String msg = createMessage(line);
					System.out.printf("待发送消息:%s\n", msg);
					out.println(msg);
					line = in.readLine();
				}
			
				out.println("--- See you, bye! ---");
				client.close();
			}
			catch (IOException e)
			{
				System.out.printf("异常！已经断开!");
			}
		}
		
		private String createMessage(String line)
		{
			line = "hello, world";
			
			return line;
		}
		
	}
	
	public static void main(String[] args) throws IOException
	{
		System.out.println("Server Start...");
		new Server();
	}
}