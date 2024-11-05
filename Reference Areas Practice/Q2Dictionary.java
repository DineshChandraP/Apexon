//package com.GS;

public class Q2Dictionary {

	public static void main(String[] args) {
		String[] dictionary = { "CODGE", "LODGESSSS", "LODGES", "123", "dodge", "mODJ", "LODGESSS" };
		String toSearch = "ODG";

		String result = searchAndReturnMaxLengthWord(dictionary, toSearch);
		System.out.println(result);
	}

	private static String searchAndReturnMaxLengthWord(String[] dictionary, String toSearch) {
		int maxLength = 0;
		int maxElementIndex = 0;
		for (int i = 0; i < dictionary.length; i++) {
			if (dictionary[i].contains(toSearch) && dictionary[i].length() > maxLength) {
				maxLength = dictionary[i].length();
				maxElementIndex = i;
			}
		}
		return dictionary[maxElementIndex];
	}
}
