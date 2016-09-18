package jrJava.recursion1;

public class Practice3 {

	public static void main(String[] args) {
		System.out.println(sum(10));
	}
	
	public static int sum(int n){
		if(n==1) return 1;
		return n + sum(n-1);
		
	}
	
	
	/*public static int sum(int n){
		int sum = 0;
		for(int i=1;i<=n;i++){
			sum +=i;
		}
		return sum;
	    
	}*/
}
