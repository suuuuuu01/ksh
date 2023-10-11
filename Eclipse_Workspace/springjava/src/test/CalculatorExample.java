package test;

public class CalculatorExample {

	public static void main(String[] args) {
		
		Calculator calculator = new Calculator();
		
		System.out.println("caclculator.add(10, 20):" + calculator.add(10, 20));
		System.out.println("caclculator.sub(10, 20):" + calculator.sub(10, 20));
		System.out.println("caclculator.mul(10, 20):" + calculator.mul(10, 20));
		System.out.println("caclculator.div(10, 20):" + calculator.div(10, 20));

	}

}
