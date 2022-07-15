package sec06.exam17;

class Singleton {
	
	private static Singleton instance = new Singleton();

	private Singleton() {}

	static Singleton getInstance() {
		return instance;
	}
}