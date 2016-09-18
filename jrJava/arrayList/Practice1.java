package jrJava.arrayList;

import java.util.ArrayList;

import jrJava.alienInvader.Alien;
import jrJava.alienInvader.Ship;

public class Practice1 {

	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		
	//	list.add(new Alien(1, 1, 0, 0, null, null));
		//list.add(new Alien(2, 2, 0, 0, null, null));
		//list.add(new Alien(3, 3, 0, 0, null, null));
		list.add(new Ship(100,104));						
		
		
		System.out.println(list.size());
		
		Alien ref = (Alien) list.get(0);
		Ship ref2 = (Ship) list.get(list.size());
 	}

}
