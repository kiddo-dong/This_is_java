package ch06.sec10.exam02;

public class Television {
	static String company = "MyCompany";
	static String model = "LCD";
	static String info;
	static String aaa;
	// 정적 인스턴스 필드 info
	
	// static block
	static {
		// info = "Mycompany" + "-" + "LCD"
		info = company + "-" + model;
		aaa = "오 이게 되네";
	}
}
