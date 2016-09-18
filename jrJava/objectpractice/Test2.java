package jrJava.objectpractice;



import java.awt.Color;

import resources.DrawingBoard;
import resources.Timer;

public class Test2 {

	public static void main(String[] args) {
		
		//ball b1 = new ball();
		//ball b2 = new ball(300,450);
		ball b1 = new ball(100, 300, 50,Color.blue, 5, -2);
		ball b2 = new ball(100, 300, 50,Color.green, 5, 2);
		ball b3 = new ball(600, 300, 50,Color.pink, -5, 2);
		DrawingBoard board = new DrawingBoard();
		
		b1.draw(board);
		
		board.repaint();
		
		Timer timer = new Timer();
		for(int i=0; i<100; i++){
			board.clear();
			b1.move();
			b1.grow();
			b1.draw(board);

			b2.move();
			b2.grow();
			b2.draw(board);
		
			b3.move();
			b3.grow();
			b3.draw(board);
			
			board.repaint();
			timer.pause(10);
		}
	}

}
