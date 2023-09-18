package ch15.sec02.exam02;

// 책의 스레드 관련예제와는 다르다.
// 스레드 편 강의 진행 후에 나중에 설명
import java.util.List;
import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
//		Vector<Board> list = new Vector<Board>();
		List<Board> list = new Vector<Board>();

		// 객체추가
				list.add(new Board("제목1", "내용1", "글쓴이1")); // 힙영역의 주소추가. list.get(0)
				list.add(new Board("제목2", "내용2", "글쓴이2")); // 힙영역의 주소추가. list.get(1)
				list.add(new Board("제목3", "내용3", "글쓴이3")); // 힙영역의 주소추가. list.get(2)
				list.add(new Board("제목4", "내용4", "글쓴이4")); // 힙영역의 주소추가. list.get(3)
				list.add(new Board("제목5", "내용5", "글쓴이5")); // 힙영역의 주소추가. list.get(4)
				
		for(int i=0; i<list.size(); i++) {
			Board b = list.get(i); // i가 0, 1, 2, 3, 4
			System.out.println(b.getSubject() + "\t" + b.getContent() + "\t" + b.getWriter()); 
		}		
		System.out.println();
		
		// 객체 삭제
		list.remove(2); // new Board("제목3", "내용3", "글쓴이3") 제거
		list.remove(2); // new Board("제목4", "내용4", "글쓴이4") 제거
		
		// 향상된 for문
		for(Board b : list) {
			System.out.println(b.getSubject() + "\t" + b.getContent() + "\t" + b.getWriter()); 
		}
		
	}

}
