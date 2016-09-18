package jrJava.memoryGame;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;


public class Card {

	private static Image backImage;
	public static final int SIZE;
	private static Color innerBorderColor, borderColor;
	private static int inset, padding;
	
	private Image image;
	private int x, y; // left, top
	private boolean shouldReveal;
	private boolean matched;
	
	
	static{
		
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
	
	
	public void swap(Card card){
		Image temp = image;
		image = card.image;
		card.image = temp;
 	}
	
	public boolean isSelected(MouseEvent e){
		if(matched==true) return false;
		return (e.getX()>x)&&
   		       (e.getX()<x+SIZE)&&
   		       (e.getY()>y)&&
   		       (e.getY()<y+SIZE);
	}
	
	public boolean hasSameImage(Card card){
		return image.equals(card.image);
	}
	
	public void show(){ shouldReveal = true;}
	public void hide(){ shouldReveal = false;}

	public void matched(){ matched = true;}
	public boolean isMatched(){ return matched; }
	
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
		g.drawRect(x-padding, y-padding, SIZE+padding*2, SIZE+padding*2);
	}


}




