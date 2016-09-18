package jrJava.memoryGameInheritance;

import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;

import resources.SoundPlayer;


public class CardManager implements MouseListener {

	private Card[] cards;
	private int columnNumber;
	private SoundPlayer tick, chime, buzz;
	
	private boolean nonSelected = true, oneSelected, twoSelected;
	private Card firstSelected, secondSelected;
	private long timeSecondCardSelected;
	private int score;
	private DrawingPanel panel;
	
	
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
	
	
	public CardManager(int numberOfCards, int columnNumber){
		
		if(numberOfCards%2==1) numberOfCards++;
		if(numberOfCards>2*imageNames.length) numberOfCards = 2*imageNames.length;
		
		int rowNumber = numberOfCards/columnNumber + (numberOfCards%columnNumber==0?0:1);
				
		int leftMargin = (Coordinator.SCREEN_WIDTH - Card.SIZE*columnNumber)/2;
		int topMargin = (Coordinator.SCREEN_HEIGHT - Card.SIZE*rowNumber)/2;
		
		ArrayList<String> names = new ArrayList<String>();
		for(int i=0; i<imageNames.length; i++) names.add(imageNames[i]);
		
		ArrayList<Image> images = new ArrayList<Image>();
		
		String each;
		Image image;
		for(int i=0; i<numberOfCards/2; i++){
			each = names.remove((int)(names.size()*Math.random()));
			image = new ImageIcon("jrJava/memoryGame/" + each).getImage();
			images.add((int)(images.size()*Math.random()), image);
			images.add((int)(images.size()*Math.random()), image);
		}
		
		cards = new Card[numberOfCards];
		
		int x, y;
		for(int i=0; i<cards.length; i++){
			x = leftMargin + i%columnNumber*Card.SIZE;
			y = topMargin + i/columnNumber*Card.SIZE;
			
			if(Math.random()>0.5) cards[i] = new Card(x, y, images.get(i));
			else cards[i] = new FlashingCard(x, y, images.get(i));
		}
		
		
		tick = new SoundPlayer();
		tick.load("jrJava/memoryGame/tick.wav");
		chime = new SoundPlayer();
		chime.load("jrJava/memoryGame/chime.wav");
		buzz = new SoundPlayer();
		buzz.load("jrJava/memoryGame/buzz.wav");
	}
	
	
	public void setDrawingPanel(DrawingPanel panel){ 
		this.panel = panel;
		panel.setCards(cards);
	}


	
	
	public void applyGameLogic(){
		
		if(!twoSelected || System.currentTimeMillis()<timeSecondCardSelected+2000) return;
		
		if(firstSelected.hasSameImage(secondSelected)){
			chime.play();
			firstSelected.matched();
			secondSelected.matched();
			score += 10;
			panel.setScore(score);
		}
		else {
			buzz.play();
			firstSelected.hide();
			secondSelected.hide();
			score -= 10;
			panel.setScore(score);
		}
		
		
		boolean allMatched = true;
		for(int i=0; i<cards.length; i++){
			if(!cards[i].isMatched()){
				allMatched = false;
				break;
			}
		}
		// if all matched, call game over.
		
		nonSelected = true;
		twoSelected = false;
		
	}
	
	

	public void mousePressed(MouseEvent e) {
		
		if(twoSelected) return;
		
		for(int i=0; i<cards.length; i++){
			if(cards[i].isSelected(e)){
				
				if(nonSelected){
					nonSelected = false;
					oneSelected = true;
					tick.play();
					firstSelected = cards[i];
					firstSelected.show();
					return;
				}
				else if(oneSelected){
					if(cards[i].equals(firstSelected)) return;
					oneSelected = false;
					twoSelected = true;
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
	
}










