package CatchIT;

import java.util.LinkedList;

public class EmployeeHashMap {
	private static final int INITIAL_CAPACITY = 16;
	private static final double LOAD_FACTOR = 0.75;
	private LinkedList<Entry>[] table;
	private int size = 0;

	public EmployeeHashMap() {
		table = new LinkedList[INITIAL_CAPACITY];
	}

	// Inner class to represent key-value pairs
	private static class Entry {
		Employee key;
		Employee value;

		Entry(Employee key, Employee value) {
			this.key = key;
			this.value = value;
		}
	}

	// Put an employee in the hash map
	public void put(Employee key, Employee value) {
		int index = hash(key);
		if (table[index] == null) {
			table[index] = new LinkedList<>();
		}

		// Check for existing key and replace if found
		for (Entry entry : table[index]) {
			if (entry.key.equals(key)) {
				entry.value = value;
				return;
			}
		}

		// Add new entry
		table[index].add(new Entry(key, value));
		size++;

		// Check if we need to resize
		if ((1.0 * size) / table.length >= LOAD_FACTOR) {
			resize();
		}
	}

	// Get an employee by key
	public Employee get(Employee key) {
		int index = hash(key);
		if (table[index] != null) {
			for (Entry entry : table[index]) {
				if (entry.key.equals(key)) {
					return entry.value;
				}
			}
		}
		return null; // Return null if employee not found
	}

	// Hash function to determine index
	private int hash(Employee key) {
		return Math.abs(key.hashCode()) % table.length;
	}

	// Resize the internal table when the load factor is exceeded
	private void resize() {
		LinkedList<Entry>[] oldTable = table;
		table = new LinkedList[table.length * 2];
		size = 0;

		// Rehash all entries into the new table
		for (LinkedList<Entry> bucket : oldTable) {
			if (bucket != null) {
				for (Entry entry : bucket) {
					put(entry.key, entry.value); // Rehashing each entry
				}
			}
		}
	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public void printEmployees() {
		for (LinkedList<Entry> bucket : table) {
			if (bucket != null) {
				for (Entry entry : bucket) {
					System.out.println(entry.value);
				}
			}
		}
	}
	
	    public static void main(String[] args) {
	        EmployeeHashMap employeeMap = new EmployeeHashMap();

	        // Creating employee objects
	        Employee emp1 = new Employee(101, "John Doe", 50000);
	        Employee emp2 = new Employee(102, "Jane Smith", 55000);
	        Employee emp3 = new Employee(103, "Sam Brown", 60000);

	        // Adding employees to the custom hashmap
	        employeeMap.put(emp1, emp1);
	        employeeMap.put(emp2, emp2);
	        employeeMap.put(emp3, emp3);

	        // Retrieving employees
	        Employee emp = employeeMap.get(emp1);
	        System.out.println("Retrieved Employee: " + emp);

	        // Printing all employees
	        System.out.println("\nAll Employees:");
	        employeeMap.printEmployees();

	        // Checking size
	        System.out.println("\nSize of HashMap: " + employeeMap.size());
	    }
	}

