package ch15.sec02.exam01;

import java.util.List;
import java.util.ArrayList;

public class ArrayListExample {
	public static void main(String[] args) {
		// list object
		List<Board> list = new ArrayList<>();
		
		for (int i=1;i<6;i++) {
		    list.add(new Board("제목"+i, "내용"+i, "이름"+i));
		}
		
		
		int size = list.size();
		System.out.println("총 객체 수 : " + size);
		System.out.println();
		
		Board board = list.get(2);
		System.out.println(board.getsubject() + " " + board.getcontent() + " " + board.getwriter());
		System.out.println();
		
		for(int i=0;i<list.size();i++) {
			Board idx = list.get(i);
			System.out.println(idx.getsubject() + " " + idx.getcontent() + " " + idx.getwriter());
		}
		System.out.println();
		
		list.remove(2);
		list.remove(2);
		
		for(Board b : list) {
			System.out.println(b.getsubject() + " " + b.getcontent() + " " + b.getwriter());
		}
	}
}
