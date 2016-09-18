package MyFlappyBird;

import java.awt.Color;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import resources.DrawingBoard;
import resources.Timer;

public class Coordinator {

	public static final int SCREEN_WIDTH = 600;
	public static final int SCREEN_HEIGHT = 600;
	private static int arrayLength = 1000;
	private static boolean Win;
	public static final String RESOURCE_PATH = "jrJava/alienInvader/imagesAndSounds/";
	
	public static void main(String[] args) {
		
		DrawingBoard board = new DrawingBoard(SCREEN_WIDTH, SCREEN_HEIGHT);
		Timer timer = new Timer();
		
		Bird bird = new Bird(100, 300, 20, Color.RED);
		board.getJFrame().addKeyListener(bird); 
		
		BackgroundAndTrees[] bats = new BackgroundAndTrees[arrayLength];
		
		for(int i=0;i<arrayLength;i++){
			bats[i] = new BackgroundAndTrees(550, 200);
		}
		
		
		bird.draw(board);
		int i=0;
		bats[i].draw(board);
		while(true){
			if(bird.isHit(bats[i]) == true){
				board.clear();
				Win = false;
				break;
			}
			if(i==arrayLength){
				board.clear();
				Win = true;
				break;
			}
			
			board.clear();
			
			if(bats[i].getX()>=0){
				bats[i].move();
				bats[i].draw(board);
			}
			else{
				bats[i+1].move();
				bats[i+1].draw(board);
				i = i+1;
			}
			bird.moveDown();
			bird.draw(board);
					
			board.repaint();
			timer.pause(30);
			
			
		}
		JLabel label;
		if(Win==true){
			label = new JLabel();
			label.setBounds(25, 75, 100, 200);
			label.setText("YOU WIN");
			board.add(label);
			board.repaint();
		}
		if(Win==false){
			Image gameOverBanner = new ImageIcon(RESOURCE_PATH + "gameOver.png").getImage();
			board.getCanvas().drawImage(gameOverBanner, 50, 150, board);
			board.repaint();
		}
		
		System.out.println(i);
		
	}

}
