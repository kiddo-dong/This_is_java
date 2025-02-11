package ch05.sec05;

public class EqualsEx {
	public static void main(String[] args) {
		// 참조타입 변수명 = new 참조타입(깂)
		// 같은 값 이어도 다른 주소로 저장하고 싶으면 new() 연산자 사용
		
		// 내부 문자열의 값 비교
		// equals() 메소드 사용
		 String strvar1 = "최동현";
		 String strvar2 = "최동현";
		 
		 if(strvar1 == strvar2) {
			 System.out.println("주소 참조가 같음");
		 }
		 else {
			 System.out.println("주소 참조가 다름");
		 }
		 
		 
		 if(strvar1.equals(strvar2)) {
			 System.out.println("문자열이 같음");
		 }
		 
		 String strvar3 = new String("최동현");
		 String strvar4 = new String("최동현");
		 
		 if(strvar3 == strvar4) {
			 System.out.println("참조가 같음");
		 }
		 else {
			 System.out.println("참조가 다름");
		 }
		 
		 if(strvar3.equals(strvar4)) {
			 System.out.println("문자열이 같음");
		 }
	}
}
