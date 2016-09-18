package jrJava.tetris;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import resources.DrawingBoard;
import resources.SoundPlayer;

public abstract class TetrisObject implements KeyListener, Drawable {

	protected Block[] blocks;
	protected int xCenter=300, yCenter=80; // x,y of the rotation center block.
	protected Color color;
	protected Wall wall;
	protected Graveyard graveyard;
	protected boolean isBuried;
	protected static SoundPlayer bubbleSound, kchingSound, shiftSound;
	
	static{
		bubbleSound = new SoundPlayer();
		bubbleSound.load(Coordinator.RESOURCE_PATH + "bubble.wav");
		
		shiftSound = new SoundPlayer();
		shiftSound.load(Coordinator.RESOURCE_PATH + "shift.wav");
		
		kchingSound = new SoundPlayer();
		kchingSound.load(Coordinator.RESOURCE_PATH + "kChing.wav");
	}

	public TetrisObject(){
		color = new Color((int) (Math.random()*256), (int) (Math.random()*256), (int) (Math.random()*256));
		createShape();
		updateBlocks();
	}
	
	public abstract void createShape();


	public void setWall(Wall wall){ this.wall = wall; }
	public void setGraveyard(Graveyard graveyard){ this.graveyard = graveyard; }

	
	public boolean isBuried(){  return isBuried; }

	public boolean isLegal(){
		for(int i=0; i<blocks.length; i++){
			if(wall.isOutside(blocks[i]) || graveyard.isInside(blocks[i])) return false;
		}
		return true;
	}


	public int moveDown(){ 
		
		if(isBuried) return 0;
		
		
		
		yCenter += Block.SIZE;
		updateBlocks();

		if(!isLegal()){	
			yCenter -= Block.SIZE;
			updateBlocks();
			if(yCenter<120) return -1;
			buryToGraveyard();
			return 0;
		}
		bubbleSound.play();
		return 0;
		
		
	}
	
	public void moveUp(){ 
		
		yCenter -= Block.SIZE;
		updateBlocks();

		if(!isLegal()){
			yCenter += Block.SIZE;
			updateBlocks();
		}
	}


	public void moveLeft(){ 
		
		
		xCenter -= Block.SIZE;
		updateBlocks();

		if(!isLegal()){
			xCenter += Block.SIZE;
			updateBlocks();
			return;
		}
		shiftSound.play();

	}


	public void moveRight(){ 
		
		
		xCenter += Block.SIZE;

		updateBlocks();

		if(!isLegal()){
			xCenter -= Block.SIZE;
			updateBlocks();
			return;
		}
		shiftSound.play();
	}


	public void rotate(){ 
		
	}


	public void mirror(){ 
		
	}

	public void dropDead(){
		
		kchingSound.play();
		while(true){
			yCenter += Block.SIZE;
			updateBlocks();

			if(!isLegal()){
				yCenter -= Block.SIZE;
				updateBlocks();
				buryToGraveyard();
				//graveyard.checkFullRowsFormed();
				break;
			}
		}
	}


	protected void updateBlocks(){
		for(int i=0; i<blocks.length; i++){
			blocks[i].updateXY(xCenter, yCenter);
		}
	}


	public void draw(Graphics g){ 
		for(int i=0; i<blocks.length; i++){
			blocks[i].draw(g); 
		}
	}

	public void buryToGraveyard(){
		if(isBuried) return;
		for(int i=0; i<blocks.length; i++){
			graveyard.bury(blocks[i]);
		}
		isBuried = true;
	}


	public void keyPressed(KeyEvent e){ 
		
		if(isBuried) return;
		
		int keyCode = e.getKeyCode();

		if(keyCode==KeyEvent.VK_LEFT){
			moveLeft();
		}
		else if(keyCode==KeyEvent.VK_UP){
			moveUp();
		}
		else if(keyCode==KeyEvent.VK_RIGHT){
			moveRight();
		}
		else if(keyCode==KeyEvent.VK_M){
			mirror();
		}
		else if(keyCode==KeyEvent.VK_R){
			rotate();
		}
		else if(keyCode==KeyEvent.VK_DOWN){
			dropDead();
		}
		else if(keyCode==KeyEvent.VK_D){
			moveDown();
		}

	}


	public void keyTyped(KeyEvent e){ }
	public void keyReleased(KeyEvent e){ }

}












