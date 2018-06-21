package oo_patterns.command.java7;

public class Client {

	public static void main(String[] args) {
		AccountCommandExecutor exec = new AccountCommandExecutor();
		System.out.println("before");
		exec.showAll();

		System.out.println("executing all account operations");
		exec.add(new GetCashCommand(exec.getAccounts()[0], 10));
		exec.add(new MakeDepositCommand(exec.getAccounts()[1], 100));
		exec.add(new TransferCommand(exec.getAccounts()[2], exec.getAccounts()[3], 5));
		exec.executeAll();
		
		exec.showAll();

	}

}
