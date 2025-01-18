package StreamAPI;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindLastElement {
	public static void main(String[] args) {
		Stream<String> stream = Stream.of("Geek_First", "Geek_2", "Geek_3", "Geek_4", "Geek_Last");
		System.out.println(stream.reduce((first, second) -> second).orElse(null));

		Stream<String> stream1 = Stream.of("Geek_First", "Geek_2", "Geek_3", "Geek_4", "Geek_Last");
		System.out.println(stream1.skip(5-1).findFirst().orElse(null));
		
		 List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7);        
	       System.out.println(numbers.stream().sorted(Collections.reverseOrder()).findFirst().orElse(null));
	}
}
