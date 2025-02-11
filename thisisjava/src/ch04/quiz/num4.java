package ch04.quiz;

public class num4 {
	public static void main(String[] args) {
		int count = 0;
		
		while(true) {	
			count++;
			
			int num1 = (int)(Math.random()*6) + 1;
			int num2 = (int)(Math.random()*6) + 1;
			
			System.out.println("("+ num1+ ", "+num2 +") 합 : "+(num1+num2));
			if(num1+num2 == 5) {
				System.out.println("프로그램 종료 | 실행 횟수 : " + count);
				break;
			}
		}
		
	}
}