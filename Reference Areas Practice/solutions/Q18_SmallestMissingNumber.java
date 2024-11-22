package solutions;

public class Q18_SmallestMissingNumber {
	/*
	 * "Given a sorted array of non-negative integers of size n, return the smallest
	 * missing integer.
	 * 
	 * Examples: int[] arr1 = {1, 2, 3, 4}; // Return 0
	 * 
	 * int[] arr2 = {0, 1, 3, 4}; // Return 2"
	 */

	public static void main(String[] args) {

		int[] arr1 = { 0, 1, 3, 4 };
		System.out.println("Smallest Missing Integer is :" + findSmallestMissingNumber(arr1));
	}

	private static int findSmallestMissingNumber(int[] arr) {

		int left = 0;
		int right = arr.length - 1;

		while (left <= right) {
			int mid = left + (right - left) / 2;

			if (arr[mid] == mid) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}
		return left;
	}
}
