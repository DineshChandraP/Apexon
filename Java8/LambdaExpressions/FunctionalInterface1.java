package LambdaExpressions;

@FunctionalInterface
public interface FunctionalInterface1 {

	void abstractFun(int x);
	
	default void normalFun() {
		System.out.println("Normal Fucntion");
	}
}

class Test {

	public static void main(String[] args) {

		FunctionalInterface1 fobj=  x -> System.out.println(2*x);
		
		fobj.abstractFun(5);
	}
}