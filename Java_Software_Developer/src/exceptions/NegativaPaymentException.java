package exceptions;

public class NegativaPaymentException extends Exception{
	
	double payment;
	
	//1. Constructor that takes the value that would throw the exception
	//2. Assign value of local variable class variable
	public NegativaPaymentException(double payment) {
		this.payment = payment;
	}

	//3. Override the toString() method to include the specific exception message
	public String toString() {
		return "Error, negative payment "+payment+" entered.";
	}
}
