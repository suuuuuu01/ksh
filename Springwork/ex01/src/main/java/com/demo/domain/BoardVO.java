package com.demo.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class BoardVO {
	
	private String writer; // 작성자
	private String title; // 제목
	private String content; // 내용
	
}
