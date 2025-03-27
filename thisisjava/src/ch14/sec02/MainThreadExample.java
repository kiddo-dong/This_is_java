package ch14.sec02;

public class MainThreadExample {
	public static void main(String args[]) {
		System.out.println("시작");
		
		// 현재 스레드 객체 리턴 (main)
		Thread currThread = Thread.currentThread();
		System.out.println(currThread.getName());
		
		
		
		System.out.println("종료");
	}
}
