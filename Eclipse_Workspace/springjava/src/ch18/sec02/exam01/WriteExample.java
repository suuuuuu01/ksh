package ch18.sec02.exam01;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteExample {

	public static void main(String[] args) {
		// 파일에 출력작업하는 예제
		// 대상 : 파일, 작업방향 : 출력스트림, 데이터 : 바이트스트림
		
		try {
			// os : 파일출력스트림 객체(빨대)
//			FileOutputStream os = new FileOutputStream("C:/dev/temp/test1.db"); // 파일생성.
			OutputStream os = new FileOutputStream("C:/dev/temp/test1.db"); // 파일생성.
			
			// 데이터 
			byte a = 10;
			byte b = 20;
			byte c = 30;
			
			// 버퍼(빨대) 내부에 데이터 쓰는 작업
			os.write(a);
			os.write(b);
			os.write(c);
			
			os.flush(); // 버퍼(빨대)의 내용을 test1.db 파일에 쓰기작업
			os.close(); // 스트림객체를 닫기(빨대를 제거)			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // FileOutputStream os = new FileOutputStream("파일명포함경로");
		
	}
}
