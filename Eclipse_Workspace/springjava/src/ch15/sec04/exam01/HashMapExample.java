package ch15.sec04.exam01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

// Map인터페이스를 구현한 HashMap 클래스 예제.
// key, value 한 쌍의 구조로 되어 관리된다. 한 쌍의 구조를 Entry라고 함.
// key는 중복 불가능, value는 중복 허용.
public class HashMapExample {

	public static void main(String[] args) {
//		HashMap<String, Integer> map = new HashMap<String, Integer>();
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("홍길동", 85);
		map.put("이순신", 95);
		map.put("홍범도", 80);
		map.put("홍길동", 80); // "홍길동" key가 중복되지만, 전 key가 지워지고 덮어씌워짐. 기존 키에 값이 저장됨.
		
		
		System.out.println("총 Entry 수: " + map.size());
		System.out.println();
		
		// 키로 값 얻기
		String key = "홍길동";
		int value = map.get(key);
		System.out.println(key + ": " + value);
		System.out.println();

		// map -> set 으로 참조하여, iterator객체로 작업
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Entry<String, Integer>> entryIterator = entrySet.iterator();
		while(entryIterator.hasNext()) {
			Entry<String, Integer> entry = entryIterator.next(); // map.put("홍길동", 85); 저장되어 있는 구조를 참조
			String k = entry.getKey();
			Integer v = entry.getValue();
			System.out.println(k + " : " + v);
		}
		System.out.println();
		
		map.remove("홍길동");
		System.out.println("총 Entry 수: " + map.size());
		System.out.println();
	}

}
