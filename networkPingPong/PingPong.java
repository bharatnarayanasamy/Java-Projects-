package networkPingPong;

import java.net.ServerSocket;
import java.net.Socket;

import resources.DrawingBoard;
import resources.Timer;

public class PingPong {

	public static final int WIDTH = 400, HEIGHT = 300;
	
	
	public static void main(String[] args) throws Exception {

		char mode = 'c';
		System.out.println("What are you? Server(s) or Client(c)");
		if((char)System.in.read()=='s'){
			mode = 's';
		}
		
		//form the network connection.
		Socket s;
		if(mode=='s'){
			ServerSocket ss =  new ServerSocket(5454);
			s = ss.accept();
		}
		else {
			s = new Socket("127.0.0.1", 5454);
		}
		
		MessageSender sender = new MessageSender(s.getOutputStream());
		MessageReceiver receiver = new MessageReceiver(s.getInputStream());
		new Thread(receiver).start();
		
		
		//prepare the game components.
		DrawingBoard board = new DrawingBoard(WIDTH, HEIGHT);
		Timer timer = new Timer();

		Deflector deflector = new Deflector(mode, true);
		Deflector dummy = new Deflector(mode, false);
		board.addMouseMotionListener(deflector); 
		
		deflector.setMessageSender(sender);
		receiver.setDeflector(dummy);
		
		Ball ball = new Ball(mode);
		ball.setMessageSender(sender);
		ball.setDeflector(deflector);
		receiver.setBall(ball); 
		
		int interval = 30;
		long nextTime = System.currentTimeMillis() + interval;
		int sleepTime;
		
		while(true){
			
			
			ball.move();
			
			board.clear();
			ball.draw(board); 
			deflector.draw(board);
			dummy.draw(board);
			board.repaint();
			
			sleepTime = (int) (nextTime - System.currentTimeMillis());
			if(sleepTime > 0) timer.pause(sleepTime);
		
			nextTime += interval;
			
		}
		
	}

}








