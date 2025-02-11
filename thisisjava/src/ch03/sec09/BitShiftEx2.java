package ch03.sec09;

public class BitShiftEx2 {
	public static void main() {
		int value = 772;
		
		byte byte1 = (byte)(value>>>24);
		int int1 = byte1 & 255;
		System.out.println(int1);
	}
}
