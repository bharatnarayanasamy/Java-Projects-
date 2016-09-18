package jrJava.alienInvader;

import java.util.ArrayList;

import resources.DrawingBoard;


public class TorpedoManager {

	//If we use an array, we will have to do all the maintenance work.
	//private Torpedo[] torpedoes = new Torpedo[100];
	
	private static ArrayList<Torpedo> torpedoes = new ArrayList<Torpedo>();
	
	
	public static void add(Torpedo torpedo){
		torpedoes.add(torpedo);
	}
	
	
	public static void remove(Torpedo torpedo){
		torpedoes.remove(torpedo);
	}
	
	
	public static void move(){
		Torpedo each;
		for(int i=torpedoes.size()-1; i>=0; i--){
			each = torpedoes.get(i);
			each.move();
			
			if(each.getY()<30){
				torpedoes.remove(i);
			}
		}
	}
	
	
	public static void draw(DrawingBoard board){
		for(int i=0; i<torpedoes.size(); i++){
			torpedoes.get(i).draw(board);
		}
	}
	
}










