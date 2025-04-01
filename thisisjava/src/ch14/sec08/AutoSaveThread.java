package ch14.sec08;

public class AutoSaveThread extends Thread{
	// method
	public void save() {
		System.out.println("작업 내용 저장");
	}
	
	@Override
	public void run() {
		while(true) {
			try {
				save();
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				break;
			}
		}
	}
}
