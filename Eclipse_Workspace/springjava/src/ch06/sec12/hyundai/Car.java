package ch06.sec12.hyundai;

import ch06.sec12.hankook.SnowTire;
import ch06.sec12.kumho.AllSeasonTire;

// 다른 패키지의동일한 이름의 클래스를 사용 시, 풀네임 형식(12,13라인)으로 코딩하라.
// 패키지명.클래스이름
// import 코드 사용하지 말 것.

public class Car {

	ch06.sec12.hankook.Tire tire1 = new ch06.sec12.hankook.Tire();
	ch06.sec12.kumho.Tire tire2 = new ch06.sec12.kumho.Tire();
	SnowTire tire3 = new SnowTire();
	AllSeasonTire tire4 = new AllSeasonTire();
}
