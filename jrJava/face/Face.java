package jrJava.face;

import java.awt.Color;
import java.awt.Graphics2D;

import resources.DrawingBoard;

public class Face {

	
		int x = 200;
		int y = 300;
		Color faceColor = Color.gray;
		Color eyeColor = Color.cyan;
		int faceSize = 200;
		int eyeRadius = 15;
		
		boolean isHappy;
		boolean isWinking;
		boolean isCrying;
		boolean isUpset;
	
	
	Face(int _x, int _y, Color _faceColor, Color _eyeColor){
		_x = x;
		_y = y;
		_faceColor = faceColor;
		_eyeColor = eyeColor;
	}
	
	void moveLeft(){
		x = x-10;
	}
	void moveRight(){
		x = x+10;
	}
	void moveUp(){
		y=y+10;
	}
	void moveDown(){
		y=y-10;
	}
	void grow(){
		faceSize = faceSize + 10;
	}
	void shrink(){
		faceSize = faceSize-10;
	}
	void wink(){
		eyeColor = Color.green;
		isWinking = true;
		isHappy = false;
		isCrying = false;
		isUpset = false;
		
	}
	void smile(){
		eyeColor = Color.green;
	
		isWinking = false;
		isHappy = true;
		isCrying = false;
		isUpset = false;
		
	}
	void beYourself(){
		eyeColor = Color.blue;
		isWinking = false;
		isHappy = false;
		isCrying = false;
		isUpset = false;
	}
	void cry(){
		eyeColor = Color.blue;
		isWinking = false;
		isHappy = false;
		isCrying = true;
		isUpset = false;
	}
	void frown(){
		eyeColor = Color.black;
		isWinking = false;
		isHappy = false;
		isCrying = false;
		isUpset = true;
	}
	
	void draw(DrawingBoard board, int thex, int they, Color thefaceColor,Color theeyeColor){
		
		Graphics2D canvas = board.getCanvas();
		
		// draw the face outline
		if (isHappy || isWinking){
			//draw the rounded rectangle
			canvas.drawRoundRect(200, 200, 50, 50, 20, 20);
		}	
		else{
			//draw the square
			canvas.drawRect(200, 200, 50, 50);
		}
		//draw the eyeballs
		if (isUpset){
			canvas.drawLine(200,200, 225, 225);
			canvas.drawLine(400, 200, 325, 225);
		}
		else if(isCrying){
			canvas.fillOval(300, 200, 2*eyeRadius, 2*eyeRadius);
			canvas.fillOval(300, 200, 2*eyeRadius, 2*eyeRadius);
		}
		else{
			canvas.fillOval(300, 200, 2*eyeRadius, 2*eyeRadius);
			canvas.fillOval(300, 200, 2*eyeRadius, 2*eyeRadius);			
		}
		
		
		// draw the mouth
		if(isUpset||isCrying){
			
			canvas.drawArc(250, 300, 105, 50, 15, 150);
		}
		else if(isHappy||isWinking){
			canvas.drawArc(250, 300, 105, 50, 195, 150);
		}
		else{
			canvas.drawLine(250, 300, 355,350);
		}
		
		// draw the tear drops
		if(isCrying){
			canvas.fillOval(300, 250, 30, 40);
			canvas.fillOval(300, 300, 30, 40);
			canvas.fillOval(300, 350, 30, 40);
			}
	}
}
		
		
	



