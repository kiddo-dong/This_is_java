package ch05.sec06.arrayGpt;

import java.util.Arrays;

public class ArrayReverse {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        
        Arrays.sort(numbers);
        System.out.print("배열 역순 :");
        
        for(int i=numbers.length-1; i>=0; i--) {
        	System.out.print(" "+numbers[i]);
        }
    }
}
