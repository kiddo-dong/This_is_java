package ch07.sec09;

public class Student extends Person{
	public int studentNo;
	public Student(String name, int studentNo) {
		// 부모 클래스인 Person의 생성자 매개변수 String name
		super(name);
		this.studentNo = studentNo;
	}
	
	public void study() {
		System.out.println("공부를 합니다.");
	}
}