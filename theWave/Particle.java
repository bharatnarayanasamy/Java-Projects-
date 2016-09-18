package theWave;

import java.awt.Color;
import java.awt.Graphics2D;

import resources.DrawingBoard;

public class Particle {
	
	private int x, y;
	private int radius = 10;
	private Color color;
	
	public Particle(int _x, int _y, Color _color){
		x = _x;
		y = _y;
		color = _color;
	}
	public void moveUp(){
		y -= 10;
	}
	public void moveDown(){
		y += 10;
	}
	public void draw(DrawingBoard board){
		Graphics2D canvas = board.getCanvas();
		canvas.setColor(color);
		canvas.fillOval(x, y, radius, radius);
	}
	public int getX(){ return x;}
	public int getY(){ return y;}
	
}
