import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadCredentials {
	  public static void main(String[] args) {
	        try (BufferedReader reader = new BufferedReader(new FileReader("credentials.txt"))) {
	            String username = reader.readLine();
	            String password = reader.readLine();
	            System.out.println("Username: " + username);
	            System.out.println("Password: " + password);
	        } catch (IOException e) {
	            e.printStackTrace(); 
	        }
	    }
}
