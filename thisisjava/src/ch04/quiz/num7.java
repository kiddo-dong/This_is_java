package ch04.quiz;

import java.util.Scanner;

public class num7 {
	public static void main(String[] args) {
		Scanner us_in = new Scanner(System.in);
		int money = 0;
		boolean a=true;
		
		while(a==true) {
			System.out.println("===============================");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("===============================");
			
			System.out.print("선택 >");
			int input_num = us_in.nextInt();
			
			switch(input_num) {
			case 1: 
				System.out.print("예금액 >");
				money+=us_in.nextInt();
				break;
			case 2:
				System.out.println("출금액 >");
				money-=us_in.nextInt();
				break;
			case 3:
				System.out.println("잔고>"+money);
				break;
			case 4: a=false;
			}
			System.out.println();
		}
		us_in.close();
	}
}
