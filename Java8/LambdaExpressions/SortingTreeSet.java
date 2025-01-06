package LambdaExpressions;

import java.util.TreeSet;

public class SortingTreeSet {

	public static void main(String[] args) {

		TreeSet<Integer> tset = new TreeSet<Integer>((o1, o2) -> (o1 > o2) ? -1 : (o1 < o2) ? 1 : 0);
		// TreeSet<Integer> tset = new TreeSet<Integer>();
		tset.add(850);
		tset.add(235);
		tset.add(1080);
		tset.add(15);
		tset.add(5);

		System.out.println(tset);
	}
}
