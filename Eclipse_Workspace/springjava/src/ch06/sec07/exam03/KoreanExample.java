package ch06.sec07.exam03;

public class KoreanExample {

	public static void main(String[] args) {
		Korean k1 = new Korean("대한민국", "홍길동", "123456-1234567");
		
		// 연예계 입문
//		k1.name = "GD";
		
		System.out.println("k1.nation: " + k1.nation);
		System.out.println("k1.nation: " + k1.name);
		System.out.println("k1.nation: " + k1.ssn);
		
		Korean k2 = new Korean("손흥민", "654321-7654321");
		
		System.out.println("k2.nation: " + k2.nation);
		System.out.println("k2.nation: " + k2.name);
		System.out.println("k2.nation: " + k2.ssn);
	}

}
