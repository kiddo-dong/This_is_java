package ch14.sec08;

public class DaemonExample {
	public static void main(String[] args) {
		AutoSaveThread auto_save_thread = new AutoSaveThread();
		auto_save_thread.setDaemon(true); // 데몬 스레드 지정
		
		auto_save_thread.start();
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		System.out.println("메인 스레드 종료");
	}
}
