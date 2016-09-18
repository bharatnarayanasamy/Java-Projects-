package jrJava.hello;

import java.util.Scanner;

public class MyOwnHelloThere {

	public static void main(String[] args) {
		
		
System.out.println("Type in your name here:");
		
		Scanner myScanner = new Scanner(System.in);
		String  name = myScanner.next();
		
System.out.println("Type in your age here:");
		
		Scanner myScanner1 = new Scanner(System.in);
		String  age = myScanner1.next();
		
		System.out.println("Type in the your favorite color here:");
			
		Scanner myScanner2 = new Scanner(System.in);
		String  color = myScanner2.next();
		
		System.out.println("Type in your favorite food here:");
		
		Scanner myScanner3 = new Scanner(System.in);
		String  food = myScanner3.next();
		
		
		System.out.println("Your name is " + name + ".");
		
		System.out.println("Your favorite color is " + color + ".");
	
		System.out.println("You like to eat " + food + ".");
		
		int yearNow;
		int yourAge;
		int total;
		int total2;
		
		yearNow = 2015;
		yourAge = 12;
		total = yearNow - yourAge;
		total2 = yearNow - yourAge - 1;
		System.out.println("You were born either in " + total + " or in " + total2 + ".");
		
		
	
		
		

	}

}
