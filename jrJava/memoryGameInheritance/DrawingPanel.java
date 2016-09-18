package jrJava.memoryGameInheritance;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class DrawingPanel extends JPanel {

	private JFrame frame;
	private JLabel scoreLabel;
	
	private Card[] cards;
	
	
	public DrawingPanel(){
		
		frame = new JFrame("Sir's Memory Card Game");
		frame.setBounds(200, 0, Coordinator.SCREEN_WIDTH, Coordinator.SCREEN_HEIGHT);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.getContentPane().setPreferredSize(new Dimension(Coordinator.SCREEN_WIDTH, Coordinator.SCREEN_HEIGHT));
		frame.pack();
		
		this.setLayout(null);
		scoreLabel = new JLabel();
		scoreLabel.setText("Score:    "); 
		scoreLabel.setBounds(350, 10, 200, 30);
		this.add(scoreLabel);
		
		
		frame.getContentPane().add(this);
		frame.setVisible(true);
 	}
	
	
	public void setCards(Card[] cards){ this.cards = cards; }
	
	
	public void setScore(int score){
		scoreLabel.setText("Score: "+score);
	}
	
	
	// public void repaint(){ .. }  // inherited.
	
	
	public void paintComponent(Graphics g){
		if(cards==null) return;
		
		g.setColor(Color.white);
		g.fillRect(0, 0, this.getWidth(), this.getHeight());
		
		((Graphics2D)g).setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		((Graphics2D)g).setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
		
		for(int i=0; i<cards.length; i++) cards[i].draw(g);
	}
	
}










