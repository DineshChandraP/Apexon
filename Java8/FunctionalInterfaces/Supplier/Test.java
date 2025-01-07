package FunctionalInterfaces.Supplier;

import java.util.function.Supplier;

public class Test {
	public static void main(String[] args) {

		Supplier<Double> randomValue = () -> Math.random();
		System.out.println(randomValue.get());
	}
}
