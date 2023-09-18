package ch15.sec05.exam03;

import java.util.TreeSet;

public class ComparableExmaple {

	public static void main(String[] args) {
		// Person클래스가 사용될 경우에는 Comparable<Person>를 구현해야 한다.(규칙)
		TreeSet<Person> treeSet = new TreeSet<Person>();
		
		treeSet.add(new Person("홍길동", 45));
		treeSet.add(new Person("손흥민", 31));
		treeSet.add(new Person("이순신", 55));
		
		for(Person person : treeSet) {
			System.out.println(person.name + ":" + person.age);
		}

	}

}
