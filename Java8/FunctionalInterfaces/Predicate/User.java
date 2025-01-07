package FunctionalInterfaces.Predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class User {
	String name, role;

	User(String a, String b) {
		name = a;
		role = b;
	}

	String getRole() {
		return role;
	}

	String getName() {
		return name;
	}

	public String toString() {
		return "User Name : " + name + ", Role :" + role;
	}

	public static void main(String args[]) {
		List<User> users = new ArrayList<User>();
		users.add(new User("John", "admin"));
		users.add(new User("Peter", "member"));

		List<User> admins = process(users, (User u) -> u.getRole().toLowerCase().equals("admin"));
		System.out.println(admins);

		List<User> adminsList = users.stream().filter(u -> u.getRole().equals("admin")).collect(Collectors.toList());
		System.out.println(adminsList);
	}

	private static List process(List<User> users, Predicate<User> preicate) {

		List<User> list = new ArrayList<User>();
		for (User u : users) {
			if (preicate.test(u))
				list.add(u);
		}
		return list;
	}
}
