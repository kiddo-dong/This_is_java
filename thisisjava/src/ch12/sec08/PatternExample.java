package ch12.sec08;

import java.util.regex.Pattern;

public class PatternExample {
	public static void main(String[] args) {
		String regExp = "(02|010)-\\d{3,4}-\\d{4}";
		String data = "010-123-4567";
		
		// 정규식 비교 후 boolean 형 리턴
		boolean result = Pattern.matches(regExp, data);
		
		if(result) {
			System.out.println("data 값이 정규식과 일치");
		} else {
			System.out.println("data 값이 정규식과 불일치");
		}
		
		regExp = "\\w+@\\w+\\.\\w+(\\.\\w+)?";
		String data_test = "dht55@googlecom";
		data = "dh6559@naver.com";
		result = Pattern.matches(regExp, data_test);
		boolean result_data = Pattern.matches(regExp, data);
		
		if(result) {
			System.out.println("data 값이 정규식과 일치");
		} else {
			System.out.println("data 값이 정규식과 불일치");
		}
		
		if(result_data) {
			System.out.println("data 값이 정규식과 일치");
		} else {
			System.out.println("data 값이 정규식과 불일치");
		}
	}
}
