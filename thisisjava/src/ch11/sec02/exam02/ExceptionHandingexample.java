package ch11.sec02.exam02;

public class ExceptionHandingexample {
	public static void main(String[] args) {
		try {
			String a = "java.util.Scanner";
			Class.forName(a);
			System.out.println(a +": 클래스를 찾음");
		} catch(ClassNotFoundException e) {
			System.out.println("클래스를 찾지 못함");
			e.printStackTrace();
		}
		
		System.out.println();
		
		try {
			String b = "java,.util.Scanner2";
			Class.forName(b);
			System.out.println(b + "클래스를 찾음");
		} catch(ClassNotFoundException e) {
			System.out.println("클래스를 찾지 못함");
			e.printStackTrace();
		}
	}
}
