package jrJava.blinking3Balls;




import java.awt.Color;

import java.awt.Graphics2D;




import resources.DrawingBoard;







public class Ball {




	int x, y;

	int radius;

	Color color;

	int vx, vy;

	Wall wall;

	Ball obA;

	Ball obB;

	boolean overlapped;
	
	Ball(int _x, int _y, Color _color){
		x = _x;
		y = _y;
		color = _color;
	}

	Ball(int _x, int _y, int _radius, Color _color, int _vx, int _vy){
		x = _x;
		y = _y;
		radius = _radius;
		color = _color;
		vx = _vx;
		vy = _vy;

	}

	void setTheOtherBalls(Ball _obA, Ball _obB){
		obA = _obA;
		obB = _obB;
	}
	void setWall(Wall _wall){
		wall = _wall;
	}

	void move(){
		x += vx;
		y += vy;

		if(x<= wall.getLeft() + radius){
			x = wall.getLeft() + radius;
			vx = -vx;
		}
		else if(x>= wall.getLeft() + wall.getWidth() - radius){
			x = wall.getLeft() + wall.getWidth() - radius;
			vx = -vx;
			
		}
		
		
		if(y<= wall.getTop() + radius){
			y =wall.getTop() + radius;
			vy = -vy;
			
		}
		else if(y>= wall.getTop() + wall.getHeight() - radius){
			y = wall.getTop() + wall.getHeight() - radius;
			vy = -vy;
			
		}

		

		

		/*

		boolean a1 = (x-obA.x)*(x-obA.x) + (y-obA.y)*(y-obA.y) <= (radius+obA.radius)*(radius+obA.radius);

		boolean a2 = (x-obB.x)*(x-obB.x) + (y-obB.y)*(y-obB.y) <= (radius+obB.radius)*(radius+obB.radius);

		

		if( a1 || a2 ){

				

			overlapped= true;

		}

		else {

			overlapped = false;

		}

		*/

		

		

		

		if(  (x-obA.x)*(x-obA.x) + (y-obA.y)*(y-obA.y) <= (radius+obA.radius)*(radius+obA.radius) ||

			 (x-obB.x)*(x-obB.x) + (y-obB.y)*(y-obB.y) <= (radius+obB.radius)*(radius+obB.radius) 	){

			

			overlapped= true;

		}

		else {

			overlapped = false;

		}

		

		

		

		

	}

	

	

	void grow(){

		radius++;

	}

	

	

	void draw(DrawingBoard board){

		Graphics2D canvas = board.getCanvas();

		

		if(overlapped){

			canvas.setColor(Color.gray);

		}

		else {

			canvas.setColor(color);

		}

				

		canvas.fillOval(x-radius, y-radius, 2*radius, 2*radius);

	}

	

}


