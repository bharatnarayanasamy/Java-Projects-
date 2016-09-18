package jrJava.methodpractice;

public class Practice1 {

	
	public static void main(String[] args) {
		System.out.println("Point 1");
		myMethod1();
		System.out.println("Point 2");
		myMethod2();
		System.out.println("Point 3");
	}

	
	private static void myMethod1(){
		System.out.println("Point 4");
		myMethod2();
		System.out.println("Point 5");
	}
	
	
	private static void myMethod2(){
		System.out.println("Point 6");
		//myMethod1();
	}
	

}
