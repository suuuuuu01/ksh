package ch19.sec03.exam01;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

// 클라이언트 통신프로그램(TCP기반)
// 연결 : Socket
public class ClientExample {

	public static void main(String[] args) {
		try {
			Socket socket = new Socket("192.168.0.49", 50001);
		
			System.out.println("[클라이언트] 연결 성공");
			
			//  입출력스트림 작업 : 채팅
			
			// Socket 닫기
			socket.close();
			System.out.println("[클라이언트] 연결 끊음.");
			
		} catch (UnknownHostException e) {
			// IP 표기 방법이 잘못되었을 경우
			e.printStackTrace();
		} catch (IOException e) {
			// 해당포트 서버에 연결할 수 없는 경우
			e.printStackTrace();
		} // 객체가 생성되면, 서버와의 연결이 됨을 의미.
		

	}

}
