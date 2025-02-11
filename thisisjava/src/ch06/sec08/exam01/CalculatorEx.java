package ch06.sec08.exam01;

public class CalculatorEx {
	public static void main(String[] args) {
		
		// Calculator 클래스는 매개 변수가 존재 하지 않아 생성자가 컴파일 시 자동 생성됨.
		Calculator myCalc = new Calculator();
	
		// 리턴 값이 없는 powerOn() 메소드 호출
		myCalc.powerOn();
		// 메소드의 리턴이 존재하지 않기때문에 리턴값을 저장할 이유가 없음
		
		// 리턴 값이 int인 객체 myCalc의 plus(x,y) 매소드 호출
		int result1 = myCalc.plus(5, 6);
		//plus 메소드의 리턴값이 int형이므로 int 변수에 리턴값 저장
		
		System.out.println("result1(plus) : " + result1);
		
		int x = 10;
		int y = 4;
		
		// 리턴 값이 double인 객체 myCalc의 divide(x,y) 메소드 호출
		// 매개 값으로 초기화한 변수 x,y을 넣어줌
		// divide의 매개변수는 int 이므로 x,y는 int형 이어야 함
		double result2 = myCalc.divide(x, y);
		System.out.println("result2(divide) : " + result2);
		
		//리턴 값이 없는 powerOff 호출
		myCalc.powerOff();
		
		// 이 코드에서 Calculator 클래스를 myCalc객체로 선언 및 생성자를 초기화 하고
		// myCalc의 메소드 4개를 사용하였으며, void메소드 두개, int 메소드 하나, double메소드 하나를 사용함
	}
}
