package Arrays;

public class InsertionSorting {
// To have a sorted portion of an array by taking 1 value every time

	public static void main(String[] args) {

		int arr[] = { 64, 34, 25, 12, 22, 11, 90, 5, 54, 79 };
		int arrSize = arr.length;

		// starting with 1 since 1st element(0 index) is considered to be sorted
		// initally
		for (int i = 1; i < arrSize; i++) {

			// where the element to be inserted
			int insertIndex = i;

			int currentValue = arr[i];

			// Index of last element in the sorted array (Initially zero index)
			int j = i - 1;

			while (j >= 0 && arr[j] > currentValue) {
				arr[j + 1] = arr[j];
				insertIndex = j;
				j--;
			}
			arr[insertIndex] = currentValue;
		}

		// Printing Sorted Array
		for (int i : arr) {
			System.out.print(i + ",");
		}
	}

}
