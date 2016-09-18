package MyFlappyBirdV2;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import resources.DrawingBoard;

public class Bird implements KeyListener{
	
	private int x, y; // center of bird/ball
	private int radius;
	private Color color;
	private static int speedUp, speedDown;
	private int majorOvalRadius;
	private int minorOvalRadius;
	static{
		speedUp = 40;
		speedDown = 40;
	}
	
	public Bird(int _x, int _y, int _radius, Color _color){
		x = _x;
		y = _y;
		radius = _radius;
		color = _color;
	}
	
	
	
	public void moveUp(){
		
		y -= speedUp;
		//System.out.println("y = " + y);
	}
	
	public void manualMoveDown(){
		y += speedDown;
	}
	
	
	public void moveDown(){
		if(y>=Coordinator.SCREEN_HEIGHT - 10 - radius) {
			y = Coordinator.SCREEN_HEIGHT - 10 - radius;
		}
		else if(y<=radius+10){
			y = radius + 15; 
		}
		else {
			y += 2;
		}
	}
	
	public boolean isHit(BackgroundAndTrees bat){
		
		int z = bat.getY();
		if(z<500) {
			
			if((((y-radius)<=z) && ((x+radius)>=bat.getX())) || (((y+radius)>=(z+bat.getHeight())) && (x+radius)>=bat.getX()) ){
				return true;
			}
		}
		else {
			if((((y-radius)<=(z-bat.getHeight())) && ((x+radius)>=bat.getX())) || (((y+radius)>=z) && (x+radius)>=bat.getX()) ){
				return true;
			}
		}
		
		return false;
		
		
		
		
		/*int z = bat.getY();
		if(bat.getY()>(600-bat.getHeight())) z = bat.getY()-bat.getHeight();
		
		if(((y-radius) <= (z + bat.getHeight())
			&& (y+radius) >= z)
			&& ((bat.getX() <= (x+radius)) && (bat.getX() >= x))){
			return true;
		}
		
		
		return false;*/
	}
	
	public void draw(DrawingBoard board){
		majorOvalRadius = 2*radius;
		minorOvalRadius = radius;
		Graphics2D canvas = board.getCanvas();
		canvas.setColor(color);
		canvas.fillOval(x-radius, y-radius, 2*radius, 2*radius);
		canvas.setStroke(new BasicStroke(1));
		canvas.drawLine(x+radius-5, y-5 , x+radius+25, y);
		canvas.drawLine(x+radius-5, y+5, x + radius + 25, y);
		canvas.fillOval(x-(radius+2*majorOvalRadius), y-minorOvalRadius, 2*majorOvalRadius, 2*minorOvalRadius);
		canvas.setColor(Color.black);
		canvas.fillOval(x+radius/2, y-radius/4, 5, 5);
	}
	
	@Override
	public void keyTyped(KeyEvent e) {
	}

	@Override
	public void keyPressed(KeyEvent e) {
		int keyCode = e.getKeyCode();
		//System.out.println("Hello");
		if(keyCode==KeyEvent.VK_UP){
			moveUp();
		}
		else if(keyCode==KeyEvent.VK_DOWN){
			manualMoveDown();
		}
		else if(keyCode==KeyEvent.VK_A){
			moveLeft();
		}
		else if(keyCode==KeyEvent.VK_S){
			moveRight();
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void moveLeft(){ x -= 10;}
	public void moveRight(){ x += 60;}
	
}
