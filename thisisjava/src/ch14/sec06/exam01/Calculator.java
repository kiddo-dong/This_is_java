package ch14.sec06.exam01;

// 객체
public class Calculator {
	private int memory;
	
	public int getmemory() {
			return memory;
	}
	
	// 먼저 이 메소드를 참조한 스레드가 종료될때까지 외부에서 참조 불가
	public synchronized void setmemory(int memory) {
		this.memory = memory;
		
		try {
			Thread.sleep(2000);
		} catch (Exception e) { }
		System.out.println(Thread.currentThread().getName() + " : " + this.memory);
	}
}
