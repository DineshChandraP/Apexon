//package com.GS;
package solutions;

import java.util.Iterator;

public class Q04_Coordinates {
	/*
	 * "Given the string (containing directions e.g., U, R, D, L) and initial
	 * coordinates (0,0), return the final coordinates after traversing the string.
	 * 
	 * Examples: Given (0,0) and String - ""UUU"" Answer : (0,3)
	 * 
	 * Given (0,0) and String - ""URRDDL"" Answer : (1,-1)
	 * 
	 * Additional testcase : String - ""DOWN UP 2xRIGHT DOWN 3xLEFT"" Answer :
	 * (-1,-1)"
	 */

	public static void main(String[] args) {
		String directions = "DOWN UP 2xRIGHT DOWN 3xLEFT";
		String result = null;
		if (directions.toLowerCase().contains("x")) {
			result = calculateCoordinatesWithWords(directions);
		} else {
			result = calculateCoordinatesWithChars(directions);
		}
		System.out.println(result);
	}

	private static String calculateCoordinatesWithWords(String directions) {
		int x = 0, y = 0;
		String value = null;
		int numberOfOccrences = 1;
		String[] direction = directions.toLowerCase().split(" ");
		for (String s : direction) {
			if (s.contains("x")) {
				String[] parts = s.split("x");
				numberOfOccrences = Integer.parseInt(parts[0]);
				value = parts[1];
			} else {
				value = s;
				numberOfOccrences = 1;
			}

			switch (value) {
			case "up":
				y += numberOfOccrences;
				continue;
			case "down":
				y -= numberOfOccrences;
				continue;
			case "left":
				x -= numberOfOccrences;
				continue;
			case "right":
				x += numberOfOccrences;
				continue;
			}

		}

		return "(" + x + "," + y + ")";

	}

	private static String calculateCoordinatesWithChars(String directions) {
		int x = 0, y = 0;
		char[] direction = directions.toLowerCase().toCharArray();
		for (char c : direction) {
			switch (c) {
			case 'u':
				y++;
				continue;
			case 'd':
				y--;
				continue;
			case 'l':
				x--;
				continue;
			case 'r':
				x++;
				continue;
			}
		}

		return "(" + x + "," + y + ")";
	}
}
