package jrJava.blinking2Balls;




import java.awt.Color;

import java.awt.Graphics2D;




import resources.DrawingBoard;







public class Ball {




	int x, y;

	int radius;

	Color color;

	int vx, vy;

	Wall wall;

	Ball ob;

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

	

	

	void setTheOtherBall(Ball _ob){

		ob = _ob;

	}

	

	

	void setWall(Wall _wall){

		wall = _wall;

	}

	

	

	void move(){

		

		x += vx;

		y += vy;

		

		

		if(x<= wall.left + radius){

			x = wall.left + radius;

			vx = -vx;

		}

		else if(x>= wall.left + wall.width - radius){

			x = wall.left + wall.width - radius;

			vx = -vx;

		}

		

		

		if(y<= wall.top + radius){

			y = wall.top + radius;

			vy = -vy;

		}

		else if(y>= wall.top + wall.height - radius){

			y = wall.top + wall.height - radius;

			vy = -vy;

		}

		

		

		if(  (x-ob.x)*(x-ob.x) + (y-ob.y)*(y-ob.y) <= (radius+ob.radius)*(radius+ob.radius)  ){

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


