데이터 타입
    - 기억장소를 생성하는 기능
    - 크기 : 1바이트, 4바이트 / 형태 : 정수형, 실수형, 논리형...etc
데이터타입 구분
    - 기본데이터타입(8개) : 스택영역에 기억장소 생성
        -> 정수 - byte, char, short, int long / 실수 - float, double / 논리 - boolean
    - 참조타입(4개) : 스택영역과 힙영역에 기억장소를 생성
        -> 배열, 열거형, 클래스, 인터페이스
    구분 : 기억장소에서 데이터를 관리하는 방식

자바코드(Hello.java) -> javac.exe(컴파일러) -> Hello.class(바이트코드) -> java.exe(실행)
 -> JVM(Java Virtual Machine) 구동 -> Hello.class를 기계어 변환
 -> JVM
    운영체제로부터 할당 메모리를 관리
    메서드 영역 : Hello.class 바이트코드를 읽어들인 정보
    스택 영역 : 기본데이터 타입 사용
    힙 영역 : 참조타입 사용

char vs String
 - char 기본데이터타입2바이트. 유니코드 0~65535
        : '홍' (올바른 문법)
          'ab' (잘못된 문법)
 - String 클래스 참조타입
        : "홍" 

자바 문자열은 불변
String name = "홍길동";
name = "홍길순";

문자열의 불변성 : 

