package ch12.sec06;

import java.util.Random;
import java.lang.reflect.Array;
import java.util.Arrays;

public class RandomExample {
	public static void main(String[] args) {
		
		int[] select_num = new int[6];
		Random rand = new Random();
		System.out.print("선택번호 : ");
		
		for (int i=0; i<select_num.length;i++) {
			select_num[i] = rand.nextInt(45)+1;
			System.out.print(select_num[i] + " ");
		}
		System.out.println();
		
		int[] win_num = new int[6];
		rand = new Random();
		System.out.print("당첨번호 : ");
		
		for(int i=0;i<win_num.length;i++) {
			win_num[i] = rand.nextInt(45)+1;
			System.out.print(win_num[i] + " ");
		}
		System.out.println();
		
		boolean result = Arrays.equals(select_num, win_num);
		
		if(result) {
			System.out.println("당첨");
		} else {
			System.out.println("낙첨");
		}
	}
}
