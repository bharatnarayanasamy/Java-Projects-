package jrJava.methodpractice;

public class Practice4 {

	public static void main(String[] args) {
		myMethod(4,false);
	}

	
	public static void myMethod(){ // name becomes myMethod
		System.out.println("1");
	}
	public static void myMethod(int a){ // name becomes myMethod__int
		System.out.println("2");
	}
	public static void myMethod(int a, int b){ // name becomes myMethod__int__int
		System.out.println("3");
	}
	public static void myMethod(int a, boolean b){ // name becomes myMethid__int__boolean
		System.out.println("4");
	}
	public static void myMethod(boolean f, boolean g){// name becomes myMethos__boolean__boolean
		System.out.println("5");
	}
	public static void myMethod(boolean x, int y){ // name becomes myMethod__boolean__int      what matters is the number of parameters and the type & order? 
		System.out.println("6");
	}
	
}

