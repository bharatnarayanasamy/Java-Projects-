package jrJava.memoryGameInheritance;

import java.awt.Graphics;
import java.awt.Image;

public class FlashingCard extends Card {

	protected int flashingInterval;
	protected int flashingDuration;
	protected long cTime, nextFlashingTime;
	
	
	public FlashingCard(int x, int y, Image image){
		super(x, y, image);
		flashingInterval = (int) (3000 + 4000*Math.random());
		flashingDuration = 200;
		nextFlashingTime = System.currentTimeMillis() + flashingInterval;
	}
	
	
	protected boolean shouldFlash(){
		cTime = System.currentTimeMillis();
		if(cTime<nextFlashingTime) return false;
		else if(cTime<nextFlashingTime + flashingDuration) return true;
		else {
			nextFlashingTime += flashingInterval;
			return false;
		}
	}
	
	
	public void draw(Graphics g){
		
		if(matched) return;
		
		if(shouldReveal){
			g.drawImage(image, x+inset, y+inset, SIZE-2*inset, SIZE-2*inset, null);
		}
		else {
			if(shouldFlash()) g.drawImage(image, x+inset, y+inset, SIZE-2*inset, SIZE-2*inset, null);
			else g.drawImage(backImage, x+inset, y+inset, SIZE-2*inset, SIZE-2*inset, null);
			
		}
		
		g.setColor(borderColor);
		g.drawRect(x, y, SIZE, SIZE); 
		g.setColor(innerBorderColor);
		g.drawRect(x+padding, y+padding, SIZE-2*padding, SIZE-2*padding);
		
	}
}











