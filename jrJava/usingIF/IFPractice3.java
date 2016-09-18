package jrJava.usingIF;

import java.awt.Color;
import java.awt.Graphics2D;

import resources.DrawingBoard;

public class IFPractice3 {

	public static void main(String[] args) {

	DrawingBoard board = new DrawingBoard (600, 400);
	
	Graphics2D canvas = board.getCanvas();
	
	canvas.setColor(Color.red);
	canvas.fillRect(150, 220, 200, 100);
	
	canvas.setColor(Color.blue);
	canvas.fillOval(300, 150, 200, 200);
	
	canvas.setColor(Color.CYAN);
	canvas.drawLine(50, 50, 500, 300);
	
	board.repaint();
	}

}
