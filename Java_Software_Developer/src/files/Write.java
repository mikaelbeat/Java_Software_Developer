package files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Write {

	public static void main(String[] args) {

		// 1. Define the path that we want to write
		String filename = "C:\\Users\\Petri\\git\\Java_Software_Developer\\Java_Software_Developer\\src\\files\\Write.txt";
		String message = "Demo data to be written to file.";
		
		// 2. Create the file in Java
		File file = new File(filename);
		
		try {
			// 3. Open the file
			FileWriter fw = new FileWriter(file);
			
			// 4. Write to the file
			fw.write(message);
			
			// 5. Close the resources
			fw.close();
			
		} catch (IOException e) {
			System.out.println("Error, could not write file: "+filename+".\n");
			e.printStackTrace();
		} finally {
			System.out.println("Closing the filewriter.");
			System.out.println("Writed message: "+message+"\n"+"to the file: "+filename+".");
		}

	}

}
