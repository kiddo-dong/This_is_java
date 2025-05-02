package gpt.ListExam01;

import java.util.*;


public class Main {
	public static void main(String[] args) {
		Scanner us_in = new Scanner(System.in);
		
		List<Student> student_list = new ArrayList<Student>();
		List<Student> underscore = new ArrayList<Student>();
		
		System.out.println("학생 성적 입력 시스템");
		while(true) {
			System.out.print("학생 이름을 입력하세요(종료: end) : ");
			String name = us_in.next();
			
			if(name.equals("end")) {
				break;
			}
			
			System.out.print("점수를 입력하세요 : ");
			int score = us_in.nextInt();
			
			student_list.add(new Student(name,score));
			
		}
		
		
		float sum = 0;
		
		Student max = new Student(student_list.get(0).getName(), student_list.get(0).getScore());
		System.out.println("---전체 학생 목록---");
		for(Student student : student_list) {
			sum = sum + student.getScore();			
			
			System.out.println("이름 : " + student.getName() + ", 점수 : " + student.getScore());
			if(student.getScore()<60) {
				underscore.add(student);
			}
			
			if(max.getScore()<student.getScore()) {
				max =  new Student(student.getName(),student.getScore());
			}
		}
		
		System.out.println("---최고 점수 학생---");
		System.out.println("이름: " + max.getName()+"점수 : "+max.getScore());
		
		System.out.println("---평균 점수---");
		System.out.println(sum/student_list.size());
		
		System.out.println("--- 불합격자 목록(60점 미만)---");
		for(Student student : underscore) {
			System.out.println("이름 : " + student.getName() + ", 점수 : " + student.getScore());
		}
		
	}
}
