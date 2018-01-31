package bankAccount;

public class BankAccountApp {

	public static void main(String[] args) {

		BankAccount account1 = new BankAccount("120770-606Q",100);
		account1.setName("Snake Charmer");
		System.out.println("Account owner is: "+account1.getName()+".\n");
		account1.makeDeposit(1000);
		account1.makeDeposit(1000);
		account1.payBill(550);
		account1.accrue();
		System.out.println(account1.toString());
		
		BankAccount account2 = new BankAccount("300160-778Y",9000);
		account2.setName("Fire Eater");
		System.out.println("Account owner is:"+account2.getName()+".\n");
		
		BankAccount account3 = new BankAccount("221145-888G",400.43);
		account3.setName("Third Wheel");
		System.out.println("Account owner is: "+account3.getName()+".\n");

	}

}

class BankAccount implements IInterest{

	// Properties of account 
	private static int ID = 1000; // Internal ID
	private String accountNumber; // ID + random 2-digit number + first 2 of SSN
	private static final String routingNumber = "B17C778";
	private String name;
	private String SSN;
	private double balance;

	// Constructor
	public BankAccount(String SSN, double initDeposit) {
		balance=initDeposit;
		ID++;
		System.out.println("New account created for ID: "+ID+".");
		this.SSN = SSN;
		setAccountNumber();
	}

	private void setAccountNumber() {
		int random = (int) (Math.random() * 100);
		accountNumber = ID+""+random+SSN.substring(0,2);
		System.out.println("Created account number is: "+accountNumber+".");
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void payBill(double amount) {
		balance -= amount;
		System.out.println("Paying bill: "+amount+"€.");
		showBalance();
		}
	
	public void makeDeposit(double amount) {
		balance += amount;
		System.out.println("Making deposit: "+amount+"€.");
		showBalance();
	}
	
	public void showBalance() {
		System.out.println("Balance is: "+balance+"€.\n");
	}
	
	public void accrueInterest() {
		
	}

	@Override
	public void accrue() {
		System.out.println("Adding interest rate "+rate+" to balance.");
		balance = balance * (1+rate/100);
		showBalance();
	}
	
	@Override
	public String toString() {
		System.out.println("*** Account info ***");
		return "Name: "+name+"\nAccount number: "+accountNumber+"\nRouting number: "
		+routingNumber+"\nBalance is: "+balance+"€\n";
	}
	
}