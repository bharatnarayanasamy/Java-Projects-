package networking2;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;



public class ChatServer {

	private int portNumber = 5454;
	
	public void connect() throws Exception{
		
		ServerSocket ss = new ServerSocket(portNumber);
		Socket s = ss.accept();

		MessageReceiver mr = new MessageReceiver(s.getInputStream());		
		MessageSender ms = new MessageSender(s.getOutputStream());	
		
		new Thread(mr).start();
		
		//mr.receive();
		ms.send();
		
	}
	
	public static void main(String[] args) throws Exception{
			
		ChatServer server = new ChatServer();
		server.connect();
		
		
		
	}
}
