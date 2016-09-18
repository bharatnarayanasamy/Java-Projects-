package multiThreading1;


public class AnotherUser implements Runnable {

	
	private Calculator calculator;
	
	
	public void setCalculator(Calculator calculator){
		this.calculator = calculator;
	}
	
	
	public void run(){
		System.out.println("In run(): TID=" 
				+ Thread.currentThread().getId());
		
		calculator.calculateSum();
	}
}
