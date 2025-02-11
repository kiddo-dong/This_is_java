package ch04.sec03;

import java.util.Scanner;

public class SwitchGPTEx {
	public static void main(String args[]) {
		Scanner us_in = new Scanner(System.in);
		/*
		// 1번
		System.out.print("입력 : ");
		int day = us_in.nextInt();
		
		switch(day) {
		case 1 -> System.out.println("월요일");
		case 2 -> System.out.println("화요일");
		case 3 -> System.out.println("수요일");
		case 4 -> System.out.println("목요일");
		case 5 -> System.out.println("금요일");
		case 6 -> System.out.println("토요일");
		case 7 -> System.out.println("일요일");
		default -> System.out.println("잘못된 입력입니다.");
		}
		*/
		
		/*
		// 2번
		System.out.println("첫번째 수 : ");
		int first = us_in.nextInt();
		System.out.println("두번째 수 : ");
		int second = us_in.nextInt();
		System.out.println("연산자(+,-,*,/) 입력");
		String oper = us_in.next();
		
		switch(oper) {
		case "+" -> System.out.println("결과 : "+ (first+second));
		case "-" -> System.out.println("결과 : "+ (first-second));
		case "*" -> System.out.println("결과 : "+ (first*second));
		case "/" -> System.out.println("결과 : "+ (first/second));
		default -> System.out.println("잘못된 연산자 입니다.");
		}
		*/
		/*
		// 3번
		System.out.print("입력 : ");
		int score = us_in.nextInt();
		
		switch(score/10) {
		case 9,10 -> System.out.println("A");
		case 8 -> System.out.println("B");
		case 7 -> System.out.println("C");
		case 6 -> System.out.println("D");
		default -> System.out.println("점수는 0~100 사이여야합니다.");
		}
		*/
		
		System.out.print("입력 : ");
		int month = us_in.nextInt();
		
		switch(month) {
		case 3,4,5 -> System.out.println("봄");
		case 6,7,8 -> System.out.println("여름");
		case 9,10,11 -> System.out.println("가을");
		case 12,1,2 -> System.out.println("겨울");
		default -> System.out.println("잘못된 월");
		}
	}
}