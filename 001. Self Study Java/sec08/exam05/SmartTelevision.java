package sec08.exam05;

public class SmartTelevision implements RemoteControl, Searchable {
	
	private int volume;

	@Override
	public void turnOn() {
		System.out.println("Smart TV turn on.");
	}

	@Override
	public void turnOff() {
		System.out.println("Smart TV turn off.");
	}

	@Override
	public void setVolume(int volume) {
		if( volume > RemoteControl.MAX_VOLUME ){
			this.volume = RemoteControl.MAX_VOLUME;
		}else if( volume < RemoteControl.MIN_VOLUME ){
			this.volume = RemoteControl.MIN_VOLUME;
		}else{
			this.volume = volume;
		}
		System.out.println("Smart TV volume : " + this.volume);
	}

	@Override
	public void search(String url) {
		System.out.println(url + "을 검색합니다.");
	}
}