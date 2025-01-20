package StreamAPI;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindDuplicateElements {
	public static void main(String[] args) {
		Stream<Integer> stream = Stream.of(5, 13, 4, 21, 13, 27, 2, 59, 59, 34);
		System.out.println(findDuplicateInStream(stream));

		Stream<Integer> stream1 = Stream.of(5, 13, 4, 21, 13, 27, 2, 59, 59, 34);
		System.out.println(findDuplicateInStreamV2(stream1));

		List<Integer> list = Arrays.asList(5, 13, 4, 21, 13, 27, 2, 59, 59, 34);
		System.out.println(findDuplicateInStreamV3(list));

	}

	private static Set<Integer> findDuplicateInStreamV3(List<Integer> list) {
		return list.stream().filter(e -> Collections.frequency(list, e) > 1).collect(Collectors.toSet());
	}

	private static Set<Integer> findDuplicateInStreamV2(Stream<Integer> stream) {
		return stream.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
				.filter(m -> m.getValue() > 1).map(Map.Entry::getKey).collect(Collectors.toSet());
	}

	private static Set<Integer> findDuplicateInStream(Stream<Integer> stream) {
		HashSet<Integer> set = new HashSet<Integer>();

		return stream.filter(e -> !set.add(e)).collect(Collectors.toSet());
	}
}
