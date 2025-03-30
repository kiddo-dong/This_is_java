package ch14.sec05.exam02;

public class JoinExample {
	public static void main(String[] args) {
		SumThread sumth = new SumThread();
		sumth.start();
		try {
			sumth.join();
		} catch (InterruptedException e) {
			
		}
		System.out.println(sumth.getnum());
	}
}
