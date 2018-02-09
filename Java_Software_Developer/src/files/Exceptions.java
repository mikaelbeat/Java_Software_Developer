package files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class Exceptions {

	public static void main(String[] args) {

		String filename = "C:\\Users\\Petri\\git\\Java_Software_Developer\\Java_Software_Developer\\src\\files\\Demo.txt";
		File file = new File(filename);
		String[] phoneNums = new String[2];
		String phoneNum = null;

		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			for (int i = 0; i < phoneNums.length; i++) {
				phoneNums[i] = br.readLine();
			}
			br.close();
		} catch (FileNotFoundException e) {
			System.out.println("Error, file not found: " + filename + ".\n");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Error, could not read file: " + filename + ".\n");
			e.printStackTrace();
		}

		for (int i = 0; i < phoneNums.length; i++) {
			phoneNum = phoneNums[i];
			try {
				if (phoneNum.length() != 10) {
					throw new DigitsException(phoneNum);
				}
				System.out.println("Valid phone number in position "+(i+1)+". "+phoneNum+".\n");
			} catch (DigitsException e) {
				System.out.println("Error, phone number is not 10 digits in position: "+(i+1));
				System.out.println(e.toString());
			} 
			}
		}
	}

class DigitsException extends Exception {

	String num;

	public DigitsException(String num) {
		this.num = num;
	}

	public String toString() {
		return ("TenDigitsException: " + num + ".\n");
	}
}