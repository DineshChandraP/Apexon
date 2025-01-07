package FunctionalInterfaces.Consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class AcceptMethod {

	public static void main(String[] args) {

		Consumer<Integer> display = e -> System.out.println("Entered number : " + e);
		display.accept(5);

		Consumer<List<Integer>> modify = list -> {
			for (int i = 0; i <= list.size(); i++)
				list.set(i, 2 * list.get(i));
		};

		Consumer<List<Integer>> displayList = list -> list.stream().forEach(e -> System.out.print(e + " "));

		List<Integer> list = new ArrayList<Integer>();
		list.add(2);
		list.add(1);
		list.add(3);

		//modify.accept(list);
		//displayList.accept(list);
		System.out.println("\n-----------------------------------");
		//modify.andThen(displayList).accept(list);

		/*
		 * try { // using addThen() modify.andThen(null).accept(list); } catch
		 * (Exception e) { e.printStackTrace(); }
		 */

		System.out.println("\n-----------------------------------");
		try {
			displayList.andThen(modify).accept(list);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
