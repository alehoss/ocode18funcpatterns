package oo_patterns.command.java7;

public class MakeDepositCommand extends AccountCommand {

	private Account account;
	private double value;
	
	
	public MakeDepositCommand(Account account, double value) {
		super();
		this.account = account;
		this.value = value;
	}


	@Override
	public void run() {
		System.out.println("making deposit of " + value + " to account " + account);		
		account.setBalance(account.getBalance()+value);

	}

}
