package jrJava.inheritance2;

import java.util.ArrayList;

public class Test2 {

	
	
	public static void main(String[] args) {
		
		ArrayList<Animal> animals = new ArrayList<Animal>(); 
		
		animals.add(new Dog());
		animals.add(new Bird());
		//animals.add(new Animal());
		animals.add(new Mammal());
		animals.add(new Dog());
		animals.add(new Human());
	
		moveAll(animals);
	}

	
	public static void moveAll(ArrayList<Animal> list){
		
		Animal each;	
		for(int i=0;i<list.size();i++){
			each = list.get(i);
			each.move();
		}
		
	}
	
}
 