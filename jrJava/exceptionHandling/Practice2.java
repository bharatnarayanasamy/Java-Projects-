package jrJava.exceptionHandling;

import java.util.Scanner;

public class Practice2 {

	
	public static void main(String[] args) {
				
		int[] values = {3, 7, 1, 6};
		
		System.out.println("Enter an integer between 0 and " + (values.length-1));
		Scanner scanner = new Scanner(System.in);
		int targetIndex = scanner.nextInt();
		
		printValue(values, targetIndex);
		
		System.out.println("end of main.");
	}

	
	
	private static void printValue(int[] array, int index){
		System.out.println("beginning of printValue.");

		System.out.println(array[index]);
		
		System.out.println("end of printValue.");
	}
	
}
