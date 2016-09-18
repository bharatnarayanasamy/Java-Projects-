package jrJava.brickBusterHome;

import java.awt.Color;
import java.awt.Graphics2D;

import resources.DrawingBoard;
import resources.SoundPlayer;

public class Ball {
	private int x,y;//center
	private int radius = 10;
	private int vx, vy;
	private Color color;
	private Wall wall;
	private Deflector deflector;
	private TheBrickManager tBM;
	private BrickManager bM;
	private ABrickManager aBM;
	private SoundPlayer sound;
	
	
	public Ball(int _x, int _y, int _vx, int _vy, Color _color){
		x = _x;
		y = _y;
		vx = _vx;
		vy = _vy;
		color = _color;
		sound = new SoundPlayer();
		sound.load("jrJava/brickbuster/Boing.wav");
		
	}
	
	public void setWall(Wall _wall){
		wall =_wall;
	}

	
	public void setDeflector(Deflector _deflector){
		deflector = _deflector;
	}
	public int getX(){ return x;}
	public int getY(){ return y;}
	public int getRadius(){ return radius;}
	public int getVX(){ return vx;}
	public int getVY(){ return vy;}

	
	public void setX(int _x){x = _x;}
	public void setY(int _y){y = _y;}
	public void setVX(int _vx){vx = _vx;}
	public void setVY(int _vy){vy = _vy;}
	public void setTheBrickManager(TheBrickManager _tBM){ 
		tBM = _tBM;
	}
	public void setBrickManager(BrickManager _bM){ 
		bM = _bM;
	}
	public void setABrickManager(ABrickManager _aBM){ 
		aBM = _aBM;
	}
	
	public void move(){
		x+=vx;
		y+=vy;
		
		if(x<=wall.getXLeft()+radius){
			x=wall.getXLeft()+radius;
			vx=-vx;
		}
		else if(x>=wall.getXRight()-radius){
			x=wall.getXRight()-radius;
			vx=-vx;
		}
		if(y<=wall.getYTop()+radius){
			y=wall.getYTop()+radius;
			vy=-vy;
		}
		
		if(x>=deflector.getX()-radius &&
			x<=deflector.getX()+deflector.getWidth()+radius &&
			y>=deflector.getY()-radius &&
			y<=deflector.getY()+deflector.getHeight() ){
			
			y=deflector.getY()-radius;
			vy = -vy;
			
		}
		
		if(bM.checkCollision(this)){
			//play sound
			sound.play();
		}
		if(tBM.checkCollision(this)){
			//play sound
			sound.play();
		}
		if(aBM.checkCollision(this)){
			//play sound
			sound.play();
		}
		
	}
	
	
	
	public void draw(DrawingBoard board){
		Graphics2D canvas = board.getCanvas();
		canvas.setColor(color);
		canvas.fillOval(x-radius, y-radius, 2*radius, 2*radius);
		
	}


}
