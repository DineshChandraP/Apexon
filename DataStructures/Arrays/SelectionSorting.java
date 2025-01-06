package Arrays;

public class SelectionSorting {
	// Pushing the lowest element to first by pushing all the element to right
	public static void main(String[] args) {
		int arr[] = { 64, 34, 25, 12, 22, 11, 90, 5, 54, 79 };
		int arrSize = arr.length;

		for (int i = 0; i < arrSize - 1; i++) {

			int minIndex = i;

			// Finding min value index
			for (int j = i + 1; j < arrSize; j++) {
				if (arr[j] < arr[minIndex]) {
					minIndex = j;
				}

			}
			int minValue = arr[minIndex];

			// Sorting the Array
			for (int k = minIndex; k > i; k--) {
				arr[k] = arr[k - 1];
			}

			arr[i] = minValue;
		}

		// Printing Sorted Array
		for (int i : arr) {
			System.out.print(i + ",");
		}
	}
}
