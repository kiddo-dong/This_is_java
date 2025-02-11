package ch06.sec14;

public class Car {
	private int speed;
	private boolean stop;
	
	public int getSpeed() {
		return this.speed;
	}
	
	public void setSpeed(int speed) {
		// 매개 값 비교
		if(speed < 0) {
			// 필드 speed
			// true 시
			this.speed = 0;
			// 매개 값 speed가 속도가 음수가 될 수 없으므로 필드 speed는 0으로 초기화
		}
		else {
			//필드 spped
			//매개 값 speed가 양수일경우 필드의 speed에 대입
			this.speed = speed;
		}
	}// 리턴 값 없음
	
	public boolean isStop() {
		return stop;
	}
	
	public void setStop(boolean stop) {
		this.stop = stop;
		if(stop == true) this.speed = 0;
	}
	
}
