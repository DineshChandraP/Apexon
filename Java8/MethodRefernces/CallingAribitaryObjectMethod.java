package MethodRefernces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * // If a lambda expression just call an instance method of a  ObjectType 
(obj, args) -> obj.instanceMethod(args) 

/ Shorthand if a lambda expression just call an instance method of a ObjectType 
ObjectType::instanceMethod
 */
public class CallingAribitaryObjectMethod {
	public static void main(String[] args) {
		List<String> personList = new ArrayList<>();
		personList.add("vicky");
		personList.add("poonam");
		personList.add("sachin");

		Collections.sort(personList, String::compareToIgnoreCase);
		personList.forEach(System.out::println);
	}
}
