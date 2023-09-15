package ch15.sec01.exam01;

import java.util.ArrayList;

/*
 컬렉션 : 기억장소. 객체를 저장하는 목적. 길이 고정되지 않음. 추가 가능.
	- 컬렉션 특징
		-> 컬렉션 기능을 제공하는 클래스를 통하여, 객체를 생성했을 때 힙영역에 기본 크기의 기억장소가 생성
		-> 데이터가 추가할 때마다, 기억장소가 자동으로 생성되어 데이터를 저장하는 특징.


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
		// 컬렉션 형태의 구조를 갖지고 있는 기억장소는 내부적으로 데이터를 Object 클래스로 관리한다.
		ArrayList al2 = new ArrayList(); 

		// 제네릭 클래스를 사용할 경우에는 참조타입만 가능. ArrayList<참조타입> al3 = new ArrayList<참조타입>();
		ArrayList<String> al3 = new ArrayList<String>();
		al3.add("홍길동");
		al3.add("손흥민");
		
		ArrayList<Car> al4 = new ArrayList<Car>();
		al4.add(new Car());

		ArrayList<Person> al5 = new ArrayList<Person>();
		al5.add(new Person());
		
//		ArrayList<Car> al2 = new ArrayList<Car>();
//		al2.add(new Car());

//		al2.add(10); // 에러

		
	}

}

class Car {

}

class Person {

}
