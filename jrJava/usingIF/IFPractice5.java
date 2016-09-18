package jrJava.usingIF;

import java.util.Scanner;

public class IFPractice5 {

	public static void main(String[] args) {

		int x = 150;
		int y = 210;
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Type in the x-value");
		x = scanner.nextInt();
		System.out.println("Type in the y-value:");
		y = scanner.nextInt();
		
		
		if ((x>100 && x<200) && (y>150 && y<210)){
			System.out.println("Yep. The point is inside the house");
			
		}
		else {
			System.out.println("Nope. The point is not inside the house");			
		}
	}

}
