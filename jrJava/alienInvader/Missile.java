package jrJava.alienInvader;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;

import resources.DrawingBoard;


public class Missile {

	private int x, y; // center, bottom
	private int vx, vy; // vy>0
	private boolean collidedWithShip;
	
	private static Image image;
	//private static Color color;
	public static final int WIDTH, HEIGHT;
	private static int widthOfExplosion;
	
	
	static{
		image = new ImageIcon(Coordinator.RESOURCE_PATH + "missile.png").getImage();
		WIDTH = image.getWidth(null);
		HEIGHT = image.getHeight(null);
		
		//color = Color.red;
		//WIDTH = 4;
		//HEIGHT = 10;
		
		widthOfExplosion = 100;
	}
	
	
	public Missile(int _x, int _y, int _vy){
		x = _x;
		y = _y;
		vy = _vy;
	}
	
	
	public int getX(){ return x; }
	public int getY(){ return y; }
	
	
	public boolean isHit(Torpedo torpedo){
		return torpedo.getX()>=x-WIDTH/2-Torpedo.WIDTH/2 &&
			   torpedo.getX()<=x+WIDTH/2+Torpedo.WIDTH/2 &&
			   torpedo.getY()>=y-HEIGHT-Torpedo.HEIGHT   &&
			   torpedo.getY()<=y;
	}
	
	
	public void move(Ship ship){
		y += vy;
		
		// check collision with the Ship.
		if(ship.isHit(this)){
			// play the explosion sound.
			// draw the explosion image.
			collidedWithShip = true;
		}
	}
	
	
	public void draw(DrawingBoard board){
		Graphics2D canvas = board.getCanvas();
		canvas.drawImage(image, x-WIDTH/2, y-HEIGHT, board);
		//canvas.setColor(color);
		//canvas.drawRect(x-WIDTH/2, y-HEIGHT, WIDTH, HEIGHT); 
		
		if(collidedWithShip){
			canvas.setColor(Color.pink);
			canvas.drawOval(x-widthOfExplosion/2, y-widthOfExplosion/2, widthOfExplosion, widthOfExplosion);
			Coordinator.gameOver = true; // call it the gameOver.
		}
	}
	
}












