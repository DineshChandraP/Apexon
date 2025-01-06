package LambdaExpressions.VariableCapture;

@FunctionalInterface
public interface MyInterface {

	void myFunction();

}

class Test {
	static int data = 100;

	public static void main(String[] args) {

		Test t = new Test();

		MyInterface myInt = () -> {
			System.out.println("Value : " + data);
			t.data += 200;
			//data = 999;
			System.out.println("Data after modification : " + t.data);
		};

		myInt.myFunction();
		t.data += 300;
		System.out.println("Final Data: " + t.data);
	}

}
