package jrJava.graphics4_layouts;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.*;

public class LayoutTest {

	private JFrame frame;
	private JPanel panel;
	private JButton[] buttons;
	private JPanel smallPanel;
	
	public LayoutTest(){
		frame = new JFrame("Layouts");
		frame.setBounds(100, 100, 400, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      		
		panel = new JPanel();
		
		buttons = new JButton[10];
		 
		for(int i=0;i<buttons.length;i++){
			buttons[i] = new JButton("Button " + i);
		}
		
		smallPanel = new JPanel();
		smallPanel.setLayout(new GridLayout(0, 1));
		smallPanel.add(buttons[7]);
		smallPanel.add(buttons[8]);
		smallPanel.add(buttons[9]);
		
		
		//useFlowLayout();
		//useGridLayout();
	    useBorderLayout();
		
		frame.getContentPane().add(panel);
		frame.pack();
		frame.setVisible(true);
	}
	
	private void useBorderLayout(){
		panel.setLayout(new BorderLayout());
	   
	    panel.add(buttons[0], BorderLayout.NORTH);
	    panel.add(buttons[1], BorderLayout.SOUTH);
	    panel.add(buttons[2], BorderLayout.WEST);
	    panel.add(buttons[3], BorderLayout.EAST);
	    panel.add(smallPanel, BorderLayout.CENTER);
	    
	}
	
	
	private void useGridLayout(){
		panel.setLayout(new GridLayout(2, 0));
	    
	    
    	panel.add(buttons[0]);
    	panel.add(buttons[1]);
    	panel.add(buttons[2]);
    	panel.add(buttons[3]);
    	panel.add(buttons[4]);
    	panel.add(buttons[5]);
    	panel.add(buttons[6]);
    	panel.add(smallPanel);
	}
	
	private void useFlowLayout(){
		panel.setLayout(new FlowLayout());
	    
	    	panel.add(buttons[0]);
	    	panel.add(smallPanel);
	    	panel.add(buttons[1]);
	    	panel.add(buttons[2]);
	    	panel.add(buttons[3]);
	    	panel.add(buttons[4]);
	    	panel.add(buttons[5]);
	    	panel.add(buttons[6]);
	        
	        
	}
	
	
	public static void main(String[] args) {
		new LayoutTest();
	}

}
