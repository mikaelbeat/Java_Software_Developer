package oop;

public class BankAccountApp {

	public static void main(String[] args) {
		
		BankAccount account1 = new BankAccount();
		account1.accountNumber = "1234";
		
		BankAccount account2 = new BankAccount("Checking account");
		account2.accountNumber = "4567";
		
		BankAccount account3 = new BankAccount("Savings account", 10000);
		account3.accountNumber = "8910";
		account3.checkBalance();
		
		System.out.println(account1.routingNumber);
		System.out.println(account2.routingNumber);
		System.out.println(account3.routingNumber);
		
	}

}
