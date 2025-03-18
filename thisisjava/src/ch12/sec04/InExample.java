package ch12.sec04;

import java.io.IOException;

public class InExample {
	public static void main(String[] args) throws IOException { // read() 메소드는 IOEXception이 발생 할 수 있으므로 예외 처리
		int speed = 0;
		int keyCode = 0;
		
		while(true) {
			//System.in.read() 메소드는 값을 하나씩 읽으므로 키 입력 값과 enter(10 or 13)을 통해 두번 읽힘
			// enter(10 or 13) 입력 시 
			if(keyCode != 13 && keyCode != 10) {
				if(keyCode == 49) {
					speed++;
				} else if(keyCode == 50) {
					speed--;
				} else if(keyCode == 51) {
					break;
				}
				System.out.println("------------------------");
				System.out.println("1.증속 | 2.감속 | 3.중지");
				System.out.println("------------------------");
				System.out.println("현재 속도 = " + speed);
				System.out.print("선택 : ");
			}
			keyCode = System.in.read(); // 1 enter시 실질적으로 keyCode는 1 읽고 13을 읽음
		}
	}
}
