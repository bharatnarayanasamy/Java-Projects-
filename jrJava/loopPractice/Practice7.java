package jrJava.loopPractice;

import java.awt.Color;

import java.awt.Graphics2D;

import resources.*;

public class Practice7 {

	public static void main(String[] args) {

		DrawingBoard board = new DrawingBoard(700,700);
		Graphics2D canvas = board.getCanvas();
		Timer timer = new Timer();
		
		int tileSize = 20;
		int numOfCols = 30;
		int numOfRows = 30;
	
		for(int i=0; i<numOfCols; i++){
			
			for(int j=0; j<=i; j++){
				
				Color tileColor = new Color(0,8*i,8*j);
				canvas.setColor(tileColor);
				//canvas.setColor(Color.red);
				canvas.fillRect(50+tileSize*j,50+tileSize*i,tileSize,tileSize);
				
				
				
				canvas.setColor(Color.white);
				canvas.drawRect(50+tileSize*j,50+tileSize*i,tileSize,tileSize);
				board.repaint();
				timer.pause(5);
			}
			
		}
				
	}

}
