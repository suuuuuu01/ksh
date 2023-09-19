package ch15.sec06.exam02;

// Que 자료구조에 사용할 클래스
public class Message {

	public String command;
	public String to;
	
	public Message(String command, String to) {
		this.command = command;
		this.to = to;
	}
}
