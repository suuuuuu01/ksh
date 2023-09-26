package ch19.sec03.exam02;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

// 클라이언트 통신프로그램(TCP기반)
// 연결 : Socket
public class EchoClient {

	public static void main(String[] args) {
		try {
			Socket socket = new Socket("192.168.0.49", 50001);
		
			System.out.println("[클라이언트] 연결 성공");
			
			//  입출력스트림 작업 : 채팅
			// 데이터보내기
			String sendMessage = "[강수현] : 추석 연휴 즐겁게.";
			OutputStream os = socket.getOutputStream();
			// String -> byte 변환
			byte[] bytes = sendMessage.getBytes("UTF-8");
			os.write(bytes);
			os.flush();
			System.out.println("서버로부터 받은 내용: " + sendMessage);
			
			
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
