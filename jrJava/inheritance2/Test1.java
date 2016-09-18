package jrJava.inheritance2;

public class Test1 {

	public static void main(String[] args) {                 
		//POLYMORPHISM
		
		
		//Dog ref = new Dog();
		//Mammal ref = new Dog();
		//Animal ref = new Dog();
		
		doAllYouCanDo(new Bird());
		
	}
	
	public static void doAllYouCanDo(Animal animal){
		animal.move();
	}

}
