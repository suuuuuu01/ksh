package ch13.sec01.exam01;

public class GenericExample {

	public static void main(String[] args) {
		
		Product<TV, String> product1 = new Product<>();
		
		product1.setKind(new TV());
		product1.setModel("스마트 Tv");

		TV tv = product1.getKind();
		String tvModel = product1.getModel();
		
		Product<Car, String> product2 = new Product<Car, String>();
		
		product2.setKind(new Car());
		product2.setModel("SUV");
		
		Car car = product2.getKind();
		String carModel = product2.getModel();
		
		// 에어컨
		Product<Eeokeon, String> product3 = new Product<Eeokeon, String>();
		
		product3.setKind(new Eeokeon());
		product3.setModel("에어컨");
		
		Eeokeon eeokeon = product3.getKind();
		String eeomodel = product3.getModel();
		
		// 제네릭을 사용하지 않으면, 타입이 Object클래스로 관리.
		Product product = new Product();
//		product.setKind(/*Object로 관리*/);
		
	}

}
