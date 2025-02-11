package ch03.sec11;

import java.util.Scanner;

public class ConditionOperatorEx {
	public static void main(String[] args) {
		Scanner us_in = new Scanner(System.in);
		
		//문제 1번
		System.out.print("첫번째 값 입력 : ");
		int a = us_in.nextInt();
		System.out.print("두번째 값 입력 : ");
		int b = us_in.nextInt();
		int result1 = a > b? a : b;
		System.out.println("더 큰 수는 "+ result1 +"입니다.");
		System.out.println();
		
		// 문제 2번
		System.out.print("입력 : ");
		int num1 = us_in.nextInt();
		String result2 = num1 % 2 == 0 ? "짝수입니다." : "홀수입니다." ;
		System.out.println(result2);
		System.out.println();
		
		// 문제 3번
		System.out.print("입력 : ");
		int num2 = us_in.nextInt();
		System.out.println(num2 == 0 ? "0입니다." : (num2 > 0? "양수입니다." : "음수입니다." ));
		System.out.println();
		
		// 문제 4번
		System.out.print("입력 : ");
		int score = us_in.nextInt();
		System.out.println(score >= 60 && score <= 100 ?"합격입니다.":"불합격입니다.");
		
		// 문제 5번
		System.out.println("세 수를 입력하세요.(enter)");
		int fir = us_in.nextInt();
		int sec = us_in.nextInt();
		int thr = us_in.nextInt();
		
		int result3 = fir > sec ? (fir > thr? fir : thr) : (sec > thr ? sec : thr);
		System.out.println("가장 큰 수는 "+ result3 + "입니다.");
	
	
	}
}
