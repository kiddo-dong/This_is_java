package ch08.sec08;

import java.util.Scanner;

public class RemoteEx {
	public static void main(String[] args) {
		RemoteControl rc = new SmartTelevision();
		rc.turnOn();
		rc.turnOff();
		//rc.searchable();
		// RemoteControl 인터페이스 타입에 searchable() 추상 메소드가 존재하지 않음
		
		Searchable sa = new SmartTelevision();
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("URL입력 :");
		String url = in.next();
		
		sa.search(url);
	}
}
