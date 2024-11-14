import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Q17_DictionaryWordCombination {
	/*
	 * "Given a dictionary (list of words) and a word, return an array of strings
	 * that can be formed from the given word. [Every letter in the input word can
	 * occur only once in the word to be returned].
	 * 
	 * Examples: String[] dict = {""ab"", ""abcd"", ""bcdaf"", ""bcad"", ""acb"",
	 * ""acab""}; String input = ""abcd""; // Return {""abcd"", ""bcad""}
	 * 
	 * String[] dict = {""ab"", ""abcd"", ""bcdaf"", ""bcad"", ""acaab"", ""acab""};
	 * String input = ""caab""; // Return {""acab""}"
	 */
	public static void main(String[] args) {
		String[] dict1 = { "ab", "abcd", "bcdaf", "bcad", "acb", "acab" };
		String input1 = "abcd";
		System.out.println("Words that can be formed: " + findCombination(dict1, input1));
	}

	private static List<String> findCombination(String[] dictionary, String input) {
		List<String> result = new ArrayList<String>();
		// Get frequencyMap
		HashMap<Character, Integer> frequencyMap = getFrequencyMap(input);

		for (String word : dictionary) {
			if (canFormWord(word, frequencyMap)) {
				result.add(word);
			}
		}
		return result;
	}

	private static boolean canFormWord(String word, HashMap<Character, Integer> frequencyMap) {
		HashMap<Character, Integer> wordFrequencyMap = getFrequencyMap(word);
		if (wordFrequencyMap.equals(frequencyMap)) {
			return true;
		}

		return false;
	}

	private static HashMap<Character, Integer> getFrequencyMap(String input) {
		HashMap<Character, Integer> frequencyMap = new HashMap<Character, Integer>();

		for (char c : input.toCharArray()) {
			frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
		}
		return frequencyMap;
	}
}
