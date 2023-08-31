CH6
객체 : 사람(명사), 자동차(동사) -> 변수(필드), 메소드
    EX) 쇼핑몰 프로젝트
        - 속성과 동작 : 1) 속성: 아이디, 비밀번호, 이름, 주소, 연락처, 직업, 취미분야
                        2) 동작: 회원가입, 회원수정, 회원삭제, 상품 장바구니, 상품 주문
        - 필드(변수)와 메소드
            필드(변수) - String useid; String passwd;
            메소드 - void join(){}, void modify(){} 

            <클래스 정의, 설계, 디자인>
            public class 회원 {
                속성: 아이디, 비밀번호, 이름, 주소, 연락처, 직업, 취미분야
                동작: 회원가입, 회원수정, 회원삭제, 상품 장바구니, 상품 주문
            }
            public class Member {
                String useid; 
                String passwd;

                void join(){}
                void modify(){}
                void login(){}
                void logout(){} 
            }
        회원: MEMBER, 상품: PRODUCT, 주문: ORDER

public class Emp {
    int empno;
    String ename;
    String job;
    int mgr;
    LocalDate hiredate;
    int sal;
    int comm;
    int deptno;
}

// 사월들이 회사에서 하는 업무기능
// 메소드 정의 

public class EmpBiz {
    // 사월들이 회사에서 하는 업무기능
    // 메소드 정의
}
