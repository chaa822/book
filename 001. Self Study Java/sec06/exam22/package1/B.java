package sec06.exam22.package1;

public class B {
	
	A a1 = new A(true);
	A a2 = new A(1);
	//A a3 = new A("문자열");	// error -> priavte은 같은 패키지여도 호출 불가 (내부에서만 가능)
}