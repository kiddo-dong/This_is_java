package ch08.sec13;

public class SealedEx {
	// main메소드
	public static void main(String[] args) {
		// 구현 객체 생성
		ImpClass imc = new ImpClass();
		
		//구현 객체를 ia를 통해 사용
		InterfaceA ia = imc;
		ia.methodA();
		
		System.out.println();
		
		InterfaceB ib = imc;
		ib.methodA();
		ib.methodB();
	
		System.out.println();
		
		InterfaceC ic = imc;
		ic.methodA();
		ic.methodB();
		ic.methodC();
	}
}
