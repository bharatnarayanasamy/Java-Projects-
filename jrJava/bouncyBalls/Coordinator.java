package jrJava.bouncyBalls;

import java.awt.Color;

import resources.DrawingBoard;
import resources.SoundPlayer;
import resources.Timer;

public class Coordinator {

	public static void main(String[] args) {

		DrawingBoard board = new DrawingBoard(800, 600);
		Timer timer = new Timer();
		
		Ball b1 = new Ball(400, 300, 5, -3, "jrJava/bouncyBalls/blueBall.png");
		Ball b2 = new Ball(200, 300, -5, -3, "jrJava/bouncyBalls/redBall.png");
		Ball b3 = new Ball(300, 300, -4, 4, "jrJava/bouncyBalls/yellowBall.png");
		Ball b4 = new Ball(300, 300, 4, 4, "jrJava/bouncyBalls/greenBall.png");
		
		board.setBackgroundImage("jrJava/bouncyBalls/bg3.png");
		
		SoundPlayer bgSound = new SoundPlayer();
		bgSound.load("jrJava/bouncyBalls/harryPotter_low.wav");
		bgSound.playLoop();
		
		
		Wall wall = new Wall();
		
		//b1.wall = wall;
		//b2.wall = wall;
		//b3.wall = wall;
		
		b1.setWall(wall);
		b2.setWall(wall);
		b3.setWall(wall);
		b4.setWall(wall);
		
		while(true){
		
			board.clear();
			
			b1.move();
			b2.move();
			b3.move();
			b4.move();
			
			b1.draw(board);
			b2.draw(board);
			b3.draw(board);
			b4.draw(board);
			wall.changesize();
			wall.draw(board);
			
			board.repaint();
			timer.pause(30);
		}
		
	}

}
