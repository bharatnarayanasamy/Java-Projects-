package jrJava.graphics;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class SimpleGUI implements ActionListener{

	private JFrame frame;
	private JPanel panel;
	private JLabel imageLabel1, imageLabel2, imageLabel3;
	private JScrollPane scrollPane;
	private JButton button1, button2;
	private JPanel smallPanel;
	private JTextField textField;
	private JTextArea textArea;
	private JLabel textLabel;
	private JMenuBar menuBar;
	private JMenu menu1, menu2;
	private JMenuItem item1A, item1B, item2A, item2B, item2C;
	
	public SimpleGUI(){
		frame = new JFrame();
		frame.setBounds(100, 100, 500, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Bharat's GUI");
		
		prepareMenu();
		prepareMainPanel();
		
		
		frame.setVisible(true);
		
	}
	
	private void prepareMenu(){
		menuBar = new JMenuBar();
		menu1 = new JMenu("Edit");
		menu2 = new JMenu("Help");
		item1A = new JMenuItem("Find");
		item1B = new JMenuItem("Replace");
		item2A = new JMenuItem("Welcome");
		item2B = new JMenuItem("Search");
		item2C = new JMenuItem("About");
		menuBar.add(menu1);
		menuBar.add(menu2);
		
		menu1.add(item1A);
		menu1.add(item1B);
		
		menu2.add(item2A);
		menu2.add(item2B);
		menu2.add(item2C);
		
		item1A.addActionListener(this);
		item1B.addActionListener(this);
		item2A.addActionListener(this);
		item2B.addActionListener(this);
		item2C.addActionListener(this);
		
		
		frame.getContentPane().add(menuBar, BorderLayout.NORTH);
		
		
		
	}
	private void prepareMainPanel(){
		panel = new JPanel();
		panel.setBackground(Color.white);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(20, 40, 300, 200);
		panel.add(scrollPane);
		
		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		textLabel = new JLabel("Type in: ");
		textLabel.setBounds(20, 250, 80, 20);
		panel.add(textLabel);
		
		textField = new JTextField();
		textField.setBounds(20, 270, 300, 20);
		panel.add(textField);
	
		button1 = new JButton("Fire");
		button1.setBounds(350, 255, 80, 20);
		button1.addActionListener(this);
		panel.add(button1);
		
		button2 = new JButton("Cancel");
		button2.setBounds(350, 285, 80, 20);
		button2.addActionListener(this);
		panel.add(button2);
		
		smallPanel = new JPanel();
		smallPanel.setBounds(340, 40, 100, 200);
		smallPanel.setBackground(new Color(245, 245, 245));
		smallPanel.setLayout(null);
		panel.add(smallPanel);
		
		ImageIcon icon1 = new ImageIcon("jrJava/alienInvader/imagesAndSounds/orangeAlien_1.png");
		imageLabel1 = new JLabel("Alien", icon1, JLabel.CENTER);
		imageLabel1.setVerticalTextPosition(JLabel.TOP);
		imageLabel1.setHorizontalTextPosition(JLabel.CENTER);
		imageLabel1.setBounds(10, 0, 80, 80);
		smallPanel.add(imageLabel1);
		
		ImageIcon icon2 = new ImageIcon("jrJava/alienInvader/imagesAndSounds/torpedo.png");
		imageLabel2 = new JLabel(icon2, JLabel.CENTER);
		imageLabel2.setVerticalTextPosition(JLabel.TOP);
		imageLabel2.setHorizontalTextPosition(JLabel.CENTER);
		imageLabel2.setBounds(10, 90, 80, 80);
		smallPanel.add(imageLabel2);
		
		ImageIcon icon3 = new ImageIcon("jrJava/alienInvader/imagesAndSounds/ship.png");
		imageLabel3 = new JLabel(icon3, JLabel.CENTER);
		imageLabel3.setVerticalTextPosition(JLabel.TOP);
		imageLabel3.setHorizontalTextPosition(JLabel.CENTER);
		imageLabel3.setBounds(10, 130, 80, 80);
		smallPanel.add(imageLabel3);
	}
	
	
	public void actionPerformed(ActionEvent e){
		if(e.getSource().equals(button1)){
			textArea.setText("Torpedo fired!!!");
			imageLabel1.setText("Fired");
			imageLabel2.setBounds(10, 40, 80, 80);
		}
		else if(e.getSource().equals(button2)){
			textArea.setText("Torpedo cancelled!!!");
			imageLabel1.setText("Cancelled");
			imageLabel2.setBounds(10, 90, 80, 80);
		}
		else if(e.getSource().equals(item1A)){
			textField.setText("User chose the 'Find' menu.");
		}
		else if(e.getSource().equals(item1B)){
			textField.setText("User chose the 'Replace' menu.");
		}
		else if(e.getSource().equals(item2A)){
			textField.setText("User chose the 'Welcome' menu.");
		}
		else if(e.getSource().equals(item2B)){
			textField.setText("User chose the 'Search' menu.");
		}
		else if(e.getSource().equals(item2C)){
			textField.setText("User chose the 'About' menu.");
		}
	}
	
	public static void main(String[] args){
		new SimpleGUI();
	}
	
	
}
