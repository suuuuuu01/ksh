package ch18.sec02.exam02;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteExample {

	public static void main(String[] args) {
		
		try {
			OutputStream os = new FileOutputStream("C:/dev/temp/test2.db"); // 파일 생성.
		
			// 데이터
			byte[] array = {10, 20, 30}; // 3바이트
			
			// 버퍼(빨대) 내용 채우기
			os.write(array);
			
			// 버퍼(빨대 안)의 내용을 사용하기 - test2.db
			os.flush();
			
			// 스트림객체 닫기(빨대 제거)
			os.close();
		
		} catch (IOException e) {
		
			e.printStackTrace();
		}

	}

}
