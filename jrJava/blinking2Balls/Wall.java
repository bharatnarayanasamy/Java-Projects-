package jrJava.blinking2Balls;




import java.awt.Color;

import java.awt.Graphics2D;




import resources.DrawingBoard;







public class Wall {




	int left = 50;

	int top = 50;

	int width = 700;

	int height = 500;

	Color color = Color.blue;

	int changeRate = 1; // if +, it will shrink, if -, it will expand.

	

	

	

	Wall(){ }







	void changeSize(){




		

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







	void draw(DrawingBoard board){

		Graphics2D canvas = board.getCanvas();

		canvas.setColor(color);

		canvas.drawRect(left, top, width, height); 

	}




}
