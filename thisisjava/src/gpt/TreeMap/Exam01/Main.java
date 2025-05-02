package gpt.TreeMap.Exam01;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		TreeMap<String, String> dict = new TreeMap<>();
		
		System.out.println("입력 : ");
		for(int i=0;i<5;i++) {
			String eng = scanner.next();
			System.out.print(" - ");
			String kr = scanner.next();
			System.out.println();
			dict.put(eng, kr);
		}
		
		System.out.println(dict.entrySet());
		
	}
}
