package sec06.exam13;

public class Main {
	
	public static void main(String[] args) {
		
		Calculator calculator = new Calculator();

		double result1 = calculator.areaRectangle(10);
		System.out.println("정사각형 넓이 : " + result1);
		
		double result2 = calculator.areaRectangle(10, 20);
		System.out.println("직사각형 넓이 : " + result2);
	}
}