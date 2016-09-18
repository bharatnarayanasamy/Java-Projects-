package jrJava.branching2;




public class ContinuePractice {










	public static void main(String[] args) {




		/*

		for(int i=0; i<10; i++){

			if(i>4) continue;

			System.out.println(i);

			// .....

			// .....

			// .....

		}







		for(int i=0; i<10; i++){

			if(i<=4){

				System.out.println(i);

				// .....

				// .....

				// .....

			}

		}

		 */




		/*

		double sum = 0;

		for(int i=1; i<=100; i++){

			if(i%10==4 || i%10==7) continue;

			sum += Math.sqrt(i);

		}

		System.out.println(sum);

		 */




		double sum = 0;

		for(int i=1; i<=100; i++){

			// if(!(i%10==4 || i%10==7)) {

			//if(!(i%10==4) && !(i%10==7)) {

			if(i%10!=4 && i%10!=7) {

				sum += Math.sqrt(i);

			}

		}

		System.out.println(sum);







	}




}