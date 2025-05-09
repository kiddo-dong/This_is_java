package gpt.Stream.exam04;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		List<Employee> employees = List.of(
			    new Employee("choi min", "Dev"),
			    new Employee("kim jae", "Dev"),
			    new Employee("park joon", "Des"),
			    new Employee("lee min", "Dev")
			);
		
		employees.stream()
	    .filter(employee -> employee.getDepartment().equals("Dev"))
	    .flatMap(employee -> Arrays.stream(employee.getName().split(" "))) // 이름 단어로 펼치기
	    .filter(word -> word.startsWith("m")) // 'm'으로 시작하는 단어 필터링
	    .forEach(System.out::println); // 결과 출력

	}
}
