package jrJava.methodpractice;

public class SumCalculator {

	public static void main(String[] args) {
		
		System.out.println(sumofNumbers(0,10,5));
		System.out.println(sumofSquares(1,3,1));
		System.out.println(sumofProducts(1,3,1));
	}

	public static int sumofNumbers(int beginnumber, int endnumber, int increment){
		int sum = 0;
		for(int i=beginnumber; i<=endnumber ;i=i+increment){
			sum = sum + i;
		}
		return (sum);
	}

	public static int sumofSquares(int beginnumber, int endnumber, int increment){
		int sum = 0;
		for(int i=beginnumber; i<=endnumber ;i=i+increment){
			sum = sum + i*i;
		}
		return (sum);
	}
	public static int sumofProducts(int beginnumber, int endnumber, int increment){
		int sum = 0;
		for(int i=beginnumber; i<=endnumber ;i=i+increment){
			sum = sum + i*(i+1);
		}
		return (sum);
	}
	
	/*	public static void main(String[] arg){
		   double value1 = 3.3;
		   double value2 = 3.0;
		   double value3 = 3.6;
		   calculateAverage(value1);
		   calculateAverage(value1, value2);
		   calculateAverage(value1, value2, value3);
		}
		public static void calculateAverage(double x1){
		   calculateAverage(x1,0.0);
	    }
	        public static void calculateAverage(double x1, double x2){
		   calculateAverage(x1, x2, 0.0);
	    }
	        public static void calculateAverage(double x1, double x2,double x3){
	           double average = (x1+x2+x3)/3;
	           System.out.println(average);
	 }
	*/
}

