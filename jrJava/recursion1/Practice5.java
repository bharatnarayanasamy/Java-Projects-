package jrJava.recursion1;

public class Practice5 {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		System.out.println(fibonacciWORecursion(40));
		long end = System.currentTimeMillis();
		System.out.println(end-start);		
		
		start = System.currentTimeMillis();
		System.out.println(fibonacci(40));
		end = System.currentTimeMillis();
		System.out.println(end-start);
		//System.out.println(fibonacci(95));
	}
	
	
	public static long fibonacci(int n){
	   if(n==1){
	        return 0;
	   }
	   else if(n==2){
		   return 1;
	   }
	   else {
	      return fibonacci(n-1) + fibonacci(n-2);
	   }
	}
	public static long fibonacciWORecursion(int n){
		long first = 0;
		long second = 1;
		
		if(n==1) return 0;
		if(n==2) return 1;
		
		long third = 0;
		for(int i=3;i<=n;i++){
			third = first + second;
			first = second;
			second = third;
		}
		return third;
	}
}
