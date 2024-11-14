//package com.GS;

public class Q02_Dictionary {
	/*
	 * "Given a dictionary (list of words) and a substring, you have to return the
	 * length of the longest word in the dictinary containing the substring.
	 * 
	 * Example: String[] dict = {""CODGE"", ""ODG"", ""LODGES"", ""SODG"",
	 * ""dodge"", ""mODJ"", ""LODGESSSS""} String toSearch = ""ODG"";
	 * 
	 * //Returns 9 (LODGESSSS)"
	 */
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
