package com.HyunE.mapper;

import com.HyunE.domain.SBoardVO;

public interface BoardMapper {
	
	public void register(SBoardVO bSBoardVO);
	
	public SBoardVO get(Long bno);
}
