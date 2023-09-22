package Sungjuk;

import java.util.Arrays;

public class SungjukMain extends Sungjuk {

	public static void main(String[] args) {
	
		Sungjuk sungjuk = new Sungjuk();
		
		System.out.println("이름: %s\n" + Arrays.toString(sungjuk.getName()));
		System.out.println("국어점수: %d" + Arrays.toString(sungjuk.getKorean()) +  " , 총점: " + sungjuk.Sumkor());
		System.out.println("영어점수: %s" + Arrays.toString(sungjuk.getEnglish()) + " , 총점: " + sungjuk.SumEng());
	
	
	}

}
