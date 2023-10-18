package com.demo.controller;



import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.demo.domain.BoardVO;
import com.demo.service.BoardService;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j;

// 게시판의 기능에 사용할 URL매핑주소를 구성요소로 하는 컨트롤러기능의 클래스.
// BoardController에서는 BoardServiceImpl의 메서드를 호출한다.
/*
 servlet-context.xml 파일
 <context:component-scan base-package="com.demo.controller" /> 자동추가됨. 
 */
// pom.xml 파일에서 <groupId>log4j</groupId>위치에서  <scope>runtime</scope> 주석처리해야 @Log4j 를 사용가능해짐.
@Log4j // log객체지원 해줌.
@Controller // servlet-context.xml 파일에
@RequestMapping("/board/*") // views폴더 밑에 board 생성
@RequiredArgsConstructor
public class BoardController {

	private final BoardService boardService;
	
	/*
	public BoardController(BoardService boardService) {
		this.boardService = boardService;
	}
	*/
	
	//매핑주소   /board/register
	//글쓰기 폼
	@GetMapping("/register")
	public void register() {
		log.info("called register...");
	}
	
	//매핑주소   /board/register
	//글쓰기저장.  jsp파일이 필요없다.
	@PostMapping("/register")
	public String register(BoardVO board) {
		
		log.info("게시판 입력데이타: " + board); // board.toString()
		//db저장.  
		/*
		 1)BoardMapper인터페이스와 BoardMapper.xml 작업
		 2)BoardService인터페이스와 BoardServiceImple 작업 
		 */
		boardService.register(board);
		
		
		return "redirect:/board/list"; // 주소는 절대경로
	}
	
	//매핑주소   /board/list
	// 목록
	// Model model : list.jsp파일에 데이터(대부분 DB)를 출력하고자 할때
	@GetMapping("/list")
	public void list(Model model) {
		// 서비스 메서드 호출
		List<BoardVO> list = boardService.getList();
		model.addAttribute("list", list);  // jsp작업진행
	}
	
	//매핑주소 /board/get?bno=게시물번호
	//게시물읽기: 리스트에서 제목을 클릭했을 때 , 게시물번호에 데이타를 출력
	//수정폼
	@GetMapping({"/get", "/modify"})
	public void get(@RequestParam("bno") Long bno, Model model) {
		//목록에서 선택한 게시물번호
		log.info("게시물번호: " + bno);
		
		BoardVO board = boardService.get(bno);
		model.addAttribute("board", board);
	}
	
	//수정하기
	@PostMapping("/modify")
	public String modify(BoardVO board) {
		
		log.info("수정 데이타: " + board);
		//db저장.
		
		boardService.modify(board);
		
		return "redirect:/board/list";
	}
	
	
}
