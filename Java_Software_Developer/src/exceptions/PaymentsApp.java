package exceptions;

import java.util.Scanner;

public class PaymentsApp {

	public static void main(String[] args) {
		
		double payment = 0;
		boolean positivePayment = true;
		
		do {
			//1. Ask the user for input
			System.out.print("Enter payment amount: ");
			
			//2. Get the amount and test the value
			Scanner scanner = new Scanner(System.in);
			
			//3. Handle exceptions appropriately
			try {
				payment = scanner.nextDouble();
				if (payment < 0) {
					throw new NegativaPaymentException(payment);
				}
				else {
					positivePayment = true;
				}
			} catch (NegativaPaymentException e){
				System.out.println(e.toString());
				System.out.println("Please try again.");
				positivePayment = false;
			}
		} while(!positivePayment);
		
		//4. Print confirmation
		System.out.println("Thank you for payment of "+payment+"€.");
		
	}

}
