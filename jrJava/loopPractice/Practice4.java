package jrJava.loopPractice;

public class Practice4 {

	public static void main(String[] args) {
	/*	
		for(int i=1; i<=3; i++){
			
			for(int j=1;j<=4;j++){
				System.out.println(i + "," + j);
			}
			
		}
		*/
		for(int i=1; i<=3; i++){
			
			for(int j=1;j<=i;j++){
				System.out.println(i + "," + j);
			}
			
		}
		
	}

}
