package ch13.sec05;

public class Course {
	public static void register1(Applicant<?> applicant) {
		System.out.println(applicant.kind.getClass().getSimpleName() + "(register 1)");
	}
	
	public static void register2(Applicant<? extends Student> applicant) {
		System.out.println(applicant.kind.getClass().getSimpleName() + "(register 2)");
	}
	
	public static void register3(Applicant<? super Worker> applicant) {
		System.out.println(applicant.kind.getClass().getSimpleName() + "(register 3)");
	}
	
	
	
}
