package ch05.sec04;

public class RegerenceVarEx {
	public static void main(String[] args) {
		int[] arr1;
		int[] arr2;
		int[] arr3;
		
		arr1 = new int[] {1,2,3};
		arr2 = new int[] {1,2,3};
		arr3 = arr2;
		
		// 참조 타입으로 변수에 주소를 저장
		System.out.println(arr1 == arr2);
		System.out.println(arr2 == arr3);
	}
}
