package sec08.exam10;

public class Main {

	public static void main(String[] args) {
		
		Driver driver = new Driver();
		driver.drive(new Bus());
		driver.drive(new Taxi());
	}
}