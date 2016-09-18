package multiThreading2;


public class BankAccount {

	private double balance = 2000;
	
	public double getBalance(){ return balance; }
	
	
	public synchronized boolean withdraw(double requestAmount){
		
		if(balance==0.0 || balance<requestAmount){
			return false;
		}
		
		//check ATF server.
		//check DEA server.
		//check liens.
		//transfer out the requestAmount to an overseas account.
		
		try {
			Thread.currentThread().sleep(50);
		} catch (InterruptedException e) { }
		
		
		balance = balance - requestAmount;
		
		return true;
	}
	
}
