package assignment_3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class PasswordApp {
	
	static String filename = "C:\\Users\\Petri\\git\\Java_Software_Developer\\Java_Software_Developer\\src\\assignment_3\\Password.txt";
	static Scanner reader = new Scanner(System.in);
	static boolean quit = false;
	static String password = null;
	static File file = new File(filename);
	static String[] fileContent = null;

	static boolean upper = false;
	static boolean lower = false;
	static boolean hasNumber = false;
	static boolean hasSpecial = false;
	
	
	public static void main(String[] args) {
		
		System.out.println("*** Password Application ***");
		System.out.println("Password must be at least 8 characters long.");
		System.out.println("It must contain lower / upper case letters and at least one number.\n");
		int choice = 0;
		menu();
		
		while(!quit) {
			choice = reader.nextInt();
			System.out.println();
			reader.nextLine();
			System.out.println("");
			
			switch(choice) {
			case 0:
				menu();
				break;
			case 1:
				writePasswordToFile();
				break;
			case 2:
				checkPasswordsValidityInFile();
				break;
			case 3:
				showFileContent();
				break;
			case 4:
				quit();
				quit = true;
			}
		}
	}
	
	
	public static boolean writePasswordToFile() {
		try {
			FileWriter fw = new FileWriter(file, true);
			BufferedWriter bw = new BufferedWriter(fw);
			System.out.print("Enter password to be saved in file: ");
			password = reader.nextLine();
			
			boolean passwordLenght = password.length() >= 6;
			boolean upperCase = !password.equals(password.toLowerCase());
			boolean lowerCase = !password.equals(password.toUpperCase());
			boolean hasSpecial = !password.matches("[A-Za-z0-9]*");
		    boolean hasNumber = !password.matches(".*\\d+.*");  
			
				if (!passwordLenght) {
					System.out.println("Invalid password, it must be at least 6 characters long.\n");
					writePasswordToFile();
					return true;
				} else if (!upperCase) {
					System.out.println("Invalid password, it must contain at least one UPPERCASE letter.\n");
					writePasswordToFile();
					return true;
				} else if (!lowerCase) {
					System.out.println("Invalid password, it must contain at least one lowev case letter.\n");
					writePasswordToFile();
					return true;
				} else if (!hasSpecial) {
					System.out.println("Invalid password, it must contain at least one special character.\n");
					writePasswordToFile();
					return true;
				} else if (hasNumber) {
					System.out.println("Invalid password, it must contain at least one number.\n");
					writePasswordToFile();
					return true;
				} else {
				bw.write(password);
				bw.newLine();
				bw.close();
				System.out.println("Password "+password+" saved to file "+file+".\n");
				menu();
				}
		} catch (IOException e) {
			System.out.println("Cannot write to file "+filename+".\n");
			e.printStackTrace();
			menu();
		}
		return true;
	}
	
	public static void showFileContent() {
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			String line = br.readLine();
			if (line == null) {
				System.out.println("The is no passwords saved in file.\n");
			}
			while(line != null) {
				System.out.println("* "+line+"\n");
				line = br.readLine();
			}
			System.out.println("");
			br.close();
			menu();
		} catch (FileNotFoundException e) {
			System.out.println("File "+file+" not found.");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Cannot read file "+filename+".\n");
			e.printStackTrace();
			menu();
		}
		
	}
	
	public static void checkPasswordsValidityInFile() {
		
	}
	
	public static void quit() {
		System.out.println("Password application shutting down.");
	}
	
	public static void menu() {
		System.out.println("1 - Write password to file.\n"+
						   "2 - Check passwords valitidy in file.\n"+
						   "3 - Show password file content.\n"+
						   "4 - Quit");
	}
}

class passwordLenghtException extends Exception{
	
	String password;
	
	public passwordLenghtException(String password) {
		this.password = password;
	}
	
	public String toString() {
		return ("Password lenght exception: " + password + ".\n");
	}
}
