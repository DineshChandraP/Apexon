package StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class BasicExamples {
	public static void main(String[] args) {

		ArrayList<String> names = new ArrayList<String>();
		names.add("Dean");
		names.add("castee");
		names.add("robert");

		Stream<String> streamOfNames = names.stream();
		System.out.println(streamOfNames);

		/*-------------------------------------  */
		var stream = IntStream.range(1, 100);
		var count = stream.filter(n -> n % 4 == 0).count();
		System.out.println(stream);
		System.out.println(count);

		/*-------------------------------------  */
		Integer[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
		Stream<Integer> streamOfNumbers = Arrays.stream(numbers);
		Stream<Integer> evenNumbers = streamOfNumbers.filter(n -> n % 2 == 0);
		System.out.println(evenNumbers);

		long counter = evenNumbers.count();
		System.out.println(counter);
		/*-------------------------------------  */
		
		ArrayList<Integer> list = new ArrayList<>();

		list.add(20);
		list.add(4);
		list.add(76);
		list.add(21);
		list.add(3);
		list.add(80);
		 
		var listStream= list.stream();
		var numberss= listStream.filter(n->n%2==0).filter(n->n>20);
		 numberss.forEach(System.out::println);
		

	}
}
