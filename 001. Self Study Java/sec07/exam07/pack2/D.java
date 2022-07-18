package sec07.exam07.pack2;

import sec07.exam07.pack1.A;

public class D extends A {
	
	public D() {
		this.field = "value";
		this.method();
	}

	public static void main(String[] args) {
		D d = new D();
	}
}