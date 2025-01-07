package FunctionalInterfaces.Predicate;

import java.util.Objects;
import java.util.function.Predicate;

public class PredicateInterfaceExample {

	// Predicate into a fucntion
	static void pred(int number, Predicate<Integer> predicate) {
		if (predicate.test(number)) {
			System.out.println("Number " + number);
		}
	}

	public static Predicate<String> hasLengthof10 = new Predicate<String>() {

		@Override
		public boolean test(String t) {
			// TODO Auto-generated method stub
			return t.length() > 10;
		}
	};

	public static void predicate_or() {
		Predicate<String> containsLetterA = p -> p.contains("A");
		String containsA = "And";
		boolean outcome1 = hasLengthof10.or(containsLetterA).test(containsA);
		System.out.println(outcome1);
	}

	public static void predicate_and() {
		Predicate<String> nonNullPredicate = Objects::nonNull;

		String nullString = null;

		boolean outcome = nonNullPredicate.and(hasLengthof10).test(nullString);
		System.out.println(outcome);

		String lengthGTThan10 = "Welcome to Apexon";
		boolean outcome2 = nonNullPredicate.and(hasLengthof10).test(lengthGTThan10);
		System.out.println(outcome2);

	}

	private static void predicate_negate() {
		String lengthGTThan10 = "Welcome to Apexon";
		boolean outcome = hasLengthof10.negate().test(lengthGTThan10);
		System.out.println(outcome);

	}

	public static void main(String[] args) {

		Predicate<Integer> lesserthan = i -> (i < 20);
		System.out.println(lesserthan.test(10));

		// Chaining
		Predicate<Integer> greaterThanTen = i -> i > 10;
		Predicate<Integer> lowerThanTwenty = i -> i < 20;
		boolean result = greaterThanTen.and(lowerThanTwenty).test(15);
		System.out.println(result);

		// Negate
		boolean result1 = greaterThanTen.and(lowerThanTwenty).negate().test(15);
		System.out.println(result1);

		// Predicate into a function
		pred(10, i -> i > 11);

		//
		predicate_or();
		predicate_and();
		predicate_negate();

	}

}
