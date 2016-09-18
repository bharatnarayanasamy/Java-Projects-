package jrJava.methodpractice;

public class Practice2 {

	public static void main(String[] args) {

		int total = getSum(1, 5, 1) + 2*getSum(10,100,2) + getSquareSum(1,10,1);
		System.out.println(total);
	}

	
	
	
	private static int getSum(int begin, int end, int increment){	
		int sum = 0;
		for (int i=begin; i<=end;i+=increment){
			sum = sum + i;
		}
		
		return sum;
	}
	

	private static int getSquareSum(int begin, int end, int increment){	
		int sum = 0;
		for (int i=begin; i<=end;i+=increment){
			sum = sum + i;
		}
		
		return sum;
	}
	
}
