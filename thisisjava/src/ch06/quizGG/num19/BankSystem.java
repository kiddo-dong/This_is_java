package ch06.quizGG.num19;

public class BankSystem {
	private int balance;
	static final int MIN_BALANCE = 0;
	static final int MAX_BALANCE = 1000000;
	
	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		// 현재 잔고 조건문
		if(balance < MIN_BALANCE || MAX_BALANCE < balance) {
			this.balance = this.balance;
		} else {
			this.balance = balance;
		}
	}
		
	public static void main(String[] args) {
		BankSystem account = new BankSystem();
		
		account.setBalance(10000);
		System.out.println("현재 잔고 : " + account.getBalance());
		
		account.setBalance(-100);
		System.out.println("현재 잔고 : " + account.getBalance());
		
		account.setBalance(2000000);
		System.out.println("현재 잔고 : "+ account.getBalance());
	
		account.setBalance(300000);
		System.out.println("현재 잔고 : " + account.getBalance());
	}
}