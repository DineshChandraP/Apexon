package solutions;
import java.util.Arrays;

public class Q22_ClimbingStairs {
	/*
	 * "A staircase with n steps is given. Starting from the base, return the number
	 * of ways of reaching the n’th stair. [The person can climb either 1 or 2
	 * stairs in one move]."
	 */

	public static void main(String[] args) {
		int n = 4;
		System.out.println(countWaysV1(n));
		System.out.println(countWaysV2(n));
		System.out.println(countWaysV3(n));
	}

	// recursive
	private static int countWaysV1(int n) {
		if (n == 0 || n == 1) {
			return 1;
		}

		return countWaysV1(n - 1) + countWaysV1(n - 2);
	}

	// Using Memoization Technique- Top Down DP approach
	private static int countWaysV2(int n) {
		// Memoization array to store results
		int[] memo = new int[n + 1];
		Arrays.fill(memo, -1);
		return countsWaysRecursive(n, memo);
	}

	private static int countsWaysRecursive(int n, int[] memo) {
		if (n == 0 || n == 1) {
			return 1;
		}

		if (memo[n] != -1) {
			return memo[n];
		}

		return memo[n] = countsWaysRecursive(n - 1, memo) + countsWaysRecursive(n - 2, memo);
	}

	// Using Tabulation - Bottom up DP approach
	private static int countWaysV3(int n) {
		int[] dp = new int[n + 1];

		// base cases
		dp[0] = 1;
		dp[1] = 1;

		for (int i = 2; i <= n; i++) {
			dp[i] = dp[i - 1] + dp[i - 2];
		}
		return dp[n];

	}
}
