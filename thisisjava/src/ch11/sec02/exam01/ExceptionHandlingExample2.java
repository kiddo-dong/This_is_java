package ch11.sec02.exam01;

public class ExceptionHandlingExample2 {
	// 메소드
	public static void printLength(String data) {
		try{// 로컬 변수 
			int result = data.length();
			System.out.println("문자 수 : " + result);
		} catch(NullPointerException e){
				e.printStackTrace();
				//System.out.println(e.toString());
				//System.out.println(e.getMessage());
		}
		finally{
			System.out.println("[마무리 실행]");
		}
	}
		
	public static void main(String[] args) {
		System.out.println("[프로그램 시작]\n");
		printLength("ThisIsJava");
		printLength(null);
		System.out.println("[프로그램 종료]");
	}
}
