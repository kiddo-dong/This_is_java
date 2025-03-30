package ch14.sec05.exam03;

public class YieldExample {
	 public static void main(String[] args) {
		 WorkThread ThreadA = new WorkThread("Thread A");
		 WorkThread ThreadB = new WorkThread("Thread B");
		 ThreadA.start();
		 ThreadB.start();
		 
		 try {
			 // main Thred 5초 후 실행
			 Thread.sleep(5000);
		} catch (InterruptedException e) {
			// Exception 발생
		}
		 ThreadA.work = false;
		 
		 try {
			 Thread.sleep(10000);
		} catch (InterruptedException e) {
			// Exception 발생
		}
		 ThreadA.work = true;
	 }
}
