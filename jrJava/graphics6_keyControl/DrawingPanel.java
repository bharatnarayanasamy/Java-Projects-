package jrJava.graphics6_keyControl;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class DrawingPanel extends JPanel
						  implements KeyListener{
	
	private JFrame frame;

	private int x = 200;
	private int y = 300;
	private int radius = 80;
	private Color color = Color.red;

	public void paintComponent(Graphics g){
		
		Graphics2D g2 = (Graphics2D) g;
		
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		
		g2.setColor(Color.CYAN);
		g2.fillRect(0, 0, getWidth(), getHeight());
		
		g2.setColor(color);
		g2.fillOval(x-radius, y-radius, 2*radius, 2*radius);
	}
	
	
	
	
	
	
	public DrawingPanel(){
		frame = new JFrame("Key Control");
		frame.setBounds(100, 100, 600, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.addKeyListener(this);
		
		frame.getContentPane().add(this);
		
		frame.setVisible(true);
		
		
	}
	
	public void keyPressed(KeyEvent e) {
		
		if(e.getKeyCode()==e.VK_LEFT){x -=10; }
		else if(e.getKeyCode()==e.VK_RIGHT){x +=10; }
		else if(e.getKeyCode()==e.VK_UP){y -=10; }
		else if(e.getKeyCode()==e.VK_DOWN){y +=10; }
		
		repaint();
	}

	
	public void keyTyped(KeyEvent e) {}
	public void keyReleased(KeyEvent e) {}

	
	
	public static void main(String[] args) {
		new DrawingPanel();
	}
}








