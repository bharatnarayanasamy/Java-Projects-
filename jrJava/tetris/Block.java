package jrJava.tetris;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import resources.DrawingBoard;

public class Block {

	public static final int SIZE = 20;
	private int xRelative, yRelative;
	private int x, y; // left, top
	private Color color;
	
	private boolean markedAsFullRowBlock;
	
	
	public Block(int xRelative, int yRelative, Color color){
		this.xRelative = xRelative;
		this.yRelative = yRelative;
		this.color = color;
	}
	public void markAsFullRowBlock(){
		markedAsFullRowBlock = true;
	}
	
	
	
	public int getX(){ return x; }
	public int getY(){ return y; }
	
	
	public void mirror(){
		xRelative = -xRelative;
	}
	
	
	public void rotate(){
		int temp = yRelative;
		yRelative = -xRelative;
		xRelative = temp;
	}
	
	
	
	public void counterRotate(){
		int temp = -yRelative;
		yRelative = xRelative;
		xRelative = temp;
	}
	
	
	
	public void updateXY(int xCenter, int yCenter){
		x = xCenter + xRelative*SIZE;
		y = yCenter + yRelative*SIZE;
	}
	
	
	public void draw(Graphics g){
		g.setColor(color);
		g.fillRect(x, y, SIZE, SIZE);
		g.setColor(Color.black);
		g.drawRect(x, y, SIZE, SIZE);
		
		if(xRelative==0 && yRelative==0 && !markedAsFullRowBlock){
			g.drawOval(x+SIZE/4, y+SIZE/4, SIZE/2, SIZE/2);
		}
		if(markedAsFullRowBlock){
			g.drawLine(x, y, x+SIZE, y+SIZE);
		}
	}
	
	public void shiftDown(){
		y += SIZE;
	}
	
}
 









