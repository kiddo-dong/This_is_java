package ch12.sec03.exam03;

public class ToStringEx {
	public static void main(String[] args) {
		
		SmartPhone myphone = new SmartPhone("삼전","안드로이드");
		
		String strObj = myphone.toString();
		
		System.out.println(myphone);
		System.out.println(strObj);
	}
}
