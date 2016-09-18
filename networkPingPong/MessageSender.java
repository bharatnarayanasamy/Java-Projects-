package networkPingPong;

import java.io.*;

public class MessageSender {


	private PrintWriter pw;


	public MessageSender(OutputStream os){
		OutputStreamWriter osw = new OutputStreamWriter(os);
		pw = new PrintWriter(osw);
	}


	public synchronized void send(String msg){
		pw.println(msg);
		pw.flush();
	}

}









