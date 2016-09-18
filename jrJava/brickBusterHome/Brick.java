package jrJava.brickBusterHome;

import java.awt.Color;
import java.awt.Graphics2D;

import resources.DrawingBoard;


public class Brick {

	private int x,y;
	private int width;
	private int height;
	private Color color;

	private boolean isBottomOne;
	private boolean busted;


	public Brick(int _x, int _y, int _width, int _height, boolean _isBottomOne){
		x = _x;

		y = _y;
		width = _width;
		height = _height;
		isBottomOne = _isBottomOne;

		color = new Color((int)(Math.random()*256),(int)(Math.random()*256),(int)(Math.random()*256));
		//color = new Color(0xffff0000);
	}




	public boolean isHit(Ball ball){

		if(busted) return false;

		// check the collision on the left hand side.
		if(ball.getX() >= x-ball.getRadius() &&
		   ball.getX() < x + width/2 && 
		   ball.getY() > y && 
		   ball.getY()<= y+height){
			
			ball.setX(x-ball.getRadius());
			ball.setVX(-ball.getVX());
			
			busted = true;
			return true;
		}
		// check the collision on the right hand side.
		if(ball.getX() > x + width/2 &&
				   ball.getX() <= x + width + ball.getRadius() && 
				   ball.getY() >= y && 
				   ball.getY() < y+height){
					
					ball.setX(x + width + ball.getRadius());
					ball.setVX(-ball.getVX());
					
					busted = true;
					return true;
		}
		// check the collision on the bottom side.
		if(isBottomOne &&
		   ball.getX() > x - ball.getRadius() &&
		   ball.getX() <= x + width + ball.getRadius() &&
		   ball.getY() >= y+height &&
		   ball.getY() <= y+height+ball.getRadius()){
			
			ball.setY(y+height+ball.getRadius());
			ball.setVY(Math.abs(ball.getVY()));
			
			busted = true;
			return true;
		}


		return false;
	}

	public void draw(DrawingBoard board){
		if (busted) return;

		Graphics2D canvas = board.getCanvas();
		canvas.setColor(color);
		canvas.fillRect(x,y,width,height);
		canvas.setColor(Color.black);
		canvas.drawRect(x,y,width,height);
	}
	public void setAsBottomBrick(){ isBottomOne =true;}
	public void shiftUp(){ y -= height;}
}

