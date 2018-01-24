package basics;

import java.util.ArrayList;

public class Cities {
	
	public static void main(String[] args) {
		
		String[] cities = {"New York","San Francisco","Miami","Dallas"};
		System.out.println(cities[0]+"\n");
		
		System.out.println("*******************************************\n");
		
		String[] countries;
		countries = new String[3];
		countries[0] = "USA";
		countries[1] = "Canada";
		countries[2] = "UK";
		System.out.println(countries[2]+"\n");
		
		System.out.println("*******************************************\n");
		
		String[] states = new String[5];
		states[0] = "California";
		states[1] = "Ohio";
		states[2] = "New Jersey";
		states[3] = "Texas";
		states[4] = "Utah";
		int i = 0;
		
		// Do loop enters the loop THEN tests condition
		do {
			System.out.println("All states in array are: "+states[i]);
			i = i + 1;
		}while (i < 5);
		
		System.out.println("");
		System.out.println("*******************************************\n");
		
		
		// While loop tests condition first then entes loop
		int n = 0;
		boolean stateFound = false;
		while (!stateFound) {
			String state = states[n];
			System.out.println(state);
			if (state == "Texas") {
				System.out.println("State found!\n");
				stateFound = true;
			}
			n++;
		}
		
		System.out.println("*******************************************\n");
		
		// For loop, best structure for iterating thought an array
		for (int x = 0; x < 5; x++) {
			System.out.println("At the position "+(x+1)+" is "+states[x]);
		}
		
		
	}

}
