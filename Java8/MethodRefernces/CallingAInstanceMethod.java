package MethodRefernces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*// If a lambda expression just call a default method of an object 
(args) -> obj.instanceMethod(args) 
 * 
 * // Shorthand if a lambda expression just call a default method of an object 
obj::instanceMethod 
 * 
 */
public class CallingAInstanceMethod {

	public static void main(String[] args) {

		List<Person> personList = new ArrayList<>();

		personList.add(new Person("vicky", 24));
		personList.add(new Person("poonam", 25));
		personList.add(new Person("sachin", 19));
		System.out.println("Sort by name :");

		ComparisonProvider cp = new ComparisonProvider();
		Collections.sort(personList, cp::compareByAge);
		personList.stream().map(p -> p.getName()).forEach(System.out::println);
		System.out.println("Sort by age :");

		Collections.sort(personList, cp::compareByAge);
		personList.stream().map(p -> p.getName()).forEach(System.out::println);
	}
}
