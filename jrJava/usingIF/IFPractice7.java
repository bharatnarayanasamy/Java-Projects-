package jrJava.usingIF;

import java.awt.*;
import java.util.Scanner;

import resources.*;

public class IFPractice7 {

	public static void main(String[] args) {
		
		int x = 200;
		int y = 250;
		int radius = 100;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the x-coordinate value of the center of the circle:");
		x = scanner.nextInt();
		System.out.println("Enter the y-coordinate value of the center of the circle:");
		y = scanner.nextInt();
		

		DrawingBoard board = new DrawingBoard(800, 600);
		Graphics2D canvas = board.getCanvas();
		
		if(x<400 && y<300){
			canvas.setColor(Color.red);
		}
		else if(x>=400 && y<300){
			canvas.setColor(Color.blue);
		}
		else if(x<400 && y>=300){
			canvas.setColor(Color.green);
		}
		else{
			canvas.setColor(Color.orange);
		}
		
		canvas.fillOval(x-radius, y-radius, 2*radius, 2*radius);
		
		
		
		canvas.setColor(Color.black);
		
		canvas.drawLine(0, 300, 800, 300);
		canvas.drawLine(400, 0, 400, 600);
		board.repaint();
	}

}
