package LambdaExpressions;

public class EvenOddNumber {

	public static void main(String[] args) {
		fi1 isEven = n -> n % 2 == 0;
		int n = 20;

		if (isEven.fun(n))
			System.out.println(n + " is Even");
		else
			System.out.println(n + " is odd");
	}

}

@FunctionalInterface
interface fi1 {
	boolean fun(int n);
}