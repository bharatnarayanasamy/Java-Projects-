package jrJava.blinking3Balls;




import java.awt.Color;

import java.awt.Graphics2D;




import resources.DrawingBoard;







public class Wall {




	private int left = 50;

	private int top = 50;

	private int width = 700;

	private int height = 500;

	private Color color = Color.blue;

	private int changeRate = 1; // if +, it will shrink, if -, it will expand.







	public Wall(){ }

	public int getLeft(){ return left+20;}
	public int getTop(){ return top+20;}
	public int getWidth(){ return width-40;}
	public int getHeight(){ return height-40;}


	public void changeSize(){

		left += changeRate;
		top += changeRate;
		width -= 2*changeRate;
		height -= 2*changeRate;


		if(width==400){
			changeRate = -1;
		}
		else if(width==710){
			changeRate = 1;
		}
	}


	public void draw(DrawingBoard board){

		Graphics2D canvas = board.getCanvas();

		canvas.setColor(color);

		canvas.drawRect(left, top, width, height); 

	}


}