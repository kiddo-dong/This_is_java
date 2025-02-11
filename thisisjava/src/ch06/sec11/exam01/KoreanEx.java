package ch06.sec11.exam01;

public class KoreanEx {
	public static void main(String[] args) {
		// Korean 객체 K1 생성 및 초기화
		Korean k1 = new Korean("123456-1234567", "최동현");
		
		System.out.println(k1.nation);
		System.out.println(k1.ssn);
		System.out.println(k1.name);
		
		// fainal field 이므로 에러남
		//k1.nation = "USA";
		//k1.ssn = "123453-7654321";
	
		k1.name = "최최최";
		System.out.println(k1.name);
	}
}