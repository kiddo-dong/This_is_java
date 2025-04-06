package ch15.sec02.exam01.gpt02;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		// Scanner
		Scanner us_in = new Scanner(System.in);
		
		// List object
		List<Student> student = new ArrayList<>();
		
		boolean loop = true;
		
		while(loop) {
			System.out.println("1. 학생 추가");
			System.out.println("2. 학생 목록 출력");
			System.out.println("3. 학생 삭제");
			System.out.println("4. 종료");
			
			System.out.print("메뉴를 선택하세요 : ");
			int num = us_in.nextInt();
			
			switch(num) {
			case 1:
				System.out.print("이름 : ");
				String name = us_in.next();
				System.out.print("나이 : ");
				int age = us_in.nextInt();
				
				student.add(new Student(name, age));
				System.out.println("학생이 추가되었습니다.");
				break;
				
			case 2:
				for(int i=0;i<student.size();i++) {
					Student idx = student.get(i);
					System.out.println("["+(i+1)+"] 이름 : " + idx.getname()+ ", 나이 : "+ idx.getage());
				}
				break;
				
			case 3:
			    System.out.print("삭제할 이름 : ");
			    String remove_name = us_in.next();
			    boolean removed = false;

			    for (int i = 0; i < student.size(); i++) {
			        if (student.get(i).getname().equals(remove_name)) {
			            student.remove(i);
			            removed = true;
			            System.out.println(remove_name + " 학생이 삭제되었습니다.");
			            break;
			        }
			    }

			    if (!removed) {
			        System.out.println(remove_name + " 학생을 찾을 수 없습니다.");
			    }
			    break;

			case 4:
				System.out.println("프로그램 종료");
				loop = false;
				break;
			}
			System.out.println();
		}
		us_in.close();
	}
}
