package CatchIT;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatingCharacter {
	public static void main(String[] args) {
		String input = "aswiss";
		char result = findFirstNonRepeatingV2(input);
		if (result != '\0') {
			System.out.println("First non-repeating character: " + result);
		} else {
			System.out.println("No non-repeating character found.");
		}
	}

	public static char findFirstNonRepeating(String s) {
		// Step 1: Create a HashMap to store the frequency of each character
		Map<Character, Integer> frequencyMap = new HashMap<>();

		// Step 2: Populate the frequency map
		for (char ch : s.toCharArray()) {
			frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
		}

		// Step 3: Find the first non-repeating character
		for (char ch : s.toCharArray()) {
			if (frequencyMap.get(ch) == 1) {
				return ch; // Return the first non-repeating character
			}
		}

		// Return a special value if no non-repeating character is found
		return '\0'; // Or return a specific value like ' ' or -1 depending on your requirements
	}
	
	public static char findFirstNonRepeatingV2(String s) {
        // Step 1: Use Streams to create a frequency map of characters
        Map<Character, Long> frequencyMap = s.chars()
            .mapToObj(c -> (char) c)
            .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));

        // Step 2: Find the first character with a count of 1
        return frequencyMap.entrySet().stream()
            .filter(entry -> entry.getValue() == 1)
            .map(Map.Entry::getKey)
            .findFirst()
            .orElse('\0'); // Return '\0' if no non-repeating character is found
    }
}
