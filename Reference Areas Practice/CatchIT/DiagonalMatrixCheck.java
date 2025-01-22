package CatchIT;

public class DiagonalMatrixCheck {
	// Function to check if a matrix is diagonal
	public static boolean isDiagonalMatrix(int[][] matrix) {
		int rows = matrix.length;
		int cols = matrix[0].length;

		// Check if the matrix is square
		if (rows != cols) {
			return false; // A diagonal matrix must be square
		}

		// Traverse the matrix and check the non-diagonal elements
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				// If it's not a diagonal element and not zero, it's not a diagonal matrix
				if (i != j && matrix[i][j] != 0) {
					return false;
				}
			}
		}

		return true; // If we pass all checks, it's a diagonal matrix
	}

	public static void main(String[] args) {
		// Example matrix
		int[][] matrix = { { 1, 0, 0 }, { 0, 5, 0 }, { 0, 0, 9 } };

		// Check if the matrix is diagonal
		if (isDiagonalMatrix(matrix)) {
			System.out.println("The matrix is a diagonal matrix.");
		} else {
			System.out.println("The matrix is not a diagonal matrix.");
		}
	}
}
