package CatchIT.solid;

public class SingleResponsibilityPrinciple {
	
	class Employee {
	    private String name;
	    private double salary;

	    public void calculateSalary() {
	        // Logic to calculate salary
	    }

	    public void saveEmployee() {
	        // Logic to save employee to the database
	    }
	}
	
	
	class Employee {
	    private String name;
	    private double salary;

	    // Constructor and other methods
	}

	class SalaryCalculator {
	    public double calculateSalary(Employee employee) {
	        // Logic to calculate salary
	        return employee.getSalary();
	    }
	}

	class EmployeeRepository {
	    public void saveEmployee(Employee employee) {
	        // Logic to save employee to the database
	    }
	}
}
