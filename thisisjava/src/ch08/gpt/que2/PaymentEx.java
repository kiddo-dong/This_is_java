package ch08.gpt.que2;

import java.util.Scanner;

public class PaymentEx {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Payment pay_us = null;
		
		int price = 10000;
		
		System.out.println("원하는 결제 방식을 선택");
		System.out.println("| 1.CreditCard | 2.PayPal | 3.Bitcoin |");
		System.out.print("> ");
		int num = in.nextInt();
		
		
		switch(num) {
			case 1 -> pay_us = new CreditCard();
			case 2 -> pay_us = new PayPal();
			case 3 -> pay_us = new Bitcoin();
			default -> System.out.println("잘못된 입력입니다.");
		}
		pay_us.pay(price);
		
	}
}
