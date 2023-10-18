package com.demo.mapper;

// 컬렉션 3개 인터페이스 : List, Set, Map
import java.util.List;  

import com.demo.domain.BoardVO;

// 인터페이스
// BoardMapper인터페이스와 BoardMapper.xml 하나로 관리된다.
/*
 - root-context.xml파일
<mybatis-spring:scan base-package="com.demo.mapper"/> 수동으로 추가해야 함. 
 */
public interface BoardMapper {

	//추상메서드
	
	//글쓰기 저장.
	// 메서드명과 id="register" 일치 <insert id="register"></insert>
	public void register(BoardVO board);
	
	//게시물읽기 또는 글수정 폼.  1개  BoardVO
	public BoardVO get(Long bno);
	
	
	//글수정하기
	public void modify(BoardVO board);
	
	
	// 목록. 여러개 List<BoardVO> 리턴값
	public List<BoardVO> getList();
	
	
	//글삭제하기
}
