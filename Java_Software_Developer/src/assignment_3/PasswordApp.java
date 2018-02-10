package assignment_3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class PasswordApp {
	
	static String filename = "C:\\Users\\Petri\\git\\Java_Software_Developer\\Java_Software_Developer\\src\\assignment_3\\Password.txt";
	static Scanner reader = new Scanner(System.in);
	static boolean quit = false;
	static String password = null;
	static File file = new File(filename);
	static String[] fileContent = null;
	
	
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
	
	
	public static void writePasswordToFile() {
		try {
			FileWriter fw = new FileWriter(file, true);
			BufferedWriter bw = new BufferedWriter(fw);
			System.out.print("Enter password to be saved in file: ");
			password = reader.nextLine();
				if (password.length() < 6) {
					System.out.println("Password must be at least 6 characters long, try again.\n");
					writePasswordToFile();
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
	}
	
	public static void showFileContent() {
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			String line = br.readLine();
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

class passwordLenghtException extends PasswordApp{
	
	String password;
	
	public passwordLenghtException(String password) {
		this.password = password;
	}
	
	public String toString() {
		return ("Password lenght exception: " + password + ".\n");
	}
}
