package jrJava.graphics;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class MyView {
	
	private JFrame frame;
	private JButton button1;
	private JButton button2;
	private JTextField textfield;
	
	
    public MyView(){
		
		frame = new JFrame();
		frame.setBounds(200,200,400,300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Bharat's view");
		frame.getContentPane().setBackground(Color.green);
		
		frame.setLayout(null);
		
		
		button1 = new JButton("BUY");
		button1.setBounds(100, 80, 100, 20);
		frame.add(button1);
		
		button2 = new JButton("SELL");
		button2.setBounds(100, 110, 100, 20);
		frame.add(button2);
		
		textfield = new JTextField();
		textfield.setBounds(100, 160, 200, 20);
		frame.add(textfield);
		
		ButtonHandler handler = new ButtonHandler();
		handler.setButtons(button1, button2);
		handler.setTextField(textfield);
		button1.addActionListener(handler);
		button2.addActionListener(handler);

		frame.setVisible(true);
	}
   
	
	public static void main(String[] args){
		new MyView();
	}
	
}
