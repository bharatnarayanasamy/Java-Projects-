package jrJava.memoryGameWith2DArray;

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

	private Card[][] cards;
	private int columnNumber;
	private SoundPlayer tick, chime, buzz;
	private	boolean allMatched;
	public static boolean gameOver;
	private jrJava.memoryGameWith2DArray.DrawingPanel panel;

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
		//cards = new Card[numOfCards];

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

		cards = new Card[rowNumber][];

		int x; 
		int y;
		int k=0;
		for(int i=0;i<cards.length;i++){
			if(i!=cards.length-1) cards[i] = new Card[columnNumber];
			else cards[i] = new Card[numOfCards-(rowNumber-1)*columnNumber];

			for(int j=0;j<cards[i].length;j++){
				x = leftMargin + j*Card.SIZE;
				y = topMargin + i*Card.SIZE;
				cards[i][j] = new Card(x, y, images.get(k)); // WE NEED TO TAKE CARE OF THIS!!!!
				k++;
			}

		}
		//cards[i] = new Card(x, y, images.get(i));
		//cards[i].show();
		tick = new SoundPlayer();
		tick.load("jrJava/memoryGame/tick.wav");
		chime = new SoundPlayer();
		chime.load("jrJava/memoryGame/chime.wav");
		buzz = new SoundPlayer();
		buzz.load("jrJava/memoryGame/buzz.wav");
	}

	public void setDrawingPanel(jrJava.memoryGameWith2DArray.DrawingPanel panel){
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
		int i, j;
		for(i=0;i<cards.length;i++){
			for(j=0;j<cards[i].length;j++){
				if(!cards[i][j].isMatched()){ allMatched = false; break; }
			}
		}
		if(allMatched) gameOver = true;





		twoSelected = false;
		nonSelected = true;


	}


	public void mousePressed(MouseEvent e) {

		if(twoSelected) return;

		int i, j;
		for(i=0;i<cards.length;i++){
			for(j=0;j<cards[i].length;j++){
				if(cards[i][j].isSelected(e)){

					if(nonSelected){
						oneSelected = true;
						nonSelected = false;
						tick.play();
						firstSelected = cards[i][j];
						firstSelected.show();
						return;
					}
					else if(oneSelected){
						if(cards[i][j].equals(firstSelected)) return;
						twoSelected = true;
						oneSelected = false;
						tick.play();
						secondSelected = cards[i][j];
						secondSelected.show();
						timeSecondCardSelected = System.currentTimeMillis();
						return;
					}

				}
			}
		}
	}

	public void mouseClicked(MouseEvent e) {}
	public void mouseReleased(MouseEvent e) {}
	public void mouseEntered(MouseEvent e) {}
	public void mouseExited(MouseEvent e) {}


}
