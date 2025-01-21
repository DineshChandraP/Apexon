import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertiesFile {
	public static void main(String[] args) {
		// Define the path to the properties file
		String propertiesFilePath = "config.properties";

		// Create a Properties object to hold the key-value pairs
		Properties properties = new Properties();

		// Load the properties file
		try (FileInputStream input = new FileInputStream(propertiesFilePath)) {
			properties.load(input); // Load the properties from the file

			// Fetch the username and password from the properties
			String username = properties.getProperty("username");
			String password = properties.getProperty("password");

			// Print the values (just for demonstration purposes)
			System.out.println("Username: " + username);
			System.out.println("Password: " + password);

		} catch (IOException e) {
			e.printStackTrace(); // Handle file loading or IO exceptions
		}
	}
}
