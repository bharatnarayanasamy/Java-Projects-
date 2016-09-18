package jrJava.exceptionHandling2;

public class Practice2 {

	public static void main(String[] args) {
		
		int[] a = {1,2,3,4,5,6,7,8,9,10};
		
		int sum=0;
		int i=0;
		
		while(i<a.length){
			sum+=a[i];
			i++;
		}
		
		System.out.println(sum);
		
	}

}
