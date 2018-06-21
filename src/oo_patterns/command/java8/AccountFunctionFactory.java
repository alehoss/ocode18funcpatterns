package oo_patterns.command.java8;

public class AccountFunctionFactory {

	
	public static Runnable createGetCashFunction(Account account, int value) {		
		return ()-> {
			System.out.println("getting " + value + " from account " + account);
			account.setBalance(account.getBalance()-value);
		};
	}
	
	public static Runnable createMakeDepositFunction(Account account, int value) {
		return ()-> {
			System.out.println("making deposit of " + value + " to account " + account);		
			account.setBalance(account.getBalance()+value);			
		};
	}
	
	public static Runnable createTransferFunction(Account origin, Account destination, int value) {
		return ()-> {
			System.out.println("transfering " + value + " from account " + origin + " to account " + destination);		
			origin.setBalance(origin.getBalance()-value);
			destination.setBalance(destination.getBalance()+value);			
		};
	}

	public static void executeAll(Runnable[] commandList) {
		for(Runnable accOpCmd: commandList) {
			accOpCmd.run();
		}		
	}

}
