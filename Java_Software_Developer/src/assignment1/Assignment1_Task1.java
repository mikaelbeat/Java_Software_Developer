package assignment1;

public class Assignment1_Task1 {

	public static void main(String[] args) {

		System.out.println(calculate(3));

	}

	public static int calculate(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			System.out.print(sum +" + "+i);
			sum = sum + i;
			System.out.println(" = "+sum);
		}
		return sum;
	}

}
