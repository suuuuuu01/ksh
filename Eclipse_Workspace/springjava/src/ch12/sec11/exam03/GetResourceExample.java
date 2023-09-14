package ch12.sec11.exam03;

// 리플렉션을 통한 해당위치에 존재하는 관련 리소스 참조하기.
public class GetResourceExample {

	public static void main(String[] args) {
		Class clazz = Car.class;
		
		String photo1Path = clazz.getResource("photo1.jpg").getPath();
		String photo2Path = clazz.getResource("photo2.jpg").getPath();

		System.out.println(photo1Path);
		System.out.println(photo2Path);
		
		
		
	}

}
