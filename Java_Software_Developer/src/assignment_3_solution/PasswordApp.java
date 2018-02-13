package assignment_3_solution;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class PasswordApp {

	public static void main(String[] args) {
		String filename = "C:\\Users\\Petri\\git\\Java_Software_Developer\\Java_Software_Developer\\src\\assignment_3_solution\\Passwords.txt";
		String[] passwords = new String[13];

		File file = new File(filename);

		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			for (int i = 0; i < passwords.length; i++) {
				passwords[i] = br.readLine();
			}
		} catch (FileNotFoundException e) {
			System.out.println("Error, could not open file.\n");
		} catch (IOException e) {
			System.out.println("Error, could not read file.\n");
		}

		// Test against criteria
		for (String password : passwords) {
			System.out.print("******\n" + password+"\n");
			boolean hasNumber = false;
			boolean hasLetter = false;
			boolean hasSpecial = false;
			
			for (int n = 0; n < password.length(); n++) {

				// 1. Contains number
				if ("0987654321".contains(password.substring(n, n + 1))) {
					hasNumber = true;
					// System.out.println("Postion "+n+" contains a number.");
				}
				// 2. Contains letter
				else if ("abcdefghijklmnopqrstuvwxyzöäå".contains(password.substring(n, n + 1).toLowerCase())) {
					hasLetter = true;
					// System.out.println("Position "+n+" contains a letter.");
				}
				// 3. Contains special character
				else if ("#¤%$&/()?".contains(password.substring(n, n + 1))) {
					hasSpecial = true;
					// System.out.println("Position "+n+" contains special character.");
				} else {
					try {
						throw new InvalidCharacterException(password.substring(n, n + 1));
					} catch (InvalidCharacterException e) {
						e.toString();
					}
					
					// System.out.println("Position "+n+" contains invalid character.");
				}
			}

			// Test & exception handling
			try {
				if (!hasNumber) {
				throw new NumberCriteriaException(password);
			} else if (!hasLetter){
				throw new LetterCriteriaException(password);
			} else if (!hasSpecial) {
				throw new SpecialCharCriteriaException(password);
			} else {
				System.out.println("Valid password.");
			}
			}catch (NumberCriteriaException | LetterCriteriaException | SpecialCharCriteriaException e) {
				System.out.println("Invalid password.\n");
				System.out.println(e.toString());
			}

		}

	}
}

class InvalidCharacterException extends Exception{
	
	String ch;
	
	public InvalidCharacterException(String ch) {
		this.ch = ch;
	}
	
	public String toString() {
		return "InvalidCharacterException: "+ch;
		
	}
}

class NumberCriteriaException extends Exception{
	
	String password;
	
	public NumberCriteriaException(String password) {
		this.password = password;
	}
	
	public String toString() {
		return "NumberCriteriaException: "+password;
	}
	
}

class LetterCriteriaException extends Exception{
	
	String password;
	
	public LetterCriteriaException(String password) {
		this.password = password;
	}
	
	public String toString() {
		return "LetterCriteriaException: "+password;
	}
	
}

class SpecialCharCriteriaException extends Exception{
	
	String password;
	
	public SpecialCharCriteriaException(String password) {
		this.password = password;
	}
	
	public String toString() {
		return "SpecialCharCriteriaException: "+password;
	}
	
}