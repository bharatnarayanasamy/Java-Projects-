package jrJava.blackjack;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class DrawingPanel_BJ extends JPanel{
	
	private JFrame frame;
	
	private Card_BJ cards;

	
	public DrawingPanel_BJ(){
		frame = new JFrame("My BlackJack Game");
		frame.setBounds(200, 0, Coordinator_BJ.SCREEN_WIDTH, Coordinator_BJ.SCREEN_HEIGHT);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		frame.getContentPane().add(this);	
		frame.setVisible(true);
		System.out.println("DrawingPanel_BJ");

	}
	
	public void paintComponent(Graphics g){
		System.out.println("paintCompBeg");
		g.setColor(Color.black);
		g.fillRect(0, 0, this.getWidth(), this.getHeight());
		
		((Graphics2D)g).setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		((Graphics2D)g).setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);

		cards.draw(g); 
		System.out.println("paintCompEnd");
		//for(int i=0;i<cards.length;i++) cards[i].draw(g);
	}
	
	public void setCards(Card_BJ cards){
		this.cards = cards; 
		System.out.println("setCards");
	}
}
