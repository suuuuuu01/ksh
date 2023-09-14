package ch15.sec01.exam01;

import java.util.ArrayList;

/*
 컬렉션 : 기억장소. 객체를 저장하는 목적. 길이 고정되지 않음. 추가 가능.

 	- cf) 배열 -> 동일한 데이터타입으로 연속적인 형태의 기억장소를 하나의 이름으로 관리.
 			  -> 길이가 고정되어 있어, 길이 변경 불가능.
			ex) int[] arr = new int[5]; 		
				arr.length;
				arr.length = 10; // 에러발생.

	  
 제네릭 : 
 */
public class GenericCollectionBasic {

	public static void main(String[] args) {
		// 컬렉션 기능을 제공하는 클래스 ArrayList
		
		// 제네릭을 이용하지 않는 컬렉션 클래스 사용
		ArrayList al =  new ArrayList();
		al.add(10);
		al.add(10.5);
		al.add(true);
		al.add("홍길동");
		
		al.add(new Car());
		al.add(new Person());
		
		// 제네릭을 이용한 컬렉션 클래스 사용		
		ArrayList<Car> al2 = new ArrayList<Car>();
		al2.add(new Car());
//		al2.add(10); // 에러


	}

}

class Car {

}

class Person {

}
