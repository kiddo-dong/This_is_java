package ch05.Quiz;

import java.util.Scanner;

public class StudentScoreProgramEx {
	public static void main(String[] args) {
		Scanner us_in = new Scanner(System.in);
		int[] student = null;
		int exit = 1;
		
		while(exit == 1) {
			System.out.println("--------------------------------------------------");
			System.out.println("1.학생 수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료 ");
			System.out.println("--------------------------------------------------");
			
			System.out.print("선택> ");
			int select = us_in.nextInt();
			
			
			
			switch(select) {
			case 1 :
				System.out.print("학생 수 : ");
				int student_input = us_in.nextInt();
				student = new int[student_input];
				break;
			
			case 2 :
				for(int i=0; i<student.length;i++) {
					System.out.print("score[" + i + "]> ");
					student[i] = us_in.nextInt();
				}
				break;
			
			case 3 :
				for(int i=0; i<student.length;i++) {
					System.out.println("score["+i+"] : " + student[i]);
				}
				break;
				
			case 4 :
				int max = student[0];
				int total = 0;
				
				for(int i : student) {
					if(max<i) {
						max = i;
					}
				}
				System.out.println("최고 점수 : " + max);
				
				for(int i : student) {
					total+=i;
				}
				System.out.println("평균 점수 : " + (double)total / student.length);
				break;
				
			case 5:
				System.out.println("프로그램 종료");
				exit = 0;
				break;
				
			default : System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
			}
			System.out.println("");
		}
		
	}
}
