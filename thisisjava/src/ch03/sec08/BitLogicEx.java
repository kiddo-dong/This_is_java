package ch03.sec08;

public class BitLogicEx {
	public static void main(String[] args) {

		byte receiveData = -120;
		
		// 비트 논리 연산 곱
		int unsignedInt1 = receiveData & 255;
		System.out.println(unsignedInt1);
		
		// 자바 API toUnsignedInt() 사용해서 값 얻기
		int unsignedInt2 = Byte.toUnsignedInt(receiveData);
		System.out.println(unsignedInt2);
		
		int test = 136;
		byte btest = (byte) test;
		System.out.println(btest);
	}
}
