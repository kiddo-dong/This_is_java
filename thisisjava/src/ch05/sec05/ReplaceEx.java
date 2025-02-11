package ch05.sec05;

public class ReplaceEx {
	public static void main(String[] args) {
		// replace(변경 대상 문자열, 변경 문자열)
		// 리턴 방식
		
		String oldStr = "자바 문자열";
		String newStr = oldStr.replace("자바","Java");
		
		System.out.println(oldStr);
		System.out.println(newStr);
		
		oldStr = oldStr.replace("자바", "Java");
		System.out.println(oldStr);
	}
}
