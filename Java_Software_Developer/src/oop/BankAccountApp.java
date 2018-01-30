package oop;

public class BankAccountApp {

	public static void main(String[] args) {
		
		BankAccount account1 = new BankAccount();
		account1.accountNumber = "1234";
		account1.setName("Demo Tester");
		account1.setSSN("11111-111A");
		System.out.println(account1.getName()+"\n");
		System.out.println("SSN is: "+account1.getSSN()+"\n");
		account1.balance = 1000;
		account1.setRate();
		account1.increaseRate();
		
		// Polymorphism thought overriding
		System.out.println(account1.toString()+"\n");
		
		account1.deposit(500);
		account1.deposit(500);
		account1.deposit(500);
		account1.withdraw(2000);
		
		//Polymorphims thought overloading
//		BankAccount account2 = new BankAccount("Checking account");
//		account2.accountNumber = "4567";
//		
//		BankAccount account3 = new BankAccount("Savings account", 10000);
//		account3.accountNumber = "8910";
//		account3.checkBalance();
//		
//		System.out.println(account1.routingNumber);
//		System.out.println(account2.routingNumber);
//		System.out.println(account3.routingNumber);
//		
//		CDAccount cd1 = new CDAccount();
//		cd1.accountNumber = "111";
//		cd1.balance = 3000;
//		cd1.interestRate = 4.5;
//		cd1.name = "Person Two";
//		cd1.accountType = "CD Account";
//		System.out.println(cd1.toString());
//		cd1.compound();
	}

}
