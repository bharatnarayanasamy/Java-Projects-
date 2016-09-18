package networkPingPong;

import java.io.*;


public class MessageReceiver implements Runnable {
	
	private BufferedReader br;
	private Deflector dummy;
	private Ball ball;
	
	public MessageReceiver(InputStream is){
		InputStreamReader isr = new InputStreamReader(is);
		br = new BufferedReader(isr);
	}
	
	public void setDeflector(Deflector dummy){ this.dummy = dummy; }
	public void setBall(Ball ball){ this.ball = ball; }
	
	
	public void run(){ receive(); }
	
	
	public void receive(){
		String msg;
		while(true){
			try {
				msg = br.readLine();
				if(msg.startsWith("B:")) ball.update(msg);
				else dummy.update(msg);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
}





