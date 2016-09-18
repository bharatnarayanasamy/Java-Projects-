package jrJava.tetris;

public class ShortL extends Rotatable{
	public ShortL(){
		super();
	}
	
	public void createShape(){
		blocks = new Block[3];
		blocks[0] = new Block(0, -1, color);
		blocks[1] = new Block(0, 0, color);
		blocks[2] = new Block(1, 0, color);
	}
}
