package sec08.exam09;

public class Main {
	
	public static void main(String[] args) {
		
		Vehicle vehicle = new Bus();
		vehicle.run();
		//vehicle.checkFare();	// error

		Bus bus = (Bus) vehicle;
		bus.run();
		bus.checkFare();
	}
}