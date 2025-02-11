package ch02.sec02;

public class LongEx{
	public static void main(String[] args) {
		
		// long 타입은 데이터가 큰 은행이나 과학 분야에서 많이 사용 됨.
		long var1 = 10;
		long var2 = 20L;
		//long var3 = 1000000000000
		
		// int 타입의 허용 범위를 초과하는 리터럴은 l이나 L을 사용해 long 타입임을 알려줘야함
		long var3 = 1000000000000L;
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
	}
}