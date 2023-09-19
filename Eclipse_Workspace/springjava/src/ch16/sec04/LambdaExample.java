package ch16.sec04;

public class LambdaExample {

	public static void main(String[] args) {
		Person person = new Person();
		
		// 실행문이 2개  이상일 경우
		person.action((x, y) -> {
			double result = x + y;
			return result;
		});

		// 리턴문이 1개 있을 경우
//		person.action((x, y) -> {
//			return x + y;
//		});
		// 같은 의미 15 = 19번 라인
		person.action((x,y) -> (x + y));

		person.action((x,y) -> sum(x,y));
	}

	public static double sum(double x, double y) {
		return (x + y); // 21 = 25번 라인
	}
}
