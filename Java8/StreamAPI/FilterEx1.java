package StreamAPI;

import java.util.stream.Stream;

public class FilterEx1 {
	public static void main(String[] args) {

		Stream<String> strings = Stream.of("Dinesh", "Chandra", "Peddakotla");
		strings.filter(s -> s.startsWith("P")).forEach(System.out::println);
	}
}
