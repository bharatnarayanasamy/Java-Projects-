package theWave;

import java.awt.Graphics2D;

import resources.DrawingBoard;
import resources.Timer;

public class Coordinator {

	public static final int screenWidth = 500;
	public static final int screenHeight = 500;
	
	public static void main(String[] args) {
		DrawingBoard board = new DrawingBoard(screenWidth, screenHeight);
		Graphics2D canvas = board.getCanvas();
		Timer timer = new Timer();

		
		WaveManager waves = new WaveManager(10, 50, 50);
		
		/*waves.draw(board);
		board.repaint();*/
		while(true){
			board.clear();
			
			waves.move();
			waves.draw(board);
			
			
			
			board.repaint();
			timer.pause(200);

			
		}
		
	}

}
