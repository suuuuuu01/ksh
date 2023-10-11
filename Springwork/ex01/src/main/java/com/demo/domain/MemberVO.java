package com.demo.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

// 오라클에서 member테이블 생성

@Getter
@Setter
@ToString
public class MemberVO {

	private String userid;
	private String passwd;
	private String addr;
	private int age;
	
}
