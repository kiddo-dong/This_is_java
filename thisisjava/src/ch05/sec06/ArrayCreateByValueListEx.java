package ch05.sec06;

public class ArrayCreateByValueListEx {
	public static void main(String[] args) {
		// new 연산자로 배열 생성
		// 빈 배열을 미리생성 (향 후 값을 지정 할 목적)
		// 타입[] 변수명 = new 타입[길이];
		
		// 배열 변수 선언 및 배열 생성
		int[] arr1 = new int[3];
		
		//배열arr 각각의 항목의 초기값
		for(int i=0; i<arr1.length;i++) {
			System.out.println("arr1[" + i + "] = " + arr1[i]);
		// 모두 0으로 초기화 되어있음.
		}
		System.out.println("======================");
		
		//배열 arr의 각 항목 값 변경
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;
		
		for(int i=0; i<arr1.length; i++) {
			System.out.println("변경된 arr1["+i+"] = "+ arr1[i]);
		}
		System.out.println("");
		
		//배열 변수 선언 및 배열생성
		double[] arr2 = new double[3];
		System.out.println(arr2[1]);
		
		String[] arr3 = new String[3];
		System.out.println(arr3[1]);
		
	}
}
