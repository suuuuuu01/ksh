package com.demo.controller;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.demo.domain.SampleDTO;

@RequestMapping("/sample3*/")
@Controller
public class SampleController3 {
	
	private static final Logger logger = LoggerFactory.getLogger(SampleController3.class);
	
	// dto객체를 JSON 데이터포맷으로 변환하여, 클라이언트에게 응답
	// JSON라이브러리가 필요. pom.xml파일에서 작업.
	// https://mvnrepository.com/ 사이트에서 참조하여, pom.xml파일에서 작업.
	@GetMapping("doA")
	public @ResponseBody SampleDTO doA() {
		
		// db에서 데이터는 읽어옴.
		SampleDTO dto = new SampleDTO();
		dto.setAge(100);
		dto.setName("홍길동");
		
		return dto;
	}
	
	// ResponseEntity 클래스 사용법
	// Http상태코드와 응답헤더 및 응답본문(데이터)를 생성하여, 클라이언트에게 전달할 때 사용.
	// ajax기능과 함께 사용.
	@GetMapping("doB")
	public ResponseEntity<SampleDTO> doB() {
		
		ResponseEntity<SampleDTO> entity = null;
		
		// 1)응답데이터 dto -> json 변환
		SampleDTO dto = new SampleDTO();
		dto.setAge(100);
		dto.setName("홍길동");
		
		// 2)헤더 : 응답데이터에 대한 설명을 작업할 때 사용(json데이터 설명)
		HttpHeaders header = new HttpHeaders();
		header.add("Content-Type", "application/json;charset=UTF-8");
		
		// 3)상태코드 : HttpStatus.OK
		entity = new ResponseEntity<SampleDTO>(dto, header, HttpStatus.OK);
		
		// 응답데이터
		/*
		1)jsp로 실행된 응답데이터라면, 클라이언트에게 보내는 상태코드는 웹서버에서 자동으로 처리.
		Content-Type, 인코딩정보 (jsp파일 내에 들어있는 정보)
		2)entity객체의 응답데이터 dto -> json으로 변환
		*/
		
		return entity;		
	}
	
	// 파일 업로드기능
	/*
	 - 업로드기능 라이브러리 필요.
	 */
	// 1)이미지 업로드 폼
	@GetMapping("upload")
	public void upload() {
	logger.info("called upload...");
	}
	
	// 2)업로드파일 처리. 여러 개의 파일이 업로드. servlet-context.xml의 multipartResolver의 bean 등록.
	@PostMapping("upload")
	public void upload(ArrayList<MultipartFile> files) {
		files.forEach(file -> {
			logger.info("-----------------------");
			logger.info("파일이름: " + file.getOriginalFilename());
			logger.info("파일크기: " + file.getSize());
			logger.info("-----------------------");
		});
		
		/*
		logger.info("-----------------------");
		for(int i=0; i<files.size(); i++) {
			logger.info("파일이름: " + files.get(i).getOriginalFilename());
			logger.info("파일크기: " + files.get(i	).getSize());
		}
		logger.info("-----------------------");
		 */
		
		// 실제 파일 업로드 작업
	}
	
}



