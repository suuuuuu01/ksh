Handlebar : 자바스크립트 템플릿 엔진 -> 서버에서 보내온 JSON 형태의 데이터를 사용하여 작업할 때 편하게 작업 가능.
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


