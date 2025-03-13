package ch11.sec06;

public class AccountExample {
	public static void main(String[] args) {
		Account choi = new Account("최동현");
		
		choi.deposit(10000); // 입금 메소드 호출
		
		// 출금 예외 클래스 불러오기
		try {
			choi.withdraw(30000);
		} catch(InsufficientExample e) {
			String message = e.getMessage();
			System.out.println(message);
		}
	}
}