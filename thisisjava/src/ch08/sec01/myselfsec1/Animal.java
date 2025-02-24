package ch08.sec01.myselfsec1;

import java.util.Scanner;

public class Animal {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		Ani_Interface animal_sound = null;
		

		System.out.println("듣고싶은 동물의 소리 입력");
		System.out.println("| 1.강아지 | 2.고양이 |");
		System.out.print("선택 >");
		int num = in.nextInt();
		
		switch(num) {
		case 1 -> animal_sound = new Dog();
		case 2 -> animal_sound = new Cat();
		default -> System.out.println("잘못 입력하셨습니다.");
		}
		
		
		while(true) {	
			System.out.println();
			if(animal_sound instanceof Dog) {
				System.out.println("강아지 객체를 선택함");
			} else if (animal_sound instanceof Cat) {
				System.out.println("고양이 객체를 선택함");
			} else {
				System.out.println("잘못된 입력");
			}
			
			animal_sound.sound();
		
			System.out.print("객체의 교체를 원하면 c를 누르세요 > ");
			String change = in.next();
		
			if (change.equals("c")) {
				System.out.println("듣고싶은 동물의 소리 입력");
				System.out.println("| 1.강아지 | 2.고양이 |");
				System.out.print("선택 >");
				num = in.nextInt();
				
				switch(num) {
				case 1 -> animal_sound = new Dog();
				case 2 -> animal_sound = new Cat();
				default -> System.out.println("잘못 입력하셨습니다.");
				}
				System.out.println("객체가 교체 되었습니다.");
			}
			System.out.println("=====================================");
		}
	}
	
}
