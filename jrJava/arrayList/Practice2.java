package jrJava.arrayList;

import java.util.ArrayList;
import jrJava.alienInvader.Alien;

public class Practice2 {

	public static void main(String[] args) {
		
		ArrayList<Alien> list = new ArrayList<Alien>();
		
		//list.add(new Alien(1, 1, 0, 0, null, null));
		//list.add(new Alien(2, 2, 0, 0, null, null));
		//list.add(new Alien(3, 3, 0, 0, null, null));
		
		//list.add(new Ship(100,101));
	
		//Alien ref = list.get(0);
		print(list);
		//list.add(1, new Alien(4,4,0,0,null,null));
		print(list);
		Alien removed = list.remove(2);
		print(list);
	}

	private static void print(ArrayList<Alien> theList){
		for(int i=0;i<theList.size();i++){
			Alien each = theList.get(i);
			System.out.println(each.getX() + ", " + each.getY());
		}
		System.out.println();

	}
	
}
