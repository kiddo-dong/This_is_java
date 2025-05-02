package ch15.sec06.exam02;

import java.util.*;

public class QueueExample {
	public static void main(String[] args) {
		Queue<Message> msg = new LinkedList<>();
		
		msg.offer(new Message("sendMail", "홍길동"));
		msg.offer(new Message("sendSMS", "신용권"));
		msg.offer(new Message("sendKaKaotalk", "김자바"));
		
		while(!msg.isEmpty()){
			Message message = msg.poll();
			System.out.println(message.command + " : " + message.to);
		}
		
	}
	
}
