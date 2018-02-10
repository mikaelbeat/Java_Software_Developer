package assignment_1;

public class Assignment1_Task2 {

	public static void main(String[] args) {
		
		System.out.println(factorial(5));
	}
	
	static int factorial(int n) {
		if (n == 0) {
			return 0;
		}
		else if (n == 1) {
			return 1;
		}
		return n * factorial(n - 1);
	}

}