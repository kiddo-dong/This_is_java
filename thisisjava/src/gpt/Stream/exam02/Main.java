package gpt.Stream.exam02;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Main {
	public static void main(String[] args) {
		List<Person> person = List.of(
				new Person("John", 33),
				new Person("choi", 29),
				new Person("John", 21),
				new Person("park", 38),
				new Person("kim", 13),
				new Person("John", 39)
		);
		
		person.stream()
				.filter((p)-> p.getAge() >= 30 && !(p.getName().equals("John")))
				.map((p) -> new Person(p.getName(), p.getAge()+10))
				.sorted(Comparator.comparing(Person::getAge).reversed())
				.forEach((p) -> System.out.println(p.getName() + " - " + p.getAge()));
	}
}
