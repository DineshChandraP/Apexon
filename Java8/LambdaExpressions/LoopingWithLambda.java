package LambdaExpressions;

public class LoopingWithLambda {

	public static void main(String[] args) {
		Func f = n -> {

			int result = 1;
			for (int i = 1; i <= n; i++)
				result = i * result;
			return result;
		};

		System.out.println(f.fact(5));
	}
}

@FunctionalInterface
interface Func {
	int fact(int n);
}