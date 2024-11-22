package solutions;

public class Q12_ChessBoardBishop {

	public static void main(String[] args) {
		int[] bishop = { 1, 1 };
		int[] immovableObject = { 3, 2 };

		canBishopReach(bishop, immovableObject);
	}

	private static void canBishopReach(int[] bishop, int[] immovableObject) {

		int x1 = bishop[0];
		int y1 = bishop[1];
		int x2 = immovableObject[0];
		int y2 = immovableObject[1];

		// Step 1 : Check if both Objects are on same diagonal
		if (Math.abs(x1 - x2) == Math.abs(y1 - y2)) {
			System.out.println("Bishop can reach Immovable Object in One Step");
		} else if ((x1 + y1) % 2 == (x2 + y2) % 2) {
			// Step 2: Check if 2 diagonals intersect in 2 steps
			System.out.println("Bishop can reach Immovable Object in Two Step");
		} else {
			System.out.println("They cannot reach each other");
		}

	}

}
