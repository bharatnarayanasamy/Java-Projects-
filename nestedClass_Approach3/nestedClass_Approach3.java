package nestedClass_Approach3;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;



public class nestedClass_Approach3 {
	
	
	private JButton b1;
	private JTextField tf;
	
	public nestedClass_Approach3(){
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
		
		b1.addActionListener(new Buyer());
		
		frame.setVisible(true);
	}
	public static void main(String[] args){
		new nestedClass_Approach3();
	}
	
	private String sillyMethod(){
		return "I am SILLY";
	}
	
	public class Buyer implements ActionListener {

		//business fields
			//business methods
		private JButton b1;
		private JTextField tf;
		
		
		
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==b1){
				//access business logics
				tf.setText(sillyMethod() + ": Just purchased 1000 Apple stocks.");
			}
		}
		public void setButton(JButton b1){
			this.b1 = b1;
		}
		public void setTextfield(JTextField tf){
			this.tf = tf;
		}

		
		
		
		
	}

}
