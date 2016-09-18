package jrJava.alienInvader;

import java.awt.Color;
import java.util.ArrayList;
import resources.DrawingBoard;


public class AlienManager {

	//private static Color[] bodyColors = {Color.red, Color.green, Color.blue, Color.cyan, Color.magenta, Color.pink, Color.orange};
	//private static Color[] eyeColors = {Color.black, Color.darkGray, Color.lightGray};
	
	private static ArrayList<Alien> aliens = new ArrayList<Alien>();


	public static void remove(Alien alien){
		aliens.remove(alien);
	}


	public static boolean isHit(Torpedo torpedo){
		Alien each;
		for(int i=0; i<aliens.size(); i++){
			each = aliens.get(i);
			if(each.isHit(torpedo)){
				aliens.remove(i);
				return true;
			}
		}
		return false;
	}
	
	
	private static void launch(){
		
		double rand = Math.random();
		
		if(rand<0.05){
			aliens.add(new SimpleAlien( (int) (Math.random()*Coordinator.SCREEN_WIDTH), (int) (Math.random()*9 - 4)));
		}
		else if(rand>0.75){
			aliens.add(new MultiShootAlien( (int) (Math.random()*Coordinator.SCREEN_WIDTH), (int) (Math.random()*9 - 4)));
		}
		else if(rand>0.25){
			aliens.add(new NastyAlien( (int) (Math.random()*Coordinator.SCREEN_WIDTH), (int) (Math.random()*9 - 4)));
		}
		else if(rand>0.15){
			aliens.add(new CloakAlien( (int) (Math.random()*Coordinator.SCREEN_WIDTH), (int) (Math.random()*9 - 4)));
		}
		else if(rand<=0.15){
			aliens.add(new RealNastyAlien( (int) (Math.random()*Coordinator.SCREEN_WIDTH), (int) (Math.random()*9 - 4)));
		}
		
	}
	
	
	
	public static void move(Ship ship){
		
		if(Math.random()>0.97) launch();
		
		Alien each;
		for(int i=aliens.size()-1; i>=0; i--){
			each = aliens.get(i);
			each.move(ship);

			if(each.getY()>Coordinator.SCREEN_HEIGHT-30){
				aliens.remove(i);
			}
		}
	}


	public static void draw(DrawingBoard board){
		for(int i=0; i<aliens.size(); i++){
			aliens.get(i).draw(board);
		}
	}


	
}
