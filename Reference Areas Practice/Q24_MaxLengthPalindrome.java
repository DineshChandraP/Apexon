
public class Q24_MaxLengthPalindrome {
	/*
	 * "Given a string, return the pallindrome of maximum length and its length.
	 * (So, you return both the relevant pallindrome substring and its length).
	 * 
	 * Example: String str = ""forgeeksskeegfor""; // Return {""geeksskeeg"", 10}"
	 */
	public static void main(String[] args) {

		String str = "forgeeksskeegfor";
		String[] result = longestPalindrome(str);
		System.out.println("Longest Palindrome : "+result[0]);
		System.out.println("Length : "+result[1]);
	}

	private static String[] longestPalindrome(String str) {

		if (str == null || str.length() == 0) {
			return new String[] { "", "0" };
		}

		int startIndex = 0;
		int maxLength = 1;

		for (int index = 0; index < str.length(); index++) {

			int oddLength = expandAroundCenter(str, index, index);

			int evenLength = expandAroundCenter(str, index, index + 1);

			int largestLength = Math.max(oddLength, evenLength);

			if (largestLength > maxLength) {
				maxLength = largestLength;
				startIndex = index - (largestLength - 1) / 2;
			}
		}

		String longestPalindrome = str.substring(startIndex, startIndex + maxLength);
		return new String[] { longestPalindrome, String.valueOf(maxLength) };
	}

	private static int expandAroundCenter(String str, int left, int right) {
		int L = left, R = right;
		while (L >= 0 && R < str.length() && str.charAt(L) == str.charAt(R)) {
			L--;
			R++;
		}
		return R - L - 1;
	}

}
