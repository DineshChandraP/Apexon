//package com.GS;

import java.util.ArrayList;

public class Q7StringStartsWithPrefix {

	/*
	 * "Prefix Search Given a document and a prefix, return all the words starting
	 * with the prefix.
	 * 
	 * Example: Say the document is a string of words, String[] arr = {""apple"",
	 * ""applet"", ""bread"", ""aper""}; String prefix = ""app"";
	 * 
	 * // Return apple, applet"
	 */

	public static void main(String[] args) {
		String[] arr = { "apple", "applet", "bread", "aper" };
		String prefix = "app";

		ArrayList<String> result = checkStringsStartingWithPrefix(arr, prefix);
		System.out.println(result);
	}

	private static ArrayList<String> checkStringsStartingWithPrefix(String[] arr, String prefix) {

		ArrayList<String> result = new ArrayList<String>();

		for (String s : arr) {
			if (s.startsWith(prefix)) {
				result.add(s);
			}
		}
		return result;

	}
}
