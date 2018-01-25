package assignment1;

import java.util.Arrays;

public class Assignment1_Task3 {

	public static void main(String[] args) {
		
		int[] numbers = {7,3,9,2,6};
		
		calculateMinimun(numbers);
		calculateAverage(numbers);
		calculateMaximun(numbers);
		

	}
	
	static int calculateMinimun(int[] numbers){
		Arrays.sort(numbers);
		System.out.println("Smallest number in array is "+numbers[0]+".\n");
		return 0;
		
	}
	
	static double calculateAverage(int[] numbers){
		double total = 0;
		for (double sum : numbers) {
			total += sum;
		}
		double average = total / numbers.length;
		System.out.println("Average for array numbers is "+average+".\n");
		return average;
	
	}
	
	static int calculateMaximun(int[] numbers) {
		System.out.println("Biggest number in array is "+numbers[numbers.length-1]+".\n");
		return 0;

	}
}