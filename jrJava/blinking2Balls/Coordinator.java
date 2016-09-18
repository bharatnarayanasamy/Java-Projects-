package jrJava.blinking2Balls;




import java.awt.Color;




import resources.DrawingBoard;

import resources.Timer;







public class Coordinator {




	public static void main(String[] args) {




		DrawingBoard board = new DrawingBoard(800, 600);

		Timer timer = new Timer();

		

		Ball b1 = new Ball(400, 300, 80, Color.green, 5, -3);

		Ball b2 = new Ball(200, 300, 60, Color.red, -5, -3);

		

		//b1.ob = b2;

		//b2.ob = b1;

		b1.setTheOtherBall(b2);

		b2.setTheOtherBall(b1);

		 

		

		Wall wall = new Wall();

		

		//b1.wall = wall;

		//b2.wall = wall;

		

		b1.setWall(wall);

		b2.setWall(wall);

		

		

		for(    ; true;    ){

		

			board.clear();

			

			b1.move();

			b2.move();

			

			b1.draw(board);

			b2.draw(board);

			

			wall.changeSize();

			wall.draw(board); 

			

			board.repaint();

			timer.pause(10);

		}

		

	}




}


