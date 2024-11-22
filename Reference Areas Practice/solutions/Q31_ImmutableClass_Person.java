package solutions;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class Q31_ImmutableClass_Person {

	// Step 1: Final class fields
	private final String name;
	private final int age;
	private final List<String> hobbies;

	// Step 2: Constructor to initialize fields
	public Q31_ImmutableClass_Person(String name, int age, List<String> hobbies) {
        if (name == null || hobbies == null) {
            throw new IllegalArgumentException("Name and hobbies cannot be null");
        }
        
        this.name = name;
        this.age = age;

        // Step 3: Defensive copy to protect the original list
        this.hobbies = Collections.unmodifiableList(hobbies);  // makes hobbies list unmodifiable
    }

	// Step 4: Provide getter methods (no setters)

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public List<String> getHobbies() {
		return hobbies;
	}

	// Step 5: Override equals(), hashCode(), and toString()

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		Q31_ImmutableClass_Person person = (Q31_ImmutableClass_Person) obj;
		return age == person.age && name.equals(person.name) && hobbies.equals(person.hobbies);
	}

	@Override
	public int hashCode() {
		int result = name.hashCode();
		result = 31 * result + age;
		result = 31 * result + hobbies.hashCode();
		return result;
	}

	@Override
	public String toString() {
		return "Person{name='" + name + "', age=" + age + ", hobbies=" + hobbies + "}";
	}

	

	    public static void main(String[] args) {
	        List<String> hobbies = Arrays.asList("Reading", "Traveling", "Coding");

	        // Create an immutable Person object
	        Q31_ImmutableClass_Person person = new Q31_ImmutableClass_Person("John Doe", 30, hobbies);

	        // Accessing fields via getters
	        System.out.println(person.getName()); // Output: John Doe
	        System.out.println(person.getAge()); // Output: 30
	        System.out.println(person.getHobbies()); // Output: [Reading, Traveling, Coding]

	        // The hobbies list is unmodifiable, so the following will throw an UnsupportedOperationException
	        try {
	            person.getHobbies().add("Painting");
	        } catch (UnsupportedOperationException e) {
	            System.out.println("Cannot modify the hobbies list");
	        }
	    }
	}

