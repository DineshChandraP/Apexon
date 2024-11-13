import java.util.HashMap;

public class Q9MinimumDistanceBetweenWords {

	/*
	 * "Given a sentence/phrase and two words, return the minimum distance between
	 * the words.
	 * 
	 * Example: String str = “the quick the brown quick brown the frog” String word1
	 * = “quick” String word2 = ""frog""
	 * 
	 * Return 2"
	 */
	public static void main(String[] args) {
		String str = "the quick the brown quick brown the frog";
		String word1 = "quick";
		String word2 = "frog";

		printMinimumDistanceBetweenTwoWords(str, word1, word2);

	}

	private static void printMinimumDistanceBetweenTwoWords(String str, String word1, String word2) {

		HashMap<String, Integer> map = new HashMap<String, Integer>();
		int minimumDistance = Integer.MAX_VALUE;
		String[] words = str.split(" ");

		for (int index = 0; index < words.length; index++) {
			if (words[index].equals(word1) || words[index].equals(word2)) {
				map.put(words[index], index);
			}

			if (map.containsKey(word1) && map.containsKey(word2)) {

				int result = Math.abs(map.get(word2) - map.get(word1)) - 1;
				if (result < minimumDistance) {
					minimumDistance = result;
				}
			}
		}
		if (minimumDistance != Integer.MAX_VALUE) {
			System.out.println("The minimum distance between given words is : " + minimumDistance);
		} else {
			System.out.println("Invalid");
		}
	}

}
