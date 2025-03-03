package ch08.gpt.que3;

public class RentTest {
	public static void main(String[] args) {
		Rentable[] vehicles = {new Car(), new Bike()};
		
		for(Rentable vehicle : vehicles) {
			if(vehicle instanceof Car c) {
				System.out.println(c.rent() + "를 대여합니다.");
			} else if(vehicle instanceof Bike b) {
				System.out.println(b.rent() + "를 대여합니다.");
			}
		}
		
	}
}
