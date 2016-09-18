package jrJava.greeting;

public class Week3Homework {

	public static void main(String[] args) {
		
		int sum1 = 0;
		for(int i=1; i<=100; i=i+1){
			sum1 = sum1 + i*(i+1);
		}
		System.out.println(sum1);
		
		
		//for(int i=0; i<1000; i++){
			//System.out.println("I must not tell lies.");
			//System.out.println("I never disrupt the Java class.");
			//System.out.println("The Java teacher has a handsome face.");
			//System.out.println("Holy! that line has caused a System.err.");
			//}
		//{
		//int squaredValue = 0;
		//for(int i=0; i<10; i=i+1){
			//squaredValue = i*i;
			//System.out.println(squaredValue);
			//}
		//}
		//{
		//for(int i=0; i<10; i=i+1){
			//int squaredValue = i*i;
			//System.out.println(squaredValue);
			//}
		//}	
	
		//int sum = 0;
				
		//for(int i=17; i<=2178; i=i+1){
			//sum = sum + i;
		//}
		//System.out.println(sum);
		
		int sum = 0;
		
		for(int i=1; i<=2; i=i+1){
			for(int j=1; j<=3; j=j+1){
				System.out.println(i+","+j);
				sum = sum + i + j;
			}
			System.out.println(sum);
		}
		
	
	
	}

}
