package com.demo.controller;

import java.util.ArrayList;

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
	
	// 클라이언트에서 동일한 파라미터명으로  데이터가 전송될 때
	// http://localhost:9090/sample2/list?idx=10&idx=20&idx=30
	@GetMapping("list")
	public void list(@RequestParam("idx") ArrayList<Integer> idx) {
		logger.info("idx: " + idx);
	}
	
}
