package ch18.sec02.exam03;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteExample {

	public static void main(String[] args) {
		
		try {
			OutputStream os =  new FileOutputStream("C:/dev/temp/test3.db");
			
			byte[] array = {10, 20, 30, 40, 50};
			
			os.write(array, 1, 3); // array배열에서 1번 인덱스 위치에서 3개를 읽어와서 스트림의 버퍼에 채운다 // 20, 30, 40
			
			os.flush();
			
			os.close();
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}

	}

}
