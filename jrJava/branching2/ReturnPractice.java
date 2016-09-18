package jrJava.branching2;




public class ReturnPractice {




	public static void main(String[] args) {




		int sum = 0;

		for(int i=1; i<=100; i++){

			sum += Math.pow(i,2);  

			if(sum>100000){

				System.out.println("The sum got too big. I stopped at i="+i);

				return;

			}

		}

		

		System.out.println(sum);

		

		return;

	}




}