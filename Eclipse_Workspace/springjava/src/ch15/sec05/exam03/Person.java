package ch15.sec05.exam03;

// TreeSet컬렉션클래스에 사용하는 클래스
public class Person implements Comparable<Person> {

	public String name;
	public int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// treeSet.add(new Person("홍길동", 45)); 객체 추가 시 정렬작업에 아래 메소드가 작동.
	@Override
	public int compareTo(Person o) {
//		System.out.println("compareTo");
		if(age<o.age) return -1;
		else if(age == o.age) return 0;
		else return 1;
	}
}
