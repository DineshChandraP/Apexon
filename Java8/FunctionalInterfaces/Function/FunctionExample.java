package FunctionalInterfaces.Function;

import java.util.function.Function;

/*The Function interface consists of the following 4 methods as listed which are later discussed as follows:

apply()
andThen()
compose()
identity()*/

public class FunctionExample {
	public static void main(String[] args) {
		Function<Integer, Double> half = e -> e / 2.0;

		System.out.println(half.apply(5));
		// System.out.println(half.andThen(e -> e*3).apply(5));
		half = half.andThen(e -> e * 3);
		half= half.compose(e-> e*10);
		System.out.println(half.apply(10));

		try {
			System.out.println("Try block");
			System.out.println(half.apply(10));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		Function<Integer,Integer> identity= Function.identity();
		System.out.println(identity.apply(10));
		
	}
}
