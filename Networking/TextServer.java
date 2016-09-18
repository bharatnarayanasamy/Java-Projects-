package Networking;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class TextServer {

	private int portNumber = 6666;
	
	public void connect() throws Exception{
		
		ServerSocket ss = new ServerSocket(portNumber);
		Socket s = ss.accept();
		
		InputStream is = s.getInputStream();
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
			
		String message = br.readLine();
		System.out.println(message);
		br.close();
	}
	
	public static void main(String[] args) throws Exception{
			
		TextServer server = new TextServer();
		server.connect();
		
	}

	
}
