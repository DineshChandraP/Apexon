package StreamAPI;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ImmutableCollection {
	public static void main(String[] args) {

		// Before Java 10- use Google Guava Lib or use CollectingAndThen

		var unmodifiableList = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
				.collect(Collectors.collectingAndThen(Collectors.toList(), Collections::unmodifiableList));
		System.out.println(unmodifiableList);
		// unmodifiableList.add(11);

		// After Java 10
		// toUnmodifiableList
		Stream<Integer> numbers = Stream.iterate(1, n -> n + 1).limit(50);
		List<Integer> numbersList = numbers.collect(Collectors.toUnmodifiableList());
		System.out.println(numbersList);
		// numbersList.add(51);

		// toUnmodifiableSet
		Set<Double> numberSet = Stream.generate(Math::random).limit(50).collect(Collectors.toUnmodifiableSet());
		System.out.println(numberSet);
		// numberSet.add(100.0);

		// toUnmodifiableMap
		List<Books> libInventory = new ArrayList<Books>();

		// Adding elements to the above object created
		// Custom input entries
		libInventory.add(new Books(1, "Pride and Prejudice"));
		libInventory.add(new Books(2, "The Sign of Four"));
		libInventory.add(new Books(3, "Sense and Sensibility"));
		libInventory.add(new Books(4, "Mansfield Park"));
		libInventory.add(new Books(5, "The Materese Circle"));
		libInventory.add(new Books(6, "The Hound of Baskerville"));
		libInventory.add(new Books(7, "Goodnight Moon"));
		libInventory.add(new Books(8, "How many sleeps till my Birthday"));
		libInventory.add(new Books(9, "The Bourne Identity"));
		libInventory.add(new Books(10, "Murder She Wrote"));
		libInventory.add(new Books(11, "The adventures of Hercule Poirot"));
		libInventory.add(new Books(12, "The song of Ice and Fire"));

		Map<Integer, String> unmodifiableMap = libInventory.stream()
				.collect(Collectors.toUnmodifiableMap(Books::getId, Books::getName));
		System.out.println(unmodifiableMap);
		//unmodifiableMap.put(13, "Revolution2020");
	}

}
