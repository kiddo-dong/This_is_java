package ch15.sec02.exam01.gpt03;

public class Student {
	//필드
	private String name;
	private int score;
	
	// 생성자
	public Student(String name, int score) {
		this.name = name;
		this.score = score;
	}
	
	public String getname() {return name;};
	public int getscore() {return score;};
}
