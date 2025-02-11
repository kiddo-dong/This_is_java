package ch02.sec12;

public class PrintEx {
	public static void main(String[] args) {
		int value = 123;
		System.out.printf("가격 : %d\n", value); // 6자리
		System.out.printf("가격 : %6d\n", value);  // 6자리 오른쪽 정렬
		System.out.printf("가격 : %-6d\n", value); // 6자리 왼쪽 정렬
		System.out.printf("가격 : %06d\n", value); // 6자리 오른쪽 정렬 공백대신 0
		
		double area = 3.14159 * 10 * 10;
		System.out.printf("반지름이 %d인 원의 넓이 : %.2f\n", 10, area); // 소수점 세 자리까지
		System.out.printf("반지름이 %d인 원의 넓이 : %10.2f\n", 10, area); // 소수점 포함 10 자리, 오른쪽 정렬, 소수점 둘째 자리 까지
		System.out.printf("반지름이 %d인 원의 넓이 : %-10.2f\n", 10, area); // 소수점 포함 10자리, 왼쪽 정렬, 소수점 두자리 까지
		System.out.printf("반지름이 %d인 원의 넓이 : %010.3f\n", 10, area); // 소수점 포함 10자리, 오른쪽 정렬, 소수점 세자리까지, 공백 대신 0

		String name = "최동현";
		String job = "도적";
		System.out.printf("%6d | %-10s | %10s\n",1, name, job);
	}
}