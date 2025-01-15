package StreamAPI;

import java.util.List;

public class FilterSortedDistinctExample {
	public static void main(String[] args) {
		List<Integer> intList = List.of(15, 20, 48, 63, 63, 49, 27, 56, 32, 9);

		printEvenNumber(intList);
		printSortedList(intList);
		findDistinctElements(intList);
	}

	private static void findDistinctElements(List<Integer> intList) {
		System.out.println("Printing distinct Numbers");
		intList.stream().distinct().sorted().forEach(System.out::println);
	}

	private static void printSortedList(List<Integer> intList) {
		System.out.println("Printing Sorted Numbers");
		intList.stream().sorted().forEach(e -> System.out.println(e));

	}

	private static void printEvenNumber(List<Integer> intList) {
		System.out.println("Printing Even Numbers");
		intList.stream().filter(n -> n % 2 == 0).forEach(System.out::println);
	}
}
