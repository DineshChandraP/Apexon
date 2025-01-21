
import java.util.*;

public class TreeKill {
	public static void main(String[] args) {
		// Example parent-child relationship
		int[] parents = { 10, 10, 20, 20, 30 }; // Parent nodes
		int[] children = { 1, 2, 3, 4, 5 }; // Child nodes

		// Example nodes to be killed (from the child array)
		int[] killedChildren = { 2, 4 };

		// Get the killed nodes
		Set<Integer> killedNodes = getKilledNodes(parents, children, killedChildren);

		// Print the result
		System.out.println("Killed nodes: " + killedNodes);
	}

	public static Set<Integer> getKilledNodes(int[] parents, int[] children, int[] killedChildren) {
		// Map to store parent-child relationships
		Map<Integer, Integer> parentMap = new HashMap<>();

		// Fill the parent-child relationship map
		for (int i = 0; i < parents.length; i++) {
			parentMap.put(children[i], parents[i]);
		}

		// Set to keep track of killed nodes (to avoid duplicates)
		Set<Integer> killedNodes = new HashSet<>();

		// Kill the given child nodes and their parents
		for (int child : killedChildren) {
			killedNodes.add(child); // Kill the child node

			// If the child has a parent, kill the parent too
			if (parentMap.containsKey(child)) {
				killedNodes.add(parentMap.get(child));
			}
		}

		return killedNodes;
	}
}
