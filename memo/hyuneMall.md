global

프로그램 설치 시에도 rollback, commit 존재

node.js 공식 사이트 (다운로드)
https://nodejs.org/en

port 
    오라클 : 1521
    mySQL : 3306

관리자
    오라클 : sys/system
    mySQL : root

클라이언트 -> 데이터베이스 서버
workbench -> my-sql
sql developer -> oracle
DBeaver -> my-sql, oracle (공통)

https://velog.io/@remon/%EA%B0%9C%EB%B0%9C-%EA%B8%B0%EB%B3%B8-%EC%A7%80%EC%8B%9D-Node.js%EB%9E%80
Node.js는 JavaScript 실행 환경(=런타임)

node.js express
https://despiteallthat.tistory.com/139 

https://namu.wiki/w/npm

npm(Node Package Manager) : node.js와 함께 설치된다.
    Node.js의 패키지를 관리할 수 있는 도구
    Node.js 기반에서 자바스크립트 개발자들이 만든 라이브러리 저장소

    NPM 명령어 제공(utility)

@PathVariable 사용법 https://byul91oh.tistory.com/435



<hyunemall>
DB에서 관리자
카테고리
상품테이블



sevlet-context.xml 삽입

<!-- 파일 업로드 설정 -->
	<!-- CommonsMultipartResolver multipartResolver = new CommonsMultipartResolver() -->
	<beans:bean id="multipartResolver" class="org.springframework.web.multipart.commons.CommonsMultipartResolver">
		<beans:property name="defaultEncoding" value="utf-8"></beans:property>
		<!-- 1024 * 1024 * 10 byte = 100mb -->
		<beans:property name="maxUploadSize" value="104857560"></beans:property>
		<!-- 1024 * 1024 * 2 = 20mb -->
		<beans:property name="maxUploadSizePerFile" value="2097152"></beans:property>
		<!-- 업로드시 서버의 임시폴더경로 -->
		<beans:property name="uploadTempDir" value="file:/C:/dev/devTools/upload/temp"></beans:property>
		<!--  업로드시 서버메모리 사용크기설정 -->		
		<beans:property name="maxInMemorySize" value="10485756"></beans:property>
	</beans:bean>
	
	<!-- 메인,썸네일 이미지 업로드 폴더경로 설정   String uploadPath = new String("C:\\dev\\upload\\product\\")-->
	<beans:bean id="uploadPath" class="java.lang.String">
		<beans:constructor-arg value="C:\\dev\\upload\\product\\"></beans:constructor-arg>
	</beans:bean>
	
	<!-- CKEditor에서 업로드되는 폴더경로 설정 -->
	<beans:bean id="uploadCKPath" class="java.lang.String">
		<beans:constructor-arg value="C:\\dev\\upload\\ckeditor\\"></beans:constructor-arg>
	</beans:bean>



model명과 jsp(화면에 뿌리는 역할)에 쓰이는 이름이 같아야 동작.

AdProductController 
GlobalControllerAdvice(1차카테고리작업)
views/comm/category_menu.js(메인페이지 1차카테고리를 뿌려주는 작업)
