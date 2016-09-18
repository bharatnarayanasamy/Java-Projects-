package jrJava.memoryGameInheritance;

import javax.swing.ImageIcon;

import resources.Timer;

public class Coordinator {

	public static final int SCREEN_WIDTH = 600;
	public static final int SCREEN_HEIGHT = 600;
	
	
	public static void main(String[] args) {

		DrawingPanel panel = new DrawingPanel();
		Timer timer = new Timer();
		
		CardManager cardManager = new CardManager(22, 5);
		cardManager.setDrawingPanel(panel); 
		panel.addMouseListener(cardManager); 
		
		
		while(true){
			panel.repaint();
			cardManager.applyGameLogic();
			timer.pause(30);
		}
		
	}
	
}
