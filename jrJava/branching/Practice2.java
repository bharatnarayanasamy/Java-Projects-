package jrJava.branching;




public class Practice2 {




	public static void main(String[] args) {




		/*

		int sum = 0;

		for(int i=1; i<=10; i++){

			

			if(i<=5){

				continue;

			}

			sum += i;

		}

		System.out.println(sum);

		*/

		

		

		int sum = 0;

		

		for(int i=1; i<=100; i++){

			

			if(i%10==1 || i%10==4) continue; 

			

			sum += i;

		}

		

		System.out.println(sum);

		

	}




}