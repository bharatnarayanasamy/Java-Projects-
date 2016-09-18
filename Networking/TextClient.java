package Networking;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

import java.io.*;

public class TextClient {
	
	private String serverIPAddress = "192.168.1.20";
	private int serverPortNumber = 6666;
	
	public void connect() throws Exception{
		
		Socket s = new Socket(serverIPAddress, serverPortNumber);
	
		OutputStream os = s.getOutputStream();
		OutputStreamWriter osw = new OutputStreamWriter(os);
		PrintWriter pw = new PrintWriter(osw);
		
		pw.println("Hi.");
		pw.flush();
		pw.close();
	}

	public static void main(String[] args) throws Exception{

		TextClient client = new TextClient();
		client.connect();
		
	}

}
