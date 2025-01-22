package CatchIT.solid;

public class DependencyInversionPrinciple {
	
	
	class UserService {
	    private Database database;

	    public UserService() {
	        database = new Database(); // Tight coupling to Database class
	    }

	    public void saveUser(User user) {
	        database.save(user);
	    }
	}

	class Database {
	    public void save(User user) {
	        // Save user to the database
	    }
	}
	
	
	interface DataSource {
	    void save(User user);
	}

	class Database implements DataSource {
	    public void save(User user) {
	        // Save user to database
	    }
	}

	class FileDataSource implements DataSource {
	    public void save(User user) {
	        // Save user to a file
	    }
	}

	class UserService {
	    private DataSource dataSource;

	    public UserService(DataSource dataSource) {
	        this.dataSource = dataSource;
	    }

	    public void saveUser(User user) {
	        dataSource.save(user);
	    }
	}
	class UserService {
	    private Database database;

	    public UserService() {
	        database = new Database(); // Directly depends on Database
	    }

	    public void saveUser(User user) {
	        database.save(user);
	    }
	}

	class Database {
	    public void save(User user) {
	        // Save user to database
	    }
	}
	
	interface DataSource {
	    void save(User user);
	}

	class Database implements DataSource {
	    public void save(User user) {
	        // Save user to database
	    }
	}

	class UserService {
	    private DataSource dataSource;

	    public UserService(DataSource dataSource) {
	        this.dataSource = dataSource;
	    }

	    public void saveUser(User user) {
	        dataSource.save(user);
	    }
	}
}
