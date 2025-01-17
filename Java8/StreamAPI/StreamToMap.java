package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamToMap {
	public static void main(String[] args) {

		String input = "Peddakotla Dinesh Chandra";

		Map<String, Integer> map = Arrays.stream(input.split(" "))
				.collect(Collectors.toMap(value -> value, value -> value.length()));
		System.out.println(map);

		User user1 = new User(1, "User1", "Pune");
		User user2 = new User(2, "User2", "Mumbai");
		User user3 = new User(3, "User3", "Nagpur");
		User user4 = new User(4, "User4", "Pune");
		User user5 = new User(5, "User5", "Mumbai");

		Map<Integer, User> userMap = Arrays.asList(user1, user2, user3).stream()
				.collect(Collectors.toMap(user -> user.getUserId(), user -> user));
		System.out.println(userMap);

		Map<String, List<User>> cityUserListMap = Arrays.asList(user1, user2, user3,user4,user5).stream()
				.collect(Collectors.groupingBy(User::getCity));
		System.out.println(cityUserListMap);
		
		Map<String,Long> cityUserCount= Arrays.asList(user1, user2, user3,user4,user5).stream().collect(Collectors.groupingBy(User::getCity, Collectors.counting()));
				System.out.println(cityUserCount);
	}
}
