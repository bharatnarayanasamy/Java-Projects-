package jrJava.tetris;

public class Donut extends TetrisObject{
	
	public Donut(){
		super();
	}
	
	public void createShape(){
		blocks = new Block[8];
		blocks[0] = new Block(-1, -1, color);
		blocks[1] = new Block(0, -1, color);
		blocks[2] = new Block(1, -1, color);
		blocks[3] = new Block(-1, 0, color);
		blocks[4] = new Block(1, 0, color);
		blocks[5] = new Block(-1, 1, color);
		blocks[6] = new Block(0, 1, color);
		blocks[7] = new Block(1, 1, color);
		

	}

}
