package ch05.sec09;

public class ArrayCopyExample {

	public static void main(String[] args) {
		// 배열복사 : System.arraycopy() 메소드를 이용.
		
		// 길이가 3인 원본배열
		String[] oldStrArray = {"java", "array", "copy"};
		
		// 길이가 5인 사본배열
		String[] newStrArray = new String[5]; // 참조타입은 초기값이 null로 설정되어 있다.
		
		// 배열복사
		System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);
		
		// 배열항목 출력
		for(int i=0; i<newStrArray.length; i++) {
			System.out.print(newStrArray[i]+ ",");
		}

	}

}
