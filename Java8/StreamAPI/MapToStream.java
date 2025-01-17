package StreamAPI;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class MapToStream {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "Geeks");
		map.put(2, "forGeeks");
		map.put(3, "A computer Portal");
		System.out.println("Map: " + map);

		// using entryset
		// System.out.println(Arrays.toString(map.entrySet().stream().toArray()));
		Stream<Map.Entry<Integer, String>> stream = map.entrySet().stream();
		System.out.println(Arrays.toString(stream.toArray()));

		// using keySet
		Stream<Integer> stream1 = map.keySet().stream();
		System.out.println(Arrays.toString(stream1.toArray()));
		
		// using values
		Stream<String> stream3 = map.values().stream();
		System.out.println(Arrays.toString(stream3.toArray()));
	}
}
