package ch12.sec05;

import java.util.StringTokenizer;

public class StringTokenizerEx {
	public static void main(String[] args) {
		String data1 = "token1&token2,token3";
		String data2 = "token1,token2,token3";
		
		String[] arr = data1.split("&|,");
		
		for(String token : arr) {
			System.out.println(token);
		}
		System.out.println();
		
		// StringTokenizer
		StringTokenizer st = new StringTokenizer(data2,",");
		
		// StringTokenizer
		while(st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println(token);
		}
	}
}
