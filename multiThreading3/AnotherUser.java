package multiThreading3;


public class AnotherUser implements Runnable {

	
	private Calculator calculator;
	private int option;
	
	public void setCalculator(Calculator calculator, int option){
		this.calculator = calculator;
		this.option = option;
	}
	
	
	public void run(){
		System.out.println("In run(): TID=" 
				+ Thread.currentThread().getId());
		
		if(option==1) calculator.calculateSum();
		else if(option==2) calculator.calculateSquareSum();
	}
}
