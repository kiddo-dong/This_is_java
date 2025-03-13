package ch11.sec06;

public class Account {
	private long balance=0;
	private String name;
	
	//생성자
	public Account(String name) {
		this.name = name;
		System.out.println("예금주 : " + this.name);
		System.out.println("현재 금액 : " + getbalance());
	}
	
	// 현재 금액 메소드
	private long getbalance() {
		return balance;
	}
	
	// 입금 메소드
	public void deposit(int money) {
		System.out.println(money+"원을 입금합니다.");
		balance += money;
		System.out.println("입금 후 금액 : " + getbalance());
	}
	
	// 출금 메소드
	// 예외를 호출한 곳으로 넘겨줌
	public void withdraw(int money) throws InsufficientExample {
		// 출금 금액이 잔고보다 크면 예외 발생 
		if(balance<money) {
			throw new InsufficientExample(name+"의 잔고부족 : " + (money-balance) + "원 모자람");
		}
		// 잔고가 더 많읗 시
		balance -= money;
		System.out.println("출금 후 금액 : " + getbalance());
	}
}
