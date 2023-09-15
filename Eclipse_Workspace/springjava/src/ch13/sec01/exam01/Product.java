package ch13.sec01.exam01;

public class Product<K, M> {

	// 필드
	private K kind;
	private M model;
	
	// getter, setter 메소드
	public K getKind() { return this.kind; }
	public M getModel() { return this.model; }
	public void setKind(K kind) { this.kind = kind; }
	public void setModel(M model) { this.model = model; }

}

// Product<TV, String> product1 = new Product<>();
// -> Product product1 = new Product();
/* 
 	// 필드
  	private Tv kind;
	private String model;
 
 	// getter, setter 메소드
	public Tv getKind() { return this.kind; }
	public String getModel() { return this.model; }
	public void setKind(Tv kind) { this.kind = kind; }
	public void setModel(String model) { this.model = model; }
*/


// Product<Car, String> product2 = new Product<Car, String>();
/*
	// 필드
  	private Car kind;
	private String model;
 
 	// getter, setter 메소드
	public Car getKind() { return this.kind; }
	public String getModel() { return this.model; }
	public void setKind(K kind) { this.kind = kind; }
	public void setModel(String model) { this.model = model; }
*/

