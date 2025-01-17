package StreamAPI;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Flattening {
	public static void main(String[] args) {

		Map<Integer, List<String>> map = new HashMap<>();

		map.put(1, Arrays.asList("1", "2", "3"));
		map.put(2, Arrays.asList("4", "5", "6"));

		// Flattening Map
		map.values().stream().flatMap(e -> e.stream().collect(Collectors.toList()).stream()).forEach(System.out::print);

		String[] a = { "A", "B", "C" };
		String[] b = { "i", "J", "K" };

		// Flattening Array
		String[] result = Stream.of(a, b).flatMap(Arrays::stream).toArray(String[]::new);
		System.out.println("\n" + Arrays.toString(result));
	}
}
