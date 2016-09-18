package networking2;

import java.io.*;
import java.net.*;



public class ChatClient {
	private String serverIPAddress = "192.168.1.21";
	private int serverPortNumber = 5454;
	
	public void connect() throws Exception{
		
		Socket s = new Socket(serverIPAddress, serverPortNumber);
	
		MessageReceiver mr = new MessageReceiver(s.getInputStream());		
		MessageSender ms = new MessageSender(s.getOutputStream());	
		
		new Thread(mr).start();
		
		//mr.receive();
		ms.send();
	
	}

	public static void main(String[] args) throws Exception{

		ChatClient client = new ChatClient();
		client.connect();
		
	}


}
