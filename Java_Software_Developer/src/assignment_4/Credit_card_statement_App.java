package assignment_4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Credit_card_statement_App {

	public static void main(String[] args) {
		
		List<String[]> data = new ArrayList<String[]>();
		String filename = "C:\\Users\\Petri\\git\\Java_Software_Developer\\Java_Software_Developer\\src\\assignment_4\\statement.csv";
		String dataRow;
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(filename));
			
			while ((dataRow = br.readLine()) != null) {
				String[] line = dataRow.split(",");
				data.add(line);
			}
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		for (String[] account : data) {
		System.out.print("[ ");
			for (String field : account) {
				System.out.print(field);
			}
			System.out.println(" ]");
	}	
		

	}
}