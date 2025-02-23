package ch07.gpt.instaceDown;

import java.util.Scanner;

public class VehicleEx {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		Vehicle vhe = null;
		
		System.out.print("차종 입력\n| 1.자동차 | 2.오토바이 | \n입력> ");
		int num = in.nextInt();
		
		switch(num) {
		case 1 -> vhe = new Car();		
		case 2 -> vhe = new Bike();
		default -> System.out.println("잘못 입력했습니다.");
		}
		
		if(vhe!=null) {
			if(vhe instanceof Car c) {
				c.run();
			}
			else if(vhe instanceof Bike bk) {
				bk.run();
			}
		}
	}
}
