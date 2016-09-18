package jrJava.blackjack;

import java.awt.*;

import javax.swing.ImageIcon;

import resources.DrawingBoard;



public class Test {

	public static void main(String[] args) {
		DrawingBoard board = new DrawingBoard(700,500);
		Graphics2D canvas = board.getCanvas();
		
		canvas.setColor(Color.red);
		canvas.drawImage(new ImageIcon("jrJava/blackjack/apple.png").getImage(), 0, 0, 100, 100, null);
		board.repaint();
	
	}

}
