package jrJava.memoryGameCreate;

import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.management.timer.Timer;
import javax.swing.ImageIcon;

import jrJava.memoryGame.Coordinator;
import jrJava.memoryGame.DrawingPanel;
import resources.SoundPlayer;

public class CardManager implements MouseListener {
	
	private Card[] cards;
	private int columnNumber;
	private SoundPlayer tick, chime, buzz;
	private	boolean allMatched;
	public static boolean gameOver;
	private jrJava.memoryGameCreate.DrawingPanel panel;
	
	private boolean nonSelected = true, oneSelected, twoSelected;
	private Card firstSelected, secondSelected;
	private long timeSecondCardSelected;
	private int score = 0;
	
	private String[] imageNames = {
			"apple.png",
			"bank.png",
			"basketball.png",
			"bubble_blue.png",
			"bubble_green.png",
			"bubble_red.png",
			"building.png",
			"cat.png",
			"cheese.png",
			"denture.png",
			"dog.png",
			"hockey_stick.png",
			"keys.png",
			"phone.png",
			"pizza.png",
			"santa.png",
			"soccer_ball.png",
			"sock.png",
			"toilet_bowl.png",
			"toilet_paper.png",
			"xmas_tree.png"	
	};

	public CardManager(int numOfCards, int columnNumber){
		
		if(numOfCards%2==1) numOfCards++;
		
		if(numOfCards>2*imageNames.length) numOfCards = 2*imageNames.length;
		
		int rowNumber = numOfCards/columnNumber + (numOfCards%columnNumber==0?0:1);
		
		this.columnNumber = columnNumber;
		cards = new Card[numOfCards];
		
		int leftMargin = (Coordinator.SCREEN_WIDTH-Card.SIZE*columnNumber)/2;
		int topMargin = (Coordinator.SCREEN_HEIGHT-Card.SIZE*rowNumber)/2;
		
		ArrayList<String> names = new ArrayList<String>();
		for(int i=0;i<imageNames.length;i++) names.add(imageNames[i]);
		String each;
		Image image;

		ArrayList<Image> images = new ArrayList<Image>();
		
		for(int i=0;i<numOfCards/2;i++){
			each = names.remove((int)(names.size()*Math.random()));
			image = new ImageIcon("jrJava/memoryGame/" + each).getImage();
			images.add((int)(Math.random()*images.size()), image);
			images.add((int)(Math.random()*images.size()), image);

		}
		
		int x; 
		int y;
		for(int i=0;i<cards.length;i++){
			x = leftMargin + i%columnNumber*Card.SIZE;
			y = topMargin + i/columnNumber*Card.SIZE;
     	    cards[i] = new Card(x, y, images.get(i));
		    //cards[i].show();
		}
		tick = new SoundPlayer();
		tick.load("jrJava/memoryGame/tick.wav");
		chime = new SoundPlayer();
		chime.load("jrJava/memoryGame/chime.wav");
		buzz = new SoundPlayer();
		buzz.load("jrJava/memoryGame/buzz.wav");
	}
	
	public void setDrawingPanel(jrJava.memoryGameCreate.DrawingPanel panel){
		this.panel = panel;
		panel.setCards(cards);
	}

	public void applyGameLogic(){
		if(!twoSelected || (System.currentTimeMillis()<timeSecondCardSelected+2000)) return;
				
		if(firstSelected.hasSameImage(secondSelected)){
			chime.play();
			firstSelected.matched();
			secondSelected.matched();
			// increase score by ten points
			score += 10;
			panel.setScore(score);
		}
		else {
			buzz.play();
			firstSelected.hide();
			secondSelected.hide();
			// deduct score by ten points.
			score -= 10;
			panel.setScore(score);
		}
		
		allMatched = true;
		for(int i=0;i<cards.length;i++){
			if(!cards[i].isMatched()){ allMatched = false; break; }
		}
		if(allMatched) gameOver = true;
		
		
		
		
		
		twoSelected = false;
		nonSelected = true;
		
		
	}
	
	
	public void mousePressed(MouseEvent e) {
		
		if(twoSelected) return;
		
		
		for(int i=0;i<cards.length;i++){
			if(cards[i].isSelected(e)){
				
				if(nonSelected){
					oneSelected = true;
					nonSelected = false;
					tick.play();
					firstSelected = cards[i];
					firstSelected.show();
					return;
				}
				else if(oneSelected){
					if(cards[i].equals(firstSelected)) return;
					twoSelected = true;
					oneSelected = false;
					tick.play();
					secondSelected = cards[i];
					secondSelected.show();
					timeSecondCardSelected = System.currentTimeMillis();
					return;
				}
				
			}
		}
	}

	public void mouseClicked(MouseEvent e) {}
	public void mouseReleased(MouseEvent e) {}
	public void mouseEntered(MouseEvent e) {}
	public void mouseExited(MouseEvent e) {}

	public void showAll() {
		for(int i=0;i<cards.length;i++){
			cards[i].show();
		}
	}
	public void hideAll() {
		for(int i=0;i<cards.length;i++){
			cards[i].hide();
		}
	}

	
}
