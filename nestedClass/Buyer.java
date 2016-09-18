package nestedClass;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextField;

public class Buyer implements ActionListener {

	//business fields
		//business methods
	private JButton b1;
	private JTextField tf;
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1){
			//access business logics
			tf.setText("Just purchased 1000 Apple stocks.");
		}
	}
	public void setButton(JButton b1){
		this.b1 = b1;
	}
	public void setTextfield(JTextField tf){
		this.tf = tf;
	}

	
	
	
	
}
