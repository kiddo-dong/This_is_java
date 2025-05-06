package gpt.Lambda.exam08;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<User> users = List.of(
            new User("철수", "chulsoo@example.com", 19),
            new User("영희", "younghee@example.com", 22),
            new User("민수", "minsoo@example.com", 25),
            new User("지영", "jiyoung@example.com", 18),
            new User("태호", "taeho@example.com", 23)
        );

        // 람다식 정의
        Filter filter = user -> {
            if (user.getAge() >= 20) {
                return user.getEmail();
            }
            return null;
        };

        List<String> emailList = new ArrayList<>();
        for (User user : users) {
            String email = filter.ageUpto20(user);
            if (email != null) {
                emailList.add(email);
            }
        }

        Collections.sort(emailList);
        System.out.println(emailList);
    }
}
