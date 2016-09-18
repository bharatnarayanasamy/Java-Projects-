package multiThreading1;


public class Calculator {

	private int sum = 0;
	
	public synchronized void calculateSum(){
		
		for(int i=1; i<=10; i++){
			sum += i;
			
			System.out.println(sum + " TID=" 
			+ Thread.currentThread().getId());
			
			try {
				Thread.currentThread().sleep(100);
			} catch (InterruptedException e) { }
			
		}
	}
} 
