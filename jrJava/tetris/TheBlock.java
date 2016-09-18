package jrJava.tetris;

public class TheBlock extends TetrisObject{

	
	public void createShape() {
		blocks = new Block[1];
		
		blocks[0] =  new Block(0, 0, color);
		
	}
	
	

}
