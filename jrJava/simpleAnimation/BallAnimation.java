package jrJava.simpleAnimation;

import java.awt.Color;
import java.awt.Graphics2D;
import java.io.IOException;




import resources.*;

//import resources.DrawingBoard;
//import resources.Timer;

public class BallAnimation {

	public static void main(String[] args) throws IOException {
		int Wheight = 700;
		int Wwidth = 500;
		DrawingBoard board = new DrawingBoard(Wwidth,Wheight);
		Graphics2D canvas = board.getCanvas();
		Timer timer = new Timer();
		
		int cornerX = 0;
		int cornerY = 0;
		int width = 150;
		int height = 150;
		int IncrX = 5;
		int IncrY = 5;
		
		
		for(int k=0; k<=100000; k++){
		
	//	for(cornerX=0; cornerX>=0 && cornerX<550; cornerX=cornerX+5){
			board.clear();
			canvas.setColor(Color.orange);
			cornerX = cornerX + IncrX;
			cornerY = cornerY + IncrY;
			
			if(cornerX<=0){
				IncrX=10;
				cornerX=cornerX+20;
				canvas.setColor(Color.blue);
				board.repaint();
			}
			if(cornerX>=(Wwidth-width)){
				IncrX=-10;
				canvas.setColor(Color.red);
			}
			if(cornerY<=0){
				IncrY=10;
				canvas.setColor(Color.green);
			}
			if(cornerY>=(Wheight-height)){
				IncrY=-10;
				canvas.setColor(Color.yellow);
			}
			
			canvas.fillOval(cornerX, cornerY, width, height);
			board.repaint();
			timer.pause(6);
		}
	}
		
		
}	

