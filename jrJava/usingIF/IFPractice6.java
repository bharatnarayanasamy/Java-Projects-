package jrJava.usingIF;

import java.awt.Color;
import java.awt.Graphics2D;

import resources.DrawingBoard;

public class IFPractice6 {

	public static void main(String[] args) {
		DrawingBoard board = new DrawingBoard (800, 600);
		
		Graphics2D canvas = board.getCanvas();
		
		canvas.setColor(Color.red);
		canvas.drawRect(200, 100, 250, 150);
		canvas.fillRect(500, 250, 100, 100);
		
		canvas.setColor(Color.green);
		canvas.fillOval(350, 100, 200, 200);
		
		canvas.setColor(Color.black);
		canvas.drawLine(50, 50, 750, 550);
		Color myColor = new Color(255, 0, 0);
		canvas.drawLine(100, 100, 700, 540);
		board.repaint();
	}

}
