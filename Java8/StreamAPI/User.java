package StreamAPI;

public class User { 
	  
    // Attributes of the user class 
    private int userId; 
    private String name; 
    private String city; 
  
    // Constructor 
    public User(int userId, String name, 
                String city) 
    { 
        this.userId = userId; 
        this.name = name; 
        this.city = city; 
    } 
  
    // Getters of the user class 
    public int getUserId() { return userId; } 
  
    public String getName() { return name; } 
  
    public String getCity() { return city; } 
  
    // Overriding the toString method 
    // to return the custom string 
    @Override
    public String toString() 
    { 
        return "User [userId = "
            + userId + ", name = "
            + name + ", city = "
            + city + "]"; 
    } 
} 
