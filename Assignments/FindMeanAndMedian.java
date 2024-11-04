package com.GS;

import java.util.Arrays;

public class FindMeanAndMedian {

	public static void main(String[] args) {

		int array[] = { 1, 3, 4, 2, 7, 5, 8, 6 };

		System.out.println("Mean: " + findMean(array));
		System.out.println("Median: " + findMedian(array));
	}

	private static double findMedian(int[] array) {
		int arrLength = array.length;
		Arrays.sort(array);
		// System.out.println("Sorted Array:");
		for (int element : array) {
			// System.out.print(element);
		}
		if (!(arrLength % 2 == 0)) {
			return array[(arrLength / 2)];
		} else {
			return (double) (array[(arrLength / 2) - 1] + array[arrLength / 2]) / 2;
		}

	}

	private static double findMean(int[] array) {
		int arrLength = array.length;
		double sum = 0;
		int i = 0;
		while (i < arrLength) {
			sum += array[i];
			i++;
		}
		return sum / arrLength;
	}

}
