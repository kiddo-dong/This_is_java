package ch08.gpt.que3;

public class Car implements Rentable{
	static final String CAR = "자동차";
	
	@Override
	public String rent() {
		return CAR;
	}

}
