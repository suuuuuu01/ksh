package com.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

// 공통주소를 만드는 예제
// 여러 개의 URL매핑주소를 생성하여, 하나의 메소드를 공유할 수 있다.
// 여러 개의 요청방식(GET, POST)을 이용하여, 하나의 메소드를 공유

@RequestMapping("/sample/*") // 매핑주소의 공통주소 // 이걸로 인해 매핑주소의 /sample/부분을 뺀다. // sample폴더를 views 파일에 생성
@Controller
public class SampleController {
	
	private static final Logger logger = LoggerFactory.getLogger(SampleController.class);
	
	// 메소드의 리턴타입이 void일 경우에는, 매핑 URL이 jsp파일명이 된다.
	// /sample/doA
	@GetMapping("doA") 
	public void doA() {
		logger.info("called doA...");
	}
	
	// /sample/doB
	@GetMapping("doB")
	public void doB() {
		logger.info("called doB...");
	}
	
	// /sample/doC
	@GetMapping("doC")
	public void doC() {
		logger.info("called doC...");
	}
	
	// @GetMapping과 동일.
	@RequestMapping(value = "doD", method = RequestMethod.GET)
	public void doD() {
		logger.info("called doD...");
	}
	
	// /sample/doE or /sample/doF
	@RequestMapping(value = {"doE", "doF"}, method = RequestMethod.GET)
	public void basic() {
		logger.info("called basic...");
	}
	
	// 클라이언트 요청 Get, Post 방식 2가지를 테스트하기 위한 목적
	@GetMapping("basic") // /sample/basic
	public void basicForm() {
		logger.info("called basicForm...");
	}
	
	// 클라이언트 요청 Get, Post 방식 2가지를 허용하는 설정
	@RequestMapping(value = "basicPro", method = {RequestMethod.GET, RequestMethod.POST})
	public void doGetPost() {
		logger.info("called doGetPost...");
	}
}





