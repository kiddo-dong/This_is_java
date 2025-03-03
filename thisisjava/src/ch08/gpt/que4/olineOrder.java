package ch08.gpt.que4;

public class olineOrder implements Order{
	static final String ONLINE = "온라인";

	@Override
	public String placeOrder() {
		return ONLINE;
	}
	
	
}
