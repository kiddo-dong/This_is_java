package ch11.sec03.exam02;

public class ExceptionHandlingExample {
	public static void main(String[] args) {
		String[] array = {"100","1oo"};
		
		for(int i = 0; i<=array.length; i++) {
			try {
				int value = Integer.parseInt(array[i]);
				System.out.println("["+i+"] :"+ array[i]);
			} catch (ArrayIndexOutOfBoundsException e) { // 인덱스 초과시 실행
				System.out.println("자식 예외 클래스 ArrayIndexOutOfBoundsExcption 실행"); // 하위 예외 클래스
			} catch(Exception e) {
				System.out.println("부모 예외 클래스 Exception 실행"); // 상위 예외 클래스
			}
			
		}
	}
}

// i = 0,1,2 로
// [0] = try -> 문 빠져나감
// [1] = try -> catch (Exception e)  | Exception에 포함(1oo으로 숫자타입이 아님 (NumberFormatExceotion 필요))
// [2] = try -> catch (ArrayIndexOutOfBoundsException e) | array[2]는 인덱스의 범위를 벗어나므로 예외 출력

