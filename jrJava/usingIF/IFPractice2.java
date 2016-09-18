package jrJava.usingIF;

import java.util.Scanner;

public class IFPractice2 {

	public static void main(String[] args) {

		System.out.println("Enter your grade: ");
		
		Scanner scanner = new Scanner(System.in);
		int grade = scanner.nextInt();
		

		if(grade>=90){
			System.out.println("Excellent job!");
		}
		else if(grade>=80 && grade<90){
			System.out.println("Average job!");
		}
		else if(grade>=70 && grade<80){
			System.out.println("Horrible!!!!");
		}
		else if(grade>=60 && grade<70){
			System.out.println("You brought shame to our family!");
		}
			if(grade==64){
				System.out.println("oh that sounds familiar. That's the score I used to get.");
				
			}
		
			
			else if(grade>50 && grade<60){
			System.out.println("&#$%&#$&%$");
		}
		
	}
	
}

