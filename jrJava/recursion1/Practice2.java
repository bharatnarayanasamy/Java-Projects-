package jrJava.recursion1;

public class Practice2 {

	
	public static void main(String[] args) {
		doSomething(0);
	}
	
	
	public static void doSomething(int a){
		a++;
		System.out.println(a);
		if(a>=4) return;
		doSomething(a);
		System.out.println(a);
			
	}

}
