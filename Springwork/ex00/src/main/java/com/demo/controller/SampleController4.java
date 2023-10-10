package com.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

// 주소이동 시 값을 파라미터로 보낼 때 사용 : RedirectAttributes
/* 차이점 (테스트 시 doG와 doI 요청 시 브라우저의 파라미터 유무 확인하기)
rttr.addAttribute(attributeName, attributeValue); 
rttr.addFlashAttribute("msg", "success");
*/

@Controller
public class SampleController4 {

	private static final Logger logger = LoggerFactory.getLogger(SampleController4.class);
	
	// 1) rttr.addAttribute(attributeName, attributeValue)
	@GetMapping("doG") // jsp파일이 필요없다.
	public String doG(RedirectAttributes rttr) {
		
		// db작업
		// 주소로 리다이렉트되면서 값을 전달하고자 할 경우, 메소드에 파라미터로 RedirectAttributes rttr 사용.
		rttr.addAttribute("msg", "Hello"); // (String, Object)
		return "redirect:/doH"; // http://localhost:9090/doH?msg=Hello // response.sendRedirect("이동주소"); 
	}
	
	@GetMapping("doH") // 요청주소가 jsp파일명. 클라이언트에서 직접주소를 사용은 안 함.
	public void doH(String msg) {
		logger.info("doH called..." + msg); // doH called...Hello 출력
	}
	
	// 2)rttr.addFlashAttribute(attributeName, attributeValue);
	@GetMapping("doI")
	public String doI(RedirectAttributes rttr) {
		
//		rttr.addAttribute(attributeName, attributeValue)
		rttr.addFlashAttribute("msg", "success"); // doJ매핑주소의 jsp에서 참조
		
		return "redirect:/doJ";
	}
	
	@GetMapping("doJ") // doJ주소를 직업 요청하면, msg값을 참조가 불가능.
	public void doJ() {
		
		// doJ.jsp파일에서 msg파라미터의 값을 참조.
	}
}



