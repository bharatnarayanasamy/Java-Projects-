package jrJava.alienInvader;

import java.util.ArrayList;

import resources.DrawingBoard;


public class MissileManager {

	private static ArrayList<Missile> missiles = new ArrayList<Missile>();


	public static void add(Missile missile){
		missiles.add(missile);
	}


	public static void remove(Missile missile){
		missiles.remove(missile);
	}


	public static boolean isHit(Torpedo torpedo){
		Missile each;
		for(int i=0; i<missiles.size(); i++){
			each = missiles.get(i);
			if(each.isHit(torpedo)){
				missiles.remove(i);
				return true;
			}
		}
		return false;
	}
	
	
	
	public static void move(Ship ship){
		Missile each;
		for(int i=missiles.size()-1; i>=0; i--){
			each = missiles.get(i);
			each.move(ship);

			if(each.getY()>Coordinator.SCREEN_HEIGHT-30){
				missiles.remove(i);
			}
		}
	}


	public static void draw(DrawingBoard board){
		for(int i=0; i<missiles.size(); i++){
			missiles.get(i).draw(board);
		}
	}


}
