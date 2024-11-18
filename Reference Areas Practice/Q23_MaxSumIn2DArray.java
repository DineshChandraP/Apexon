
public class Q23_MaxSumIn2DArray {
	/*
	 * "Given a matrix of size m * n, return the maximum path sum in the matrix.
	 * [You start from the top-left corner of the matrix and may up, down and
	 * diagonally].
	 * 
	 * Example: Matrix 10 10 2 0 20 4 1 0 0 30 2 5 0 10 4 0 2 0 1 0 2 20 0 4
	 * 
	 * // Return 74 [The maximum sum path is 20-30-4-20]"
	 * 
	 */

	public static void main(String[] args) {
		int matrix[][] = { { 10, 10, 2, 0, 20, 4 }, { 1, 0, 0, 30, 2, 5 }, { 0, 10, 4, 0, 2, 0 },
				{ 1, 0, 2, 20, 0, 4 } };

		System.out.println(findMaxPath(matrix));
	}

	private static int findMaxPath(int[][] matrix) {
		int rows = matrix.length;
		int columns = matrix[0].length;

		int result = -1;

		// finding max value in first row
		for (int i = 0; i < columns; i++) {
			result = Math.max(result, matrix[0][i]);
		}

		for (int i = 1; i < rows; i++) {
			result = -1;
			for (int j = 0; j < columns; j++) {

				// when all paths are possible
				if (j > 0 && j < columns - 1) {
					matrix[i][j] += Math.max(matrix[i - 1][j], Math.max(matrix[i - 1][j - 1], matrix[i - 1][j + 1]));
				}
				// when diagonal right is not possible
				else if (j > 0) {
					matrix[i][j] += Math.max(matrix[i - 1][j], matrix[i - 1][j - 1]);
				}
				// when diagonal left is not possible
				else if (j < columns - 1) {
					matrix[i][j] += Math.max(matrix[i - 1][j], matrix[i - 1][j + 1]);
				}
				// store max path sum
				result = Math.max(matrix[i][j], result);
			}
		}

		return result;
	}
}
