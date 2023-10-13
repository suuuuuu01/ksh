package com.demo.controller;

import static org.junit.Assert.*;

import java.sql.Connection;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

// root-context.xml파일의 DataSource를 테스트하는 예제.

// JUnit 도구를 이용하여, root-context.xml 파일의 내용을 읽어들이는 의미.
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"})

public class DataSourcesTest {

	private static final Logger logger = LoggerFactory.getLogger(JDBCTests.class);
	
	@Autowired // 의존성 주입(Dependency Injection: DI) Anotation // root-dontext.xml 27번 라인 "dataSource"을 대입시킴.
	private DataSource ds;
	
	@Test // test 시에 꼭 바꾸기
	public void testConnection() {
		long start = System.currentTimeMillis();
		//연결작업.  10000번을 테스트 할려고 했으나, 오라클데이타베이스 설정부분으로 인하여, 테스트 못함.
		// https://blog.naver.com/PostView.nhn?blogId=deersoul6662&logNo=221812017367 참고
		for(int i=0; i<1; i++) {
			// conn객체를 자동으로 close() 처리를 해준다.
			// AutoCloseable 상속받는 클래스만 사용가능.
			try(Connection conn = ds.getConnection()) { // ds.getConnection()는 root-context.xml의 21~24라인 참조
				
			}catch(Exception ex) {
				fail(ex.getMessage());
			}
		}
		long end = System.currentTimeMillis();
		
		logger.info("연결속도: " + (start-end));
	}

}
