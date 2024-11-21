import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test_Q4_OceanView {

	public static void main(String[] args) {
		
		 int[] heights = { 4,3,2,1};

	        List<Integer> result = findOceanViewBuildings(heights);

	        for (int i : result) {
	            System.out.print(i + " ");
	        }
	}

	private static List<Integer> findOceanViewBuildings(int[] heights) {
		List<Integer> result= new ArrayList<Integer>();
		int currentTallestBuilding =Integer.MIN_VALUE;
		
		for(int i= heights.length-1; i>=0; i--) {
			
			if(heights[i] >currentTallestBuilding) {
				currentTallestBuilding= heights[i];
				result.add(i);
			}
		}
		Collections.reverse(result);
		return result;
	}
}
