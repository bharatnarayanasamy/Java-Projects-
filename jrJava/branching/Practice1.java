package jrJava.branching;







public class Practice1 {






	public static void main(String[] args) {




		for(int i=1; i<=100; i++){

			if(i==12) break;

			System.out.println(i);

		}
		int sum = 0;

		for(int i=1; i<=100; i++){



			sum += i*i;



			if(sum>10000){

				sum = sum*2;

				break;

			}

		}

		System.out.println(sum);



	}

}