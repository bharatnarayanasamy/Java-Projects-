package jrJava.simpleAnimation;

import java.awt.Color;
import java.awt.Graphics2D;
import java.io.IOException;




import resources.*;

//import resources.DrawingBoard;
//import resources.Timer;

public class MovingShape {

	public static void main(String[] args) throws IOException {
		
		DrawingBoard board = new DrawingBoard(700,500);
		Graphics2D canvas = board.getCanvas();
		Timer timer = new Timer();
		
		int cornerX = 0;
		int cornerY = 0;
		int width = 150;
		int height = 150;
		
		for(int k=0; k<=1000; k++){
		
		for(int i=0; i<=67; i++){
			board.clear();
			canvas.setColor(Color.cyan);
			cornerX = cornerX + 8;
			cornerY = cornerY + 5;
			canvas.fillOval(cornerX, cornerY, width, height);
			board.repaint();
			timer.pause(30);	}
			for(int j=0; j<=67; j++){
					board.clear();
					canvas.setColor(Color.green);
					cornerX = cornerX - 8;
					cornerY = cornerY - 5;
					canvas.fillOval(cornerX, cornerY, width, height);
					board.repaint();
					timer.pause(6);	
				}
			}
		
		}
		
		
	}	

