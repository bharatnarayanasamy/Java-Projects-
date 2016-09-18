package jrJava.methodpractice;

import java.awt.*;

import resources.*;

public class Practice5 {

	
	public static void main(String[] args) {

		DrawingBoard board = new DrawingBoard(800,600);
		Timer timer = new Timer();
		
		move(board, timer, Color.red, 70, 100, 100, 590, 190);
	}
	private static void move(DrawingBoard board,Timer timer,
							Color color, int radius, 
							int x1, int y1, int x2, int y2){
		
		Graphics2D canvas = board.getCanvas();
		
		for(int i=0;i<=100;i++){
			
			int xCenter = i+100;
			int yCenter = 100;
			board.clear();
			canvas.setColor(color);
			canvas.fillOval(xCenter-radius, yCenter-radius, 2*radius, 2*radius);
			
			board.repaint();
			timer.pause(10);
		}
		
		
		
	}
}
