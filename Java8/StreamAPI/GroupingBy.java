package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class GroupingBy {

	public static void main(String[] args) {

		List<Person> people = Arrays.asList(new Person("Alice", 25), new Person("Bob", 30), new Person("Charlie", 25),
				new Person("David", 30), new Person("Eve", 35));
		
		Map<Integer, List<Person>> groupedByAge=people.stream().collect(Collectors.groupingBy(Person::getAge));
		/*
		 * groupedByAge.forEach(age,persons)->{ System.out.println(age);
		 * persons.forEach(System.out::println); };
		 */
		System.out.println(groupedByAge);
		
		Map<Character,List<Person>> groupedByFirstLetter= people.stream().collect(Collectors.groupingBy(p->p.getName().charAt(0)));
		System.out.println(groupedByFirstLetter);
		
		
		Map<Integer,Long> ageCount=people.stream().collect(Collectors.groupingBy(Person::getAge, Collectors.counting()));
		System.out.println(ageCount);
		
		Map<Integer,List<String>> groupedByAgeNames=people.stream().collect(Collectors.groupingBy(Person::getAge,Collectors.mapping(Person::getName, Collectors.toList())));
		System.out.println(groupedByAgeNames);
		
		Map<String,List<Person>> groupedByAgeAndFirstLetter=people.stream().collect(Collectors.groupingBy(p->p.getAge()+"-"+p.getName().charAt(0)));
		System.out.println(groupedByAgeAndFirstLetter);
	}
}
