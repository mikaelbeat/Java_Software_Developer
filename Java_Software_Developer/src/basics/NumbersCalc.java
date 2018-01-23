package basics;

public class NumbersCalc {

	public static void main(String[] args) {

		System.out.println("Program is starting...\n");
		printName();
		
		int numA = 10;
		int numB = 20;
		
		addNumbers(numA, numB);
		System.out.println("Result is "+multipleNumbers(numA, numB)+".");
		
	}
	
	static void printName(){
		System.out.println("Name printer!\n");
	}
	
	static void addNumbers(int numberA, int numberB){
		int sum = numberA + numberB;
		System.out.println("Sum of number "+numberA+" and number "+numberB+" is "+sum+".");
	}
	
	static int multipleNumbers(int numberA, int numberB){
		int product = numberA * numberB;
		addNumbers(product, product);
		return product;
	}

}
