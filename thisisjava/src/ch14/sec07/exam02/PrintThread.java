package ch14.sec07.exam02;

public class PrintThread extends Thread{
	@Override
	public void run() {
		try{
			while(true) {
				System.out.println("실행 중");
				Thread.sleep(1000);
			}
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("리소스 정리");
		System.out.println("실행 종료");
	}
}
