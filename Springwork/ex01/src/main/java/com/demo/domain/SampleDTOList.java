package com.demo.domain;


import java.util.ArrayList;
import java.util.List;

import lombok.Data;

// 클라이언트에서 SampleDTO클래스의 필드에 해당하는 파라미터가 여러 개 전달받을 때 사용

@Data 
public class SampleDTOList {

	private List<SampleDTO> list;
	
	public SampleDTOList() {
		list = new ArrayList<SampleDTO>();
	}
}
