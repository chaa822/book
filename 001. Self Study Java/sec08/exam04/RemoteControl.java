package sec08.exam04;

public interface RemoteControl {
	
	public int MIN_VOLUME = 0;
	public int MAX_VOLUME = 10;

	/**
	 * interface에서 선언된 추상 메소드는
	 * 모두 public abstract 특성을 갖기 때문에 생략 가능
	 */
	public abstract void turnOn();
	public void turnOff();
	void setVolume(int volume);
}