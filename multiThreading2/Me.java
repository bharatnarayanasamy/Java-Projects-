package multiThreading2;

public class Me {

	public static void main(String[] args) {

		BankAccount account = new BankAccount();
		
		Thread[] threads = new Thread[5];
		for(int i=0; i<threads.length; i++){
			OnlineATM atm = new OnlineATM();
			atm.setBankAccount(account);
			threads[i] = new Thread(atm);
		}
		
		for(int i=0; i<threads.length; i++){
			threads[i].start();
		}
		
	}

}
