package ch08.gpt.que2;

public class CreditCard implements Payment{

	@Override
	public void pay(int amount) {
		System.out.println("신용카드로 "+amount+"원 결제");
	}

}
