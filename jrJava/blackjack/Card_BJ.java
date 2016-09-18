package jrJava.blackjack;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;

import jrJava.memoryGame.DrawingPanel;

public class Card_BJ {

	private Image image;
	private int x, y;
	public static int WIDTH;
	public static int HEIGHT;
	
	static{
		WIDTH = 100;
		HEIGHT = 150;
	}

	public void draw(Graphics g) {
		//g.setColor(Color.red);
		//g.drawImage(image, x, y, WIDTH, HEIGHT, null);
		System.out.println("I am here");
		g.drawImage(new ImageIcon("jrJava/blackjack/apple.png").getImage(), 50, 50, 100, 100, null);

	}
	
	public Card_BJ(int x, int y, Image image){
		this.x = x;
		this.y = y;
		this.image = image;
		System.out.println("Card_BJ");

	}

}
