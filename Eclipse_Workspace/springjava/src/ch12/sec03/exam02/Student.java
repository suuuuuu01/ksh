package ch12.sec03.exam02;

public class Student /* extends Object */ {

	private int no;
	private String name;
	
	public Student(int no, String name) {
		this.no =  no;
		this.name = name;
	}
	
	public int getNo() { return no; }
	public String getName() { return name; } // 실제 개발은 소스 탭 getter, setter 사용

	// 재정의하는 목적은 객체의 동등비교
	@Override
	public int hashCode() {
		int hashCode = no + name.hashCode();
//		System.out.println("hashCode() 호출");
		return hashCode;
	}

	@Override
	public boolean equals(Object obj) {
//		System.out.println("equals() 호출");
		if(obj instanceof Student) {
			Student target = (Student) obj;
			if(no == target.getNo() && name.equals(target.getName())) {
				return true;
			}
		}
		return false;
	}
	
}
