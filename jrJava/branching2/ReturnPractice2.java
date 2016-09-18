package jrJava.branching2;




public class ReturnPractice2 {




	

	public static void main(String[] args) {




		System.out.println( squareSum(70) );

	}




	

	

	public static int squareSum(int n){

		

		int sum = 0;

		for(int i=1; i<=n; i++){

			sum += Math.pow(i,2);  

			if(sum>100000){

				System.out.println("The sum got too big. I stopped at i="+i);

				return sum;

			}

		}

		

		return sum;

	}

	

	

}


