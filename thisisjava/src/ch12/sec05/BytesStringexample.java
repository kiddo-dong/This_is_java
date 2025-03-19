package ch12.sec05;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class BytesStringexample {
	public static void main(String[] args) {
		String data = "자바";
	
		byte[] arr1;
		try {
			// encoding
			arr1 = data.getBytes("euc-kr");
			System.out.println(arr1.length);
			System.out.println(Arrays.toString(arr1));
			
			// decoding
			String data2 = new String(arr1, "euc-kr");
			System.out.println(data2);
			
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		
		
		
	}
}
