package jrJava.graphics5_usingRepaint;


import javax.swing.*;


public class DrawingTest {

	private JFrame frame;
	private DrawingPanel panel;
	
	
	public DrawingTest(){
		frame = new JFrame("Layouts");
		frame.setBounds(100, 100, 600, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel = new DrawingPanel();
		
		frame.getContentPane().add(panel);
		
		frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		new DrawingTest();
	}

}
