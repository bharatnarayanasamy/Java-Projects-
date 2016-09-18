package jrJava.brickbuster;

import java.awt.Color;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import resources.SoundPlayer;
import resources.Timer;
import resources.DrawingBoard;

public class Coordinator {

	public static boolean gameOver;
	public static final String RESOURCE_PATH = "jrJava/alienInvader/imagesAndSounds/";
	
	public static void main(String[] args) {
			//JFrame frame = new JFrame();
			DrawingBoard board = new DrawingBoard(570,700);
			Timer timer = new Timer();
			
			Wall wall = new Wall();
			Deflector deflector = new Deflector(51,616);
			
			deflector.setWall(wall);
			
		
			
			JFrame frame = board.getJFrame();
			frame.addKeyListener(deflector);
			
			
			board.addMouseListener(deflector);
			board.addMouseMotionListener(deflector);

			
			
			int numOfColumns = 10;
			int brickHeight = 15;
			int brickWidth = (wall.getXRight() - wall.getXLeft())/numOfColumns;
			int[] numOfBricks = new int[]{20, 10, 15, 5, 21, 12, 8, 18, 6, 17};
			BrickManager[] bMs = new BrickManager[numOfColumns];
			
			for(int i=0;i<numOfColumns;i++){
				bMs[i] = new BrickManager(wall.getXLeft() + i*brickWidth, wall.getYTop(), brickWidth, brickHeight, numOfBricks[i]);
				
			}
			int numOfBalls = 10;
			Ball[] balls = new Ball[numOfBalls];
			
			
			
			int[] vx = new int[]{3, 4, 5, 4, 3, -3, -4, -5, -4, -3};
			int[] vy = new int[]{3, 4, -5, -4, -3, 3, 4, -5, -4, -3};
			Color[] colors = new Color[]{Color.RED, Color.green, Color.BLUE, Color.cyan, Color.magenta, Color.black, Color.gray, Color.pink, Color.orange, Color.yellow};
			
			
			
			for(int i=0;i<numOfBalls;i++){
				balls[i] = new Ball(300,500,vx[i],vy[i],colors[i]);
				balls[i].setWall(wall);
				balls[i].setDeflector(deflector);
				balls[i].setBrickManagers(bMs);
			}
			
			
			int count = 0;
			while(!gameOver){
				count++;
				board.clear();
							
				for(int i=0;i<balls.length;i++){
					balls[i].move();
					balls[i].draw(board);	
				}
				
				if(count%100==0) Ball.grow();
				
				wall.draw(board);
				deflector.draw(board);
				
				for(int i=0;i<bMs.length;i++) {
					bMs[i].draw(board);
				}
				
				board.repaint();
				timer.pause(10);
				
				int i=0;
				while(i<bMs.length){
					if(bMs[i].getNumOfBricks()==0){
						gameOver=true;
						i++;
					}
					else{
						gameOver=false;
						i=bMs.length;
					}
				}
				
				
			
			}
			board.clear();
			Image gameOverBanner = new ImageIcon(RESOURCE_PATH + "gameOver.png").getImage();
			board.getCanvas().drawImage(gameOverBanner, 35, 200, board);
			
			/*
			JTextArea textField = new JTextArea();
			textField.setBounds(50, 50, 100, 10);
			textField.setText("GOOD JOB");
			board.add(textField);
	
			board.repaint();
	*/
			
			
	}

}
