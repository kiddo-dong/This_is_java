package ch06.quizGG.num13;

public class MemberModeling {
	// 멤버 클래스 작성
	
	// field 생성
	String name;
	String id;
	String password;
	int age;
	
	//생성자 overloading
	public  MemberModeling() {
	}
	
	public MemberModeling(String name, String id){
		this.name = name;
		this.id = id;
	}
	
	// login method
	public boolean login(String id, String password){
		this.id = id;
		this.password = password;
		
		if(id == "이주은 개병신" && password == "9835") {
			return true;
		} else {
			return false;
		}	
	}
	
	// logout method
	public void logout(String id) {
		this.id = id;
		System.out.println(id + "님이 로그아웃되었습니다.");
	}
	
	// 메인 메소드
	public static void main(String[] args) {
		MemberModeling user1 = new MemberModeling("이주은 개병신", "lee");
		
		System.out.println(user1.name +" | " +user1.id);
		
		// 객체 user_main 생성
		MemberModeling user_main = new MemberModeling();
		// 로그인 시스템 리턴값 저장
		boolean result = user_main.login("이주은 개병신", "9835");
		
		if(result) {
			System.out.println("로그인되었습니다.");
			user_main.logout("이주은 개병신");
		} else {
			System.out.println("id 또는 패스워드가 올바르지 않음");
		}
		
		
	}
}
