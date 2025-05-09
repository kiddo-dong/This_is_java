package gpt.Stream.exam03;

import java.text.Collator;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
	public static void main(String[] args) {
		List<Employee> employeeList = List.of(
				new Employee("choi", "Dev", 1100000),
				new Employee("kim", "Dev", 2200000),
				new Employee("park", "PM", 3300000),
				new Employee("choi", "Des", 2500000),
				new Employee("Jhon", "Dev", 3200000)
				);
		
		int sum = 0;
		for(Employee e : employeeList) {
			sum+=e.getSalary();
		}
		
		double avg = (double)sum / employeeList.size();

		employeeList.stream()
			.filter(employee -> employee.getDepartment().equals("Dev") && employee.getSalary() >= avg)
			.sorted(Comparator.comparingInt(Employee::getSalary).reversed())
			.limit(3)
			.map(employee -> new Employee(employee.getName().toUpperCase(), employee.getDepartment(), employee.getSalary()))
			.forEach((employee)->System.out.println( employee.getName() + " - " + employee.getSalary() ));

	}
}
