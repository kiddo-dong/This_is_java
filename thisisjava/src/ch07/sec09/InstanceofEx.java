package ch07.sec09;

public class InstanceofEx {
	public static void personInfo (Person person) {
		System.out.println("name : " + person.name);
		person.walk();
		
		if (person instanceof Student student) {
			System.out.println("studentNo: "+student.studentNo);
			student.study();
		}
	}
	
	public static void main(String[] args) {
		Person p1 = new Person("홍길동");
		personInfo(p1);
		
		System.out.println();
		
		// Student 의 매개 값 String name, int studentNo
		Person p2 = new Student("홍길동", 10);
		personInfo(p2);
	}
}
