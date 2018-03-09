package assignment_4_solution;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class Statement_App {
	
	private static DecimalFormat df2 = new DecimalFormat(".##");

	public static void main(String[] args) {

		List<String[]> transactions = new ArrayList<String[]>();
		String filename = "C:\\Users\\Petri\\git\\Java_Software_Developer\\Java_Software_Developer\\src\\assignment_4_solution\\statement.csv";
		String dataRow;
		double balance = 0;

		try {
			BufferedReader br = new BufferedReader(new FileReader(filename));

			while ((dataRow = br.readLine()) != null) {
				String[] line = dataRow.split(",");
				transactions.add(line);
			}

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		for (String[] transaction : transactions) {
			String date = transaction[0];
			String type = transaction[1];
			String vendor = transaction[2];
			double amount = Double.parseDouble(transaction[3]);
			System.out.print(date + " " + type + " " + vendor + " $" + amount);

			if (type.equalsIgnoreCase("credit")) {
				balance += amount;
			} else if (type.equalsIgnoreCase("debit")) {
				balance -= amount;
			} else {

			}
			System.out.print(" " + df2.format(balance) + "\n");
		}
		
		if (balance > 0) {
			System.out.println("You have a balance of " + df2.format(balance));
			System.out.println("You have charged a 10% fee of " + df2.format(balance * .10));
			System.out.println("Your new balance is: " + df2.format(balance * 1.1));
		}
		else if (balance < 0) {
			System.out.println("Thanks for your payments.");
			System.out.println("You have a overpayment of - " + df2.format(balance));
		}
		else {
			System.out.println("Thanks for your payment!");
		}
	}
}
