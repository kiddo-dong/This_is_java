package ch02.sec06;

public class StringEx {
	public static void main(String[] args) {
		// String을 이용한 문자열 출력
		String name = "최동현";
		String job = "백수";
		System.out.println(name);
		System.out.println(job);
		
		String str = "나는\"자바\"를 배워용~"; // \"를 사용해 큰따음표 포함 
		System.out.println(str);
		
		str = "번호\t이름\t직업"; // \t 탭 네칸 띄우기
		System.out.println(str);
		
		System.out.print("나는\n"); // \n 엔터 문장 줄바꿈 
		System.out.print("자바를\n");
		System.out.print("베워용~");
	}
}
