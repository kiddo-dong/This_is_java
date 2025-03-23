package ch12.sec12;

import java.lang.reflect.Method;

public class PrintAnnotationExample {
	public static void main(String[] args) throws Exception{
		// Service 클래스 메소드 리플렉션
		Method[] declaredMethods =  Service.class.getDeclaredMethods();
		
		for(Method M : declaredMethods) {
			PrintAnnotation PA = M.getAnnotation(PrintAnnotation.class);
		
		}
	}
	
	public static void printLine(PrintAnnotation printAnnotation) {
		if(printAnnotation != null) {
			int num = printAnnotation.number();
			for(int i = 0; i<num;i++) {
				String value = printAnnotation.value();
				System.out.println(value);
			}
			System.out.println();
		}
	}
}
