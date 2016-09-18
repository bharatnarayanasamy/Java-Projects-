package jrJava.branching2;




public class BreakPractice {




	

	public static void main(String[] args) {




		/*

		int i = 0;

		while(true){

			if(Math.sqrt(i)>1.999) break;

			System.out.println(i);

			i++;

		}

		*/

		

		/*

		int sum = 0;

		for(int i=1; i<=100; i++){

			sum += Math.pow(i,2);  //i*i;

			if(sum>100000){

				System.out.println(i);

				break;

			}

		}

		System.out.println(sum);

		*/

		

		

		

		for(int i=0; i<10; i++){

			for(int j=0; j<i; j++){

				System.out.println(i + ", " + j);

				if(i%2==0) break;

			}

			if(i%5==3) break;

		}

		

		

		

		boolean shouldBreak = false;

		

		for(int i=0; i<10; i++){

			for(int j=0; j<i; j++){

				System.out.println(i + ", " + j);

				if(i%2==0) {

					shouldBreak = true;

					break;

				}

			}

			

			if(shouldBreak || i%5==3) break;

		}

		

		

	}




	

}


