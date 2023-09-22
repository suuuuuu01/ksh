package Sungjuk;

public class Sungjuk {
	
		private String[] name = {"홍길동", "강호동", "유재석", "박명수"};
		
		private int[] Korean = {60, 70, 80, 90};
		
		private int[] English = {75, 80, 55, 100};

		public String[] getName() {
			return name;
		}

		public void setName(String[] name) {
			this.name = name;
		}

		public int[] getKorean() {
			return Korean;
		}

		public void setKorean(int[] korean) {
			Korean = korean;
		}

		public int[] getEnglish() {
			return English;
		}

		public void setEnglish(int[] english) {
			English = english;
		}
		
		// 국어 총점
		public int Sumkor() {
			
			int sum = 0;
			for(int i=0; i<Korean.length; i++) {
				sum += Korean[i];
			}
			return sum;
		}
		
		// 영어 총점
		public int SumEng() {
			int sum = 0;
			for(int i=0; i<English.length; i++) {
				sum += English[i];
			}
			return sum;
		}
		
}
