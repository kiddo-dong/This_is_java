package ch15.sec02.exam01.gpt03;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		
		Scanner us_in = new  Scanner(System.in);
		
		List<Student> Student_List = new ArrayList<>();
		
		while(true) {
			System.out.print("학생을 추가하시겠습니까? (y/n) : ");
			String yes_no = us_in.next();
			if(yes_no.equals("y")) {
				System.out.print("학생 이름 : ");
				String name = us_in.next();
				System.out.print("학생 성적 : ");
				int score = us_in.nextInt();
				
				Student_List.add(new Student(name, score));
				
			} else if(yes_no.equals("n")) {
				break;
			} else {
				System.out.println("잘못 입력하셨습니다.");
			}
			System.out.println();
		}
		
		System.out.println();
		float avg = 0;
		int count = 0;
		System.out.println("학생 목록 : ");

		for(Student student : Student_List) {
			System.out.println(student.getname() + " - " + "성적 : " + student.getscore());
			avg += student.getscore();
			count++;
		}
		System.out.println();
		System.out.println("전체 성적 평균 : " + ((float) avg/count));
	}
}