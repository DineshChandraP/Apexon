import java.util.HashMap;
import java.util.Stack;

public class Test_Q3_ValidParenthesis {

	public static void main(String[] args) {

		String str = "(a + (b -c) +z) - z)";//extra closing
		String str1 = "(a + (b -c) +z - z)";//valid
		String str2 = "((a + (b -c) +z - z)";//extra opening
		String str3 = "(a + {b -c)  +z}";//bracket types do not match/ brackets overlapping
		String str4 = "y + (a + (b -c) +z - z) ";//valid

		if (checkValidParenthesis(str4)) {
			System.out.println("Given expression is valid");
		} else {
			System.out.println("Given expression is not valid");
		}
	}

	private static boolean checkValidParenthesis(String str) {
		// To push the opening chars
		Stack<Character> stack = new Stack<Character>();
		// Pairs
		HashMap<Character, Character> map = new HashMap<Character, Character>();
		map.put('}', '{');
		map.put(')', '(');
		map.put(']', '[');

		for (char c : str.toCharArray()) {
			// If character is opening ([{, push it to stack
			if (map.containsValue(c)) {
				stack.push(c);
			}
			// If character is closing )]}
			if (map.containsKey(c)) {
				if (!stack.isEmpty()) {
					// check if the closing char matches with the opening char
					if (stack.peek() == map.get(c)) {
						stack.pop();
					} else {
						return false;
					}
				} else {
					// Closing character found, but Stack is empty-opening char is missing
					return false;
				}
			}
		}
		// If stack is empty, return true, else false
		if (!stack.isEmpty())
			return false;
		// No conflicts, valid parenthesis
		return true;
		// Time Complexity: O(n)- number of chars in String.
	}
}