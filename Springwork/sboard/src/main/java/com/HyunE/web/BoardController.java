package com.HyunE.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j;

@Log4j // log 객체지원
@Controller
@RequestMapping("/board/*")
@RequiredArgsConstructor
public class BoardController {
	
	private final BoardService boardService;
	
	@GetMapping("register")
	public void register() {
		log.info("called register...");
	}
	
	@PostMapping("register")
	public String register() {
		
		boardService.register();
		return "redirect:/board/list";
	}
	
}
