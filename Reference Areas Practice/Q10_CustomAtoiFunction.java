
public class Q10_CustomAtoiFunction {

	public static void main(String[] args) {

		// Test cases
		String str1 = "123";
		String str2 = "-123";
		String str3 = "1a23";
		String str4 = "  +42";
		String str5 = "  -42";
		String str6 = "abc123";
		String str7 = "2147483648"; // Overflow case

		System.out.println(myAtoi(str1)); // 123
		System.out.println(myAtoi(str2)); // -123
		System.out.println(myAtoi(str3)); // -1 (Invalid entry)
		System.out.println(myAtoi(str4)); // 42
		System.out.println(myAtoi(str5)); // -42
		System.out.println(myAtoi(str6)); // 0 (Invalid entry)
		System.out.println(myAtoi(str7)); // 2147483647 (Overflow case)
	}

	private static int myAtoi(String strToConvert) {
		// Step1: Trim the string
		String str = strToConvert.trim();

		// Step2: Check for empty String
		if (str.isEmpty()) {
			return 0;
		}

		int index = 0;
		int sign = 1;

		// Step 3: Check for '+' or '-'
		if (str.charAt(0) == '-') {
			index++;
			sign = -1;
		} else if (str.charAt(0) == '+') {
			index++;
		}

		// Step4: convert the String to Integer
		int result = 0;
		while (index < str.length()) {
			char c = str.charAt(index);

			// converting to number
			if (c >= '0' && c <= '9') {
				int numericalValue = c - '0';

				// Over Flow case
				// base formula-- result * 10 + digit > Interger.MAX_VALUE
				// result > (Integer.MAX_VALUE-digit) /10

				if (result > (Integer.MAX_VALUE - numericalValue) / 10) {
					return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
				}
				result = result * 10 + numericalValue;
			} else {
				break;
			}
			index++;
		}

		// Step5: Add the sign to the result
		result = sign * result;

		return result;
	}

}
