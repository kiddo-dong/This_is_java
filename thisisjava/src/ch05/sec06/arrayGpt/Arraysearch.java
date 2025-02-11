package ch05.sec06.arrayGpt;

import java.util.Scanner;

public class Arraysearch {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] numbers = {5, 12, 23, 7, 19, 45, 30};
		
		System.out.println("찾을 값 을 입력하세요.(정수)");
		int target = scanner.nextInt();
		
		
		for(int i=0; i<numbers.length;i++) {
			if(target == numbers[i]) {
				System.out.println("값 "+target+"은 "+ i +"번째 인덱스에 있습니다.");
			}
		}
		
		
	}
}
