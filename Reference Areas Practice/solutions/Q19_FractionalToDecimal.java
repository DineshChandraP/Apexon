package solutions;
import java.util.HashMap;
import java.util.Map;

public class Q19_FractionalToDecimal {

	/*
	 * "Given two integers representing the numerator and denominator of a fraction,
	 * return the fraction in string format. [If the fractional part is repeating,
	 * enclose the repeating part in parentheses].
	 * 
	 * Examples: Numerator = 1, Denominator = 2 // Return ""0.5""
	 * 
	 * Numerator = 1, Denominator = -2 // Return ""-0.5""
	 * 
	 * Numerator = 50, Denominator = 22 // Return ""2.(27)"" [Fractional part (27)
	 * is repeating, hence enclosed in paranthesis]"
	 */
	public static void main(String[] args) {
		int numerator = 10;
		int denominator = 3;

		System.out.println(convertFractionalToDecimal(numerator, denominator));
	}

	private static String convertFractionalToDecimal(int numerator, int denominator) {

		if (numerator == 0)
			return "0";
		if (denominator == 0)
			return "";

		StringBuilder result = new StringBuilder();

		if (numerator < 0 || denominator < 0)
			result.append("-");
		result.append(numerator / denominator);

		int num = Math.abs(numerator);
		int den = Math.abs(denominator);

		long remainder = num % den;

		if (remainder != 0) {
			result.append(".");
		} else {
			return result.toString();
		}

		Map<Long, Integer> remainderMap = new HashMap<Long, Integer>();

		while (remainder != 0) {
			if (remainderMap.containsKey(remainder)) {
				int repeatIndex = remainderMap.get(remainder);
				result.insert(repeatIndex, "(");
				result.append(")");
				break;
			}

			remainderMap.put(remainder, result.length());

			remainder *= 10;
			result.append(remainder / den);

			remainder %= den;
		}

		return result.toString();
	}
}
