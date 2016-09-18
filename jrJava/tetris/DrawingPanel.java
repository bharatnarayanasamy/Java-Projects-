package jrJava.tetris;

import java.awt.*;
import java.awt.event.KeyListener;
import java.util.ArrayList;

import javax.swing.*;

public class DrawingPanel extends JPanel {

	private ArrayList<Drawable> drawables = new ArrayList<Drawable>();
	private JFrame frame;
	
	public DrawingPanel(int width, int height){
		frame = new JFrame("Tetris");
		frame.setBounds(200, 0, width, height);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setPreferredSize(new Dimension(width, height));
		frame.pack();
		frame.getContentPane().add(this);
		frame.setVisible(true);
	}
	
	
	public void addDrawable(Drawable drawable){
		drawables.add(drawable);
	}
	public void removeDrawable(Drawable drawable){
		drawables.remove(drawable);
	}
	
	
	public void addKeyListener(KeyListener listener){
		frame.addKeyListener(listener);
	}
	public void removeKeyListener(KeyListener listener){
		frame.removeKeyListener(listener);
	}
	
	
	public void paintComponent(Graphics g){
		
		((Graphics2D)g).setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		
		g.setColor(Color.white);
		g.fillRect(0, 0, getWidth(), getHeight());
		
		for(int i=0; i<drawables.size(); i++){
			drawables.get(i).draw(g);
		}
	}
	 
}










