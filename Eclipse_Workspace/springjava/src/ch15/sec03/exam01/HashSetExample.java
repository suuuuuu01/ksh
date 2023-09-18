package ch15.sec03.exam01;

import java.util.HashSet;
import java.util.Set;

// Set인터페이스를 구현한 클래스 : 저장순서 유지되지 않음. 객체 중복저장 X
// ch12.sec03.exam02 패키지에서 HashsetExample.java 예제 cf
public class HashSetExample {

	public static void main(String[] args) {

//		HashSet<String> set = new HashSet<String>();
		Set<String> set = new HashSet<String>();
		
		// 객체저장. 중복검사가 진행된다.
		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("Java"); // 중복객체이므로 저장 X
		set.add("MyBatis");
		
		// 저장된 객체 수 출력
		int size = set.size();
		System.out.println("총 객체 수: " + size);
	}

}
