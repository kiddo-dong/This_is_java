package ch08.gpt.que3;

public class Bike implements Rentable{
	static final String BIKE = "자전거";
	
	@Override
	public String rent() {
		return BIKE;
	}
	
}
