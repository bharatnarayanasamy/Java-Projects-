package jrJava.bouncyBalls;

import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;

import resources.DrawingBoard;
import resources.SoundPlayer;

public class ImageSoundTest {

	public static void main(String[] args) {

		DrawingBoard board = new DrawingBoard(800,600);
		Graphics2D canvas = board.getCanvas();
		
		ImageIcon bgicon = new ImageIcon("jrJava/bouncyBalls/bg3.png");
		Image bgimage = bgicon.getImage();
		canvas.drawImage(bgimage,0,0,board);
		
		ImageIcon icon = new ImageIcon("jrJava/bouncyBalls/blueball.png");
		Image image = icon.getImage();
		canvas.drawImage(image,100,200,board);
		
		board.repaint();	
		
		SoundPlayer bgSound = new SoundPlayer();
		bgSound.load("jrJava/bouncyBalls/harryPotter_low.wav");
		bgSound.playLoop();
		
		
		SoundPlayer boingSound = new SoundPlayer();
		boingSound.load("jrJava/bouncyBalls/Boing.wav");
		boingSound.playLoop();

		
	}

}
