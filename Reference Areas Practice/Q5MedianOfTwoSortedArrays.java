//package com.GS;

public class Q5MedianOfTwoSortedArrays {
	/*
	 * "Find the median of two sorted arrays of different sizes.
	 * 
	 * Example: arr1[] = {2, 3, 5, 8} arr2[] = {10, 12, 14, 16, 18, 20}
	 * 
	 * //Return 11 as the median"
	 */

	public static void main(String[] args) {
		int[] arr1 = { 1, 3, 8, 9, 15 };
		int[] arr2 = { 7, 11, 18, 19, 21, 25 };

		System.out.println(medianOf2(arr1, arr2));
	}

	public static int medianOf2(int[] arr1, int[] arr2) {

		int length1 = arr1.length, length2 = arr2.length;

		if (length1 > length2) {
			return medianOf2(arr2, arr1);
		}

		int low = 0, high = length1;

		while (low <= high) {
			int mid1 = (low + high) / 2;
			int mid2 = (length1 + length2 + 1) / 2 - mid1;

			int l1 = mid1 == 0 ? Integer.MIN_VALUE : arr1[mid1 - 1];
			int r1 = mid1 == length1 ? Integer.MAX_VALUE : arr1[mid1];

			int l2 = mid2 == 0 ? Integer.MIN_VALUE : arr2[mid2 - 1];
			int r2 = mid2 == length2 ? Integer.MAX_VALUE : arr2[mid2];

			if (l1 <= r2 && l2 <= r1) {

				if ((length1 + length2) % 2 == 0) {
					return (Math.max(l1, l2) + Math.min(r1, r2)) / 2;
				} else {
					return Math.max(l1, l2);
				}
			}

			if (l1 > r2) {
				high = mid1 - 1;
			} else {
				low = mid1 + 1;
			}
		}
		return 0;
	}

}
