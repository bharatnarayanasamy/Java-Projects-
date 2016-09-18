package jrJava.brickBusterHome;


import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;

import javax.swing.JFrame;

import resources.SoundPlayer;
import resources.Timer;
import resources.DrawingBoard;

public class Coordinator {

	public static void main(String[] args) {
			DrawingBoard board = new DrawingBoard(570,700);
			Timer timer = new Timer();
			Ball ball1 = new Ball(300, 500, 4, -6, Color.red);
			Ball ball2 = new Ball(300, 500, -5, -4, Color.blue);
			Ball ball3 = new Ball(300, 500, 3, -4, Color.green);
			Wall wall = new Wall();
			Deflector deflector = new Deflector(51,616);
			
			deflector.setWall(wall);
			
			
			ball1.setDeflector(deflector);
			ball1.setWall(wall);
			ball2.setDeflector(deflector);
			ball2.setWall(wall);
			ball3.setDeflector(deflector);
			ball3.setWall(wall);
			
			JFrame frame = board.getJFrame();
			frame.addKeyListener(deflector);
			
			board.addMouseListener(deflector);
			board.addMouseMotionListener(deflector);

			TheBrickManager bM  = new TheBrickManager(wall.getXLeft()+200,wall.getYTop(),100,20,15);
			ball1.setTheBrickManager(bM);
			ball2.setTheBrickManager(bM);
			ball3.setTheBrickManager(bM);
			
			
			BrickManager tBM  = new BrickManager(wall.getXLeft()+100,wall.getYTop(),100,20,15);
			ball1.setBrickManager(tBM);
			ball2.setBrickManager(tBM);
			ball3.setBrickManager(tBM);
			
			ABrickManager aBM  = new ABrickManager(wall.getXLeft(),wall.getYTop(),100,20,15);
			ball1.setABrickManager(aBM);
			ball2.setABrickManager(aBM);
			ball3.setABrickManager(aBM);
			
			while(true){
				
				board.clear();
				
				ball1.move();
				ball2.move();
				ball3.move();
				
				
				ball1.draw(board);
				ball2.draw(board);
				ball3.draw(board);
				
				wall.draw(board);
				deflector.draw(board);
				
				bM.draw(board);
				tBM.draw(board);
				aBM.draw(board);
				
				
				board.repaint();
				timer.pause(10);
				if(BrickManager.numberOfBricks()&&TheBrickManager.numOfBricks()&&ABrickManager.numOfBricks()) break;
				else if(ball1.getY()>=700 && ball2.getY()>=700 && ball3.getY()>=700) break;
			}
			
			
			if(BrickManager.numberOfBricks()&&TheBrickManager.numOfBricks()&&ABrickManager.numOfBricks()){
				board.clear();
				Graphics2D canvas = board.getCanvas();
				canvas.setColor(Color.black);
				canvas.setStroke(new BasicStroke(20f));
				canvas.drawLine(250, 200, 250, 300);
				canvas.drawLine(350, 200, 350, 300);
				canvas.drawArc(150, 168, 300, 300, 200, 145);
				board.repaint();
			}
			else if(ball1.getY()>=700 && ball2.getY()>=700 && ball3.getY()>=700){
				board.clear();
				Graphics2D canvas = board.getCanvas();
				canvas.setColor(Color.black);
				canvas.setStroke(new BasicStroke(20f));
				canvas.drawLine(250, 200, 250, 300);
				canvas.drawLine(350, 200, 350, 300);
				canvas.drawArc(150, 378, 300, 300, 20, 150);
				board.repaint();
			}
	}
			
}


