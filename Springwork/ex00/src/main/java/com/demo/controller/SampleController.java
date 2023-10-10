package com.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

//스프링의 기본동작
//매핑주소 요청 -> 메소드 호출 -> jsp 실행.

@Controller
public class SampleController {
	
	// 컨트롤러 기능을 갖는 클래스가 동작 시 로그 출력 목적.
	private static final Logger logger = LoggerFactory.getLogger(SampleController.class);
	
	
	@GetMapping("doA") // 매핑주소를 get방식으로 요청 시 사용하는 어노테이션 getmapping("매핑주소이름");
	public void doA() {
//		System.out.println("doA called..."); // 서버 부하 발생.
		logger.info("doA called...");
		
		// servlet-context.xml 파일 참조. "/WEB-INF/views/" + "doA" + ".jsp"
		// 매핑주소가 jsp파일명이 됨./JAVA Resources/src/main/webapp/WEB-INF/views/doA.jsp 파일이 실행됨. = 15라인"doA"매핑주소
	}
	
	@GetMapping("testB") // testB.jsp
	public void doB() {
		logger.info("doB called...");
	}
	
	// jsp파일명은 매핑주소가 아니라 리턴값이 된다. testC.jsp
	@GetMapping("doC")
	public String doC() {
		logger.info("doC called...");
		return "testC"; // testC.jsp 파일을 찾는다.
	}
}
