package com.demo.service;



import java.util.List;

import com.demo.domain.BoardVO;

// 인터페이스는  @Service 애노테이션 사용 안함.
public interface BoardService {
	
	public void register(BoardVO board);
	
	public List<BoardVO> getList();
	
	public BoardVO get(Long bno);
	
	public void modify(BoardVO board);
	
	
}
