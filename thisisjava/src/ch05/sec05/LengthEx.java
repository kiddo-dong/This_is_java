package ch05.sec05;

public class LengthEx {
	public static void main(String[] args) {
		// length() - 문자열 길이
		
		String ssn = "020207-3184513";
		int length = ssn.length();
		if(length == 14) {
			System.out.println("주민등록번호 자릿수가 맞습니다.");
		} else {
			System.out.println("주민등록번호 자릿수가 틀립니다.");
		}
	}
}