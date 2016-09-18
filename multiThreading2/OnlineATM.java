package multiThreading2;

public class OnlineATM implements Runnable {

	private BankAccount account;
	
	public void setBankAccount(BankAccount account){
		this.account = account;
	}
	
	
	public void run(){
		withdrawAll();
	}
	
	
	public void withdrawAll(){
		
		double amount = account.getBalance();
		boolean result = account.withdraw(amount);
		
		if(result){
			System.out.println("$" + amount 
			+ " transferred out.");
		}
		else {
			System.out.println("It was declined.");
		}
		
	}
}
