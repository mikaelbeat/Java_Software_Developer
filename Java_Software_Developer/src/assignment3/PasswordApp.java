package assignment3;

import java.util.Scanner;

public class PasswordApp {
	
	static String filename = "C:\\Users\\Petri\\git\\Java_Software_Developer\\Java_Software_Developer\\src\\assignment3\\Password.txt";
	static Scanner reader = new Scanner(System.in);
	static boolean quit = false;
	
	public static void main(String[] args) {
		
		System.out.println("A");
		System.out.println("A");
		System.out.println("A");
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
				quit();
				quit = true;
				
			}
		}
		
		

	}
	
	
	public static void writePasswordToFile() {
		
	}
	
	public static void checkPasswordsValidityInFile() {
		
	}
	
	public static void quit() {
		
	}
	
	public static void menu() {
		System.out.println("1 - Write password to file.\n"+
						   "2 - Check passwords vality in file.\n"+
						   "3 - Quit");
	}
	
	

}
