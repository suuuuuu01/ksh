package ch15.sec02.exam03;

import java.util.ArrayList;
import java.util.List;

// LinkedList컬렉션 : 객체 추가, 삽입 시 ArrayList보다 성능이 좋다.
// ArrayList와 LinkedList컬렉션의 성능차이.
public class LikedListExample {

	public static void main(String[] args) {

		List<String> list1 = new ArrayList<String>();

		List<String> list2 = new ArrayList<String>();

		long startTime;
		long endTime;
		
		startTime = System.nanoTime();
		for(int i=0; i<10000; i++) {
			list1.add(0, String.valueOf(i)); // [0] : "0"
		}
		endTime = System.nanoTime();
		System.out.printf("%-17s %8d ns \n", "ArrayList 걸린시간 : ", (endTime - startTime));
		
		startTime = System.nanoTime();
		for(int i=0; i<10000; i++) {
			list2.add(0, String.valueOf(i)); // [0] : "0"
		}
		endTime = System.nanoTime();
		System.out.printf("%-17s %8d ns \n", "LinkedList 걸린시간 : ", (endTime - startTime));
		
		
	}

}
