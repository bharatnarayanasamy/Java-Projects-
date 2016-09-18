package jrJava.alienInvader;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;

import resources.DrawingBoard;
import resources.SoundPlayer;


public class Torpedo {

	private int x, y; // center, top
	private int vx, vy; // vy>0
	private boolean collidedWithAlien, collidedWithMissile;

	private static Image image;
	//private static  Color color;
	public static final int WIDTH, HEIGHT;
	private static Image explosionImage, smallExplosionImage;
	public static int widthOfExplosion, widthOfSmallExplosion;
	private static SoundPlayer explosionSound;

	static {
		
		image = new ImageIcon(Coordinator.RESOURCE_PATH + "torpedo.png").getImage();
		WIDTH = image.getWidth(null);
		HEIGHT = image.getHeight(null);
		
		//color = Color.blue;
		//WIDTH = 4;
		//HEIGHT = 12;

		explosionImage = new ImageIcon(Coordinator.RESOURCE_PATH + "explosion.png").getImage();
		smallExplosionImage = new ImageIcon(Coordinator.RESOURCE_PATH + "explosion_small.png").getImage();
		
		widthOfExplosion = explosionImage.getWidth(null);
		widthOfSmallExplosion = smallExplosionImage.getWidth(null);
		
		//widthOfExplosion = 90;
		//widthOfSmallExplosion = 70;

		explosionSound = new SoundPlayer();
		explosionSound.load(Coordinator.RESOURCE_PATH + "explosion.wav");
	}


	public Torpedo(int _x, int _y, int _vy){
		x = _x;
		y = _y;
		vy = _vy;
	}


	public int getX(){ return x; }
	public int getY(){ return y; }


	public void move(){
		y += vy;

		// check the collision with Alien.
		if(AlienManager.isHit(this)){
			explosionSound.play(); // play the explosion sound.
			collidedWithAlien = true;
		}

		// check the collision with Missile.
		if(MissileManager.isHit(this)){
			explosionSound.play(); // play the explosion sound.
			collidedWithMissile = true;
		}

	}


	public void draw(DrawingBoard board){
		Graphics2D canvas = board.getCanvas();
		canvas.drawImage(image, x-WIDTH/2, y, board);
		//canvas.setColor(color);
		//canvas.drawRect(x-WIDTH/2, y, WIDTH, HEIGHT); 

		if(collidedWithAlien){
			canvas.drawImage(explosionImage, x-widthOfExplosion/2, y-widthOfExplosion/2, board);
			//canvas.setColor(Color.orange);
			//canvas.fillOval(x-widthOfExplosion/2, y-widthOfExplosion/2, widthOfExplosion, widthOfExplosion);
			TorpedoManager.remove(this);// I die.  
		}
		else if(collidedWithMissile){
			canvas.drawImage(smallExplosionImage, x-widthOfSmallExplosion/2, y-widthOfSmallExplosion/2, board);
			//canvas.setColor(Color.red);
			//canvas.fillOval(x-widthOfSmallExplosion/2, y-widthOfSmallExplosion/2, widthOfSmallExplosion, widthOfSmallExplosion);
			TorpedoManager.remove(this);// I die.    
		}
	}


}











