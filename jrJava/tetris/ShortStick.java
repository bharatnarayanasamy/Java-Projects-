package jrJava.tetris;

import resources.SoundPlayer;

public class ShortStick extends Rotatable{

	protected static SoundPlayer arrowSound;
	
	static{
		arrowSound = new SoundPlayer();
		arrowSound.load(Coordinator.RESOURCE_PATH + "arrow.wav");
	}
	
	
	public void createShape() {
		blocks = new Block[3];
		blocks[0] = new Block(0, -1, color);
		blocks[1] = new Block(0,  0, color);
		blocks[2] = new Block(0,  1, color);
	}
	public void rotate() {
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

}
