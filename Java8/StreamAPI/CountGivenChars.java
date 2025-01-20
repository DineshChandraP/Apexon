package StreamAPI;

import java.util.stream.Collectors;

public class CountGivenChars {
	public static void main(String[] args) {

		String str = "PeddakotlaDineshChandra";
		char c = 'a';
		System.out.println(count(str, c));
	}

	private static long count(String str, char ch) {
		return str.chars().filter(c -> c == ch).count();
	}
}
