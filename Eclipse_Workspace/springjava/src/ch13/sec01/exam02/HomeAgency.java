package ch13.sec01.exam02;

public class HomeAgency implements Rentable<Home> {

	@Override
	public Home rent() {
		// TODO Auto-generated method stub
		return new Home();
	}
	
}
