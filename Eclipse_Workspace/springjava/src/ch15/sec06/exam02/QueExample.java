package ch15.sec06.exam02;

import java.util.LinkedList;
import java.util.Queue;

public class QueExample {

	public static void main(String[] args) {
		// 큐 : FIFO 선입선출
		Queue<Message> messagesQueue = new LinkedList<Message>();
		
		// 메시지 넣기
		messagesQueue.offer(new Message("sendMail", "홍길동"));
		messagesQueue.offer(new Message("sendSMS", "손흥민"));
		messagesQueue.offer(new Message("sendKakaotalk", "이강인"));

		while(! messagesQueue.isEmpty()) {
			Message message = messagesQueue.poll();
			switch(message.command) {
				case "sendMail":
					System.out.println(message.to + "님에게 메일을 보냅니다.");
					break;
				case "sendSMS":
					System.out.println(message.to + "님에게 SMS를 보냅니다.");
					break;
				case "sendKakaotalk":
					System.out.println(message.to + "님에게 카카오톡을 보냅니다.");
					break;
			}
		}
	}

}
