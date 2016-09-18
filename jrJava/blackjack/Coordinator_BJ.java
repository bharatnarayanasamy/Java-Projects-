package jrJava.blackjack;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;

public class Coordinator_BJ {

	public static final int SCREEN_WIDTH = 600;
	public static final int SCREEN_HEIGHT = 600;
	
	public static void main(String[] args) {
		DrawingPanel_BJ panel = new DrawingPanel_BJ();
		Image image = new ImageIcon("jrJava/blackjack/apple.png").getImage();
		
		Card_BJ c = new Card_BJ(0, 0, image);
		panel.setCards(c);
		
		panel.repaint();
	}

}
