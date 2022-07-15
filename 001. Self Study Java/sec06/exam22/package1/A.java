package sec06.exam22.package1;

public class A {

	A a1 = new A(true);
	A a2 = new A(1);
	A a3 = new A("문자열");
	
	//public
	public A(boolean b){}

	//default
	A(int b){}

	//priavte
	private A(String s){}
}