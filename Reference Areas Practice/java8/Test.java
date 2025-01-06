package java8;

import java.util.List;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {

		List<List<Integer>> nestedLists = List.of(List.of(1, 2, 3), List.of(4, 5), List.of(6));

		List<Integer> list = nestedLists.stream().flatMap(List::stream).collect(Collectors.toList());
		
		System.out.println(list);

	}
}
