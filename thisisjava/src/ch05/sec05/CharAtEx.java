package ch05.sec05;

public class CharAtEx {
	public static void main(String[] args) {
		// charAt(value) - value의 인덱스 위치
		
		String ssn = "020207-3184513";
		char sex = ssn.charAt(7);
		
		switch(sex) {
		case '1','3' -> System.out.println("남자 입니다.");
		case '2','4' -> System.out.println("여자 입니다.");
		}
		
	}
}
