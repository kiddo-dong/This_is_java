package ch05.sec09;

public class ArrayCopyByForEx {
	public static void main(String[] args) {
		int[] oldIntArr = {1,2,3};
		
		int[] newIntArr = new int[5];
		
		int idx=0;
		for(int i : oldIntArr) {
			newIntArr[idx++] = i;
		}

		for(int i=0;i<newIntArr.length;i++) {
			System.out.println(newIntArr[i]);
		}
	}
}