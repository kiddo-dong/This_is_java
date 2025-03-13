package ch11.sec04;

//AutoCloseable - try() 의 리소스 객체를 사용하려면 AutoCloseable
public class MyResource implements AutoCloseable{
	String name;
	
	// 생성자
	// try 호출 시 실행
	public MyResource(String name) {
		this.name = name;
		System.out.println("[" + name + "] 생성자 호출 및 열기");
	}
	
	// 메소드1
	public String read1() {
		System.out.println("[" + name + "] 읽기");
		return "100";
	}
	
	//메소드2
	public String read2() {
		System.out.println("[" + name + "] 읽기");
		return "abc";
	}
	
	// AutoCloseable 의 close() 추상 메소드 오버라이딩
	// try 및 catch 블록 수행 후 실행됨
	@Override
	public void close() throws Exception {
		System.out.println("[" + name +"] 닫기");
	}

}
