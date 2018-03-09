package assignment_4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {

	public static void main(String args[]) {

		String fileName = "C:\\Users\\Petri\\git\\Java_Software_Developer\\Java_Software_Developer\\src\\assignment_4\\statement.csv";

		try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {

			String line;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
	
	
	
	
	
	
	
	
	}