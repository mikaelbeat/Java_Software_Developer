package oop;

public class BankAccountApp {

	public static void main(String[] args) {
		
		BankAccount account1 = new BankAccount();
		
		BankAccount account2 = new BankAccount("checking account");
		
		BankAccount account3 = new BankAccount("savings account", 5000);

	}

}
