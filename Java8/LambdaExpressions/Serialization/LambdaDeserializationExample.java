package LambdaExpressions.Serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class LambdaDeserializationExample {

	public static void main(String[] args) {
		// Deserialize the lambda expression from the file
		try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("greeting.ser"))) {
			SerializableGreeting greeting = (SerializableGreeting) in.readObject();
			// Use the deserialized lambda expression
			System.out.println(greeting.greet("Alice"));
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
