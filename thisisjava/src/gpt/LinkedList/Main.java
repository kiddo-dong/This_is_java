package gpt.LinkedList;

import java.util.*;

public class Main {
	public void deleteNode(ListNode nodeToDelete) {
		
	}

	
	public static void main(String[] args) {
		List<ListNode> list1 = new LinkedList<>();
		list1.add(new ListNode("A"));
		list1.add(new ListNode("B"));
		list1.add(new ListNode("C"));
		list1.add(new ListNode("D"));
		list1.add(new ListNode("E"));
		
		list1.remove(2);
		
		for(ListNode node : list1) {
			System.out.print(node.val + "->");
		}
	}
}
