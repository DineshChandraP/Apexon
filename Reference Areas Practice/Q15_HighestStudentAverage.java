import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Q15_HighestStudentAverage {
	/*
	 * "Given a list of student names and corresponding marks, return the highest
	 * average marks (and print the corresponding student name - optional). The
	 * marks can be negative as well and a student may have multiple marks.
	 * 
	 * Example: String[][] = {{"Charles”, 84}, {"John”, 100}, {"Andy”, 37}, {"John”,
	 * 23}, {"Charles”, 20}};
	 * 
	 * Return 61.5 (which is of John's)"
	 */

	public static void main(String[] args) {
		String[][] studentMarks = { { "Charles", "84" }, { "John", "100" }, { "Andy", "37" }, { "John", "23" },
				{ "Charles", "20" } };

		printStudentWithHighestAverageMarks(studentMarks);

	}

	private static void printStudentWithHighestAverageMarks(String[][] studentMarks) {

		// Add the Data to HashMap
		HashMap<String, List<Integer>> studentData = new HashMap<String, List<Integer>>();

		for (String[] student : studentMarks) {
			String studentName = student[0];
			int marks = Integer.parseInt(student[1]);

			studentData.putIfAbsent(studentName, new ArrayList<Integer>());
			studentData.get(studentName).add(marks);
		}

		// System.out.println(studentData.toString());

		// Calculate Average
		double highestAverage = Double.NEGATIVE_INFINITY;
		String studentWithHighestAverage=null;

		for (Map.Entry<String, List<Integer>> data : studentData.entrySet()) {
			String studentName = data.getKey();
			List<Integer> marksList = data.getValue();
			// Find Average
			//double average = marksList.stream().mapToInt(Integer::intValue).average().orElse(0.0);
			
			//Alternate Average Calculation
			double sum=0;
			for(int marks: marksList) {
				sum=sum+marks;
			}
			
			double average= sum/marksList.size();
			
			if(average > highestAverage) {
				highestAverage= average;
				studentWithHighestAverage= studentName;
			}
		}
		
		System.out.println(studentWithHighestAverage+ " is having highest average marks "+ highestAverage);
	}
}
