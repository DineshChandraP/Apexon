package com.basic;

public class Fibonacci {
	public static void main(String[] args) {
		System.out.println(0);
		System.out.println(1);
		fibonacciUsingForLoop(1, 0);
		fibonacciUsingRecursion(1, 0);
		System.out.println(calclateNthFibonacciNumber(19));
	}

	private static int calclateNthFibonacciNumber(int number) {

		if (number <= 1) {
			return number;
		} else {
			return calclateNthFibonacciNumber(number - 1) + calclateNthFibonacciNumber(number - 2);
		}
	}

	private static void fibonacciUsingRecursion(int prev1, int prev2) {
		int count = 2;
		if (count <= 19) {
			int newFibo = prev1 + prev2;
			System.out.println(newFibo);
			prev2 = prev1;
			prev1 = newFibo;
			count += 1;
			fibonacciUsingRecursion(prev1, prev2);
		} else {
			return;
		}
	}

	private static void fibonacciUsingForLoop(int prev1, int prev2) {

		System.out.println(prev2);
		System.out.println(prev1);

		for (int fibo = 0; fibo < 18; fibo++) {
			int newFibo = prev1 + prev2;
			System.out.println(newFibo);
			prev2 = prev1;
			prev1 = newFibo;
		}
	}
}
