
package ch07.sec07.exam03;

public class ChildEx {
	public static void main(String[] args) {
		Par pa = new Child();
		
		pa.field1 = "data1";
		pa.method1();
		pa.method2();
		// pa는 pa에서 정의된 Child의 객체들만 참조
	
		Child chi = (Child) pa;
		
		chi.field1 = "data";
		chi.field2 = "data2";
		chi.method1();
		chi.method2();
		chi.method3();
	}
}
