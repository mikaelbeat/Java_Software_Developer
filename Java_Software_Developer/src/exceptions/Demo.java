package exceptions;

public class Demo {

	public static void main(String[] args) {
		System.out.println("Program starts...");
		calculate(12, 0);
		System.out.println("Program continues...");
	}

	public static void calculate(int a, int b) {
		answer(a, b);
	}
	
	public static double answer(int x, int y) {
		return x / y;
	}
	
}
