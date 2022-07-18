package sec07.exam08;

public class Main {
	
	public static void main(String[] args) {
		
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();

		A a1 = b;
		A a2 = c;
		A a3 = c;
		A a4 = d;

		B b1 = d;
		C c1 = e;

		//B b3 = e;	// erorr
		//C c2 = d;	// error
	}
}