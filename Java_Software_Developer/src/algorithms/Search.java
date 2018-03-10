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
		
		int mi
	}
}
