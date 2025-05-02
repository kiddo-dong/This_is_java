package gpt.Queue.exam01;

import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class Main {
	public static void main(String[] args) {
		Scanner us_in = new Scanner(System.in);
		Queue<Integer> queue = new LinkedList<>();
		
		System.out.print("입력 : ");
		for(int i=0 ; i<5; i++) {
			int in = us_in.nextInt();
			queue.offer(in);
		}
		
		System.out.print("출력 : ");
		for(int i=0 ; i<5; i++) {
			System.out.print(queue.poll() + " ");
		}
		
	}
}
