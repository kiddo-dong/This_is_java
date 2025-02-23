package ch07.gpt.sealed;

import java.util.Scanner;

public class ShapeEx {
	public static void main(String[] args) {
		Scanner us_in = new Scanner(System.in);
		
		System.out.println("넓이를 구할 도형 선택");
		System.out.print("| 1.원 | 2.사각형 | \n선택 >");
		int num = us_in.nextInt();
		
		Shape shp = null;
		
		if(num==1) {
			System.out.print("원을 선택. \n반지름 입력 : ");
			double r = us_in.nextDouble();
			shp = new Circle(r);
		}
		else if (num==2) {
			System.out.println("사각형을 선택.");;
			System.out.print("가로 입력 : ");
			double row = us_in.nextDouble();
			System.out.print("세로 입력 : ");
			double column = us_in.nextDouble();
			shp = new Rectangle(row,column);
		}
		else {
			System.out.println("잘못된 입력입니다.");
		}
		
		
		if(shp != null) {
			if(shp instanceof Circle) {
				System.out.println("원의 넓이 : " + shp.area());
			}
			else {
				System.out.println(shp.area());
			}
		}
	}
}
