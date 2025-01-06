package LambdaExpressions;

import java.util.TreeSet;

public class SortingTreeSetWithCompareTo {

	public static void main(String[] args) {
		TreeSet<String> ts= new TreeSet<String>((o1,o2)-> o2.compareTo(o1));
		
		
		 // Add elements to the Treeset
		  ts.add("A");
		  ts.add("B");
		  ts.add("C");
		  ts.add("D");
		  ts.add("E");
		  ts.add("F");
		  ts.add("G");
		  
		  //Display the elements .
		  for(String element : ts)
		    System.out.println(element + "");
		   
		  System.out.println();
	}
}
