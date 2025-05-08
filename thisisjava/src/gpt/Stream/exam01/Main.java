package gpt.Stream.exam01;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {
	public static void main(String[] args) {
		List<User> users = List.of(
			    new User("민수", 25, "서울"),
			    new User("영희", 19, "부산"),
			    new User("자바", 30, "서울"),
			    new User("주은", 17, "대전"),
			    new User("동현", 28, "서울")
			);
		
		Stream<User> users_stream = users.stream();
		users_stream.forEach((user)->{
			if(user.getAge() >= 20 && user.getCity().equals("서울")) {
				System.out.println(user.getName());
			}
		});
	}
}
