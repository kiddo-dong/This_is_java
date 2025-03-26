package ch12.sec11.exam02;

import java.lang.reflect.*;

public class ReflectionEx {
	public static void main(String[] args) {
		Class c = Car.class;
		
		System.out.println("생성자 정보");
		Constructor[] constructors = c.getDeclaredConstructors();
		for(Constructor constructor : constructors) {
			Class[] parameters = constructor.getParameterTypes();
			printParameters(parameters);
			System.out.println("");
		}
		System.out.println();
		
		System.out.println("필드 정보");
		Field[] fields = c.getDeclaredFields();
		for(Field field : fields) {
			System.out.println("");
		}
	}
	
	// private 메소드
	private static void printParameters(Class[] paraketers) {
	}
}
