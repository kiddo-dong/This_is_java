package ch11.sec03.exam01;

public class ExceptionHandlingExample {
	public static void main(String[] args) {
		String[] array = {"100", "1oo"};
		
		for(int i = 0; i<=array.length;i++) {
			try {
				int value = Integer.parseInt(array[i]);
				System.out.println("[" + i + "] " + value);
			} catch(ArrayIndexOutOfBoundsException e){
				System.out.println("인덱스 초과");
				System.out.println(e.getMessage());
			} catch(NumberFormatException e) {
				System.out.println("숫자타입이 아님");
				System.out.println(e.toString());
			} catch(NullPointerException e) {
				System.out.println("값이 없음");
				e.getStackTrace();
			}
			System.out.println();
		}
	
	}	
}
