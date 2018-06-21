package oo_patterns.command.java7;

import java.util.ArrayList;
import java.util.List;

public class AccountCommandExecutor {

	public final static int NUM_ACCOUNTS = 5;
	private Account[] accounts = new Account[NUM_ACCOUNTS];
	private List<AccountCommand> accountOperations = new ArrayList<>();
	
	public AccountCommandExecutor() {
		for (int i=0;i<NUM_ACCOUNTS;i++) {
			accounts[i] = new Account();
			accounts[i].balance = Math.floor(Math.random()*1000);
		}
	}
	
	public void add(AccountCommand acOp) {
		accountOperations.add(acOp);
	}
	
	public void executeAll() {
		for(AccountCommand accOpCmd: accountOperations) {
			accOpCmd.run();
		}
	}

	public Account[] getAccounts() {
		return accounts;
	}
	
	public void showAll() {
		for (Account acc: accounts) {
			System.out.println("account " + acc + " : " + acc.getBalance());
		}		
	}
	
	
}
