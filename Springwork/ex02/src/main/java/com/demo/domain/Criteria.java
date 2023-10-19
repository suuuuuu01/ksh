package com.demo.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

// 페이징 및 검색 필드를 가지고 있는 클래스

@ToString
@Setter
@Getter
public class Criteria {

	private int pageNum; // 선택한 페이지 번호 저장 1 2 3 4 5
	private int amount; // 페이지마다 출력할 게시물 개수 5개씩, 10개씩
	
	private String type; // 검색종류 (제목, 작성자, 제목+글) T C W TC TW TWC
	private String keyword; // 검색어
	
	public Criteria() {
		this(1, 10);
		System.out.println("Criteria 기본생성자 호출");
	}
	
	public Criteria(int pageNum, int amount) {
		this.pageNum = pageNum;
		this.amount = amount;
	}
	
	// getType()메소드 대신 boardMapper.xml에서 사용할 메소드
	// Type; 검색종류 : T C W TC TW TWC 6개 중 선택.
	public String[] getTypeArr() {
		
		// Type이 "TWC"면, {"T", "W", "C"}
		return type == null? new String[] {} : type.split("");
	}
	
}



