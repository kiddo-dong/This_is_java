package ch12.sec03.exam02;

public class Student {
	private int id;
	private String name;
	
	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public int getid() {return id;}
	public String getname() {return name;}
	
	// Object의 hashCode() 오버라이드
	@Override
	public int hashCode() {
		int hashCode = id + name.hashCode();
		return hashCode;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student target) {
			if(id == target.getid() && name.equals(target.getname())) {
				return true;
			}
		}
		return false;
	}
}
