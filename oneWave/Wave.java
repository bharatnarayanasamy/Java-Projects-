package oneWave;

import java.awt.Color;
import java.awt.Graphics2D;

import resources.DrawingBoard;

public class Wave {
	private int x, y;
	private int radius = 10;
	private Color color;
	
	public Wave(int x, int y, Color color){
		this.x = x;
		this.y = y;
		this.color = color;
	}
	public void moveDown(){
		y += 10;
	}
	public void moveUp(){
		y -= 10;
	}
	public void draw(DrawingBoard board){
		Graphics2D canvas = board.getCanvas();
		canvas.setColor(color);
		canvas.fillOval(x, y, radius, radius);
	}
	public static void main(String[] args){
		DrawingBoard board = new DrawingBoard();
		Wave wave = new Wave(10, 10, Color.red);
		while(true){
			board.clear();
			
			wave.moveDown();
			wave.draw(board);
			
			board.repaint();
			
		}
	}
}







