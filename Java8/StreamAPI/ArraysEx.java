package StreamAPI;

import java.util.Arrays;
import java.util.function.IntPredicate;

public class ArraysEx {

	public static void main(String[] args) {

		int arr_sample1[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };

		// asDoubleStream()
		// It converts the original array to double
		System.out.println("Example of asDoubleStream(): ");
		Arrays.stream(arr_sample1).asDoubleStream().forEach(e -> System.out.print(e + " "));

		// asLongStream()
		// It converts the original array to Long
		System.out.println("\nExample of asLongStream");
		Arrays.stream(arr_sample1).asLongStream().forEach(System.out::print);

		// anyMatch()
		// This method find whether the given predicate
		// is in the array or not
		System.out.println("\nExample of anyMatch");
		// Test whether any of the element in array is
		// divisible by 11 or not
		IntPredicate predicate = e -> e % 11 == 0;
		System.out.println(Arrays.stream(arr_sample1).anyMatch(predicate));

		// You can directly write the lambda expression
		// which computes to IntPredicate
		// Uncomment to test
		// System.out.println(Arrays.stream(arr)
		// .anyMatch(e -> e % 11 == 0));

		int arr_sample3[] = { 2, 4, 6, 8, 10 };
		int arr_sample4[] = { 1, 3, 5, 7, 11 };
		int arr_sample5[] = { 2, 5 };

		// allMatch()
		// This method finds whether the given predicate
		// matches the entire array or not
		System.out.println("Example of allMatch :");

		// Returns true as all the elements of arr_sample3
		// is even
		System.out.println(Arrays.stream(arr_sample3).allMatch(e -> e % 2 == 0));

		// Returns false as all the elements of arr_sammple4
		// is odd
		System.out.println(Arrays.stream(arr_sample4).allMatch(e -> e % 2 == 0));

		// noneMatch()
		System.out.println("Example of noneMatch");
		System.out.println(Arrays.stream(arr_sample5).noneMatch(e -> e % 3 == 0));

		// average()
		// This method returns a average of an array
		System.out.println("Example of average() : ");
		System.out.println((Arrays.stream(arr_sample1).average()));

		// findAny()
		// It can return any value from the stream
		// Most of the time it returns the first value
		// but it is not assured it can return any value
		System.out.println("Example of findAny() : ");
		System.out.println(Arrays.stream(arr_sample1).findAny());

		// findFirst()
		// It returns the first element of the stream
		System.out.println("Example of findFirst() :");
		System.out.println(Arrays.stream(arr_sample1).findFirst());

		// max()
		// It returns the max element in an array
		System.out.println("Example of max() :");
		System.out.println(Arrays.stream(arr_sample1).max());

		// min()
		// It returns the min element in an array
		System.out.println("Example of min() :");
		System.out.println(Arrays.stream(arr_sample1).min());

		// reduce()
		// It reduces the array by certain operation
		// Here it performs addition of array elements
		System.out.println("Example of reduce() :");
		System.out.println(Arrays.stream(arr_sample1).reduce((x, y) -> x + y));

		System.out.println("These method convert Optional to primitive");

		// OptionalDouble can be converted to double by using getAsDouble()
		// if average doesn't contains any value it throws NoSuchElementException
		System.out.println("Example of average() : ");
		System.out.println((Arrays.stream(arr_sample1).average().getAsDouble()));

		// OptionalInt can be converted to int by using getAsInt()
		System.out.println("Example of findAny() : ");
		System.out.println(Arrays.stream(arr_sample1).findAny().getAsInt());

	}
}
