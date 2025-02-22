package ch07.sec07.exam02;

public class ChildEx {
	public static void main(String[] args) {
		// 자식 객체
		Child ch = new Child(); //method 1,2,3
		
		// 부모객체 생성 및 타입변환
		Parent par = ch; // Child 클래스
		
		par.method1(); // Parent 클래스의 par 객체의 method1 호출
		par.method2(); // 자식객체에서 오버라이딩된 객체 호출
		// par.method3(); 에러 // par에는 method3 이 존재하지않음

	}
}











