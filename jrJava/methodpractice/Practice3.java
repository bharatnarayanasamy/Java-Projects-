package jrJava.methodpractice;

public class Practice3 {

	public static void main(String[] args) {
		System.out.println(getSum());
	}
	private static int getSum(){	
		return getSum(1,1000,1);
	}
	private static int getSum(int begin){	
		return getSum(begin, 1000,1);
		}
	private static int getSum(int begin, int end){	
		return getSum(begin, end,1);
		}
	private static int getSum(int begin, int end, int increment){	
		return getSum(begin, end,increment);
	}
	
}
