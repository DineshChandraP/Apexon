
public class Q20_LongestSubstringSameCharacter {
	/*
	 * "Given a string, return the starting index & length of the longest substring
	 * containing the same character.
	 * 
	 * Example: String[] str = ""aabbbbCCddd""; // Return 2 (index) and substring
	 * ""bbbb"""
	 */

	public static void main(String[] args) {
		String str = "aabbbbCCddd";
		
	int[]	result= longestSubstringSameCharacter(str);
		System.out.println("Start Index: " + result[0]);
		System.out.println("Length: " + result[1]);
		System.out.println("Substring: " + str.substring(result[0], result[0] + result[1]));
	}

	private static int[] longestSubstringSameCharacter(String str) {

		int maxStartIndex = 0;
		int maxLength = 1;

		int startIndex = 0;
		int length = 1;
		
		//check if any character is repeating
		for (int i = 1; i < str.length(); i++) {
			if (str.charAt(i) == str.charAt(i - 1)) {
				length++;
			} else {
				if (length > maxLength) {
					maxLength = length;
					maxStartIndex = startIndex;
				}
				startIndex = i;
				length = 1;
			}
		}
		return new int[] { maxStartIndex, maxLength };
	}
}
