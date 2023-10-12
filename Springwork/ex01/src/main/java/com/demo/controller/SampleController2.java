package com.demo.controller;

import java.util.ArrayList;
import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.demo.domain.BoardVO;
import com.demo.domain.MemberVO;
import com.demo.domain.SampleDTO;
import com.demo.domain.SampleDTOList;

// 클라이언트에서 전송해온 값을 스프링에서 참조

@Controller // URL매핑주소를 가지고 있는 클래스에 적용
@RequestMapping("/sample2/*") // 공통주소. sample2로 시작되는 모든 주소에 대하여 클래스가 요청을 담당
public class SampleController2 {
	
	private static final Logger logger = LoggerFactory.getLogger(SampleController2.class);
	
	
	// /sample2/basic
	@GetMapping("/basic")
	public String basic() {

		logger.info("called basic...");
		
		return "/sample2/basicForm"; // 리턴값이 jsp파일명.
	}

	// /sample2/basicPro
	@RequestMapping(value = "basicPro", method = {RequestMethod.GET, RequestMethod.POST})
	public String basicPro(SampleDTO dto) {
		
		logger.info("called basicPro..." + dto); // dto.ToString()이 작동
		
		return "/sample2/basicPro";
	}
	
	// /sample2/write
	@GetMapping("/write")
	public void write() {
		
		logger.info("called write...");
		
	}
	
	@PostMapping("write")
	public void write(BoardVO vo) {
		logger.info("called BoardVO...");
	}
	
	// /sample2/join 회원가입폼주소
	@GetMapping("/join") // <- join.jsp
	public void join() { // public String join() { return "/sample2/join"; } 절대경로 쓰기
		
	}
	
	// 회원가입폼에서 입력한 데이터를 받는 목적
	@PostMapping("/join")
	public void join(MemberVO vo) {
		logger.info("입력값" + vo);
	}
	
	// @RequestParam 어노테이션 사용
	// 클라이언트에서 동일한 파라미터명으로  데이터가 전송될 때 - 75, 82라인 두 가지 방법
	
	// http://localhost:9090/sample2/array?idx=10&idx=20&idx=30
	// 1)배열 사용
	@GetMapping("array") 
	public void list(@RequestParam("idx") String[] idx) {
		logger.info("idx: " + Arrays.toString(idx));
	}
	
	// http://localhost:9090/sample2/list?idx=10&idx=20&idx=30
	// 2)컬렉션 사용
	@GetMapping("list") // ArrayList<Integer>
	public void list(@RequestParam("idx") ArrayList<String> idx) {
		logger.info("idx: " + idx);
	}
	
	// http://localhost:9090/sample2/list2?userid=doccomsa&age=100
	@GetMapping("list2")
	public void list2(String userid, int age) {
		logger.info("userid: " + userid);
		logger.info("age: " + age);
	}
	
	// 클라이언트에서 전송에 사용하는 파라미터명과 스프링의 메소드 매개변수가 다를 경우 @RequestParam 사용
	// http://localhost:9090/sample2/list3?id=doccomsa&old=100
	@GetMapping("list3") 
	public void list3(@RequestParam("id") String userid, @RequestParam("old") int age) {
		logger.info("userid: " + userid);
		logger.info("age: " + age);
	}
	
	// 클라이언트에서 전송에 사용하는 파라미터명과 스프링의 메소드 매개변수가 동일한 경우 생략가능
	// http://localhost:9090/sample2/list4?userid=doccomsa&age=100
	@GetMapping("list4") 
	public void list4(@RequestParam String userid, @RequestParam int age) {
		logger.info("userid: " + userid);
		logger.info("age: " + age);
	}
	
	// http://localhost:9090/sample2/list5?userid=doccomsa&age=100 성공
	// http://localhost:9090/sample2/list5 에러 (@RequestParam 부재)
	// http://localhost:9090/sample2/list5?userid=doccomsa 성공
	@GetMapping("list5") 
	public void list5(@RequestParam(required = true) String userid, @RequestParam(required = false) Integer age) {
		logger.info("userid: " + userid);
		logger.info("age: " + age);
	}

	// http://localhost:9090/sample2/list6?userid=doccomsa&age=100 성공
	// http://localhost:9090/sample2/list6 성공
	// http://localhost:9090/sample2/list6?userid=doccomsa 성공
	@GetMapping("list6") 
	public void list6(
			@RequestParam(required = true, defaultValue = "guest") String userid, 
			@RequestParam(required = false, defaultValue = "-1") Integer age) {
		logger.info("userid: " + userid);
		logger.info("age: " + age);
	}
	
	// SampleDTOList클래스 사용 예.
	// 1)form으로 사용
	@GetMapping("beanForm")
	public void beanForm() {
		logger.info("called beanForm...");
	}
	
	// 2)form에서 전송되어온 데이터 처리 목적
	@RequestMapping("beanPro") // SampleDTO dto
	public void beanPro(SampleDTOList lst) {	
		logger.info("list컬렉션 데이터: " + lst);
	}
	
	
}



