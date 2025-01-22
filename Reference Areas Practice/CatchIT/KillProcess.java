package CatchIT;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class KillProcess {

	public static void main(String[] args) {
		KillProcess solution = new KillProcess();

		/*
		 * List<Integer> pid = Arrays.asList(1, 3, 10, 5, 8); List<Integer> ppid =
		 * Arrays.asList(6, 4, 8, 5, 6); int kill = 3;
		 */
		
		List<Integer> pid = Arrays.asList(1, 2, 3, 0);
        List<Integer> ppid = Arrays.asList(6, 4, 8, 5);
        int kill = 3;

		List<Integer> result = solution.killProcess(pid, ppid, kill);
		System.out.println(result); // Output: [3, 8]
	}

	public List<Integer> killProcess(List<Integer> pid, List<Integer> ppid, int kill) {
		// Create a map to store the children of each parent
		Map<Integer, List<Integer>> tree = new HashMap<>();
		for (int i = 0; i < pid.size(); i++) {
			int parent = ppid.get(i);
			int child = pid.get(i);
			tree.putIfAbsent(parent, new ArrayList<>());
			tree.get(parent).add(child);
		}

		// List to store the killed processes
		List<Integer> result = new ArrayList<>();

		// Kill the target process and its parent
		killHelper(kill, tree, result);

		return result;
	}

	private void killHelper(int process, Map<Integer, List<Integer>> tree, List<Integer> result) {
		// Add the current process to the result list
		result.add(process);

		// Find the parent process and kill it
		for (Map.Entry<Integer, List<Integer>> entry : tree.entrySet()) {
			if (entry.getValue().contains(process)) {
				killHelper(entry.getKey(), tree, result); // Kill the parent
				break;
			}
		}
	}
}