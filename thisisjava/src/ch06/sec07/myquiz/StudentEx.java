package ch06.sec07.myquiz;

public class StudentEx {
	public static void main(String[] args) {
		Student std1 = new Student("최동현");
		System.out.println(std1.ban + " | " + std1.name + " | " + std1.kor + " | " + std1.eng);
		
		Student std2 = new Student("홍길동", 90);
		System.out.println(std2.ban + " | " + std2.name + " | " + std2.kor + " | " + std2.eng);
		
		Student std3 = new Student("김만점", 100, 100);
		System.out.println(std3.ban + " | " + std3.name + " | " + std3.kor + " | " + std3.eng);
	}
}
