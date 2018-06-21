package oo_patterns.command.java7;

public class GetCashCommand extends AccountCommand {

	private Account account;
	private double value;
			
	public GetCashCommand(Account account, double value) {
		super();
		this.account = account;
		this.value = value;
	}


	@Override
	public void run() {
		System.out.println("getting " + value + " from account " + account);
		account.setBalance(account.getBalance()-value);

	}

}
