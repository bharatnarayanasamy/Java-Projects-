package newProjectAtHome;

import java.awt.Color;
import java.awt.Graphics2D;

import resources.DrawingBoard;

public class Universe {

	public static void main(String[] args) {
		int numOfBalls = (int) (2+20*Math.random());
		numOfBalls=100;
		DrawingBoard board = new DrawingBoard(600,700);
		Graphics2D canvas = board.getCanvas();
		for(int i=0;i<numOfBalls;i++){
			int sizeOfBalls = (int) (100*Math.random());
			int x = (int)(100*Math.random());
			int y = 10+100^x%600;
			//canvas.setColor((int)Math.random()*256,(int)Math.random()*256, (int)Math.random()*256);
			canvas.setColor(Color.blue);
			canvas.fillOval(x, y, sizeOfBalls, sizeOfBalls);
		}
		board.repaint();
	}

}
