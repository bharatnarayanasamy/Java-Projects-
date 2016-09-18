package jrJava.brickBusterHome;


import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.event.*;

import resources.DrawingBoard;


public class Deflector implements KeyListener, MouseListener, MouseMotionListener {

	private int x,y; // top left coordinate
	private int width = 700;
	private int height = 15;
	private Color color = Color.black;
	private Wall wall;
	
	
	
	public Deflector(int _x, int _y){
		x = _x;
		y = _y;
	}
	public void setWall(Wall _wall){ wall = _wall;}
	public int getX(){ return x;}
	public int getY(){ return y;}
	public int getWidth(){ return width;}
	public int getHeight(){ return height;}
	
	
	public void draw(DrawingBoard board){
		Graphics2D canvas = board.getCanvas();
		canvas.setColor(color);
		canvas.fillRect(x,y,width,height);
	}
	
	public void keyTyped(KeyEvent e) {
		//System.out.println("I am in the keyPressed method.");
	}
	
	public void keyPressed(KeyEvent e) {
		int keyCode = e.getKeyCode();
	
		if(keyCode==KeyEvent.VK_LEFT){
			x=x-35;
			
		}
		else if(keyCode==KeyEvent.VK_RIGHT){
			x=x+35;
		}
		if(keyCode==KeyEvent.VK_UP){
			y=y-35;
			
		}
		else if(keyCode==KeyEvent.VK_DOWN){
			y=y+35;
		}
		if(x<wall.getXLeft()){
			x=wall.getXLeft();
		}
		else if(x>wall.getXRight()-width){
			x=wall.getXRight()-width;
		}
		if(y<wall.getYTop()){
			y=wall.getYTop();
		}
		else if(y>wall.getYBottom()-height){
			y=wall.getYBottom()-height;
		}
	}
	
	
	

	public void keyReleased(KeyEvent e) {
		//System.out.println("I am in the keyReleased method.");
	}
	@Override
	public void mouseDragged(MouseEvent e) {
		int mouseX = e.getX();
		int mouseY = e.getY();
		x = mouseX - width/2;
		y = mouseY - height/2;
		if(x<wall.getXLeft()){
			x=wall.getXLeft();
		}
		else if(x>wall.getXRight()-width){
			x=wall.getXRight()-width;
		}
		if(y<wall.getYTop()){
			y=wall.getYTop();
		}
		else if(y>wall.getYBottom()-height){
			y=wall.getYBottom()-height;
		}
	}
	@Override
	public void mouseMoved(MouseEvent e) {
	}
	@Override
	public void mouseClicked(MouseEvent e) {
	}
	@Override
	public void mousePressed(MouseEvent e) {
		int mouseX = e.getX();
		int mouseY = e.getY();
		x = mouseX - width/2;
		y = mouseY - height/2;
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
	}
	@Override
	public void mouseEntered(MouseEvent e) {
	}
	@Override
	public void mouseExited(MouseEvent e) {
	}
	
	
	
}
