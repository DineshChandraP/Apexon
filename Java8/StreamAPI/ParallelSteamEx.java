package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ParallelSteamEx {
	public static void main(String[] args) {

		List<String> list = Arrays.asList("Hello ", "G", "E", "E", "K", "S!");

		// Sequntial streamp Single core
		Stream.of(list).forEach(System.out::print);
		System.out.println("\n--------------------");
		list.stream().forEach(System.out::print);
		
		
		//Parallel Stream- multi core
		System.out.println("\nParallel Stream");
		list.parallelStream().forEach(System.out::println);
		list.parallelStream().forEachOrdered(System.out::println);
	}
}
