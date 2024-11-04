package com.GS;

import java.util.HashMap;

public class Q1CharOccurences {

	public static void main(String[] args) {
		/*
		 * Problem: 4 Convert a string as given in the format below: Example: aabbbycyyc
		 * into a2b3y3c2 aaaa into a4 a into a1
		 */
		String input = "aabbbycyyc";

		calculateCharOccurances(input);

	}

	private static void calculateCharOccurances(String input) {
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();

		for (char c : input.toCharArray()) {
			if (map.containsKey(c)) {
				map.put(c, map.getOrDefault(c, 0) + 1);
			} else {
				map.put(c, 1);
			}
		}
		// System.out.println(map);
		map.forEach((key, value) -> System.out.print(key + "" + value));

	}

}
