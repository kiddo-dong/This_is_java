package ch06.sec08.exam02;

public class ComputerEx {
	public static void main(String[] args) {
		
		// Computer 클래스를 myCom이라는 객체로 선언 및 생성자 초기화
		Computer myCom = new Computer();
		
		//sum() 메소드 호출 시 매개값 1,2,3을 제공하고
		//합산 결과를 리턴받아 result1 변수에 대입
		int result1 = myCom.sum(1,2,3);
		System.out.println("result1 : " + result1);
		
		int[] values = {1,2,3,4,5};
		int result2 = myCom.sum(values);
		System.out.println("result2 : " + result2);
		
		int result3 = myCom.sum(new int[] {1,2,3,4,5});
		System.out.println("result3 : " + result3);
		
		
	}
}