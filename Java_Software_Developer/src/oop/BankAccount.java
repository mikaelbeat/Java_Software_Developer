package oop;

public class BankAccount implements IRate{
	
	String accountNumber;
	
	// Static --> Belongs to the CLASS not the OBJECT instance
	// Final --> Constant, cannot even be overwritten 
	private static final String routingNumber = "888";
	private String name;
	private String ssn;
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
	
	public void setName(String name) {
		this.name = "Mr. "+name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setSSN(String ssn) {
		this.ssn = ssn;
	}
	
	public String getSSN() {
		return ssn;
	}
	
	// Interface methods
	public void setRate() {
		System.out.println("Setting rate.\n");
	}
	
	public void increaseRate() {
		System.out.println("Increasing rate.\n");
	}
	
	// Define methods
	
	void deposit(double amount) {
		balance+=amount;
		showActivity("*Deposit* "+amount+"\n");
	}
	
	void withdraw(double amount) {
		balance-=amount;
		showActivity("*Withdraw* "+amount+"\n");
	}
	
	private void showActivity(String activity) {
		System.out.println("Your new balance is: "+balance+"€.");
		System.out.println("Your recent activity: "+activity);
		
	}
	
	void checkBalance() {
		System.out.println("Balance is "+balance+"€.\n");
	}
	
	void getStatus() {
		
	}
	
	@Override
	public String toString() {
		return "Account owner: "+name+", Account number "+accountNumber+", Balance: "+balance+"€ and "
				+ "Routing number "+routingNumber+".";
	}

}
