package jrJava.alienInvader;

import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Composite;
import java.awt.Graphics2D;

import resources.DrawingBoard;

public class CloakAlien extends SimpleAlien {

	protected int cloakStartY = Coordinator.SCREEN_HEIGHT/10;
	protected int cloakCompleteY = Coordinator.SCREEN_HEIGHT/2;
	protected int cloakStopY = Coordinator.SCREEN_HEIGHT*4/5;
	
	
	public CloakAlien(int x, int xSpeed){
		super(x, xSpeed);
	}
	

	public void draw(DrawingBoard board){
		Graphics2D canvas = board.getCanvas();
		
		float transparency = 1;
		if(y>=cloakStartY && y<=cloakCompleteY){
			transparency = 1 - ((float)y-cloakStartY)/(cloakCompleteY-cloakStartY);
		}
		else if(y>cloakCompleteY && y<cloakStopY){
			transparency = 0;
		}
		
		Composite original = canvas.getComposite();
		Composite composite = AlphaComposite.getInstance(AlphaComposite.SRC_OVER, transparency);
		canvas.setComposite(composite);
		
		count++;
		if(count%drawCycle<drawCycle/2) canvas.drawImage(image1, x-WIDTH/2, y-HEIGHT, board);
		else canvas.drawImage(image2, x-WIDTH/2, y-HEIGHT, board);
		
		if(collidedWithShip){
			canvas.setColor(Color.green);
			canvas.drawOval(x-WIDTHOfExplosion/2, y-WIDTHOfExplosion/2, WIDTHOfExplosion, WIDTHOfExplosion);
			Coordinator.gameOver = true; // call it the gameOver.
		}
	
		canvas.setComposite(original); 
	}

	
}

























