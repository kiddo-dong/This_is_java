package ch15.sec04.exam02;

import java.util.*;

import ch14.quiz.exam06.ThreadB;

public class HashTableExample {
	public static void main(String[] args) {
		Map<String, Integer> map = new Hashtable<>();
		
		Thread threadA = new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i=1;i<=1000;i++) {
					map.put(String.valueOf(i), i);
				}
			}
		});
		
		Thread threadB = new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i=1001;i<=2000;i++) {
					map.put(String.valueOf(i), i);
				}
			}
		});
		
		threadA.start();
		threadB.start();
		
		try {
			threadA.join();
			threadB.join();
		} catch(Exception e) {
		
		}

		int size = map.size();
		System.out.println("Entry size : " + size);
	}
}
