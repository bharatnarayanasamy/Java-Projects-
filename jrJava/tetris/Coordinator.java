package jrJava.tetris;

import java.awt.Color;

import resources.DrawingBoard;
import resources.SoundPlayer;

public class Coordinator {

	public static final String RESOURCE_PATH = "jrJava/tetris/sounds/";
	public static final int UPDATE_INTERVAL = 600;
	public static final int PAUSE_TIME = 50;
	public static boolean gameOver;
	


	public static void main(String[] args) {

		DrawingPanel panel = new DrawingPanel(600, 700);
		ScoreReporter scoreReporter = new ScoreReporter();
		panel.addDrawable(scoreReporter);
		TetrisObject tetris;
		long nextUpdateTime;
		int numOfFullRowsCleared;
		
		Wall wall = new Wall();
		panel.addDrawable(wall);
		Graveyard graveyard = new Graveyard();
		panel.addDrawable(graveyard);
		
		
		SoundPlayer bgSound = new SoundPlayer();
		bgSound.load(RESOURCE_PATH + "imperialMarch.wav");
		bgSound.playLoop();
		
		while(true){
			tetris = createTetrisObject();
			
			
			panel.addDrawable(tetris); 


			tetris.setWall(wall);
			tetris.setGraveyard(graveyard); 

			panel.addKeyListener(tetris); 

			nextUpdateTime = System.currentTimeMillis() + UPDATE_INTERVAL;

			
			while(!gameOver){

				//wall.draw(board);
				//tetris.draw(board);

				if(System.currentTimeMillis()>=nextUpdateTime){
					numOfFullRowsCleared = graveyard.clearFullRowsIfAny();
					scoreReporter.changeScore(150*numOfFullRowsCleared);
					if(tetris.moveDown()<0) gameOver = true;
					scoreReporter.changeScore(-1);
					nextUpdateTime += UPDATE_INTERVAL;
					//graveyard.report();
					if(tetris.isBuried()) {

						break;
					}
				}

				panel.repaint();

				try {
					Thread.currentThread().sleep(PAUSE_TIME);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			if(gameOver) break;
			
			
			panel.removeKeyListener(tetris);
			panel.removeDrawable(tetris);
		}
		
		scoreReporter.gameOver();
		panel.repaint();
		bgSound.stop();
	}
	public static TetrisObject createTetrisObject(){
		double random = Math.random();
		if(random<0.1) return new Square();
		else if(random<0.2) return new LongL();
		else if(random<0.3) return new ShortStick();
		else if(random<0.4) return new LongStick();
		else if(random<0.5) return new Cross();
		else if(random<0.6) return new ShortL();
		else if(random<0.7) return new ShortZ();
		else if(random<0.8) return new Tee();
		else if(random<0.9) return new LongZ();
		else return new TheBlock();


	}

}









