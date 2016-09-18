package jrJava.objectpractice;

import java.awt.Color;
import java.awt.Graphics2D;
import resources.DrawingBoard;

public class ball {

	int x = 100;
	int y = 200;
	int radius = 70;
	Color color = Color.red;
	int vx = 5;
	int vy = 1;


	ball(){
		System.out.println("I am here in Constructor.");
	}

	ball(int _x, int _y){
		x = _x;
		y = _y;
	}
	ball(int _x, int _y, int _radius, Color _color, int _vx, int _vy){
		x = _x;
		y = _y;
		radius = _radius;
		color = _color;
		vx = _vx;
		vy = _vy;		
	}


	void move(){
		x = x + vx;
		y = y + vy;
	}
	void grow(){
		radius = radius + 1;
	}
	void draw(DrawingBoard board){
		Graphics2D canvas = board.getCanvas();
		canvas.setColor(color);
		canvas.fillOval(x-radius,y-radius,radius,radius);

	}

}