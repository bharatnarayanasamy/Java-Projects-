package jrJava.tetris;

import java.awt.Graphics;
import java.util.ArrayList;

import resources.SoundPlayer;

public class Graveyard implements Drawable {

	private SoundPlayer eerieSound;
	
	private TombStack[] stacks;
	private ArrayList<Integer> fullRowYValues;
	private long timeFullRowFormed;

	public Graveyard(){
		int num = (Wall.RIGHT-Wall.LEFT)/Block.SIZE;
		stacks = new TombStack[num];
		for(int i=0; i<num; i++){
			stacks[i] = new TombStack(Wall.LEFT + Block.SIZE*i);
		}
		
		eerieSound = new SoundPlayer();
		eerieSound.load(Coordinator.RESOURCE_PATH + "eerie.wav");
		fullRowYValues = new ArrayList<Integer>();
	}


	public boolean isInside(Block block){
		int index = (block.getX()-Wall.LEFT)/Block.SIZE;
		return stacks[index].isInside(block);
	}

	public void bury(Block block){
		stacks[(block.getX()-Wall.LEFT)/Block.SIZE].add(block);
		checkFullRowsFormed(block);
	}


	public void draw(Graphics g){
		for(int i=0; i<stacks.length; i++){
			stacks[i].draw(g); 
		}
	}
	
	public void checkFullRowsFormed(Block block){
		int y = block.getY();
		for(int i=0;i<stacks.length;i++){
			if(!stacks[i].contains(y)) return;
		}
		//Reaching down here means it formed full row
		for(int i=0;i<stacks.length;i++){
			stacks[i].markFullRow(y);
		}
		
		timeFullRowFormed = System.currentTimeMillis();
		
		
		//We need to add the 'y' into the fullRowYValues.
		//We will sort them while we insert the 'y'.
		
		// Case 1: If it finds an entry that is greater than y
		for(int i=0;i<fullRowYValues.size();i++){
			if(fullRowYValues.get(i).intValue()>y) {
				fullRowYValues.add(i, y);
				return;
			}
		}
		
		//Case 2: If fullRowYValues is empty.
		//Case 3: If 'y' is the biggest value.
		fullRowYValues.add(new Integer(y));
		
		
	
	}
	
	public int clearFullRowsIfAny(){
		if(fullRowYValues.size()==0) return 0;
		int eachY;
		
		if(System.currentTimeMillis()<timeFullRowFormed + 500) return 0;
		
		eerieSound.play();
		
		
		int numOfFullRowsCleared = 0;
		for(int i=0;i<fullRowYValues.size();i++){
			eachY = fullRowYValues.get(i); // auto-unboxing
			
			for(int j=0;j<stacks.length;j++){
				stacks[j].remove(eachY);
				stacks[j].shiftDownAllBlocksAbove(eachY);
			}
			numOfFullRowsCleared++;
		}
		
		fullRowYValues.clear();
		
		return numOfFullRowsCleared;
		
		
		
	}
	
	

	public void report(){
		for(int i=0;i<stacks.length;i++){
			stacks[i].report();
		}
		System.out.println();
	}

}
