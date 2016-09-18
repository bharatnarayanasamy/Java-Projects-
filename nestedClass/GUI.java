package nestedClass;

import java.awt.Color;

import javax.swing.*;

public class GUI {
	
	private JButton b1;
	private JTextField tf;
	
	public GUI(){
		JFrame frame = new JFrame();
		frame.setTitle("Nested Class Practice");
		frame.setBounds(200, 100, 400, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.white);
		frame.getContentPane().add(panel);
		
		b1 = new JButton("Buy Stock");
		b1.setBounds(50, 70, 120, 20);
		panel.add(b1);
		
		tf = new JTextField();
		tf.setBounds(50, 150, 250, 20);
		panel.add(tf);
		
		Buyer buyer = new Buyer();
		buyer.setButton(b1);
		buyer.setTextfield(tf);
		b1.addActionListener(buyer);
		
		frame.setVisible(true);
	}
	public static void main(String[] args){
		new GUI();
	}
	
	
	
}
