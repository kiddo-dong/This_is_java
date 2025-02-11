package ch05.sec05;

import java.util.Scanner;

public class SubstringEx {
	public static void main(String[] args) {
		// index_silcing
		// substring(시작 인덱스) - 입력한 시작 인덱스부터 끝까지 자르기
		// substring(시작 인덱스, 끝 인덱스) - 입력한 시작 인덱스부터 입력한 끝 인덱스 전 까지 슬라이싱
		
		String ssn = "020207-3184513";
		char aa = ssn.charAt(6);
		
		Scanner us_in = new Scanner(System.in);
		
		System.out.println("| (1) 앞번호 | (2) 뒷번호 |");
		System.out.print("입력 : ");
		String num = us_in.nextLine();
		
		String first = ssn.substring(0,6);
		String second = ssn.substring(7);
		
		switch(num) {
		case "1" -> System.out.println(first);
		case "2" -> System.out.println(second);
		default -> System.out.println("잘못된 입력");
		}	
		
		// substring(시작 인덱스, 끝 인덱스) - 시작 인덱스 부터 끝인덱스 전까지
		// substring(시작 인덱스) - 시작 인덱스 부터 끝까지
	}
}
