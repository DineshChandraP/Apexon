package CatchIT;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HighestAverageScore {

	public static void main(String[] args) {
        String[][] student = {{"Charles", "100"}, {"Bob", "87"}, {"Eric", "64"}, {"Charles", "22"}};
        
        // Call the method to find the student with the highest average score
        String topStudent = findHighestAverage(student);
        
        // Output the result
        System.out.println(topStudent);
	}
	
	public static String findHighestAverage(String[][] student) {
        // Map to store student names and their corresponding scores
        Map<String, List<Integer>> studentScores = new HashMap<>();

        // Populate the map with student names and their scores
        for (String[] entry : student) {
            String name = entry[0];
            int score = Integer.parseInt(entry[1]);

            // Add score to the student's list of scores in the map
            studentScores.putIfAbsent(name, new ArrayList<>());
            studentScores.get(name).add(score);
        }

        // Variables to track the student with the highest average score
        String topStudent = null;
        double highestAverage = -1;

        // Calculate the average score for each student and track the highest average
        for (Map.Entry<String, List<Integer>> entry : studentScores.entrySet()) {
            String name = entry.getKey();
            List<Integer> scores = entry.getValue();

            // Calculate the average score for the current student
            double average = scores.stream().mapToInt(Integer::intValue).average().orElse(0);

            // Check if this student has the highest average
            if (average > highestAverage) {
                highestAverage = average;
                topStudent = name;
            }
        }

        return topStudent;
    }
}
