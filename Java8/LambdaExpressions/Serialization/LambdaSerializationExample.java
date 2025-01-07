package LambdaExpressions.Serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class LambdaSerializationExample {
	public static void main(String[] args) {
		// Create a lambda expression that implements Serializable
		SerializableGreeting greeting = (name) -> "Hello, " + name + "!";

		// Serialize the lambda expression to a file
		try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("greeting.ser"))) {
			out.writeObject(greeting);
			System.out.println("Lambda expression serialized.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

@FunctionalInterface
interface SerializableGreeting extends Serializable {
	String greet(String name);
}
