package FunctionalInterfaces.Consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerPractice {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Integer> lista = new ArrayList<Integer>();
		lista.add(2);
		lista.add(1);
		lista.add(3);

		List<Integer> listb = new ArrayList<Integer>();
		listb.add(2);
		listb.add(1);
		listb.add(2);

		BiConsumer<List<Integer>, List<Integer>> equals = (list1, list2) -> {

			if (list1.size() != list2.size()) {
				System.out.println("False");
			} else {
				for (int i = 0; i < list1.size(); i++) {
					if (list1.get(i) != list2.get(i)) {
						System.out.println("False");
						return;
					}
				}
				System.out.println("True");
			}
		};

		BiConsumer<List<Integer>, List<Integer>> display = (list1, list2) -> {
			System.out.println("List 1");
			list1.stream().forEach(e -> System.out.print(e + " "));
			System.out.println("\nList 2");
			list2.stream().forEach(e -> System.out.print(e + " "));
		};

		equals.andThen(display).accept(lista, listb);
	}
}
