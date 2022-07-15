package sec06.exam16;

public class Main {
	
	public static void main(String[] args) {
		// main 메소드는 정적(static) 메소드이기 때문에
		// 인스턴스 멤버 변수/메소드를 사용하기 위해서 인스턴스를 생성
		Car myCar = new Car();
		myCar.speed = 60;
		myCar.run();
	}
}