package jrJava.memoryGameCreate;

import javax.swing.ImageIcon;

import jrJava.memoryGameWith2DArray.CardManager;
import resources.Timer;

public class Coordinator {
	
	public static final int SCREEN_WIDTH = 600;
	public static final int SCREEN_HEIGHT = 600;
	
	
	public static void main(String[] args){
		
		DrawingPanel panel = new DrawingPanel();
		Timer timer = new Timer();
		
		jrJava.memoryGameCreate.CardManager cardManager = new jrJava.memoryGameCreate.CardManager(14, 4);
		cardManager.setDrawingPanel(panel);
		
		panel.addMouseListener(cardManager);
		
		cardManager.showAll();
		panel.repaint();
		timer.pause(2000);

		cardManager.hideAll();
		panel.repaint();
		
		while(true){
			panel.repaint();
			cardManager.applyGameLogic();
			timer.pause(10);
		}
		
	}

}
