package ch06.sec07.exam04;

public class CarEx {
	public static void main(String[] args) {
		// 객체 Car1 생성 및 생성자 Car 호출
		Car Car1 = new Car();
		System.out.print(Car1.company + " | " + Car1.model + " | " + Car1.color + " | " + Car1.maxSpeed );
		System.out.println();
		
		Car Car2 = new Car("자가용");
		System.out.print(Car2.company + " | " + Car2.model + " | " + Car2.color + " | " + Car2.maxSpeed );
		System.out.println();
		
		Car Car3 = new Car("자가용", "빨강");
		System.out.print(Car3.company + " | " + Car3.model + " | " + Car3.color + " | " + Car3.maxSpeed );
		System.out.println();
	
		Car Car4 = new Car("택시", "검정", 200);

		System.out.print(Car4.company + " | " + Car4.model + " | " + Car4.color + " | " + Car4.maxSpeed );
		System.out.println();
	
	}
}
