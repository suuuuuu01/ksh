
package ch15.sec03.exam02;

import java.util.HashSet;
import java.util.Set;

public interface HashSetExample {

	public static void main(String[] args) {
		Set<Member> set = new HashSet<Member>();
		
		set.add(new Member("홍길동", 30));
		set.add(new Member("홍길동", 30));
		
		// Member클래스를 hashCode()와 equals()메소드를 재정의하여, 동일한 객체중복이 저장되지 않게 한다.
		System.out.println("총 객체 수: " + set.size()); // 2 -> 1
	}
}
