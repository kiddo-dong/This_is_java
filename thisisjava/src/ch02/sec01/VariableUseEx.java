package ch02.sec01;

public class VariableUseEx {
	public static void main(String[] args) {
		int hour = 3;
		int minute = 5;
	
		System.out.println(hour + "시간" + minute + "분");
		
		
		System.out.println("총 " + (hour*60+minute) + "분");
	}
}