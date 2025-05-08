package gpt.Lambda.exam11;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		List<User> users = Arrays.asList(
			    new User("철수", 25, true),
			    new User("영희", 18, true),
			    new User("민수", 30, false),
			    new User("지수", 22, true)
			);
		
		Filter filter = (user) -> {
			if(user.getAge() >= 20 && (user.getIsActive() == true)) {
				return user.getName();
			} else {
				return null;
			}
		};
		
		List<String> nameList = new ArrayList<>();
		for(User user : users) {
			if(filter.adultUser(user) != null) {
				nameList.add(filter.adultUser(user));
			}
		}
		Collections.sort(nameList);
		System.out.println(nameList);
	}
}
