package jrJava.alienInvader;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;

import resources.DrawingBoard;


public class SimpleAlien extends Alien {

	public SimpleAlien(int x, int vx){
		super(x, vx);
	}

	public void launchMissile(){
		MissileManager.add( new Missile(x, y+Missile.HEIGHT, 2*vy) );
	}
	

	public void move(Ship ship){
		x += vx;
		y += vy;

		// check collision with the Ship.
		if(ship.isHit(this)){
			// play the explosion sound.
			// draw the explosion image.
			collidedWithShip = true;
			// Coordinator.gameOver = true; // call it the gameOver.
		}

		// Randomly, fires missiles.
		if(Math.random()>0.97) launchMissile();
		

		if(x<WIDTH/2){
			x = WIDTH/2;
			vx = -vx;
		}
		else if(x>Coordinator.SCREEN_WIDTH-WIDTH/2){
			x = Coordinator.SCREEN_WIDTH-WIDTH/2;
			vx = -vx;
		}

	}


	public void draw(DrawingBoard board){
		Graphics2D canvas = board.getCanvas();
		
		count++;
		if(count%drawCycle<drawCycle/2) canvas.drawImage(image1, x-WIDTH/2, y-HEIGHT, board);
		else canvas.drawImage(image2, x-WIDTH/2, y-HEIGHT, board);
		
		//canvas.setColor(bodyColor);
		//canvas.drawRect(x-WIDTH/2, y-HEIGHT, WIDTH, HEIGHT);
		//canvas.setColor(eyeColor);
		//canvas.fillOval(x-WIDTH/4-eyeRadius, y-HEIGHT*3/4, 2*eyeRadius, 2*eyeRadius); 
		//canvas.fillOval(x+WIDTH/4-eyeRadius, y-HEIGHT*3/4, 2*eyeRadius, 2*eyeRadius); 
	
		if(collidedWithShip){
			canvas.setColor(Color.green);
			canvas.drawOval(x-WIDTHOfExplosion/2, y-WIDTHOfExplosion/2, WIDTHOfExplosion, WIDTHOfExplosion);
			Coordinator.gameOver = true; // call it the gameOver.
		}
	
	}

}












