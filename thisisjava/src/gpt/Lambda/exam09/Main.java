package gpt.Lambda.exam09;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		List<User> users = List.of(
			    new User("철수", "chulsoo@example.com", 24, "서울"),
			    new User("영희", "younghee@example.com", 27, "부산"),
			    new User("민수", "minsoo@example.com", 30, "서울"),
			    new User("지영", "jiyoung@example.com", 25, "서울"),
			    new User("태호", "taeho@example.com", 22, "서울")
			);
		
		Filter filter = (user) -> {
			if(user.getAge() >= 25 && user.getCity().equals("서울")) {
				return user.getEmail();
			} else {
				return null;
			}
		};
		
		List<String> emailList = new ArrayList<String>();
		for(User u : users) {
			String result = filter.adult(u);
			if(result != null) {
				emailList.add(result);
			}
		}
		
		Collections.sort(emailList);
		System.out.println(emailList);
	}
}
