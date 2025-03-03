package ch08.gpt.que2;

public class Bitcoin implements Payment{

	@Override
	public void pay(int amount) {
		System.out.println("비트코인으로 "+amount+"원 결제");
	}

}
