package solutions;

public class Q14_NumberPowerOfTen {

	public static void main(String[] args) {

		int n = 1000;

		checkIftheGivenNumberIsPowerOfTenV1(n);
		checkIftheGivenNumberIsPowerOfTenV2(n);

	}

	private static void checkIftheGivenNumberIsPowerOfTenV1(int n) {

		if (n <= 0) {
			System.out.println("Invalid Number");
		}

		System.out.println(Math.log10(n) % 1 == 0);
	}

	private static void checkIftheGivenNumberIsPowerOfTenV2(int n) {
		if (n <= 0) {
			System.out.println("Invalid Number");
		}

		while (n % 10 == 0) {
			n = n / 10;
		}
		System.out.println(n == 1);
	}
}
