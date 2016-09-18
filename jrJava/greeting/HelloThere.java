package jrJava.greeting;

import java.util.Scanner;

public class HelloThere {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Type in your first name and press the Enter-key:");
		String theFirstName = scanner.next();
		
		System.out.println("Type your last name and press the Enter-key");
		String theLastName = scanner.next();
		
		System.out.println("Type in your grade and press the Enter-key:");
		int theGrade = scanner.nextInt();
		
		System.out.println("Well, your name is "+theFirstName+" "+theLastName+" and you are in "+theGrade+"th grade.");
	}

}
