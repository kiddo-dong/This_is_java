package gpt.HashSet.Exam01;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		String[] fruits = {"apple", "banana", "apple", "orange", "banana", "melon"};
		
		Set<String> setFruits = new HashSet<>();
		// 배열 객체 리스트에 추가
		for(String fruit : fruits) {
			setFruits.add(fruit);
		}
		for(String fruit : setFruits) {
			System.out.println(fruit);
		}
	}
}
