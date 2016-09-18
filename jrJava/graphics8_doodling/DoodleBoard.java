package jrJava.graphics8_doodling;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Stroke;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class DoodleBoard extends JPanel implements MouseListener, MouseMotionListener, ActionListener {

	private JFrame frame;
	private JPanel buttonPanel;
	private JButton red, green, blue, orange, black;
	private JButton stroke1, stroke2, stroke3, stroke4, stroke5, stroke6, stroke7;

	private int x, y; // current position of mouse.
	private int lastX, lastY;
	private Color color = Color.black;
	private Color bgColor = Color.white;
	private Stroke[] strokes = {new BasicStroke(0.5f), new BasicStroke(1f), new BasicStroke(2f), new BasicStroke(4f), new BasicStroke(8f), new BasicStroke(16f), new BasicStroke(32f)};
	private Stroke stroke = new BasicStroke(1f);
	private boolean initialized;
	private boolean eraseMode;


	public DoodleBoard(){
		frame = new JFrame("Doodle Board");
		frame.setBounds(100, 100, 900, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBackground(Color.cyan);

		this.setLayout(null);
		buttonPanel = new JPanel();
		buttonPanel.setBounds(0, 0, 900, 35);
		this.add(buttonPanel);
		buttonPanel.setLayout(new FlowLayout()); 

		red = new JButton("Red");
		red.addActionListener(this);
		buttonPanel.add(red);

		green = new JButton("Green");
		green.addActionListener(this);
		buttonPanel.add(green);

		blue = new JButton("Blue");
		blue.addActionListener(this);
		buttonPanel.add(blue);

		orange = new JButton("Orange");
		orange.addActionListener(this);
		buttonPanel.add(orange);
		
		black = new JButton("Black");
		black.addActionListener(this);
		buttonPanel.add(black);

		stroke1 = new JButton("0.5 px");
		stroke1.addActionListener(this);
		buttonPanel.add(stroke1);

		stroke2 = new JButton("1 px");
		stroke2.addActionListener(this);
		buttonPanel.add(stroke2);

		stroke3 = new JButton("2 px");
		stroke3.addActionListener(this);
		buttonPanel.add(stroke3);

		stroke4 = new JButton("4 px");
		stroke4.addActionListener(this);
		buttonPanel.add(stroke4);
		
		stroke5 = new JButton("8 px");
		stroke5.addActionListener(this);
		buttonPanel.add(stroke5);
		
		stroke6 = new JButton("16 px");
		stroke6.addActionListener(this);
		buttonPanel.add(stroke6);

		stroke7 = new JButton("32 px");
		stroke7.addActionListener(this);
		buttonPanel.add(stroke7);
		
		this.addMouseListener(this); 
		this.addMouseMotionListener(this); 

		frame.getContentPane().add(this);
		frame.setVisible(true);
	}


	public void paintComponent(Graphics g){

		Graphics2D g2 = (Graphics2D) g;
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON); 

		if(!initialized){
			g2.setColor(bgColor);
			g2.fillRect(0, 0, getWidth(), getHeight());
			initialized = true;
		}

		if(eraseMode){
			g2.setColor(bgColor);
			g2.fillOval(x-5, y-5, 10, 10); 
		}
		else {
			g2.setColor(color);
			g2.setStroke(stroke);
			g2.drawLine(lastX, lastY, x, y);
		}

		lastX = x;
		lastY = y;
	}


	public void actionPerformed(ActionEvent e){

		if(e.getSource().equals(red)){ color = Color.red; }
		else if(e.getSource().equals(green)){ color = Color.green; }
		else if(e.getSource().equals(blue)){ color = Color.blue; }
		else if(e.getSource().equals(orange)){ color = Color.orange; }
		else if(e.getSource().equals(black)){ color = Color.black; }

		else if(e.getSource().equals(stroke1)){ stroke = strokes[0]; }
		else if(e.getSource().equals(stroke2)){ stroke = strokes[1]; }
		else if(e.getSource().equals(stroke3)){ stroke = strokes[2]; }
		else if(e.getSource().equals(stroke4)){ stroke = strokes[3]; }
		else if(e.getSource().equals(stroke5)){ stroke = strokes[4]; }
		else if(e.getSource().equals(stroke6)){ stroke = strokes[5]; }
		else if(e.getSource().equals(stroke7)){ stroke = strokes[6]; }


	}



	public void mousePressed(MouseEvent e) {
		lastX = e.getX();
		lastY = e.getY();
	}


	public void mouseDragged(MouseEvent e) {

		eraseMode = e.isShiftDown();

		x = e.getX();
		y = e.getY();

		repaint();
	}


	public void mouseMoved(MouseEvent e) {}
	public void mouseClicked(MouseEvent e) {}
	public void mouseReleased(MouseEvent e) {}
	public void mouseEntered(MouseEvent e) {}
	public void mouseExited(MouseEvent e) {}



	public static void main(String[] args) {
		new DoodleBoard();
	}

}










