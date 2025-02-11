package ch02.sec11;

public class VariableScopeEx {
	public static void main(String[] args) {
		int v1 = 15;
		if (v1>10) {
			int v2 = v1 - 10;
			System.out.println(v2);
		}
		// int v3 = v1 + v2 + 5;
		// v2를 사용 할 수 없어 컴파일 에러 발생
		
	}
}
