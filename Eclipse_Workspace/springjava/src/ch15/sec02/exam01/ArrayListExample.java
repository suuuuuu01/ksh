package ch15.sec02.exam01;

import java.util.ArrayList;
import java.util.List;

// List인터페이스를 구현한 ArrayList클래스.
public class ArrayListExample {

	public static void main(String[] args) {
		
//		ArrayList<Board> list = new ArrayList<Board>();
		List<Board> list = new ArrayList<Board>(); // 컬렉션은 주로 java.util에서 제공
		
		// 객체추가
		list.add(new Board("제목1", "내용1", "글쓴이1")); // 힙영역의 주소추가. list.get(0)
		list.add(new Board("제목2", "내용2", "글쓴이2")); // 힙영역의 주소추가. list.get(1)
		list.add(new Board("제목3", "내용3", "글쓴이3")); // 힙영역의 주소추가. list.get(2)
		list.add(new Board("제목4", "내용4", "글쓴이4")); // 힙영역의 주소추가. list.get(3)
		list.add(new Board("제목5", "내용5", "글쓴이5")); // 힙영역의 주소추가. list.get(4)
		
		// 저장된 총 객체 수 얻기
		int size = list.size();
		System.out.println("총 객체 수 : " + size);
		System.out.println();
		
		// 모든 객체를 하나씩 가져오기
		for(int i=0; i<list.size(); i++) {
			Board b = list.get(i); // i가 0, 1, 2, 3, 4
			System.out.println(b.getSubject() + "\t" + b.getContent() + "\t" + b.getWriter()); 
		}		
		System.out.println();
		
		// 객체 삭제
		list.remove(2); // new Board("제목3", "내용3", "글쓴이3") 제거
		list.remove(2); // new Board("제목4", "내용4", "글쓴이4") 제거
		
		// list.get(2); // new Board("제목5", "내용5", "글쓴이5")
		
		// 향상된 for문
		for(Board b : list) {
			System.out.println(b.getSubject() + "\t" + b.getContent() + "\t" + b.getWriter()); 
		}
		
	}

}
