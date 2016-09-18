package jrJava.tetris;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import resources.DrawingBoard;

public class Wall implements Drawable {

	public static final int LEFT = 100;
	public static final int RIGHT = 500;
	public static final int TOP = 40;
	public static final int BOTTOM = 600;
	
	
	public boolean isOutside(Block block){
		return block.getX()<LEFT || block.getX()>=RIGHT || block.getY()>=BOTTOM || block.getY()<TOP;
	}
	
	
	public void draw(Graphics g){
		
		g.setColor(Color.lightGray);
		for(int x=LEFT+Block.SIZE; x<RIGHT; x+=Block.SIZE){
			g.drawLine(x, TOP, x, BOTTOM);
		}
		
		for(int y=TOP+Block.SIZE; y<BOTTOM; y+=Block.SIZE){
			g.drawLine(LEFT, y, RIGHT, y);
		}
		
		g.setColor(Color.darkGray); 
		g.drawRect(LEFT, TOP, RIGHT-LEFT, BOTTOM-TOP); 	
	}
}

















