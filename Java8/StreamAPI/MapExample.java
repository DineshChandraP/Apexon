package StreamAPI;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class MapExample {
	public static void main(String[] args) {
		ArrayList<String> fruit = new ArrayList<>();
		fruit.add("Apple");
		fruit.add("mango");
		fruit.add("pineapple");
		fruit.add("kiwi");
		System.out.println("List of fruit-" + fruit);

		fruit.stream().map(f ->f.length()).collect(Collectors.toList()).forEach(System.out::println);
	}
}