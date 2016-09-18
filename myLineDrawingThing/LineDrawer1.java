package myLineDrawingThing;

import java.awt.Graphics2D;
import java.awt.Color;

import resources.DrawingBoard;
import resources.Timer;

public class LineDrawer1 {

	private static final int screenWidth = 600;
	private static final int screenHeight = 600;
	//private int[] array = new int[]
	

	public static void main(String[] args) throws InterruptedException{


		DrawingBoard board = new DrawingBoard(600, 600);
		Graphics2D canvas = board.getCanvas();
		Timer timer = new Timer();

		board.clear();
		canvas.setColor(Color.black);

		int x1 = 0;
		int	y1 = screenHeight/2;
		int x2 = 0;
		int y2 = screenHeight/2;

		int xscale = 1;
		int yscale = 1;
		
		int dx = 0;
		int dy = 0;
		int a = 1;
		int b = 0;
		int setTheColor;
		while(x2<screenWidth && y2<screenHeight && y2>0){
			int prev_a = a;
			a = (int)(Math.random()*5);
			int xscale_minus_1 = (int)(Math.random()*4);
			int yscale_minus_1 = (int)(Math.random()*4);
			xscale = xscale_minus_1 + 1;
			yscale = yscale_minus_1 + 1;
			
			xscale = 1;
			yscale = 1;
			if( prev_a == 1 || prev_a == 2 ) a=0;
			else if( prev_a == 0 && a==0){
				b = (int)(Math.random()*4);
				a = b+1;
			} else if( prev_a == 3 && a == 3) a=4;
			else if ( prev_a == 4 && a == 4) a = 3;
			
			if( a == 0 ) {
				dx=1;
				dy=0;
			} 
			else if( a == 1) {
				dx = 0;
				dy = -1;
			}
			else if( a == 2) {
				dx = 0;
				dy = 1;
			} /*else if ( a == 3) {
				dx = 1;
				dy = 1;
			} else if( a == 4 ) {
				dx = 1;
				dy = -1;
			}*/
			
			for(int i=0;i<10;i+=1){
				canvas.drawLine(x1, y1, x2, y2);
				board.repaint();
				Thread.sleep(3);
				x1 = x2;
				y1 = y2;
				x2 = x1 + dx*xscale;
				y2 = y1 + dy*yscale;
			}

			if( x2 >= screenWidth ) {
				x2 = 0;
				x1 = 0;
				setTheColor = (int)(Math.random()*12);
				if(setTheColor==0) canvas.setColor(Color.black);
				if(setTheColor==1) canvas.setColor(Color.blue);
				if(setTheColor==2) canvas.setColor(Color.cyan);
				if(setTheColor==3) canvas.setColor(Color.darkGray);
				if(setTheColor==4) canvas.setColor(Color.gray);
				if(setTheColor==5) canvas.setColor(Color.green);
				if(setTheColor==6) canvas.setColor(Color.lightGray);
				if(setTheColor==7) canvas.setColor(Color.magenta);
				if(setTheColor==8) canvas.setColor(Color.orange);
				if(setTheColor==9) canvas.setColor(Color.pink);
				if(setTheColor==10) canvas.setColor(Color.red);
				if(setTheColor==11) canvas.setColor(Color.yellow);
				Thread.sleep(3);
				
			}
			if( y2 >= screenHeight ) {
				y2 = screenHeight - 20;
				Thread.sleep(3);
			}
			if( y2 <= 0 ) {
				y2 = 20;
				Thread.sleep(3);
			}
		}
		canvas.drawLine(0, 0, 50, 50);
		board.repaint();

	}


}
