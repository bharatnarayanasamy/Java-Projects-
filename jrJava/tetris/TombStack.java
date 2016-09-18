package jrJava.tetris;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;


public class TombStack {

	private ArrayList<Block> blocks;
	
	
	public TombStack(int x){
		blocks = new ArrayList<Block>();
		/*
		int num = (int)(Math.random()*8);
		Block block;
		for(int i=0; i<num; i++){
			block = new Block(0, -i, new Color((int)(Math.random()*256), (int)(Math.random()*256), (int)(Math.random()*256)));
			block.updateXY(x, Wall.BOTTOM-Block.SIZE);
			blocks.add(block);
		}
		*/
	}
	
	
	public void add(Block block){
		blocks.add(block);
	}
	
	
	public boolean isInside(Block block){
		Block each;
		for(int i=0; i<blocks.size(); i++){
			each = blocks.get(i);
			if(each.getX()==block.getX() && each.getY()==block.getY()) return true;
		}
		return false;
	}
	
	
	public boolean contains(int y){
		for(int i=0; i<blocks.size(); i++){
			 if(blocks.get(i).getY()==y) return true;
		}
		return false;
	}
	
	
	public void markFullRow(int y){
		Block each;
		for(int i=0; i<blocks.size(); i++){
			each = blocks.get(i);
			if(each.getY()==y){
				each.markAsFullRowBlock();
				return;
			}
		}
	}
	
	
	public void remove(int y){
		for(int i=0; i<blocks.size(); i++){
			if(blocks.get(i).getY()==y){
				blocks.remove(i);
				return;
			}
		}
	}
	
	
	public void shiftDownAllBlocksAbove(int y){
		Block each;
		for(int i=0; i<blocks.size(); i++){
			each = blocks.get(i);
			if(each.getY()<y){
				each.shiftDown();
			}
		}
	}
	
	
	
	public void draw(Graphics g){
		for(int i=0; i<blocks.size(); i++){
			blocks.get(i).draw(g);
		}
	}
	
	
	public void report(){
		System.out.print(blocks.size() + " ");
	}
}















