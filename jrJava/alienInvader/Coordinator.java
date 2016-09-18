package jrJava.alienInvader;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;

import resources.DrawingBoard;
import resources.SoundPlayer;
import resources.Timer;

public class Coordinator {


	public static final String RESOURCE_PATH = "jrJava/alienInvader/imagesAndSounds/";
	public static final int SCREEN_WIDTH = 800;
	public static final int SCREEN_HEIGHT = 750;
	public static final int PAUSE_TIME = 30;
	
	public static boolean gameOver;
	


	public static void main(String[] args) {

		DrawingBoard board = new DrawingBoard(SCREEN_WIDTH, SCREEN_HEIGHT);
		Timer timer = new Timer();

		Ship ship = new Ship(300, 570);
		// register the ship as ML, MML to the JPanel (DrawingBoard).
		board.addMouseListener(ship); 
		board.addMouseMotionListener(ship);
		// register the ship as KL to the JFrame. 
		board.getJFrame().addKeyListener(ship); 

		board.setBackgroundImage(RESOURCE_PATH + "bg.png");  
		
		SoundPlayer bgSound = new SoundPlayer();
		bgSound.load(RESOURCE_PATH + "bgMusic.wav");
		bgSound.playLoop();
		
		
		while(!gameOver){
			
			board.clear();

			TorpedoManager.move();
			TorpedoManager.draw(board); 

			AlienManager.move(ship);
			AlienManager.draw(board);

			MissileManager.move(ship);
			MissileManager.draw(board); 

			ship.draw(board); 


			board.repaint(); 
			timer.pause(PAUSE_TIME);
		}

		bgSound.stop();
		
		Image gameOverBanner = new ImageIcon(RESOURCE_PATH + "gameOver.png").getImage();
		board.getCanvas().drawImage(gameOverBanner, 150, 200, board);
		board.repaint();
		
		/*
		Graphics2D canvas = board.getCanvas();
		canvas.setColor(Color.green);
		Font font = new Font("Times", Font.BOLD, 100);
		canvas.setFont(font);
		canvas.drawString("GAME OVER", 80, 300); 
		board.repaint();
		*/
	}

}











