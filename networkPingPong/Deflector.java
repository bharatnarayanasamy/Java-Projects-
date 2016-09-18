package networkPingPong;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import resources.DrawingBoard;

public class Deflector implements MouseMotionListener {

	public int x, y;
	public int w = 10, h = 50;
	private Color color;
	
	private MessageSender sender; 
	private int lastY;
	private long lastTime, currentTime;
	private int vy;
	private int weight = 5;
	
	
	public Deflector(char mode, boolean isActive){
		if(mode=='c'){
			if(isActive){
				x = 20; color = Color.blue;
			}
			else {
				x = PingPong.WIDTH-w-20; color = Color.green;
			}
		}
		else {
			if(isActive){
				x = PingPong.WIDTH-w-20; color = Color.green;
			}
			else {
				x = 20; color = Color.blue;
			}
		}
		
		y = PingPong.HEIGHT/2 - h/2;
	}
	
	
	
	public void setMessageSender(MessageSender sender){ this.sender = sender; }
	
	
	public int getVY(){
		if(System.currentTimeMillis() - lastTime > 50) return 0;
		return vy; 
	}
	
	
	public void mouseDragged(MouseEvent e) {
		y = e.getY();
		sender.send("" + y);  
		
		currentTime = System.currentTimeMillis();
		
		vy = (y-lastY)/(int)((currentTime-lastTime + 1))/weight;
		lastY = y;
		lastTime = currentTime;
	} 

	
	public void update(String msg){
		y = Integer.parseInt(msg);
	}
	
	
	public void draw(DrawingBoard board){
		Graphics2D canvas = board.getCanvas();
		canvas.setColor(color);
		canvas.fillRect(x, y, w, h);
		canvas.setColor(Color.black);
		canvas.drawRect(x, y, w, h);
	}
	
	
	public void mouseMoved(MouseEvent e) {}
	

}






