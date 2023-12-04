aㅁHandlebar : 자바스크립트 템플릿 엔진 -> 서버에서 보내온 JSON 형태의 데이터를 사용하여 작업할 때 편하게 작업 가능.
핸들바 공식사이트
https://handlebarsjs.com/


str += `<button type="button" class="btn btn-info" data-rew_num="${rew_num}">Info</button>`; 
"${rew_num}" EL문법으로 먼저 해석되어 값이 들어가지 않는다. jsp연결문자열로 변경해준다. 백틱`` -> 작은따옴표'' + 
'<button type="button" class="btn btn-info" data-rew_num="' + rew_num + '">Info</button>'; 변경 후


정적
동적(프로그램 상 추가)

웹 요청방식 
    - get:select문, 
    - post:insert,update,delete문 / 
    수정 시 - put/petch:update, 
            - delete:delete
REST API 개발방법론. 
    - CRUD(Create Read Update Delete)

cf) spring legacy project -> spring mvc project - view : jsp 기본제공 -> 설정파일 : servlet-context.xml, root-context.xml
    sprintg starter project -> spring boot project - view : thymeleaf 기본권장. jsp권장 X. 설정작업을 통해 사용가능 
                                                        : 설정파일 :  jsp기본권장
bean 설정 : Java Class 파일로 Bean 작업.
application.properties

pom.xml 기본 내장 파일이름 sprign boot starter ~
DemomallApplication : 프로젝트명__Application : 메인파일 

<docmall 최종정리>
spring MVC project : pom.xml, web.xml 버전을 동일하게 한다. 

web.xml 내 DispatcherServlet객체 : Front Controller역할 (모든 controller를 주도한다) , 매핑주소를 담당하는 제어로 넘겨줌. (중요!!!!!!!!)
https://velog.io/@betterfuture4/Spring-Dispatcher-Servlet-%EC%A0%95%EB%A6%AC
https://zzang9ha.tistory.com/441

email-config.xml, root-context, servlet-context.xml

패키지구조 = mapper.xml 폴더구조

CATEGORY_TBL(카테고리 테이블)    
    - CG_CODE컬럼 : 1차, 2차, 3차 모든 카테고리 코드가 저장.
    - CG_PARENT_CODE컬럼(NULL 허용) : CG_CODE컬럼에 삽입된 코드의 부모카테고리 코드가 저장.(데이터베이스 데이터에 특수문자 에러나면 & 사용하기)
    - CG_NAME컬럼 : 카테고리 이름
---> CategoryVO 생성

VO, DTO 등등의 클래스는 Controller, Service, Mapper 패키지의 클래스 또는 인터페이스에서 사용이 되기 때문에 먼저 생성을 해두어야 작업이 편해짐.

ADMIN_TBL(관리자 카테고리 관리) - 등록, 수정, 삭제 작업. - 사용유무컬럼. Y, N

상품테이블 : primary key컬럼을 설정 시 제약조건이름을 수동으로 생성해야 한다.
            이유? primary key제약조건이름이 인덱스명으로 생성이 되어, 인덱스를 페이징쿼리의 오라클 인덱스힌트 명령어로 사용해야 하기 때문.

ctrl + 객체 : open declaration 추상메소드
GlobalContollerAdvice 내에 firstCategoryList를 pro_insert, 
HomeController의 "/"루트주소를 index.jsp

CKEditor 설정
adProductController
server.xml

jsp로 데이터를 뿌릴 때만 model 사용, ajax로 호출 시 사용 X

jstl c:~
    pro_list : <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    pom.xml :
            <dependency>
                        <groupId>javax.servlet</groupId>
                        <artifactId>jstl</artifactId>
                        <version>1.2</version>
                    </dependency>

<img alt="" src="detail?pageNum=29&amount=2&type=&keyword>상품이미지</a>

<form id="actionForm> // actionForm 사용
    <input type="hidden" name="pageNum" value="29">
</form>

jsp에서 정보(Model)을 이용하여 출력 시 
    1)메소드의 파라미터가 가지고 있는 값을 jsp에서 사용 시 : @ModelAttribute("cri");
    2)메소드에 의하여 진행되는 jsp에서 정보를 호출할 때 Model객체 사용

테이블 간의 참조(Foreign key) 작업 시 확인사항
    - Foreign key 생성 X or 제거
    - Foreign key 생성을 하면서 조건을 단다.

    - 부모테이블(1)과 자식테이블(N) 참조키 설정이 되어(데이터) 있으면, 기본으로 부모테이블은 삭제에러발생
        참조키가 설정되어 있는 상태에서 부모테이블 삭제 시 null 설정

제약조건 잠시 비활성화 https://deftkang.tistory.com/145














<spring boot>
https://start.spring.io - 이 사이트에서 라이브러리 받아옴.![Alt text](image.png)  -  ![Alt text](image-1.png) 
src 내 jsp 기본지원 X  
new - spring starter project - 
    packaging(배포파일 제작) : jar외장톰캣서버 등록 작업 X(스프링부트 프로젝트 내 내장톰캣 존재, jsp실행) / 
        war(톰캣서버 내 스프링 프로젝트)

최신 버전 : spring regacy project 지원 X

application.properties파일 :
src - main - 내 파일 수동생성 (WEB-INF - views) views 내 3,4 8,9(계정, 비번), 15 (mybatis 위치 설정)
server port = 3000
file.dir = C:\\dev\\upload\\product\\

controller 파일 : 
{file}

email.properties 파일을 email.config 에서 @Configuration으로 참조

db작업까지 완료되었을 떄 실행 1)초록색 전원모양 클릭 - (re)start 2) run as - spring boot app

Jar : 내장톰캣O(자바환경에 배포 가능)
War : 톰캣이 있는 서버에 배포 가능

spring_workspace sts4 복사해 새로운 workspace 만들어 실행

help - about spring tool suite 4에서 버전 확인
STS4 - JDK 1.8 변경작업하기

초반 세팅) window - preferences - java - (사진 참고)

2) help - install new software / eclipse marketplace
eclipse marketplace에서 web install하면 preferences에서 web설정 나타난다.

new - spring starter project - 링크 복사해 접속 https://start.spring.io 여기서 만들어 import해 사용 가능

maven, java, 3.2.0, group 프로젝트이름, artifact, package name, jar, 17
만들고 같은 워크스페이스에 넣어 import

maven, gradle = 빌드 관리 소프트웨어 

프로젝트 우클릭 - run as - spring boot app으로 실행

초록색 전원 - 

스프링부트 bin 설정 - 자바 파일 만들어서 한다. 

spring root_context.xml / 스프링부트 application.properties - 비밀번호, 설정

비밀번호 암호화 작업 : 스프링 spring-security , web.xml에서 spring-security / 스프링부트 securityConfig.java

port 충돌 시 주소 변경 application.properties 내 server.port=9000

@component 어노테이션
https://programmingrecoding.tistory.com/13





<git> STS tool 형태 작업
팀장(PL)과 팀원(개발자)의 협업
    - 팀장 (doccomsa) MVC
        원격 repository(기본 브랜치 main) : 필수 README.md 파일 생성하기(동기화 이해) 생성 후 깃허브에 협업 프로젝트 공유 -> 로컬 레포지토리 커시
        개발컴퓨터에 플젝 생성 -> 로컬 레포지토리(기본 브랜치 master) 생성 -> 소스 올리기.
        1) Git Repositories
            spring100[master] : 로컬 레포지토리
                - Remotes
                    -origin
            로컬 레포지토리와 원격레포지토리 동기화(Sync)
            로컬에서 원격으로 push 작업을 하기 위해서는 원격의 내용을 로컬에 동일하게 가지고 있어야 한다.
            원격에서 pull(fetch + merge) 작업으로 로컬로 가져와 동기화를 해야 한다.
            origin - configure fetch - branch

            -> push작업
                Pull Request -> Merge 작업
                
                    main branch(default) + master내용이 머지merge
                    master

    - 팀원 spring boot
    팀장의 원격레포지토리를 공유 : Fork작업
    팀장의 원격레포지토리 생성.



new branch (ex : dev01)에 기본작업 후 작업 이어나감.
문제없으면 main branch에 merge

원격 레포지토리 내 (세 개의 공간 존재, 순서대로 업로드 가능)
소스작업(working directory) -add-> 스테이징 영역 -commit-> local repository -push-> 업로드


git repositories - orgin - 초록색 구름 우클릭 - configure fetch - source에서 스페이스바(branch나타남. 클릭) - next - finish - save and fetch
master(branch이름) 우클릭 - 

import - git - project from git(MVC)
             - project from git and 어쩌공(boot)