package jrJava.objectpractice2;

import java.awt.Color;

import resources.DrawingBoard;
import resources.Timer;

public class TheOneThatBringsInThread {

	public static void main(String[] args) {
		Ball b1 = new Ball(650,250,Color.cyan,50,5,0);
		Ball b2 = new Ball(650,250,Color.green,50,-5,-2);
		Ball b3 = new Ball(650,250,Color.blue,50,-5,2);
		
		
		Timer timer = new Timer();
		DrawingBoard board = new DrawingBoard(1000,7000);
		for(int i = 0; i<100; i++){
		board.clear();
		b1.draw(board);
		b2.draw(board);
		b3.draw(board);
		
		b1.move();
		b2.move();
		b3.move();
		
		b1.grow();
		b2.grow();
		b3.grow();
		board.repaint();
		timer.pause(20);
		}
		
		/*
		ref.TellAboutYourself();
		ref.move();
		ref.TellAboutYourself();
		ref.move();
		ref.TellAboutYourself();
		ref.grow();
		ref.TellAboutYourself();
		ref.grow();
		ref.TellAboutYourself();
		ref.draw(board);
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//System.out.println(ref);
	//	System.out.println(ref.radius);
		//ref.radius = 10 + ref.radius;
		//System.out.println(ref.radius);
		
		//ref.move();
		
	//	ref.grow();
		
		//ref.TellAboutYourself();
	 }

}
