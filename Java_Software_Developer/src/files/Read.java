package files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Read {

	public static void main(String[] args) {
		
		
		// 1. Define file path that we want to read
		String filename = "C:\\Users\\Petri\\git\\Java_Software_Developer\\Java_Software_Developer\\src\\files\\Read.txt";
		String text = null;
		
		// 2. Create the file in Java
		File file = new File(filename);
		
		try {
			// 3. Open the file			
			 BufferedReader br = new BufferedReader(new FileReader(file));
			
			// 4. Read the file
			text = br.readLine();
			
			// 5. Cloese the resources
			br.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("Error, file not found: "+filename+".\n");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Cannot read data: "+filename+".\n");
			e.printStackTrace();
		} finally {
			System.out.println("Finished reading the file.");
		}
		System.out.println(text);
	}
}