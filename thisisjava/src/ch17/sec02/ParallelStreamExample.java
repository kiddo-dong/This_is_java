package ch17.sec02;

import java.util.*;
import java.util.stream.*;

public class ParallelStreamExample {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("홍길동");
		list.add("동길동");
		list.add("남길동");
		list.add("서길동");
		list.add("북길동");
	
		Stream<String> stream_list = list.parallelStream();
		stream_list.forEach(name -> {
			System.out.println(name + ": " + Thread.currentThread().getName());
		});
	}
}
