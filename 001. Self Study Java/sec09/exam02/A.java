package sec09.exam02;

public class A {

	/**
	 * 1. 정적 멤버 클래스 C는 모든 필드의 초기 값이나 모든 메소드에서 객체를 생성할 수 있다.
	 * 2. 인스턴스 멤버 클래스 B는 바깥 클래스의 인스턴스 필드(field1)의 초기값이나 인스턴스 메소드(method1)에서 객체를 생성할 수 있으나
	 *    정적 필드(field3)의 초기 값이나 정적 메소드(method2)에서는 객체를 생성할 수 없다.
	 */
	
	class B {}

	static class C {}

	B field1 = new B();
	C field2 = new C();

	//static B field3 = new B();	// error
	static C field4 = new C();

	void method1() {
		B var1 = new B();
		C var2 = new C();
	}

	static void method2() {
		//B var1 = new B();	// error
		C var2 = new C();
	}
}