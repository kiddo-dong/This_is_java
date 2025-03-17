package ch12.sec03.exam02;

public class HashCodeExample {
	public static void main(String[] args) {
		Student s1 = new Student(1, "최동현");
		Student s2 = new Student(1, "최동현");
		
		Student s3 = new Student(2, "최동현");
		
		if(s1.hashCode() == s2.hashCode()) {
			if(s1.equals(s2)) {
				System.out.println(s1.hashCode() +" | "+ s2.hashCode());
				System.out.println("동등 객체 입니다.");
			}
			else {
				System.out.println(s1.hashCode() +" | "+ s2.hashCode());
				System.out.println("데이터가 다르므로 동등 객체가 아닙니다");
			}
		}
		else{
			System.out.println(s1.hashCode() +" | "+ s2.hashCode());
			System.out.println("해시코드가 다르므로 동등 객체가 아닙니다.");
		}
		
		if(s1.hashCode() == s3.hashCode()) {
			if(s1.equals(s3)) {
				System.out.println(s1.hashCode() +" | "+ s3.hashCode());
				System.out.println("동등 객체 입니다.");
			} else {
				System.out.println(s1.hashCode() +" | "+ s3.hashCode());
				System.out.println("데이터가 다르므로 동등 객체가 아닙니다.");
			}
			
		} else {
			System.out.println(s1.hashCode() +" | "+ s3.hashCode());
			System.out.println("해시코드가 다르므로 동등 객체가 아닙니다.");
		}
		
	}
}
