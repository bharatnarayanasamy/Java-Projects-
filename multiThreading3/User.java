package multiThreading3;

public class User {

	
	public static void main(String[] args) {

		System.out.println("In main(): TID=" 
		+ Thread.currentThread().getId());
		
		Calculator calculator = new Calculator();
		
		AnotherUser user2 = new AnotherUser();
		user2.setCalculator(calculator, 1);
		
		AnotherUser user3 = new AnotherUser();
		user3.setCalculator(calculator, 2);
		
		Thread t2 = new Thread(user2);
		Thread t3 = new Thread(user3);
		
		t2.start();
		t3.start();
		
	}

}
