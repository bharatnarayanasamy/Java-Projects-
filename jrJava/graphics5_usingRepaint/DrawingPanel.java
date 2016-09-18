package jrJava.graphics5_usingRepaint;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class DrawingPanel extends JPanel{

	private int x = 200;
	private int y = 300;
	private int radius = 80;
	private Color color = Color.red;

	public void paint(Graphics g){
		g.setColor(color);
		g.fillOval(x-radius, y-radius, 2*radius, 2*radius);
	}
	 

}
