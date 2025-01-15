package StreamAPI;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Sorting {
	public static void main(String[] args) {
		List<String> companyList = new ArrayList<>();
		companyList.add("Google");
		companyList.add("Apple");
		companyList.add("Microsoft");
		System.out.println(companyList);
//		Comparator<String> stringComp= (String o1, String o2)-> o1.compareTo(o2);
//		Collections.sort(companyList, stringComp);
		
		companyList.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		//System.out.println(companyList);
	}
}
