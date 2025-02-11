package ch05.sec05;

public class IndexOf {
	public static void main(String[] args) {
		// indexOf(찾을 문자열) - 찾고싶은 문자열의 인덱스 리턴 (존재하지 않으면 -1) (존제)		
		String subject = "자바 프로그래밍";
		
		int location = subject.indexOf("프로그래밍");
		System.out.println(location);
		String substring = subject.substring(location);
		System.out.println(substring);
		
		location = subject.indexOf("자바");
		
		if (location != -1) {
			System.out.println("자바 관련 책");
		}
		else {
			System.out.println("자바 관련없는 책");
		}
		
		boolean result = subject.contains("자바");
		if(result) {
			System.out.println("자바 관련 책");
		}
		else {
			System.out.println("자바 관련 없는 책");
		}
	}
}
