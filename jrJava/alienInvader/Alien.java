package jrJava.alienInvader;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;

import resources.DrawingBoard;


public abstract class Alien {

	protected static Image[] images1, images2; 
	
	protected int x, y; // center, bottom
	protected int vx, vy;
	protected Image image1, image2;
	protected int count, drawCycle=12;;
	//protected Color bodyColor, eyeColor;
	protected boolean collidedWithShip;
	
	public static final int WIDTH, HEIGHT;
	//protected static int eyeRadius;
	protected static int WIDTHOfExplosion;

	static {
		
		images1 = new Image[3];
		images1[0] = new ImageIcon(Coordinator.RESOURCE_PATH + "blueAlien_1.png").getImage();
		images1[1] = new ImageIcon(Coordinator.RESOURCE_PATH + "greenAlien_1.png").getImage();
		images1[2] = new ImageIcon(Coordinator.RESOURCE_PATH + "orangeAlien_1.png").getImage();
		
		images2 = new Image[3];
		images2[0] = new ImageIcon(Coordinator.RESOURCE_PATH + "blueAlien_2.png").getImage();
		images2[1] = new ImageIcon(Coordinator.RESOURCE_PATH + "greenAlien_2.png").getImage();
		images2[2] = new ImageIcon(Coordinator.RESOURCE_PATH + "orangeAlien_2.png").getImage();
		
		WIDTH = images1[0].getWidth(null);
		HEIGHT = images1[0].getHeight(null);
		
		//WIDTH = 25;
		//HEIGHT = 25;
		//eyeRadius = 3;
		
		WIDTHOfExplosion = 120;
	}

	
	public Alien(int _x, int _vx){
		x = _x; //(int) (Math.random()*Coordinator.SCREEN_WIDTH);
		y = 0;
		vx = _vx; //(int) (Math.random()*9 - 4);
		vy = (int) (Math.random()*4 + 2);
		
		int randomIndex = (int) (Math.random()*images1.length);
		image1 = images1[randomIndex];
		image2 = images2[randomIndex];
	}
	
	
	/*
	public Alien(int _x, int _y, int _vx, int _vy, Color _bodyColor, Color _eyeColor){
		x = _x;
		y = _y;
		vx = _vx;
		vy = _vy;
		bodyColor = _bodyColor;
		eyeColor = _eyeColor;
	}
	*/
	

	public int getX(){ return x; }
	public int getY(){ return y; }


	public boolean isHit(Torpedo torpedo){
		return torpedo.getX()>=x-WIDTH/2-Torpedo.WIDTH/2 &&
				torpedo.getX()<=x+WIDTH/2+Torpedo.WIDTH/2 &&
				torpedo.getY()>=y-HEIGHT-Torpedo.HEIGHT   &&
				torpedo.getY()<=y;
	}


	public abstract void launchMissile();
	public abstract void move(Ship ship);
	public abstract void draw(DrawingBoard board);

}












