package ch12.sec08;

import java.text.*;
import java.util.*;

public class DateExample {
	public static void main(String[] args) {
		Date now = new Date();
		// Date() 클래스는 시스템 시간을 반환
		System.out.println(now);
		
		// 생성자에 표현 정규식 입력
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.mm.dd hh:mm:ss");
		// SimpleDateFormat format(현재 시간) 메소드 호출
		System.out.println(sdf.format(now));
	}
}
