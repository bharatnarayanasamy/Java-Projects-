package jrJava.memoryGameInheritance;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;


public class Card {

	protected static Image backImage;
	public static final int SIZE;
	protected static Color innerBorderColor, borderColor;
	protected static int inset, padding;
	
	protected Image image;
	protected int x, y; // left, top
	protected boolean shouldReveal;
	protected boolean matched;
	
	
	static {
		backImage = new ImageIcon("jrJava/memoryGame/backside.png").getImage();
		SIZE = 100;
		innerBorderColor = Color.black;
		borderColor = Color.lightGray;
		inset = 10;
		padding = 5;
	}
	
	
	public Card(int x, int y, Image image){
		this.x = x;
		this.y = y;
		this.image = image;
	}
	
	
	public boolean hasSameImage(Card card){
		return image.equals(card.image);
	}
	
	
	
	public boolean isSelected(MouseEvent e){
		if(matched) return false;
		return e.getX()>x && e.getX()<x+SIZE && e.getY()>y && e.getY()<y+SIZE;
	}
	
	
	public void matched(){ matched = true; }
	public boolean isMatched(){ return matched; } 
	
	
	public void show(){ shouldReveal = true; }
	public void hide(){ shouldReveal = false; }
	
	
	public void draw(Graphics g){
		
		if(matched) return;
		
		if(shouldReveal){
			g.drawImage(image, x+inset, y+inset, SIZE-2*inset, SIZE-2*inset, null);
		}
		else {
			g.drawImage(backImage, x+inset, y+inset, SIZE-2*inset, SIZE-2*inset, null);
		}
		
		g.setColor(borderColor);
		g.drawRect(x, y, SIZE, SIZE); 
		g.setColor(innerBorderColor);
		g.drawRect(x+padding, y+padding, SIZE-2*padding, SIZE-2*padding);
	}
	
}
















