package jrJava.tetris;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class ScoreReporter implements Drawable{

	private int x = 510;
	private int y = 25;
	private Font scoreFont, gameOverFont;
	
	private int score = 1000;
	private boolean gameOver;
	
	public ScoreReporter(){
		scoreFont = new Font("Times", Font.BOLD, 15);
		gameOverFont = new Font("Times", Font.BOLD, 85);
	}
	
	public void changeScore(int change){ score += change; }
	
	public void gameOver(){ gameOver = true; }

	@Override
	public void draw(Graphics g) {
		
		g.setColor(Color.DARK_GRAY);
		g.setFont(scoreFont);
		g.drawString("Score: " + score, x, y);
		
		if(gameOver){
			g.setColor(Color.red);
			g.setFont(gameOverFont);
			g.drawString("Game Over", 120, 350);
		}
		
	}
}
