
public class Q29PascalTraingle {

	public static void main(String[] args) {

		int numberOfRows = 5;

		printPascalTraiangle(numberOfRows);
	}

	private static void printPascalTraiangle(int numberOfRows) {
		int i, j;

		for (i = 0; i <= numberOfRows; i++) {
			// Printing spaces
			for (j = 0; j <= numberOfRows - i; j++) {
				System.out.print(" ");
			}
			for (j = 0; j <= i; j++) {
				System.out.print(" " + factorial(i) / (factorial(i - j) * factorial(j)));
			}
			System.out.println("");
		}
	}

	public static int factorial(int i) {
		if (i == 0) {
			return 1;
		}
		return i * factorial(i - 1);
	}

}
