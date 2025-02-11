package ch02.sec06;

public class TextBlockEx {
	public static void main(String[] args) {
		String str1 = """
				{
					"id" : "dh6559",
					"name" : "눈송이"
				}
				""";
		System.out.println(str1);
		
		String str2 = """
				나는 \
				최동현\
				입니다.
				""";
		System.out.println(str2);
	}
}