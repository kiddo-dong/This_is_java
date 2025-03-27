package ch13.sec05;

public class GenericExample {
	public static void main(String[] args) {
		Course.register1(new Applicant<Person>(new Person()));
		Course.register1(new Applicant<middleStudent>(new middleStudent()));
		System.out.println();
		Course.register2(new Applicant<Student>(new Student()));
		Course.register2(new Applicant<middleStudent>(new middleStudent()));
		System.out.println();
		Course.register3(new Applicant<Worker>(new Worker()));
		Course.register3(new Applicant<Person>(new Person()));
	}
}
