package StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SliceOfStream {
	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		for (int i = 11; i <= 20; i++)
			list.add(i);
		int startIndex = 4;
		int endIndex = 8;
		list.stream().skip(startIndex).limit(endIndex-startIndex+1).forEach(System.out::print);
		System.out.println("\n--------------------");
		list.stream().collect(Collectors.collectingAndThen(
				Collectors.toList(),list1-> list1.stream().skip(startIndex).limit(endIndex-startIndex+1))).forEach(System.out::print);
				
		System.out.println("\n--------------------");
		list.stream().collect(Collectors.toList()).subList(startIndex, endIndex+1).forEach(System.out::print);
		
	}
}
