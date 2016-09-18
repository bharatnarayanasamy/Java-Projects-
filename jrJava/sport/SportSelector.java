package jrJava.sport;

import java.util.Scanner;

public class SportSelector {

	public static void main(String[] args) {

		String selectedSport;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Your preference, indoor(1) or outdoor(2) ?");
		int preference1 = scanner.nextInt();
		
		System.out.println("Your preference, team(1) or individual(2) ?");
		int preference2 = scanner.nextInt();
		
		if(preference1==1){
			if(preference2==1){
				selectedSport = "basketball";
			}
		    else{
				selectedSport = "pingpong";
		    }
		}	
		else {	
			if(preference2==1){
				selectedSport = "soccer";
			}
			
			else {
				selectedSport = "tennis";
			}
		}
		
		System.out.println("We recommend " + selectedSport + " for you.");
		
	}

}
