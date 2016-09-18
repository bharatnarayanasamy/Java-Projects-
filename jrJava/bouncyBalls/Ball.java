package jrJava.bouncyBalls;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;

import resources.DrawingBoard;
import resources.SoundPlayer;


public class Ball {

	private int x, y;
	private int radius;
	private int vx, vy;
	private Wall wall;
	private Image image;
	private SoundPlayer sound;
	
	
	public Ball(int _x, int _y, int _vx, int _vy, String filePath){
		x = _x;
		y = _y;
		vx = _vx;
		vy = _vy;
		
		ImageIcon icon = new ImageIcon(filePath);
		image = icon.getImage();
		radius = image.getWidth(null)/2;
		
		sound = new SoundPlayer();
		sound.load("jrJava/bouncyBalls/Boing.wav");
	}
	
	
	
	public void setWall(Wall _wall){
		wall = _wall;
	}
	
	
	public void move(){
		x += vx; 
		y += vy;
		
		if(x<= wall.getLeft() + radius){
			x = wall.getLeft() + radius;
			vx = -vx;
			sound.play();
		}
		else if(x>= wall.getLeft() + wall.getWidth() - radius){
			x = wall.getLeft() + wall.getWidth() - radius;
			vx = -vx;
			sound.play();
		}
		
		
		if(y<= wall.getTop() + radius){
			y =wall.getTop() + radius;
			vy = -vy;
			sound.play();
		}
		else if(y>= wall.getTop() + wall.getHeight() - radius){
			y = wall.getTop() + wall.getHeight() - radius;
			vy = -vy;
			sound.play();
		}
		
	}
	
	
	public void grow(){
		radius++;
	}
	
	
	public void draw(DrawingBoard board){
		Graphics2D canvas = board.getCanvas();
		canvas.drawImage(image, x-radius, y-radius, board);
	}
	
}












