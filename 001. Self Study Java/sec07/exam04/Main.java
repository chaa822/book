package sec07.exam04;

public class Main {
	
	public static void main(String[] args) {
		
		SupersonicAirplane supersonicAirplane = new SupersonicAirplane();
		supersonicAirplane.takeOff();
		supersonicAirplane.fly();
		supersonicAirplane.flyMode = SupersonicAirplane.SUPERSONIC;
		supersonicAirplane.fly();
		supersonicAirplane.flyMode = SupersonicAirplane.NORMAL;
		supersonicAirplane.fly();
		supersonicAirplane.land();
	}
}
