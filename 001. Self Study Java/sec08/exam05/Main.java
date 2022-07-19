package sec08.exam05;

public class Main {
	
	public static void main(String[] args) {
		
		SmartTelevision smartTelevision = new SmartTelevision();

		RemoteControl remoteControl = smartTelevision;
		remoteControl.turnOn();
		//remoteControl.search("url");
		remoteControl.turnOff();
		
		Searchable searchable = smartTelevision;
		//searchable.turnOn();
		searchable.search("url");
	}
}