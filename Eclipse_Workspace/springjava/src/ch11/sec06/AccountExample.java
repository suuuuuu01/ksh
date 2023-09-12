package ch11.sec06;

public class AccountExample  {
// public class AccountExample (extends Object가 생략됨 자동으로 임포트.{
// public class AccountExample (extends 클래스명 { 일 때는, 단상속이기 때문에 그 클래스 파일 내 (extends Object가 생략

	public static void main(String[] args) {
		Account account = new Account();
		
		// 예금하기
		account.deposit(10000);
		System.out.println("예금액: " + account.getBalance());

		// 출금하기
		try {
		account.withdraw(30000); // 예외 떠넘기기 가능이 포함.
		} catch (InsufficientException e ) {
			String message = e.getMessage(); // 잔고 부족: 20000 모자람.
			System.out.println(message);
		}
	}

}
