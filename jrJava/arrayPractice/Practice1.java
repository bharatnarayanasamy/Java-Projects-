package jrJava.arrayPractice;

public class Practice1 {

	public static void main(String[] args) {

		int[] a = new int[6];
		System.out.println(a[0] + ", " + a[1] + ", " + a[2] + ", " + a[3] + ", " + a[4]);
		
		a[1] = 4;
		a[2] = 6;
		a[3] = a[1] + a[2] + 1;
		
		System.out.println(a[0] + ", " + a[1] + ", " + a[2] + ", " + a[3] + ", " + a[4]);
		
		int n=2;
		a[n+2] = 3*a[3];
		a[n-5/2] = 3*a[n+7%n];
		
		System.out.println(a[0] + ", " + a[1] + ", " + a[2] + ", " + a[3] + ", " + a[4]);
		
		a[5] = 99;
		a[n-3] = a[0] + 2*a[2];
	}

}
