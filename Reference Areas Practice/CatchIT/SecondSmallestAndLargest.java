package CatchIT;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SecondSmallestAndLargest {

	public static void main(String[] args) {
		// Example cases:
		try {
			int[] arr1 = { 7, 9, 2, 4, 5 }; // Normal case
			System.out.println("Sum of second smallest and second largest: " + findSumOfSecondSmallestAndLargest(arr1));

			int[] arr2 = { 5, 5, 5, 5 }; // Case with duplicate elements
			System.out.println("Sum of second smallest and second largest: " + findSumOfSecondSmallestAndLargest(arr2));

			int[] arr3 = { 8, 3 }; // Case with only two elements
			System.out.println("Sum of second smallest and second largest: " + findSumOfSecondSmallestAndLargest(arr3));

		} catch (IllegalArgumentException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

	public static int findSumOfSecondSmallestAndLargest(int[] arr) {
		// Handle edge cases:
		if (arr == null || arr.length < 2) {
			throw new IllegalArgumentException("Array must have at least two elements.");
		}

		// Convert array to a list, sort and remove duplicates using streams
		List<Integer> sortedList = Arrays.stream(arr).boxed() // Convert int[] to Integer[]
				.distinct() // Remove duplicates
				.sorted() // Sort the elements
				.collect(Collectors.toList());

		// If there are less than 2 distinct elements, return an error or handle
		// accordingly
		if (sortedList.size() < 2) {
			throw new IllegalArgumentException("Array must have at least two distinct elements.");
		}

		// Get second smallest and second largest elements
		int secondSmallest = sortedList.get(1);
		int secondLargest = sortedList.get(sortedList.size() - 2);

		return secondSmallest + secondLargest;
	}
}
