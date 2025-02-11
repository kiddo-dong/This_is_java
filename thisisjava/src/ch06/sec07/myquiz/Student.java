package ch06.sec07.myquiz;

public class Student {
	String ban = "A반";
	String name;
	int kor;
	int eng;
	
	Student(String name){
		this(name, 0, 0);
	}
	
	Student(String name, int kor){
		this(name, kor, 0);
	}
	
	
	Student(String name, int kor, int eng){
		this.name = name;
		this.kor = kor;
		this.eng = eng;
	}
}
