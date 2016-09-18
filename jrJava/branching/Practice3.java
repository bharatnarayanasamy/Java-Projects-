package jrJava.branching;




public class Practice3 {




	/*

	public static void main(String[] args) {




		int sum = 0;

		for(int i=1; i<=100; i++){

			sum += i*i*i;

			if(sum>10000) return;

		}

		

		System.out.println(sum);

		return;

	}

	*/

	

	public static void main(String[] args) {

	

		System.out.println(myMethod(90));

		

	}

	

	

	

	private static int myMethod(int param){

	

		if(Math.sqrt(param)>10) return 0;

		

		return param*param;

		

	}

	

}