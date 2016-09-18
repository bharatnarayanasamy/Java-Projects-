package jrJava.methodpractice;

public class MYPRACTICE2 {
	public static void main(String[] args){
		int a = 1;
		double b = 0.5;
		method1(a,a+b);
		method2(2*a-b);
		System.out.println("Done!");
	}
	public static void method1(int param1, double param2){
		double sum = param1 + param2;
		System.out.println("Inside method1");
		System.out.println(sum);
		method2(sum);
	}
	public static void method2(double theValue){
		System.out.println("Inside method2");
		System.out.println(theValue*10);
	}
}
