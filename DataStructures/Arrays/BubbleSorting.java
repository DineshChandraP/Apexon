package Arrays;

public class BubbleSorting {
	// Pushing the highest element to the next position by swaping
	public static void main(String[] args) {
		int arr[] = { 64, 34, 25, 12, 22, 11, 90, 5, 54, 79 };

		int arrSize = arr.length;
		System.out.println(arrSize);

		for (int i = 0; i < arrSize; i++) {

			for (int j = 0; j < arrSize - i - 1; j++) {

				if (arr[j] > arr[j + 1]) {
					int temp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = temp;
				}
			}
		}

		// Printing Sorted Array
		for (int i : arr) {
			System.out.print(i + ",");
		}

	}
}
