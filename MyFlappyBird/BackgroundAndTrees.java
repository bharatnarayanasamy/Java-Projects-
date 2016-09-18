package MyFlappyBird;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;

import resources.DrawingBoard;

public class BackgroundAndTrees {
	
	
	private int x;
	private int height;
	private int y = (int) (Math.random()*600);
	private Font f;
	
	public BackgroundAndTrees(int _x, int _height){
		x = _x;
		height = _height;
	}
	
	public void move(){
		x -= 20;
	}
	
	public void draw(DrawingBoard board){
		Graphics2D canvas = board.getCanvas();
		canvas.setColor(Color.black);
		canvas.setStroke(new BasicStroke(20));
		if(y>=(600-height)){
			canvas.drawLine(x, y, x, y-height);
		}
		else{
			canvas.drawLine(x, y, x, y+height);
		}
		
	}
	public int getX(){ return x;}
	public int getY(){ return y;}
	public int getHeight(){ return height;}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//private int TopWidthOfTree, TopHeightOfTree;
	//private int BottomWidthOfTree, BottomHeightOfTree;
	
	
	
}
