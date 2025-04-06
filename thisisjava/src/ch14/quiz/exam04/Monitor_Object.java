package ch14.quiz.exam04;

public class Monitor_Object {
	
	public synchronized void method1(boolean isPingTurn) {
		if(isPingTurn) {
			System.out.println("ping");
			notify();
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			System.out.println("pong");
			notify();
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
