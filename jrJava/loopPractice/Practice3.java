package jrJava.loopPractice;

import java.awt.*;

import resources.*;

public class Practice3 {

	public static void main(String[] args) {
		Timer timer = new Timer();
		DrawingBoard board  = new DrawingBoard(800,600);
		Graphics2D canvas = board.getCanvas();
		
		for(int i=0; i<=100;i++){
		board.clear();
		canvas.setColor(Color.red);
		canvas.fillOval(100+5*i, 100, 140, 140);
		board.repaint();
		timer.pause(30);
		}
		for(int i=0; i<=60;i++){
			board.clear();
			canvas.setColor(Color.red);
			canvas.fillOval(600, 100 + 5*i, 140, 140);
			board.repaint();
			timer.pause(30);
			}
		for(int i=0; i<=100;i++){
			board.clear();
			canvas.setColor(Color.red);
			canvas.fillOval(600-5*i, 400, 140, 140);
			board.repaint();
			timer.pause(30);
			}
		for(int i=0; i<=60;i++){
				board.clear();
				canvas.setColor(Color.red);
				canvas.fillOval(100, 400 - 5*i, 140, 140);
				board.repaint();
				timer.pause(30);
				}
	}

}
