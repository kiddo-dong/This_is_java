package ch08.gpt.que4;

public class storeOrder implements Order{
	static final String STORE = "매장";

	@Override
	public String placeOrder() {
		return STORE;
	}
}
