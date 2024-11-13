import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Q8FirstNonRepeatingCharacter {
	/*
	 * "Given a string, return the first non-repeating character.
	 * 
	 * Examples: String str1 = ""12345"" //Return 1
	 * 
	 * String str2 = ""abbacd"" //Return c"
	 * 
	 */
	public static void main(String[] args) {

		// Logic 1
		String str = "abbcd";
		printFirstNonReptingCharacter(str);

		// Logic 2
		Optional<Map.Entry<Character, Long>> result = findFirstNonRepeatingCharacter(str);
		if (result.isPresent()) {
			System.out.println("the result is " + result.get().getKey());
		} else {
			System.out.println("all characters are repeated");
		}
	}

	private static void printFirstNonReptingCharacter(String str) {
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		char[] chars = str.toCharArray();

		for (char c : chars) {
			if (map.containsKey(c)) {
				map.put(c, map.getOrDefault(c, 0) + 1);
			} else {
				map.put(c, 1);
			}
		}

		Iterator<Map.Entry<Character, Integer>> itr = map.entrySet().iterator();
		while (itr.hasNext()) {
			Map.Entry<Character, Integer> entry = itr.next();
			if (map.get(entry.getKey()) == 1) {
				System.out.println("First Non repeating value in the given string is : " + entry.getKey());
				break;
			}
		}

	}

	private static Optional<Map.Entry<Character, Long>> findFirstNonRepeatingCharacter(String str) {
		if (str == null || str.isEmpty()) {
			return null;
		}

		Optional<Map.Entry<Character, Long>> result = str.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
				.entrySet().stream().filter(entry -> entry.getValue() == 1).findFirst();

		return result;
	}
}
