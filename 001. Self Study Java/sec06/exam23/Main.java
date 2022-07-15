package sec06.exam23;

import sec06.exam23.package1.A;

public class Main {
	
	public static void main(String[] args) {
		
		A a = new A();
		a.field1 = 1;
		//a.field2 = 1;	// error -> 다른 패키지 default 필드 접근 불가
		//a.field3 = 1;	// error -> 다른 패키지 private 필드 접근 불가

		a.method1();
		//a.method2();	// error -> 다른 패키지 default 메소드 접근 불가
		//a.method3();	// error -> 다른 패키지 private 메소드 접근 불가
	}
}