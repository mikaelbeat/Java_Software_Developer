package basics;

public class Salary_Calculator {

	public static void main(String[] args) {

		String career;
		System.out.println("Program is starting!");
		career = "software developer";
		System.out.println("My career is "+career+".");
		
		int hoursPerWeek = 40;
		int weeksPerYear = 50;
		double rate = 42.50;
		
		double salary = hoursPerWeek * weeksPerYear * rate;
		System.out.println("My salary as "+career+" at a rate of "+rate+" is "+salary+"€.");

	}

}
