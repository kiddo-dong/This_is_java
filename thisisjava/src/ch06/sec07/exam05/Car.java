package ch06.sec07.exam05;

public class Car {
	// 필드 선언
	String company = "현대";
	String model;
	String color;
	int maxSpeed;
	
	
	// 생성자 선언
	//Car car1 = new Car("자가용"); -> car1(현대,자가용,은색,250)
	Car(String model){
		this(model,"은색",250); // 기본 생성자 호출 호출받은 model, 은색, 250을 기본생성자에 대입
	}
	
	//Car car2 = new Car("자가용", "빨강"); -> car2(현대, 자가용, 빨강, 250)
	Car(String model, String color){
		this(model,color,250);
	}
	
	// 기본 생성자
	// Car car3 = new Car("택시", "검정", 250); -> car3(현대, 택시, 검정, 250)
	Car(String model, String color, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}
