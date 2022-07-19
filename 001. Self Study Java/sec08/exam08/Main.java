package sec08.exam08;

public class Main {
	public static void main(String[] args) {
		Driver driver = new Driver();		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		driver.drive(bus);
		driver.drive(taxi);
	}
}