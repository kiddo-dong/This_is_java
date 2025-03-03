package ch08.gpt.que4;

public class PhoneOrder implements Order{
	static final String PHONE = "전화";

	@Override
	public String placeOrder() {
		return PHONE;
	}
}
