package gpt.HashSet.Exam03;


import java.util.*;

public class Main {
	public static void main(String[] args) {
		
		Set<String> textSet = new HashSet<String>();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("문자열 무한 저장");
		while(true) {
			System.out.print("입력> ");
			String text = scanner.next();
			
			if(textSet.contains(text)) {
				System.out.println("이미 존재합니다.");
			} else if(text.equals("종료")){
				System.out.println("프로그램 종료");
				break;
			} else {
				textSet.add(text);
				System.out.println("추가되었습니다.");
			}
			
		}
	}
}
