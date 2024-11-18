
public class Q21_AddingTwoFractions {
	/*
	 * "Give two fractions, the numerator and denominator represented as a pair of
	 * ints, return them in their simplest form after adding them.
	 * 
	 * Examples: {Numerator_frac1 = 1, Denominator_frac1 = 3} // 1/3
	 * {Numerator_frac2 = 3, Denominator_frac2 = 9} // 3/9 // Return Numerator_ans =
	 * 2, Denominator_ans = 3 // 2/3
	 * 
	 * {Numerator_frac1 = 1, Denominator_frac1 = 2} // 1/2 {Numerator_frac2 = 3,
	 * Denominator_frac2 = 2} // 3/2 // Return Numerator_ans = 2, Denominator_ans =
	 * 1 // 2/1"
	 */

	public static void main(String[] args) {
		int n1 = 1, d1 = 3, n2 = 3, d2 = 9;
		int[] result = addFractions(n1, d1, n2, d2);
		System.out.println("Result: " + result[0] + "/" + result[1]);
	}

	private static int[] addFractions(int n1, int d1, int n2, int d2) {
		// int finalNumerator = 0, finalDenominator = 0;

		int leastCommonMultiple = (d1 * d2) / greatestCommonDivisor(d1, d2);

		int newN1 = n1 * (leastCommonMultiple / d1);

		int newN2 = n2 * (leastCommonMultiple / d2);

		int finalNumerator = newN1 + newN2;
		int finalDenominator = leastCommonMultiple;

		// simply the fraction
		int gcd = greatestCommonDivisor(finalNumerator, finalDenominator);
		finalNumerator = finalNumerator / gcd;
		finalDenominator = finalDenominator / gcd;

		return new int[] { finalNumerator, finalDenominator };
	}

	private static int greatestCommonDivisor(int d1, int d2) {

		return (d2 == 0) ? d1 : greatestCommonDivisor(d2, d1 % d2);
	}
}
