package LambdaExpressions;

import java.util.ArrayList;

public class PrintingElements {
	public static void main(String[] args) {

		ArrayList<Integer> arrL = new ArrayList<Integer>();
		arrL.add(1);
		arrL.add(2);
		arrL.add(3);
		arrL.add(4);
		
		System.out.println("Printing all elements");
		arrL.forEach(e -> System.out.println(e));
		
		System.out.println("Printing Even elements");
		arrL.forEach(e -> {
			if(e%2==0)System.out.println(e);
		});
	}
}
