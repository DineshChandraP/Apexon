package solutions;

public class Q11_MinimumElementInSortedArray {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		int[] input = { 100, 200, 300, 500, 600, 1, 10, 50, 60, 70, 80 };

		int[] input1 = { 1, 2, 3, 4, 5, 6 };
		int[] input2 = { 6, 1, 2, 3, 4, 5 };
		int[] input3 = { 5, 6, 1, 2, 3, 4 };
		int[] input4 = { 2, 1 };
		int[] input5 = { 10 };
		int[] input6 = { 3, 4, 5, 1, 2 };
		int[] input7 = { 7, 7, 7, 7, 7 };

		printMinimumElementInRotatedSortedArray(input);
	}

	private static void printMinimumElementInRotatedSortedArray(int[] input) {

		int low = 0;
		int high = input.length - 1;
		int min = Integer.MAX_VALUE;

		while (low < high) {

			int mid = low + (high - low) / 2;

			if (input[mid] > input[high]) {
				low = mid + 1;
			} else {
				high = mid;
			}
		}

		System.out.println(input[low]);
	}

}
