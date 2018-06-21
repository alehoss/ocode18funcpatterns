package oo_patterns.command.java7;

public class TransferCommand extends AccountCommand {

	private Account origin;
	private Account destination;
	private double value;
	
		
	public TransferCommand(Account origin, Account destination, double value) {
		super();
		this.origin = origin;
		this.destination = destination;
		this.value = value;
	}

	@Override
	public void run() {
		System.out.println("transfering " + value + " from account " + origin + " to account " + destination);		
		origin.setBalance(origin.getBalance()-value);
		destination.setBalance(destination.getBalance()+value);
		
	}
		
}
