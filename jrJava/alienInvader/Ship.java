package jrJava.alienInvader;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.ImageIcon;

import resources.DrawingBoard;
import resources.SoundPlayer;



public class Ship implements MouseListener, MouseMotionListener, KeyListener {

	private int x, y; // center, top
	private int eachHEIGHT = 20;
	private int topWIDTH = 4, middleWIDTH = 20, bottomWIDTH = 60;
	private Image image;
	//private Color color = Color.red;
	private SoundPlayer laser;
	
	public Ship(int _x, int _y){
		x = _x;
		y = _y;
		
		laser = new SoundPlayer();
		laser.load(Coordinator.RESOURCE_PATH + "laser.wav");
		image = new ImageIcon(Coordinator.RESOURCE_PATH + "ship.png").getImage();
	}
	
	
	public int getX(){ return x; }
	
	
	public boolean isHit(Alien alien){
		return inside(alien.getX(), alien.getY(), alien.WIDTH, alien.HEIGHT);
	}
	
	
	public boolean isHit(Missile missile){
		return inside(missile.getX(), missile.getY(), missile.WIDTH, missile.HEIGHT);
	}
	
	
	private boolean inside(int eX, int eY, int eW, int eH){
		return (eX>=x-topWIDTH/2-eW/2 && eX<=x+topWIDTH/2+eW/2 && eY>=y && eY<=y+eachHEIGHT+eH) ||
			   (eX>=x-middleWIDTH/2-eW/2 && eX<=x+middleWIDTH/2+eW/2 && eY>=y+eachHEIGHT && eY<=y+2*eachHEIGHT+eH) ||
			   (eX>=x-bottomWIDTH/2-eW/2 && eX<=x+bottomWIDTH/2+eW/2 && eY>=y+2*eachHEIGHT && eY<=y+3*eachHEIGHT+eH);
	}
	
	
	public void draw(DrawingBoard board){
		Graphics2D canvas = board.getCanvas();
		canvas.drawImage(image, x-bottomWIDTH/2, y, board);
		//canvas.setColor(color);
		//canvas.drawRect(x-topWIDTH/2, y, topWIDTH, eachHEIGHT);
		//canvas.drawRect(x-middleWIDTH/2, y+eachHEIGHT, middleWIDTH, eachHEIGHT);
		//canvas.drawRect(x-bottomWIDTH/2, y+2*eachHEIGHT, bottomWIDTH, eachHEIGHT);
	}


	public void mousePressed(MouseEvent e) {
		x = e.getX();
	}
	
	
	public void mouseDragged(MouseEvent e) {
		x = e.getX();
		
		if(x<bottomWIDTH/2){
			x =bottomWIDTH/2;
		}
		else if(x>Coordinator.SCREEN_WIDTH-bottomWIDTH/2){
			x = Coordinator.SCREEN_WIDTH-bottomWIDTH/2;
		}
	}
	
	
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode()==KeyEvent.VK_SPACE){
			// fire a torpedo.
			laser.play();
			TorpedoManager.add( new Torpedo(x, y-Torpedo.HEIGHT, -5) );
			//System.out.println("Just fired a TORPEDO!!!");
		}
		else if(e.getKeyCode()==KeyEvent.VK_LEFT){
			x=x-35;
			
		}
		else if(e.getKeyCode()==KeyEvent.VK_RIGHT){
			x=x+35;
		}
		if(e.getKeyCode()==KeyEvent.VK_UP){
			y=y-35;
			
		}
		else if(e.getKeyCode()==KeyEvent.VK_DOWN){
			y=y+35;
		}
	}
	
	
	public void mouseClicked(MouseEvent e) {}
	public void mouseReleased(MouseEvent e) {}
	public void mouseEntered(MouseEvent e) {}
	public void mouseExited(MouseEvent e) {}
	public void mouseMoved(MouseEvent e) {}
	public void keyTyped(KeyEvent e) {}
	public void keyReleased(KeyEvent e) {}
	
}











