package oo_patterns.command.java8;

public class Client {

	
	public static void main(String[] args) {
		System.out.println("The functional version of the command pattern");
		Runnable[] cmdList = new Runnable[4];
		Account accounts[] = new Account[2];
		accounts[0] = new Account();		
		accounts[1] = new Account();

		Account.showAll(accounts);
		cmdList[0] = AccountFunctionFactory.createMakeDepositFunction(accounts[0], 100);
		cmdList[1] = AccountFunctionFactory.createMakeDepositFunction(accounts[1], 200);
		cmdList[2] = AccountFunctionFactory.createTransferFunction(accounts[0], accounts[1], 50);
		cmdList[3] = AccountFunctionFactory.createGetCashFunction(accounts[0], 50);
		AccountFunctionFactory.executeAll(cmdList);
		Account.showAll(accounts);
		
	}
	

	
}
