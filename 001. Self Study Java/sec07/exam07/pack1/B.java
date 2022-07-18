package sec07.exam07.pack1;

public class B {
	
	public void method() {
		// protected도 default와 마찬가지로 같은 패키지 내에서 접근 가능
		A a = new A();
		a.field = "value";
		a.method();
	}
}
