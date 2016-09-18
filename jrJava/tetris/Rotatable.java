package jrJava.tetris;

import resources.SoundPlayer;

public abstract class Rotatable extends TetrisObject{
	
	protected static SoundPlayer arrowSound;
	
	static{
		arrowSound = new SoundPlayer();
		arrowSound.load(Coordinator.RESOURCE_PATH + "arrow.wav");
	}
	
	public void rotate(){ 
		
	
		for(int i=0; i<blocks.length; i++){
		 
			blocks[i].rotate();
		}
		updateBlocks();

		if(!isLegal()){
			for(int i=0; i<blocks.length; i++){
				blocks[i].counterRotate();
			}
			updateBlocks();
			return;
		}
		arrowSound.play();
		
	}


	public void mirror(){ 
		
		for(int i=0; i<blocks.length; i++){
		 
			blocks[i].mirror();
		}
		updateBlocks();

		if(!isLegal()){
			for(int i=0; i<blocks.length; i++){
				blocks[i].mirror();
			}
			updateBlocks();
			return;
		}
		arrowSound.play();
		
	}


}
