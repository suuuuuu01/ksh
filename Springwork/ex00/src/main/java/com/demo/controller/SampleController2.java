package com.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

// 매핑주소에 쿼리스트링을 메소드에서 파라미터로 참조.

@Controller // 이 클래스를 mapping 주소로 호출해 사용하려면 @Controller 사용
public class SampleController2 {
	
	private static final Logger logger = LoggerFactory.getLogger(SampleController2.class);
	
//	http://localhost:9090/doD?id=doccomsa&age=100 정상작동
//	http://localhost:9090/doD
	/*
	String id 참조타입은 null로 처리가 된다. 
	그러나 기본데이터타입(primitive type)은 반드시 값을 제공해야 한다.

	쿼리스트링에 의한 값이 파라미터로 전달하고, 그 값을 jsp에서 사용할 경우
	@ModelAttribute("jsp에서 참조할 이름")
	 */

	@GetMapping("doD")
	public String doD(@ModelAttribute("id") String id, @ModelAttribute("age") int age) { // 13번 라인의 id, age
		
		logger.info("아이디: " + id);
		logger.info("나이: " + age);
		
		return "result"; // result.jsp // 톰캣서버 재시작 시 스프링 읽어들임.
	}
	
//	int age -> Integer age 변경 시, age 파라미터 값을 제공하지 않으면, null로 처리되어 에러발생되지 않음.
//	http://localhost:9090/doE?id=doccomsa&age=100 정상작동. 파라미터가 null로 처리.
//	http://localhost:9090/doE
	@GetMapping("doE")
	public String doE(String id, Integer age) {

		logger.info("아이디: " + id);
		logger.info("나이: " + age);
		
		return "doE"; // doE.jsp
	}
}









