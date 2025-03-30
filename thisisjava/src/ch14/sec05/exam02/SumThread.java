package ch14.sec05.exam02;

public class SumThread extends Thread{
	private int num;
	
	public void setnum(int num) { this.num = num;}
	public int getnum() { return this.num; }
	
	@Override
	public void run() {
		for (int i=1; i<=100; i++) {
			num+=i;
		}
	}
}
