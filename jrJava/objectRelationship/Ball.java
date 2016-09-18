package jrJava.objectRelationship;




import java.awt.Color;

import java.awt.Graphics2D;




import resources.DrawingBoard;







public class Ball {

	int x, y;

	int radius;

	Color color;

	int vx, vy;

	Wall wall;

	
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
	}

	void grow(){

		radius++;

	}

	void draw(DrawingBoard board){

		Graphics2D canvas = board.getCanvas();

		canvas.setColor(color);

		canvas.fillOval(x-radius, y-radius, 2*radius, 2*radius);

	}

}


