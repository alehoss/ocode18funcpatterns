package oo_patterns.command.java8;


public class Account {

	double balance;

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
		
	public static void showAll(Account[] accounts) {
		for (Account acc: accounts) {
			System.out.println("account " + acc + " : " + acc.getBalance());
		}		
	}

	
	
}
