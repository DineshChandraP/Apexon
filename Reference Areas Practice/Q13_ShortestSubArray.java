import java.util.HashMap;

public class Q13_ShortestSubArray {
	/*
	 * "Given an array of integers and a sum K, return the length of the shortest
	 * sub-array which matches the given sum. If it doesn't exist, return -1. [Even
	 * a single integer can be considered as a sum.]
	 * 
	 * Examples: int[] arr = {2, 4, 6, 10, 2, 1}, K = 12 // Return 2
	 * 
	 * int[] arr = {5, 8, 50, 4}, K = 50 // Return 50 (A single integer may be
	 * considered as a sum)"
	 */

	public static void main(String[] args) {
		int[] arr = {2, 4, 6, 10, 2, 1};
		int value = 12;
		System.out.println(shortestSubArray(arr, value));

	}

	private static int shortestSubArray(int[] arr, int k) {
//return number of elements in the shortest subarray that sums to k
		int arrLength = arr.length;

		if (arrLength == 0)
			return -1;

		HashMap<Integer, Integer> prefixSumMap = new HashMap<>();

		int currentSum = 0;
		int shortestLength = Integer.MAX_VALUE;

		prefixSumMap.put(0, -1);
		
		
		for(int i=0; i< arrLength; i++) {
			currentSum += arr[i];
			
			if(prefixSumMap.containsKey(currentSum-k)) {
				int subArrayLength = i- prefixSumMap.get(currentSum-k);
				shortestLength= Math.min(shortestLength, subArrayLength);
				
			}
			if(!prefixSumMap.containsKey(currentSum)) {
				prefixSumMap.put(currentSum, i);
			}
		}

		return (shortestLength == Integer.MAX_VALUE) ? -1 : shortestLength;

	}
}
