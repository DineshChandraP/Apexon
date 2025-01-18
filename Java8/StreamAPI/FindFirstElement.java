package StreamAPI;

import java.util.stream.Stream;

public class FindFirstElement {
	public static void main(String[] args) {
		Stream<String> stream = Stream.of("Geek_First", "Geek_2", "Geek_3", "Geek_4", "Geek_Last");
		System.out.println(stream.reduce((first, second) -> first).orElse(null));

		Stream<String> stream1 = Stream.of("Geek_First", "Geek_2", "Geek_3", "Geek_4", "Geek_Last");
		System.out.println(stream1.findFirst().orElse(null));
	}
}
