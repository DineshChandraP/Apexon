package MethodRefernces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


/*
 * // If a lambda expression just call a static method of a class 
(args) -> Class.staticMethod(args)  

// Shorthand if a lambda expression just call a static method of a class 
Class::staticMethod  
 */
public class CallingAStaticMethod {

	public static int compareByName(Person a, Person b) {
		return a.getName().compareTo(b.getName());
	}

	public static int compareByAge(Person a, Person b) {
		return a.getAge().compareTo(b.getAge());
	}

	public static void main(String[] args) {

		List<Person> personList = new ArrayList<>();

		personList.add(new Person("vicky", 24));
		personList.add(new Person("poonam", 25));
		personList.add(new Person("sachin", 19));

		/*
		 * Collections.sort(personList, new Comparator<Person>() {
		 * 
		 * @Override public int compare(Person p1, Person p2) { return
		 * CallingAStaticMethod.compareByName(p1, p2); } });
		 */
		
		//Collections.sort(personList, (p1, p2) -> CallingAStaticMethod.compareByName(p1, p2));
		Collections.sort(personList, CallingAStaticMethod::compareByName);

		System.out.println("Sorting by Name : ");

		personList.stream().map(p -> p.getName()).forEach(System.out::println);

		Collections.sort(personList, CallingAStaticMethod::compareByAge);
		System.out.println("Sorting by age : ");
		personList.stream().map(p -> p.getName()).forEach(System.out::println);

	}

}
