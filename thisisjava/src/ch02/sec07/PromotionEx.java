package ch02.sec07;

public class PromotionEx {
	public static void main(String[] args) {
		// 자동 타입 변환
		byte byteValue = 10;
		int intValue = byteValue;
		System.out.println(intValue);
		
		char CharValue = '가';
		intValue = CharValue;
		System.out.println("유니코드 : " + intValue);
		
		intValue = 50;
		long longValue = intValue;
		System.out.println(longValue);
		
		longValue = 100;
		float FloatValue = longValue;
		System.out.println(FloatValue);
		
		FloatValue = 100.5F;
		double DoubleValue = FloatValue;
		System.out.println(DoubleValue);
		
	}
}
