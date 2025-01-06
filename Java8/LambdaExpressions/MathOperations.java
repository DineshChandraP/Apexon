package LambdaExpressions;

@FunctionalInterface
public interface MathOperations {

	int operate(int a, int b);
}

class Test1 {
	public static void main(String[] args) {

		MathOperations add = (int x, int y) -> x + y;
		MathOperations sub = (int x, int y) -> x - y;

		System.out.println("Addition " + add.operate(1, 2));
		System.out.println("Substraction " + sub.operate(1, 2));

	}

}