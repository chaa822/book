package sec08.exam05;

public interface RemoteControl {
	
	public int MIN_VOLUME = 0;
	public int MAX_VOLUME = 10;

	public abstract void turnOn();
	public void turnOff();
	void setVolume(int volume);
}
