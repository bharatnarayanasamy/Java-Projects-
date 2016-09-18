package MyFlappyBirdV2;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;

import resources.DrawingBoard;

public class BackgroundAndTrees {
	
	
	private int x;
	private int height;
	private double random;
	private int y;
	private Font f;
	private int screenSize = 600;
	
	public BackgroundAndTrees(int _x, int _height){
		x = _x;
		height = _height;
		random = Math.random();
	}
	
	public void move(){
		x -= 20;
	}
	
	public void draw(DrawingBoard board){
		y = (int) (random*screenSize);
		
		Graphics2D canvas = board.getCanvas();
		canvas.setColor(Color.black);
		canvas.setStroke(new BasicStroke(20));
		if(y<500){
			canvas.drawLine(x, 0, x, y);
			canvas.drawLine(x, screenSize, x, y+height);
		}
		else{
			canvas.drawLine(x, 0, x, y-height);
			canvas.drawLine(x, screenSize, x, y);
		}
		//canvas.drawLine(x, y, x, y-height);
		//canvas.drawLine(x, 0, x, height);
		
		
		
	}
	public int getX(){ return x;}
	public int getY(){ return y;}
	public int getHeight(){ return height;}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//private int TopWidthOfTree, TopHeightOfTree;
	//private int BottomWidthOfTree, BottomHeightOfTree;
	
	
	
}
