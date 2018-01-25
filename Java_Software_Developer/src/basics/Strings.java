package basics;

public class Strings {

	public static void main(String[] args) {

		String booktitle;
		String wordChoice = "Ring";
		booktitle = "The Lord Of The Rings";
		
		if (booktitle.contains("Ring")) {
			System.out.println("The booktitle contais word "+wordChoice+".\n");
		}
		
		String browser = "Chrome";
		if (browser.equalsIgnoreCase("chrome")) {
			System.out.println("The browser is Chome.\n");
		}
		
		String firstName = "FirstName";
		String lastName = "LastName";
		String SSN = "123456789-123A";
		
		// Print initials plus last 4 digits from SSN
		System.out.print(firstName.substring(0,1)+" ");
		System.out.print(lastName.substring(0,3)+" ");
		System.out.println(SSN.substring(10)+"\n");
		
		System.out.println("There are "+SSN.length()+" digits in your SSN.");
		
	}

}
