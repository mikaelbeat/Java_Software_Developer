package algorithms;

public class Search {
	
	public static int linearSearch(int[] dataSet, int target) {
		// Iterate thought dataset searching for target
		
		for (int i = 0; i < dataSet.length; i++) {
			if (dataSet[i] == target){
				return i;
			}
		}
		return -1;
	}
	
	public static int binarySearch(int[] dataSet, int target, int start, int end) {
		// Binary searches assumes a sorted array and can therefore continually split our search domain in half
		
		System.out.println("Searching between " + dataSet[start] + " and " + dataSet[end] + ".");
		int midpoint = (int) Math.floor(((start + end) / 2));
		int value = dataSet[midpoint];
		
		if (target > value) {
			System.out.println(target + " > " + value);
			return binarySearch(dataSet, target, midpoint + 1, end);
			
		} else if (target < value) {
			System.out.println(target + " < " + value);
			return binarySearch(dataSet, target, start, midpoint - 1);
		}
		System.out.println(target + " = " + value);
		return midpoint;
	}
}
