package gpt.Lambda.exam10;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		List<User> users = List.of(
				new User("민수", 25, "서울"),
				new User("영희", 28, "부산"),
				new User("자바", 21, "서울"),
				new User("주은", 24, "부산"),
				new User("동현", 24, "인천")
				);
		
		// Lambda Filter (String return)
		Filter filter = (user) -> {
			if(user.getAge() >= 25 && (user.getCity().equals("부산") || user.getCity().equals("서울"))) {
				return user.getName();
			} else {
				return null;
			}
		};
		
		List<String> nameSet = new ArrayList<String>();
		for(User user : users) {
			String nameResult = filter.age25AndCity(user);
			if(nameResult != null) {
				nameSet.add(nameResult);
			}
		}
		
		Collections.sort(nameSet);
		System.out.println(nameSet);
	}
}
