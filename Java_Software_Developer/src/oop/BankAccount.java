package oop;

public class BankAccount {
	
	String accountNumber;
	
	// Static --> Belongs to the CLASS not the OBJECT instance
	// Final --> Constant, cannot even be overwritten 
	static final String routingNumber = "888";
	String name;
	String ssn;
	String accountType;
	double balance = 0;
	
	BankAccount() {
		System.out.println("New account created.\n");
	}
	
	BankAccount(String accountType){
		System.out.println("Created account: "+accountType+".\n");
	}
	
	BankAccount(String accountType, double initDeposit){
		System.out.println("Created account: "+accountType+".\n");
		System.out.println("Initial deposit "+initDeposit+"€ done.\n");
		if (initDeposit < 1000) {
			String message = "ERROR: Minimum deposit must be at least 1000€.\n";
			System.out.println(message);
		} else {
			String message = "Thanks for your initial deposit of "+initDeposit+"€.\n";
			System.out.println(message);
		}
		balance+=initDeposit;
	}
	
	void deposit() {
		
	}
	
	void withdraw() {
		
	}
	
	void checkBalance() {
		System.out.println("Balance is "+balance+"€.\n");
	}
	
	void getStatus() {
		
	}

}
