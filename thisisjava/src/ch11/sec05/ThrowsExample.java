package ch11.sec05;

public class ThrowsExample {
	public static void main(String[] args) {
		try {
			findClass(); // 예외 throws
		} catch(ClassNotFoundException e) {
			System.out.println("예외 처리 : " + e.toString());
		}
	}

	//정적 필드
	public static String name = "java.lang.String2";
	//메소드
	public static void findClass() throws ClassNotFoundException{
		Class.forName(name);
	}
}	
