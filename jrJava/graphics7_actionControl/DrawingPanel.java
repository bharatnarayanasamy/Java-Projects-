package jrJava.graphics7_actionControl;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
 
public class DrawingPanel extends JPanel implements ActionListener{
	
	private JFrame frame;

	private JButton left, right, up, down, grow, shrink;
	
	private int x = 200;
	private int y = 300;
	private int radius = 80;
	private Color color = Color.red;
	
	
	public DrawingPanel(){
		frame = new JFrame("Key Control");
		frame.setBounds(100, 100, 600, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setLayout(null);
		
		left = new JButton("Left");
		left.addActionListener(this);
		left.setBounds(20, 20, 70, 20);
		this.add(left);

		right = new JButton("Right");
		right.addActionListener(this);
		right.setBounds(100, 20, 70, 20);
		this.add(right);

		up = new JButton("Up");
		up.addActionListener(this);
		up.setBounds(180, 20, 70, 20);
		this.add(up);

		down = new JButton("Down");
		down.addActionListener(this);
		down.setBounds(260, 20, 70, 20);
		this.add(down);

		grow = new JButton("Grow");
		grow.addActionListener(this);
		grow.setBounds(340, 20, 70, 20);
		this.add(grow);

		shrink = new JButton("Shrink");
		shrink.addActionListener(this);
		shrink.setBounds(420, 20, 80, 20);
		this.add(shrink);
		
		frame.getContentPane().add(this);
		frame.setVisible(true);
		
		
	}
	

	public void paintComponent(Graphics g){
		
		Graphics2D g2 = (Graphics2D) g;
		
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		
		g2.setColor(Color.WHITE);
		g2.fillRect(0, 0, getWidth(), getHeight());
		
		g2.setColor(color);
		g2.fillOval(x-radius, y-radius, 2*radius, 2*radius);
	}
	
	public void actionPerformed(ActionEvent e){
			
		if(e.getSource().equals(left)){ x-=10; }
		else if(e.getSource().equals(right)){ x+=10; }
		else if(e.getSource().equals(up)){ y-=10; }
		else if(e.getSource().equals(down)){ y+=10; }
		else if(e.getSource().equals(grow)){ radius+=10; }
		else if(e.getSource().equals(shrink)){ radius-=10; }
		
		repaint();
	}

	public static void main(String[] args) {
		new DrawingPanel();
	}
}








