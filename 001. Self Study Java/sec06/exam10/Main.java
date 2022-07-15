package sec06.exam10;

public class Main {
	
	public static void main(String[] args) {
		Car car = new Car();
		car.setGas(5);

		if( car.isLeftGas() ){
			System.out.println("출발합니다.");
			car.run();
		}

		if( car.isLeftGas() ){
			System.out.println("gas를 주입할 필요가 없습니다.");
		}else{
			System.out.println("gas를 주입하세요.");
		}
	}
}
