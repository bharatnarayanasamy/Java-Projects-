package jrJava.loopPractice;

import java.awt.Color;
import java.awt.Graphics2D;

import resources.DrawingBoard;
import resources.Timer;

public class Practice6 {

	public static void main(String[] args) {
		Timer timer = new Timer();
		DrawingBoard board  = new DrawingBoard(800,600);
		Graphics2D canvas = board.getCanvas();
	for(int j=0; j<10; j++){
		for(int i=0; i<=100;i++){
		board.clear();
		canvas.setColor(Color.red);
		canvas.fillOval(100+5*i, 100, 140, 140);
		board.repaint();
		timer.pause(7);
		}
		for(int i=0; i<=60;i++){
			board.clear();
			canvas.setColor(Color.red);
			canvas.fillOval(600, 100 + 5*i, 140, 140);
			board.repaint();
			timer.pause(30);
			}
		for(int i=100; i>=0;i--){
			board.clear();
			canvas.setColor(Color.red);
			canvas.fillOval(100+5*i, 400, 140, 140);
			board.repaint();
			timer.pause(7);
			}
		for(int i=60; i>=0;i--){
				board.clear();
				canvas.setColor(Color.red);
				canvas.fillOval(100, 100 + 5*i, 140, 140);
				board.repaint();
				timer.pause(30);
				}
	}
		
		
		/*int sum = 0;
		
		for(int i=1; i<=100; i++){
			
			for(int j=1; j<=i; j++){
				sum = sum + j;
				
			}
		}
		
		System.out.println(sum);
		*/
		
		
	}

}
