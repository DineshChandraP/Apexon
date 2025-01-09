package MethodRefernces;

public class ComparisonProvider {
	public int compareByName(Person a, Person b) {
		return a.getName().compareTo(b.getName());
	}

	public int compareByAge(Person a, Person b) {
		return a.getAge().compareTo(b.getAge());
	}
}
