package oop;

public class BankAccount {
	
	String accountNumber;
	String routingNumber;
	String name;
	String ssn;
	String accountType;
	
	BankAccount() {
		System.out.println("New account created.\n");
	}
	
	BankAccount(String accountType){
		System.out.println("New account "+accountType+" created.\n");
	}
	
	BankAccount(String accountType, double initDeposit){
		System.out.println("New accout "+accountType+" created.");
		System.out.println("Initial deposit is "+initDeposit+"€.\n");
	}
	
	void deposit() {
		
	}
	
	void withdraw() {
		
	}
	
	void checkBalance() {
		
	}
	
	void getStatus() {
		
	}

}
