package ch14.quiz.exam02;

public class Main {
	public static void main(String[] args) {
		// 공유 객체
		ParkingLot parkinglot = new ParkingLot();
		
		Thread car1 = new Thread(new Runnable() {
			@Override
			public void run() {
				parkinglot.parking("car-1");
			}
		});
		
		Thread car2 = new Thread(new Runnable() {
			@Override
			public void run() {
				parkinglot.parking("car-2");
			}
		});
		
		Thread car3 = new Thread(new Runnable() {
			@Override
			public void run() {
				parkinglot.parking("car-3");
			}
		});
		
		Thread car4 = new Thread(new Runnable() {
			@Override
			public void run() {
				parkinglot.parking("car-4");
			}
		});
		
		car1.start();
		car2.start();
		car3.start();
		car4.start();
	}
}
