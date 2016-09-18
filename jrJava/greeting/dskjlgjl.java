package jrJava.greeting;

import java.awt.Color;
import java.awt.Graphics2D;

import resources.DrawingBoard;

public class dskjlgjl {

	public static void main(String[] args) {
		DrawingBoard board  = new DrawingBoard(800,600);
		Graphics2D canvas = board.getCanvas();
		board.clear();
		canvas.setColor(Color.black);
		canvas.drawArc(100, 100, 105, 50, 195, 150);
		canvas.drawArc(200, 200, 105, 50, 15, 150);
		
		board.repaint();
	/*	for(int i=100; i<=700;i=i+10){
			canvas.setColor(Color.red);
			canvas.fillOval(i, 100, 140, 140);
		}
		*/
		/*canvas.setColor(Color.black);
		canvas.fillOval(110, 110, 140, 140);
		canvas.setColor(Color.red);
		canvas.fillOval(120, 120, 140, 140);
		canvas.setColor(Color.black);
		canvas.fillOval(130, 130, 140, 140);
		board.repaint();
		*/
	}

}
