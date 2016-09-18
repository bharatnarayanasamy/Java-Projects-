package jrJava.recursion1;


public class Practice1 {

	
	private static Practice1 p;
	
	public static void main(String[] args) {
	
		doSomething();
	
	}
	
	
	
	
	public static void doSomething(){
		
		p = new Practice1();
		System.out.println(p);
		//if(a==0) return;
		doSomething();
	}

}
