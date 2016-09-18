package jrJava.objectpractice2;

import java.awt.Color;
import java.awt.Graphics2D;

import resources.DrawingBoard;

public class Ball {

	int x = 100;
	int y = 150;
	int radius = 70;
	Color color = Color.red;
	int vx = 5;
	int vy = 1;
	
	Ball() {}
	
	Ball (int _x, int _y, Color _color, int _radius, int _vx, int _vy){
		x =_x;
		y = _y;
		color = _color;
		radius = _radius;
		vx = _vx;
		vy = _vy;
	}
	
	void move(){
		x = x + vx;
		y = y+vy;
	}
	void grow(){
		radius++;
	}
	void TellAboutYourself(){
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		System.out.println("radius = " + radius);
		System.out.println("--------------------------");
	}

	void draw(DrawingBoard board){
		Graphics2D canvas  = board.getCanvas();
		canvas.setColor(color);
		
		canvas.fillOval(x - radius, y-radius, 2*radius, 2*radius);
	
	}

}