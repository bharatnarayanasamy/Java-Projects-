package jrJava.brickBusterHome;

import java.awt.Color;
import java.awt.Graphics2D;

import resources.DrawingBoard;

public class Wall {

	private int xLeft = 20;
	private int xRight = 520;
	private int yTop = 20;
	private int yBottom = 630;
	private Color color = Color.gray;
	
	public Wall(){ }
	
	
	public int getXLeft(){ return xLeft;}
	public int getXRight(){ return xRight;}
	public int getYTop(){ return yTop;}
	public int getYBottom(){ return yBottom;}
	
	public void draw(DrawingBoard board){
		Graphics2D canvas = board.getCanvas();
		canvas.setColor(color);
		canvas.drawLine(xLeft, yTop, xRight, yTop);
		canvas.drawLine(xLeft, yTop, xLeft, yBottom);
		canvas.drawLine(xRight, yTop, xRight, yBottom);
	}
	
}