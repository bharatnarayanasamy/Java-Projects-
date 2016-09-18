package jrJava.graphics;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextField;


public class ButtonHandler implements ActionListener{
	
	
	private JButton button1;
	private JButton button2;
	private JTextField textfield;
	
	public void setButtons(JButton button1, JButton button2){
		this.button1 = button1;
		this.button2 = button2;
	}
	
	public void setTextField(JTextField textfield){
		this.textfield = textfield;
	}
	
	
	public void actionPerformed(ActionEvent e){
		
		if(e.getSource().equals(button1)){
			// I need to take care of buying business logic.
			textfield.setText("I bought all of them.");
			
		}
		else if(e.getSource().equals(button2)){
			// I need to take care of selling business logic.
			textfield.setText("I sold half of them.");
		}
	
	}

}
