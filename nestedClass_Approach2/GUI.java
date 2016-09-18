package nestedClass_Approach2;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class GUI implements ActionListener{
	
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
		
		b1.addActionListener(this);
		
		
		
		frame.setVisible(true);
	}
	public static void main(String[] args){
		new GUI();
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1){
			//access business logics
			tf.setText("Just purchased 1000 Apple stocks.");
		}
	}
	
	
	
}
