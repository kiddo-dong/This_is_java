package ch11.sec03.exam03;

public class ExceptionHandlingExample {
	public static void main(String[] args) {
		String[] array = {"100","1oo", null, "200"};
		
		for(int i = 0; i<=array.length;i++) {
			try{
				int value = Integer.parseInt(array[i]);
				System.out.println("[" + i + "] : " + value);
			} catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("[x] : " + "배열 인덱스를 초과함 : " + e.getMessage());
			} catch(NumberFormatException | NullPointerException e) { // |(OR) 연산자로 공통 예외 처리
				System.out.println("[" + i + "] : " + "데이터에 문제가 있음");
			}
			System.out.println();
		}
		
	}
}

// i = 0,1,2,3,4
// [0] : try -> 문 빠져나감
// [1] : try -> catch (NumberFormatException e)
// [2] : try -> catch (NullPointerException e)
// [3] : try -> 문 빠져나감
// [4] : try -> catch (ArrayIndexOutOfBoundsException e)