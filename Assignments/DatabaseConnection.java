import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

	public static void main(String[] args) {
		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/apexon", "root",
					"root");
			System.out.println("Connection Successful!");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
