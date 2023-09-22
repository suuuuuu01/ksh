package ch18.sec03.exam03;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream; // Ctrl + Shift + O : 필요없는 import 삭제

public class CopyExample {

	public static void main(String[] args) throws Exception {
		// 파일 복사 예제
		
		String originalFileName = "c:dev/temp/test.jpg"; // 이미지는 경로에 존재를 해야 함.
		String targetFileName = "c:dev/temp/test2.jpg";
		
		// 입력스트림은 test.jpg 파일을 읽는 목적
		InputStream is = new FileInputStream(originalFileName); // 18, 19블럭 설정 후 surround with - try / catch block 방법 존재
		OutputStream os = new FileOutputStream(targetFileName); // 파일생성

		byte[] data = new byte[1024];
		
		// 입력스트림 작업 : test.jpg 파일의 내용을 읽어서, 출력스트림 내부에 쓰기작업.
		while(true) {
			int num = is.read(data); // num : 읽어온 실제 바이트 수 
			if(num == -1) break;
			os.write(data, 0, num); // 출력스트림 내부에 작업.
		}
		
		os.flush(); // 출력스트림에 있던 내용을 사본파일(test2.jpg)에 쓰기. 스트림 안(내용)은 비워진다.
		os.close();
		is.close(); // 객체 생성의 역순으로 닫아주기 is - os - os.close() - is.close()
		
		System.out.println("복사 성공");
		
	}

}
