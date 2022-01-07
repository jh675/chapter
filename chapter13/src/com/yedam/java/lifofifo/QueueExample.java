package com.yedam.java.lifofifo;

import java.util.*;

public class QueueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Message> msgQ = new LinkedList<Message>();
		
		msgQ.offer(new Message("sendMail", "김진환"));//Queue의 offer는 Stack의 push와 같은 역할을 한다.
		msgQ.offer(new Message("sendSMS", "백진석"));
		msgQ.offer(new Message("sendKakao", "조형석"));
	
		while(!msgQ.isEmpty()) {
			Message msg = msgQ.poll(); //Queue의 poll은 Stack의 pop과 같은 역할을 한다.
			switch(msg.command) {
			case "sendMail":
				System.out.println(msg.to + "님에게 메일을 보냈습니다");
				break;
			case "sendSMS":
				System.out.println(msg.to + "님에게 SMS을 보냈습니다");
				break;
			case "sendKakao":
				System.out.println(msg.to + "님에게 카카오톡을 보냈습니다");
				break;
			}
		}
	}

}
