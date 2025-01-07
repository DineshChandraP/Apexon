import FunctionalInterfaces.MathOperations;

public class Calculations {
	public static void main(String[] args) {

		MathOperations add = (int x, int y) -> x + y;
		MathOperations sub = (int x, int y) -> {
			return x - y;
		};

		System.out.println(add.operate(1, 2));
		System.out.println(sub.operate(1, 2));

		new Thread(() -> System.out.println("Thread Started")).start();
	}
}
