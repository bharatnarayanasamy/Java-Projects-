package jrJava.arrayPractice;

public class Practice2 {

	public static void main(String[] args) {
		
		//double[] a = new double[5];		
		//double[] a = new double[]{1.1, -2.4, 3, -6, 0, -9};
		//System.out.println(a.length);
		//doSomething(a);
		
		Thing[] things = new Thing[5];
		System.out.println(things[0]);
		
		things[0] = new Thing(35);
		System.out.println(things[0]);
		things[0].aboutMe();
		
	}

	
	private static void doSomething(double[] b)
	{
		int n=2;
		if(n<=b.length-1) System.out.println(b[n]);
		else System.out.println("Are you crazy?");
	}
}
