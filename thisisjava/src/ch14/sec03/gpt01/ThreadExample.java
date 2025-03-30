package ch14.sec03.gpt01;

public class ThreadExample {
	// 메인 스레드
	public static void main(String[] args) {
        Thread thread01 = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("NonName implements object");
			}
        	
        });
        thread01.start();
	}
}
