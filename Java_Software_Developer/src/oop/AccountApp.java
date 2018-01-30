package oop;

public class AccountApp {

	public static void main(String[] args) {
		
		LoanAccount loanAc1 = new LoanAccount();
		
		loanAc1.increaseRate();
		loanAc1.setRate();
		loanAc1.setAmmortSchedule();
		loanAc1.setTerm(20);
		
		// Polymorphism changes where we are ponting
		IRate account1 = new LoanAccount();
		account1.increaseRate();
		account1.setRate();

	}

}
