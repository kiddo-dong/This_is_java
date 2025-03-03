package ch08.gpt.que2;

public class PayPal implements Payment{
	@Override
	public void pay(int amount) {
		System.out.println("PayPal로 "+amount+"원 결제");
	}

}
