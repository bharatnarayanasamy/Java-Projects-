package jrJava.hello;

import java.util.Scanner;

public class HelloThere {

	public static void main(String[] args) {

		System.out.println("Type in your name here:");
		
		Scanner myScanner = new Scanner(System.in);
		String  name = myScanner.next();
		
		//System.out.println("your name is " + name + ".");
		
		int mathScore;
		int scienceScore;
		int total; 
		
		mathScore = 100;
		scienceScore = 100;
		total = mathScore + scienceScore;
		
		System.out.println("The total score for " + name + " is " + total + ".");
		System.out.println("The most important thing is: Sir is so handsome.");
	}

}
